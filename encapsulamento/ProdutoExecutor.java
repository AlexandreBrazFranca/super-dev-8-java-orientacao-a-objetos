package encapsulamento;

public class ProdutoExecutor {
    public void executor(){
        Produto produto1 = new Produto();
        produto1.setNome("banana");
        produto1.setPreco(5.50);
        produto1.setQuantidade(15);


        Produto produto2 = new Produto();
        produto2.setNome("maçã");
        produto2.setPreco(3.75);
        produto2.setQuantidade(7);
    }
}
