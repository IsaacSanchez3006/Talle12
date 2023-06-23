// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

class FigurasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la base del triángulo: ");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triángulo: ");
                double altura = sc.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + areaTriangulo);

                System.out.println("Ingrese el primer lado del triángulo: ");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el segundo lado del triángulo: ");
                double lado2 = sc.nextDouble();
                System.out.println("Ingrese el tercer lado del triángulo: ");
                double lado3 = sc.nextDouble();
                double perimetroTriangulo = lado1 + lado2 + lado3;
                System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
                break;

            case 2:
                System.out.println("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("El área del cuadrado es: " + areaCuadrado);

                double perimetroCuadrado = 4 * lado;
                System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
                break;

            case 3:
                System.out.println("Ingrese el radio del círculo: ");
                double radio = sc.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + areaCirculo);

                double perimetroCirculo = 2 * Math.PI * radio;
                System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        sc.close();
    }
}
