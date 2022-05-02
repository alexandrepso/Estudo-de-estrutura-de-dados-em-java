package one.digitalinnovation;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("ford"));
        hashSetCarros.add(new Carro("chevrolet"));
        hashSetCarros.add(new Carro("fiat"));
        hashSetCarros.add(new Carro("alpha romeu"));
        hashSetCarros.add(new Carro("zip"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("ford"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("fiat"));
        treeSetCarros.add(new Carro("alpha romeu"));
        treeSetCarros.add(new Carro("zip"));

        System.out.println(treeSetCarros);





    }

}
