import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operacion = 0;
        float primerValor = 0;
        float segundoValor = 0;
        System.out.println("¿Qué operación desea realizar?: \n1.Suma \n2.Resta \n3.Multiplicación \n4.Divisón");
        operacion = input.nextInt();
        primerValor = EntradaSalida.entradaInt("Introduce el primer valor: ").floatValue();
        segundoValor = EntradaSalida.entradaInt("Introduce el segundo valor: ").floatValue();
        System.out.println("El resultado es " + Calculadora.operar(primerValor, segundoValor, operacion));


    }
}