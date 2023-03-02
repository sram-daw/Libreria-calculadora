package com.castelao;

/**
 * Libreria para crear una calculadora con las operaciones de suma, resta, multiplicación y división.
 *
 * @author Sara
 * @version 0.1
 */

public class Calculadora {
    /**
     * Opción de uso para la operación de suma
     */
    public static final int SUMA = 1;
    /**
     * Opción de uso para la operación de resta
     */
    public static final int RESTA = 2;
    /**
     * Opción de uso para la operación de multiplicacion
     */
    public static final int MULTIPLICACION = 3;
    /**
     * Opción de uso para la operación de división
     */
    public static final int DIVISION = 4;

    /**
     * Opción de uso para la operación de raíz
     */
    public static final int RAIZ = 5;

    /**
     * Método para operar con dos dos valores, realizando una suma, resta, multiplicación, división o raíces.
     *
     * @param primerValor  el primer valor que introduce el usuario para operar (float).
     * @param segundoValor el segundo valor que introduce el usuario para operar (float).
     * @param operacion    entero que determina qué operación se va a realizar.
     * @return devuelve un Integer con el resultado de la operación o un null en caso de que haya habido un error.
     */
    public static Integer operar(float primerValor, float segundoValor, int operacion) {
        Integer resultado = 0;
        switch (operacion) {
            case SUMA:
                try {
                    resultado = Math.round(primerValor) + Math.round(segundoValor);
                    return resultado;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }

            case RESTA:
                try {
                    resultado = Math.round(primerValor) - Math.round(segundoValor);
                    return resultado;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }

            case MULTIPLICACION:
                try {
                    resultado = Math.round(primerValor) * Math.round(segundoValor);
                    return resultado;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            case DIVISION:
                try {
                    resultado = Math.round(primerValor) / Math.round(segundoValor);
                    return resultado;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            case RAIZ:
                try {
                    resultado = (int) Math.pow(primerValor, 1.0 / segundoValor);
                    return resultado;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            default:
                return null;
        }
    }
}
