package composicao;

public class Motor {

    private double cilindradas;
    private String combustivel; // Flex, Álcool, Gasolina, Diesel

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public String getCombustivel(){
        return combustivel;
    };

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return  "Motor:\nCilindradas: " + cilindradas + "\nCombustível: " + combustivel;
    }
}