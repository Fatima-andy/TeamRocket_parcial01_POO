package com.FAQE.x00139619;

public class Documento {
    private String nombreD, numeroD;

    public Documento(String nombreD, String numero) {
        this.nombreD = nombreD;
        this.numeroD = numeroD;
    }

    public String getNombreD() {
        return nombreD;
    }

    public String getNumero() {
        return numeroD;
    }

    @Override
    public String toString() {
        return "Documento\n" +
                "Nombre del documento: " + nombreD +
                "\nNumero:" + numeroD;
    }
}
