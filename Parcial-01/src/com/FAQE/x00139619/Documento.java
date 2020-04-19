package com.FAQE.x00139619;

public class Documento {
    private String nombreD, numero;

    public Documento(String nombreD, String numero) {
        this.nombreD = nombreD;
        this.numero = numero;
    }

    public String getNombreD() {
        nombreD = nombreD + ".txt";
        return nombreD;
    }

    public String getNumero() {
        numero = 1 + numero;
        return numero;
    }

}
