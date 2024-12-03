package Oggetti_Costruttore_Getter_Setter.Es2;
//Scrivere un programma che contenga una classe che definisce
// un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
public class Auto {
    private String marca;
    private String modello;
    private int cilindrata;
    String targa;

    public Auto(){}

    public Auto(String marca, String modello, int cilindrata, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                '}';
    }
}
