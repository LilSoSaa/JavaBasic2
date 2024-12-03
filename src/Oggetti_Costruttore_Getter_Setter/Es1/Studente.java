package Oggetti_Costruttore_Getter_Setter.Es1;
//Scrivere un programma che contenga una classe che
// definisce uno Studente che abbia come proprietà nome,
// cognome ed identificativo.
//Per questa classe saranno necessari i metodi accessori
// (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Studente.
public class Studente {
    private String nome;
    private String cognome;
    int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public Studente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }
}
