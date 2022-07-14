import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import services.IService;
import services.ServiceList;
import services.ServiceTableau;
import static java.lang.System.exit;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

      
        //IService service = new ServiceTableau();
        IService service = new ServiceList(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int selection;
        Scanner sc = new Scanner(System.in);
        do{
                System.out.println("Bonjour choisissez parmi ces options");
                System.out.println("---------\n");
                System.out.println("1 - Ajouter pavillon");
                System.out.println("2 - Lister pavillon");
                System.out.println("3 - Supprimer pavillon");
                System.out.println("4 - Ajouter chambre");
                System.out.println("5 - Lister toutes les chambres");
                System.out.println("6 - Archiver chambre");
                System.out.println("7 - affecter chambre a un pavillon");
                System.out.println("8 - Ajouter etudiant");
                System.out.println("9 - affecter chambre a un boursier logé");
                System.out.println("0 - quitter");
    
                selection = sc.nextInt();
             
            switch(selection){
                case 1:
                  
                    Pavillon pavillon = new Pavillon();

                    System.out.println("Veuillez saisir le nombres d etages du pavillon");
                    int nbrEt = sc.nextInt();
                    pavillon.setNbrEtages(nbrEt);

                    service.ajouterPavillon(pavillon);
                    System.out.println("le pavillon a bien été enregistré");
                    break;
                case 2:
                    System.out.println("Liste des pavillons:");
                    service.listerPavillon();
                    break;
                case 3: 
                    System.out.println("Veuillez choisir l id du pavillon que vous voulez supprimer");
                    service.listerPavillon();
                    int idPavSup = sc.nextInt();
                    service.supprimerPavillon(idPavSup);
                    System.out.println("le pavillon a été supprimé avec succes");
                    break;
                case 4:
                    Chambre chambre = new Chambre();
                    System.out.println("Veuillez choisir l id du pavillon:");
                    service.listerPavillon();
                    int idPav = sc.nextInt();
                    pavillon =  service.getPavillonById(idPav);
                    chambre.setPavillon(pavillon); 
                    System.out.println("Veuillez saisir le numero de l'etages:");
                    String etage = sc.next();
                    chambre.setEtage(etage);

                    int choixType;
                    do{
                        System.out.println("veuillez choisir le type de chambre entre \n 1:"+TypeChambre.values()[0]+"\n 2: "+TypeChambre.values()[1]);
                         choixType = sc.nextInt();
                    }
                    while(choixType != 1 && choixType != 2);
                    if(choixType == 1){
                        chambre.setType(TypeChambre.values()[0]);
                    }
                    else if(choixType == 2){
                        chambre.setType(TypeChambre.values()[1]);
                    }
                    service.ajouterChambre(chambre);
                    System.out.println("la chambre a bien été ajoutée");
                    break;
                case 5:
                    System.out.println("Liste des chambres:");
                    service.listerChambre();
                    break;
                case 6:
                    System.out.println("Veuillez choisir l id de la chambre que vous voulez supprimer");
                    service.listerChambre();
                    int idChaSup = sc.nextInt();
                    service.archiverChambre(idChaSup);
                    System.out.println("la chambre a été archive avec succes");
                    break;
                case 7:
                    System.out.println("affecter chambre a un pavillon");
                    break;
                case 8:
                    System.out.println("ajouter etudiant");
                    break;
                case 9:
                    System.out.println("affecter chambre a un boursier logé");
                    break;
                case 0:
                    exit(0);
                default:
                    System.out.println("ce choix n est pas disponible");
                    break;
            }
       
        }
        while(selection!=0);
    }
}
