package models;

public class Boursier {
    
    private String typeBourse;
    private Chambre chambre;
    private TypeBourse type;

    public TypeBourse getType() {
        return type;
    }

    public void setType(TypeBourse type) {
        this.type = type;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public String getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(String typeBourse) {
        this.typeBourse = typeBourse;
    }
}
