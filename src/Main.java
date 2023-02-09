import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operacion = 0;
        float primerValor = 0;
        float segundoValor = 0;
        System.out.println("¿Qué operación desea realizar?: \n1.Suma \n2.Resta \n3.Multiplicación \n4.Divisón");
        operacion = input.nextInt();
        input.nextLine(); //limpieza de scanner para cambiar el tipo de dato que va a detectar
        System.out.println();
        System.out.println("Introduce el primer valor: ");
        primerValor = input.nextFloat();
        System.out.println("Introduce el segundo valor: ");
        segundoValor = input.nextFloat();
        System.out.println("El resultado es "+Calculadora.operar(primerValor, segundoValor, operacion));


    }
}