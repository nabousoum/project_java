import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import services.IService;
import services.ServiceTableau;
import static java.lang.System.exit;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

      
        IService service = new ServiceTableau();
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
             int id = 0;
            switch(selection){
                case 1:
                    id++;
                    Pavillon pavillon = new Pavillon();
                    pavillon.setId(id);

                    System.out.println("Veuillez saisir le nombres d etages du pavillon");
                    int nbrEt = sc.nextInt();
                    pavillon.setNbrEtages(nbrEt);

                    System.out.println("Veuilez saisir le numero du pavillon");
                    int num = sc.nextInt();
                    pavillon.setNumero(num);

                    service.ajouterPavillon(pavillon);
                    System.out.println("le pavillon a bien été enregistré");
                    break;
                case 2:
                    System.out.println("Liste des pavillons:");
                    service.listerPavillon();
                    break;
                case 3: 
                    System.out.println("Veuillez choisir l id du pavillon que vous voulez supprimer");
                    
                    break;
                case 4:
                    Chambre chambre = new Chambre();
                    // Pavillon pavillon = new Pavillon();

                    // System.out.println("Veuillez choisir un pavillon:");
                    //service.listePavillon();
                    // int idPav = sc.nextInt();
                    // pavillon.setId(idPav);

                    System.out.println("Veuillez saisir l id de la chambre:");
                    int idCh = sc.nextInt(); 
                    chambre.setId(idCh);

                    System.out.println("Veuillez saisir le numero de la chambre:");
                    String numCha = sc.next();
                    chambre.setNumero(numCha);

                    System.out.println("Veuillez saisir le numero de l'etages:");
                    String etage = sc.next();
                    chambre.setEtage(etage);

                    TypeChambre typeChambre = TypeChambre.DOUBLE;
                    chambre.setType(typeChambre);

                    //chambre.setPavillon(pavillon);

                    service.ajouterChambre(chambre);
                    System.out.println("la chambre a bien été ajoutée");
                    break;
                case 5:
                    System.out.println("Liste des chambres:");
                    service.listerChambre();
                    break;
                case 6:
                    System.out.println("archiver chambre");
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
