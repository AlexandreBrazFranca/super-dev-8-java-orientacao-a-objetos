package encapsulamento;

/*
encapsulamento define a visibilidade da parada (atributo/método/construto/classe)
-private (acessível somente dentro da mesma classe)
-protected (acessível somente dentro da própria package ou através da herança)
- public "acessível em qualquer lugar"
*/

public class Imovel {
    // Atributos devem ser privados 
    private int quantidadeQuartos;
    private int quantidadeBanheiros;
    private int metragem;
    private boolean possuiGaragem;
    private String endereco;

    //SET: método que permite definir ou alterar o valor de um atributo
    public void setQuantidadeQuartos(int quantidadeQuartos){
        this.quantidadeQuartos = quantidadeQuartos;
    }

    //GET: métodos que permite obter a informação
    public int getQuantidadeQuartos(){
        return quantidadeQuartos;
    }

    public void setQuantidadeBanheiros(int quantidadeBanheiros){
        this.quantidadeBanheiros = quantidadeBanheiros;
    }
    public int getQuantidadeBanheiros(){
        return quantidadeBanheiros;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEngereco(){
        return endereco;
    }

    
    public void setMetragem(int metragem){
        this.metragem = metragem;
    }
    public int getMetragem(){
        return metragem;
    }
    
    public void setPossuiGaragem(boolean possuiGaragem){
        this.possuiGaragem = possuiGaragem;
    }
    public boolean getPossuiGaragem(){
        return possuiGaragem;
    }

}