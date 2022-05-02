package one.digitalinnovation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {

    public static void main(String[] args){

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("ford"));
        listCarros.add(new Carro("chevrolet"));
        listCarros.add(new Carro("fiat"));
        listCarros.add(new Carro("peugeot"));

        System.out.println(listCarros.contains(new Carro("ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("fiat")));

        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);

        System.out.println(listCarros.size());






    }

}
