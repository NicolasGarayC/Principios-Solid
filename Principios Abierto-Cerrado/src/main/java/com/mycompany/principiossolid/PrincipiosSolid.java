package com.mycompany.principiossolid;

public class PrincipiosSolid {

    public static void main(String[] args) {
        Figuras fig = new Figuras();
        Figura cuadrado = new Cuadrado();
        Figura circulo = new Circulo();
        fig.addFigura(circulo);
        fig.addFigura(cuadrado);
        fig.dibujarFiguras();
    }
}
