import java.util.ArrayList;

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

            // horrible uso de instanceof
            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.println("Area circulo: " + c.calcularArea());
            }

            if (f instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) f;
                System.out.println("Area rectangulo: " + r.calcularArea());
            }

            if (f instanceof Triangulo) {
                Triangulo t = (Triangulo) f;
                System.out.println("Area triangulo: " + t.calcularArea());
            }
        }
    }

    public void mostrarPerimetros() {

        for (Object f : getFiguras()) {

            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.println("Perimetro circulo: " + c.calcularPerimetro());
            }

            if (f instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) f;
                System.out.println("Perimetro rectangulo: " + r.calcularPerimetro());
            }

            if (f instanceof Triangulo) {
                Triangulo t = (Triangulo) f;
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