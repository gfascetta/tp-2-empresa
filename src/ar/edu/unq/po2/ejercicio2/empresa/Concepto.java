package ar.edu.unq.po2.ejercicio1.empresa;

public class Concepto {
    String titulo;
    double monto;

    // CONSTRUCTOR
    public Concepto(String titulo, double monto){
        setTitulo(titulo);
        setMonto(monto);
    }

    // SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setMonto(double monto){
        this.monto = monto;
    }
}
