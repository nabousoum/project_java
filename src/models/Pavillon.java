package models;

public class Pavillon {
    private static int nbr;
    private int id;
    private String numero;
    private int nbrEtages;
    private ResponsablePedagogique resp;

    public Pavillon(){
        nbr++;
        id=nbr;
        numero = "pav000"+id;
    }
    public ResponsablePedagogique getResp() {
        return resp;
    }

    public void setResp(ResponsablePedagogique resp) {
        this.resp = resp;
    }

    public int getNbrEtages() {
        return nbrEtages;
    }

    public void setNbrEtages(int nbrEtages) {
        this.nbrEtages = nbrEtages;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pavillon :ID:" + id + ", nbrEtages: " + nbrEtages + ", numero: " + numero + " ";
    }

}
