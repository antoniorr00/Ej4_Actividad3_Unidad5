public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura=new Pintura(250);
        Rectangulo rectangulo= new Rectangulo(20, 35);
        Esfera esfera=new Esfera(15);
        Cilindro cilindro= new Cilindro(10, 30);

        System.out.println("La cantidad de pintura que necesitamos para el réctangulo es: "+pintura.calcularCantidadPintura(rectangulo));
        System.out.println("La cantidad de pintura que necesitamos para el esfera es: "+pintura.calcularCantidadPintura(esfera));
        System.out.println("La cantidad de pintura que necesitamos para el cilindro es: "+pintura.calcularCantidadPintura(cilindro));
    }
}