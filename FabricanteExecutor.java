
import javax.swing.JOptionPane;

public class FabricanteExecutor {

    public void executar() {
        Fabricante textil = new Fabricante();
        textil.nome = "Karsten S.A";
        textil.CNPJ = "82.640.558/0001-04";
        textil.faturamento = 800000000.00;
        textil.lucro = 8;
        textil.lucroLiquido = calcularLucro(textil);

        Fabricante metalurgica = new Fabricante();
        metalurgica.nome = "Metaltecnica Metalúrgica Ltda.";
        metalurgica.CNPJ = "02.984.383/0001-05";
        metalurgica.faturamento = 543000000;
        metalurgica.lucro = 5;
        metalurgica.lucroLiquido = calcularLucro(metalurgica);

        JOptionPane.showMessageDialog(null,
                "=== Fábrica 1 ===\n"
                + "Nome: " + textil.nome + "\n"
                + "CNPJ: " + textil.CNPJ + "\n"
                + "Faturamento Anual: R$" + textil.faturamento + "\n"
                + "Porcentagem de lucro: R$" + textil.lucro + "\n"
                + "Calculo do Lucro: " + textil.lucro + "+" + textil.faturamento  + "+" + textil.lucroLiquido
                + "=== Fábrica 2 ===\n"
                + "Nome: " + metalurgica.nome + "\n"
                + "CNPJ: " + metalurgica.CNPJ + "\n"
                + "Faturamento Anual: R$" + metalurgica.faturamento + "\n"
                + "Porcentagem de lucro: R$" + metalurgica.lucro + "\n"
                + "Calculo do Lucro: " + metalurgica.lucro + "+" + metalurgica.faturamento  + "+" + metalurgica.lucroLiquido
        );

    }

    private double calcularLucro(Fabricante fabricante) {
        double lucroLiquido = fabricante.faturamento * fabricante.lucro;
        return lucroLiquido;
    }
}
