public class CalculadoraArea {
    public static double calcularArea(double lado) {
        return lado * lado; // Área de um quadrado
    }

    public static double calcularArea(double largura, double altura) {
        return largura * altura; // Área de um retângulo
    }

    public static double calcularArea(int raio) {
        return Math.PI * raio * raio; // Área de um círculo
    }

    public static void main(String[] args) {
        System.out.println("Área do quadrado: " + calcularArea(5.0));
        System.out.println("Área do retângulo: " + calcularArea(4.0, 6.0));
        System.out.println("Área do círculo: " + calcularArea(3));
    }
}
