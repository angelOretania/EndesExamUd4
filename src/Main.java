public class Main {

    public static void main(String[] args) {

        GestorFiguras gestor = new GestorFiguras();

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 3, 4, 5);

        gestor.agregarFigura(circulo);
        gestor.agregarFigura(rectangulo);
        gestor.agregarFigura(triangulo);

        System.out.println("---- AREAS ----");
        gestor.mostrarAreas();

        System.out.println("---- PERIMETROS ----");
        gestor.mostrarPerimetros();

        System.out.println("---- DIBUJAR ----");
        gestor.dibujarTodo();
    }
}