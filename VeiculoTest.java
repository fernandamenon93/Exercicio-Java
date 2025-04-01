import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCalculoCustoSemDesconto() {
        Veiculo v = new Veiculo("Fusca", 100.0);
        assertEquals(300.0, v.calcularCusto(3));
    }

    @Test
    public void testCalculoCustoComDesconto() {
        Veiculo v = new Veiculo("Civic", 100.0);
        assertEquals(630.0, v.calcularCusto(7)); // 700 - 70 (10%)
    }

    @Test
    public void testDesconto() {
        Veiculo v = new Veiculo("Onix", 100.0);
        assertEquals(0, v.desconto(5));
        assertEquals(70.0, v.desconto(7));
    }

    @Test
    public void testCalculoMulta() {
        Veiculo v = new Veiculo("Fiat Uno", 100.0);
        assertEquals(240.0, v.calcularMulta(2)); // 2 * 100 * 1.2
    }

    @Test
    public void testCustoComValoresInvalidos() {
        Veiculo v = new Veiculo("HB20", 100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            v.calcularCusto(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Veiculo invalido = new Veiculo("Gol", -50.0);
            invalido.calcularCusto(2);
        });
    }
}



