public class Calculadora {
    
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int resultado = suma(numero1, numero2);
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + resultado);
    }
}
