package composicao;

public class Executor {
    public void executar(){
        executarCarro();
    }

    private void executarCarro(){
        Motor motorPalio = new Motor();
        motorPalio.setCilindradas(150);
        motorPalio.setCombustivel("Flex");

        Carro palio = new Carro();
        palio.setModelo("Palio com escada");
        palio.setCor("Vermelho");
        palio.setMotor(motorPalio);
        palio.setEscada(true);

        System.out.println(palio.toString());
        System.out.println(motorPalio.toString());

    }

    private void executarLivro(){
        Autor autor1 = new Autor();
        autor1.setNome("kleiton Hasta");
        autor1.setCidadeNatal("Tumberlands");

        Autor autor2 = new Autor();
        autor2.setNome("Monjaro Linux");
        autor2.setCidadeNatal("Winland");

        Autor autor3 = new Autor();
        autor3.setNome("Dom Xicote");
        autor3.setCidadeNatal("Portunhol");



        Livro brasil = new Livro();
        brasil.setNome("Biografía de Kleitinho");
        brasil.setDataLancamento("31-12-2006");
        brasil.setAutor(autor1);
        brasil.setIsbn("218-779-454-89");
        brasil.setResumo("Contando sobre a vida do pobre Kleiton Hasta");
    }
}
