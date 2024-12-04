package Oggetti_Costruttore_Getter_Setter.Es3;

import Oggetti_Costruttore_Getter_Setter.Es2.Auto;

//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Nissan", "GTR", 3800, "AB123CD");


        auto1.setCilindrata(4000);
        auto1.setTarga("FB123CF");



        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());


    }
}
