
import javax.swing.JOptionPane;


public class  CarroExecutor {
    public void executar(){
        Carro uno = new Carro();
        uno.motor = 3.5;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";
        uno.isEletrico = false;
        uno.marca = "Fiat";
        uno.aro = 14;

        //Unof foi mexido
        uno.modelo ="Uno com escada dupla";
        uno.motor = 7.0;
        uno.cor = "Relampago do marquinhos";

        Carro carro1 = new Carro();
        carro1.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        carro1.cor = JOptionPane.showInputDialog("Digite a cor");
        carro1.isEletrico = Boolean.parseBoolean(JOptionPane.showInputDialog("Carro elétrico [true/false"));
        carro1.motor = Double.parseDouble(JOptionPane.showInputDialog("Digite a potência do motor"));
        carro1.marca = JOptionPane.showInputDialog("Digite o nome da marca");
        carro1.aro = Integer.parseInt(JOptionPane.showInputDialog("Digite o aro do carro"));

        JOptionPane.showMessageDialog(null,
            "=== Dados do uno ===\n" +
            "Modelo: " + uno.modelo + "\n" +
            "Cor: " + uno.cor + "\n" +
            "Elétrico: " + uno.isEletrico + "\n" +
            ",Motor: " + uno.motor + "\n" +
            "Marca: " + uno.marca + "\n" +
            "Aro: " + uno.aro + "\n\n" +
            
            "=== Dados do carro 1 ===\n" +
            "Modelo: " + carro1.modelo + "\n" +
            "Cor: " + carro1.cor + "\n" +
            "Elétrico: " + carro1.isEletrico + "\n" +
            ",Motor: " + carro1.motor + "\n" +
            "Marca: " + carro1.marca + "\n" +
            "Aro: " + carro1.aro );
        }
}