package services;

import models.Etudiant;
import models.Pavillon;
import models.Chambre;


public class ServiceTableau implements IService{

    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private int indexChambre = 0;

    private Pavillon pavillons[] = new Pavillon[NOMBRE];
    private int indexPavillon = 0;

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        if(indexPavillon < NOMBRE){
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
        
    }
    @Override
    public void listerPavillon() {
        
        for (Pavillon pavillon : pavillons) {
            if(pavillon != null){
                System.out.println(pavillon);
            }
        }
    }

    @Override
    public Pavillon getPavillonById(int id) {
        Pavillon pavillon = null;
        for (Pavillon p : pavillons) {
            if(p!=null && p.getId() == id){
                pavillon = p;
            }
        }
        return pavillon;
    }

    @Override
    public void supprimerPavillon(int id) {
        //removeElement(chambres, id);
        
    }

    @Override
    public void ajouterChambre(Chambre chambre) {

       if(indexChambre < NOMBRE){
            chambres[indexChambre] = chambre;
            indexChambre++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
        
    }

    @Override
    public void listerChambre() {
        
        for (Chambre chambre : chambres) {
            if(chambre != null){
                System.out.println(chambre);
            }
        }
        
    }

    @Override
    public void affecterChambreBoursier() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePav() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void archiverChambre(int id) {
        for (Chambre c : chambres) {
            if(c.getId() == id){
                c.setEtat("archive");
            }
        }
        
    }

    @Override
    public void listerEtudiant() {
        // TODO Auto-generated method stub
        
    }

 
    
}
