public class Rectangulo extends Figura {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.setAncho(ancho);
        this.setAlto(alto);
    }

    @Override
    public double calcularArea() {
        return getAncho() * getAlto();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * getAncho() + 2 * getAlto();
    }

    @Override
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