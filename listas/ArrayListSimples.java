package listas;

import java.util.ArrayList;

public class ArrayListSimples {
    public void executar(){

    }

    private void exemploListaString(){
        // Vetor
        // String[] nome = new String[3];
        //nomes[0] = "Lorenzo";
        //nomes[1] = "Gustavo";
        //nomes[2] = "Judity";
        //nomes[3] = "Erroo"; Aconte um erro porque o vetor não tem quatro posições

        //CRUD
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lorenzo"); // C -> Create
        nomes.add("Gustavo");
        nomes.add("Judity");
        nomes.add("ERROOo");
        nomes.add("Aroldo"); // Indice 4, quinta posição

        //Lorenzo casou, vamos alterar o nome dele no array list
        nomes.set(0, "Lorenzo Ambrosio"); // U -> Update

        nomes.remove("Aroldo"); // D -> Delete

        // Para poder acessar o elemento do array list
        String primeiroNome = nomes.get(0); // R -> Read

        // Descobrir a quantidade de elemenetos do ArrayList
        int quantidadeNomes = nomes.size();

        System.out.println("Quantidade de nomes: " + quantidadeNomes);
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Segundo nome: " + nomes.get(1));
        System.out.println("Terceiro nome: " + nomes.get(2));
        System.out.println("Quarto nome: " + nomes.get(3));
    }



}
