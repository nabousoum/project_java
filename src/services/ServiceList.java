package services;

import models.Etudiant;
import models.Pavillon;

import java.util.ArrayList;
import java.util.List;

import models.Chambre;


public class ServiceList implements IService{

    private List<Chambre> chambres;
    private List<Pavillon> pavillons;

    public ServiceList(List<Chambre> chambres,List<Pavillon> pavillons){
        this.chambres = chambres;
        this.pavillons = pavillons;
    }
    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        pavillons.add(pavillon);
    }
    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : pavillons) {
            System.out.println(pavillon);
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
        pavillons.remove(id);
    }

    @Override
    public void ajouterChambre(Chambre chambre) {

        chambres.add(chambre);
    }

    @Override
    public void listerChambre() {

        for (Chambre chambre : chambres) {
            System.out.println(chambre);
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiant() {
        // TODO Auto-generated method stub
        
    }

 
    
}
