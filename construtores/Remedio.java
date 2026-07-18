package construtores;

import java.time.LocalDate;

public class Remedio {

    private  String nome; // Obrigatório
    private int miligramagem; // Obrigatório
    private boolean generico; // Obrigatório
    private LocalDate dataVencimento; // Obrigatório
    private String fabricante; // Opcional

    //Construtor: criar o objeto com informacoes que são obrigatórias para o correto funcionamento
    public Remedio(String nome, int miligramagem, boolean generico, LocalDate dataVencimento) {
        this.nome = nome;
        this.miligramagem = miligramagem;
        this.generico = generico;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

// Neste cenário nao queremos permitir o usuario alterar o nome
//public void setNome(String nome) {
// this.nome = nome;
//}
    public int getMiligramagem() {
        return miligramagem;
    }

// Neste cenário nao queremos permitir o usuario alterar o miligramagem
//public void setMiligramagem(int miligramagem) {
//this.miligramagem = miligramagem;
//}
    public boolean isGenerico() {
        return generico;
    }
// Neste cenário nao queremos permitir o usuario alterar o generico
//public void setGenerico(boolean generico) {
//this.generico = generico;
//}

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

// Neste cenário nao queremos permitir o usuario alterar o dataVencimento
// public void setDataVencimento(LocalDate dataVencimento) {
//this.dataVencimento = dataVencimento;
//}
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
