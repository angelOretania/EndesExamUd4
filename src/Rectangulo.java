public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    public double calcularArea() {
        return getAncho() * getAlto();
    }

    public double calcularPerimetro() {
        return 2 * getAncho() + 2 * getAlto();
    }

    public void dibujar() {
        System.out.println("Dibujando rectangulo " + getAncho() + "x" + getAlto());
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}