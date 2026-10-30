package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta 
{
    private String mNumero;
    private String mTitular;
    private Double mSaldo;
    private List<Movimiento> mMovimientos;

    public Cuenta(String numero, String titular, Double saldoInicial) 
    {
        this.mNumero = numero;
        this.mTitular = titular;
        this.mSaldo = saldoInicial;
        this.mMovimientos = new ArrayList<>();
    }

    public void ingresar(Double x) 
    {
        //  Versión 1 para que el test falle
    }

    public void retirar(Double x) {
        // Versión 1 para que el test falle
    }

    public Double getSaldo() {
        return this.mSaldo;
    }
}