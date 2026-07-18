package listas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayComFor {

    public void executarFor() {
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String palavra = JOptionPane.showInputDialog("Digite uma palavra");
            palavras.add(palavra);
        }

        String menorPalavra = "";
        int quantidadeCaracteresMenorPalavra = 99999999;

        for (int i = 0; i < palavras.size(); i++) {
            String palavra = palavras.get(i);

            if (palavra.length() < quantidadeCaracteresMenorPalavra) {
                quantidadeCaracteresMenorPalavra = palavra.length();
                menorPalavra = palavra;
            }
        }
        JOptionPane.showMessageDialog(null, "Menor palavra: " + menorPalavra);
    }

    public void executarEx02() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Integer numeros = JOptionPane.showInputDialog("Digite um número");
            numeros.add(numero);
        }
    }
}
