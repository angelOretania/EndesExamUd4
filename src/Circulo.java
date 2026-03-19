public class Circulo extends Figura {

    public static final double PI = 3.1416;
    private double radio;

    public Circulo(double radio) {
        this.setRadio(radio);
    }

    @Override
    public double calcularArea() {
        return PI * getRadio() * getRadio();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * getRadio();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + getRadio());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}