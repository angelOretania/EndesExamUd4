package com.figuras.modelo;

/**
 * Interfaz TipoFigura que contiene los métodos listos
 * para ser sobreescitos por cada una de las clases que la implementen
 */
public interface TipoFigura {
    double calcularArea();

    double calcularPerimetro();

    void dibujar();
}
