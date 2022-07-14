package models;

import java.util.Date;

public class Etudiant extends Personne{

    protected String  matricule;
    protected String  email;
    protected String  telephone;
    protected Date  dateNaiss;
    private String  isHoused;
    
    public Etudiant(){
        matricule = "MAT"+id;
    }
    public Date getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getIsHoused() {
        return isHoused;
    }
    public void setIsHoused(String isHoused) {
        this.isHoused = isHoused;
    }
    @Override
    public String toString() {
        return "Etudiant [dateNaiss=" + dateNaiss + ", email=" + email + ", isHoused=" + isHoused + ", matricule="
                + matricule + ", telephone=" + telephone + "]";
    }

}
