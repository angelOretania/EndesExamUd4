package com.figuras.servicio;

import com.figuras.modelo.Circulo;
import com.figuras.modelo.Rectangulo;
import com.figuras.modelo.Triangulo;

import java.util.ArrayList;

/**
 * El servicio GestorFiguras crea una lista de objetos.
 * Accede a ellos mediante un Getter e imprime el resultado adecuado para cada uno de ellos
 */
public class GestorFiguras {

    private ArrayList<Object> figuras;

    public GestorFiguras() {
        setFiguras(new ArrayList<>());
    }

    public void agregarFigura(Object f) {
        getFiguras().add(f);
    }

    public void mostrarAreas() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo c) {
                System.out.println("Area circulo: " + c.calcularArea());
            }

            if (f instanceof Rectangulo r) {
                System.out.println("Area rectangulo: " + r.calcularArea());
            }

            if (f instanceof Triangulo t) {
                System.out.println("Area triangulo: " + t.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo c) {
                System.out.println("Perimetro circulo: " + c.calcularPerimetro());
            }

            if (f instanceof Rectangulo r) {
                System.out.println("Perimetro rectangulo: " + r.calcularPerimetro());
            }

            if (f instanceof Triangulo t) {
                System.out.println("Perimetro triangulo: " + t.calcularPerimetro());
            }
        }
    }

    public void dibujarTodo() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo) {
                ((Circulo) f).dibujar();
            }

            if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujar();
            }

            if (f instanceof Triangulo) {
                ((Triangulo) f).dibujar();
            }
        }
    }

    public ArrayList<Object> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Object> figuras) {
        this.figuras = figuras;
    }
}