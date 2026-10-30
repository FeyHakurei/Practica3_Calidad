package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg.Cuenta;

public class CuentaTest {
    private Cuenta cuenta;
    private Cuenta cuenta12345;
    private Cuenta cuenta67890;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("00000", "Titular", 0.0);
        cuenta12345 = new Cuenta("12345", "Titular 1", 50.0);
        cuenta67890 = new Cuenta("67890", "Titular 2", 0.0);
    }

    @Test
    public void testIngresar() {
        cuenta.ingresar(100.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() {
        cuenta.retirar(100.0);
        assertEquals(-100.0, cuenta.getSaldo());
    }

    @Test
    public void test0014() {
     
        cuenta12345.retirar(200.0);
        
        cuenta67890.retirar(350.0);
       
        cuenta12345.ingresar(100.0);
       
        cuenta67890.retirar(200.0);
       
        cuenta67890.retirar(150.0);
       
        cuenta12345.retirar(200.0);
      
        cuenta67890.ingresar(50.0);
       
        cuenta67890.retirar(100.0);

        // Resultados esperados
        assertEquals(-250.0, cuenta12345.getSaldo());
        assertEquals(-450.0, cuenta67890.getSaldo());
    }
}