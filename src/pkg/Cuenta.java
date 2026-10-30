package pkg;

import java.util.ArrayList;
import java.util.List;
import pkg.Movimiento.Signo;

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
        this.mSaldo += x;
        this.mMovimientos.add(new Movimiento(x, Signo.H, "Ingreso de " + x + "€"));
    }

    public void retirar(Double x) 
    {
        if (this.mSaldo - x >= -500.0) 
        {
            this.mSaldo -= x;
            this.mMovimientos.add(new Movimiento(x, Signo.D, "Reintegro de " + x + "€"));
        }
        else 
        {
            System.out.println("Fondos insuficientes (saldo " + this.mSaldo + "€) en la cuenta " 
                + this.mNumero + " para el reintegro de " + x + "€");
        }
    }

    public Double getSaldo() {
        return this.mSaldo;
    }
}