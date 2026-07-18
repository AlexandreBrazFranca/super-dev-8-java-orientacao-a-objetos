package composicao;

public class Livro {

    private String nome;
    private String descricao;
    private Autor autor;
    private String isbn;
    private String resumo;
    private String dataLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getResumo(){
        return resumo;
    }

    public void setResumo(String resumo){
        this.resumo = resumo;
    }

    public String getDataLancamento(){
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento){
        this.dataLancamento = dataLancamento;
    }
}
