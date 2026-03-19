public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.setRadio(radio);
    }

    public double calcularArea() {
        return 3.1416 * getRadio() * getRadio();
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * getRadio();
    }

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