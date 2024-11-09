package com.campusdual.classroom;


public class Exercise07 {

    public static void main(String[] args) {
        sumFirstNaturalNumbers(10);
        showFirstNaturalNumbers(20);
        showFirstNaturalNumbers(-20);//comprobo que o if me devolve o comentario o non ser positivo
        sumFirstNaturalNumbers(-10);//comprobo que o if me devolve o comentario o non ser positivo

    }


    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {

    }


    /* El método sumFirstNaturalNumbers() recibe un número entero por parámetro. El método mostrará por pantalla un mensaje o mensajes,
    para que quede más claro, que muestre la suma de los primeros números positivos que indique el parámetro.
     Que imprima como mensaje la suma de los primeros N números positivos */
    public static void sumFirstNaturalNumbers(int numero) {
        int suma = 0;
        if (numero <= 1){
            System.out.println("Ingresa un número positivo ");
           return;
        }

        for (int i = 1; i <= numero; i++) {
            suma += i;

        }
        System.out.println("la suma de los primeros " + numero + "  numeros naturales es de: " + suma);

    }


    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int numero) {

        if (numero < 1) { //valido que o num sexa un numero enteiro positivo
            System.out.println("Ingresa un número entero positivo.");
            return;
        }

        System.out.print("Los primeros " + numero + " números naturales son: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
            if (i < numero) {
                System.out.println(", ");
            }
        }
        System.out.println();
    }
}


