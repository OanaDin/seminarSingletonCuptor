package org.example;

public class Main {
    public static void main(String[] args) {
        Comanda c1 = new Comanda(10,"c1",250);
        Comanda c2 = new Comanda(10,"c2",250);
        Comanda c3 = new Comanda(10,"c3",270);
        Comanda c4 = new Comanda(10,"c4",250);
        Cuptor.addComandaStatic(c1);
        Cuptor.addComandaStatic(c2);
        Cuptor.addComandaStatic(c3);
        Cuptor.addComandaStatic(c4);
        for(int i =1; i<=4 ; i++){
            Cuptor.getInstance(i).afisareComenziAsteptare();
        }
        System.out.println();




    }
}