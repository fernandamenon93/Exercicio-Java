public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0 || valorDiaria < 0) {
            throw new IllegalArgumentException("Dias e valor da diária devem ser positivos.");
        }

        double custoBase = dias * valorDiaria;
        return custoBase - desconto(dias);
    }

    public double desconto(int dias) {
        if (dias >= 7) {
            return dias * valorDiaria * 0.10;
        }
        return 0;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 0) return 0;
        return diasAtraso * valorDiaria * 1.2; // multa de 20% por dia de atraso
    }

    // Getters (se precisar usar nos testes ou no main)
    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}
