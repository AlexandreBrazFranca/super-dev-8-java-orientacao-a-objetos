package construtores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executor {
    public void executar(){
        executarRemedio();
    }

    public void executarRemedio(){
        Remedio paracetamol = new Remedio("Paracetamol", 500, true, LocalDate.of(2026, 12, 31));
    //Paracetamol.setFabricante("EuroFarma")

    // String remedioGenerico = "";
    // if (paracetamol.isGenerico() == true) {
    // remedioGenerico = "Sim";
    //} else {
    //  remedioGenerico = "Não";
    //}
    // Operador ternário
    // Ex: variável = condição ? parte verdadeira : parte falsa
    String remedioGenerico = paracetamol.isGenerico() == true ? "Sim" : "Não";
    
    String  nomeFabricante = paracetamol.getFabricante() != null ? paracetamol.getFabricante() : "Sem Fabricante";

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd//MM/yyyy");
    String dataFormatada = formatador.format(paracetamol.getDataVencimento());

    System.out.println(String.format("""
            Remédio: %s
            Miligramagem: %s
            Genérico: %s
            Data de validade: %s
            Fabricante: %s
            """, paracetamol.getNome(), paracetamol.getMiligramagem(), remedioGenerico, dataFormatada, nomeFabricante));
    }
}
