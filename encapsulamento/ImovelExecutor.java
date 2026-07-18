package encapsulamento;

public class ImovelExecutor {
    public void executor(){
        Imovel casa = new Imovel();
        casa.setEndereco("Rua das Maçãs");
        casa.setQuantidadeQuartos(3);
        casa.setQuantidadeBanheiros(2);
        casa.setMetragem(3);
        casa.setPossuiGaragem(true);
    }
}