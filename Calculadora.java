import java.util.Scanner;

public class Calculadora {
    
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        int resultadoSuma = suma(num1, num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + resultadoSuma);
        
        int resultadoMultiplicacion = multiplicacion(num1, num2);
        System.out.println("La multiplicación de " + num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        double resultadoDivision = dividir(num1, num2);
        System.out.println("La división de " + num1 + " / " + num2 + " = " + resultadoDivision);
        
        scanner.close();
    }
}
