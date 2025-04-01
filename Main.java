public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Corolla", 120.0);
        int dias = 8;

        double custo = carro.calcularCusto(dias);
        double multa = carro.calcularMulta(2);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Dias: " + dias);
        System.out.println("Custo total com desconto: R$" + custo);
        System.out.println("Multa por 2 dias de atraso: R$" + multa);
    }
}