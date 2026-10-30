package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg.Cuenta;

public class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("12345", "Titular", 0.0);
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
}