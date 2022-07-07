package models;

public class Pavillon {
    private int id;
    private int numero;
    private int nbrEtages;
    private ResponsablePedagogique resp;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
        return "Pavillon :id=" + id + ", nbrEtages=" + nbrEtages + ", numero=" + numero + " ";
    }

}
