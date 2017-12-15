// Programa que  calcula la multiplicacion de dos matrices n * m
package opmatriciales;

import java.util.Scanner;

/**
 *
 * @author gaapl
 */
public class OpMatriciales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int f1 = 0;
        int c1 = 0;

        int f2 = 0;
        int c2 = 0;

        System.out.println("ingrese el tamaño de la fila de la matriz 1");
        f1 = entrada.nextInt();

        System.out.println("ingrese el tamaño de la columna de la matriz 1");
        c1 = entrada.nextInt();

        System.out.println("ingrese el tamaño de la fila de la matriz 2");
        f2 = entrada.nextInt();

        System.out.println("ingrese el tamaño de la columna de la matriz 2");
        c2 = entrada.nextInt();

        if (c1 == f2) {

            int[][] array1 = new int[f1][c1];
            int[][] array2 = new int[f2][c2];

            // se ingresa la primer matriz
            System.out.println("ingrese los elementos de la primer matriz  ");

            for (int i = 0; i < f1; i++) {

                for (int j = 0; j < c1; j++) {

                    array1[i][j] = entrada.nextInt();

                }

            }
            // se ingresa la segunda matriz
            System.out.println("ingrese los elementos de la segunda matriz ");

            for (int i = 0; i < f2; i++) {

                for (int j = 0; j < c2; j++) {

                    array2[i][j] = entrada.nextInt();

                }

            }

            // se imprimen ambas matrices
            System.out.println("Las matrices ingresadas son:");

            for (int i = 0; i < f1; i++) {

                for (int j = 0; j < c1; j++) {

                    System.out.print("  " + array1[i][j]);

                    if (j == c1 - 1) {

                        System.out.println();
                    }
                }

            }
            System.out.println("-------------");
            for (int i = 0; i < f2; i++) {

                for (int j = 0; j < c2; j++) {

                    System.out.print("  " + array2[i][j]);

                    if (j == c2 - 1) {

                        System.out.println();
                    }
                }

            }

            System.out.println("-------------");

            // creando arreglo  de matriz transpuesta
            int ft = c2;
            int ct = f2;

            int[][] arrayT = new int[ft][ct];

            for (int i = 0; i < f2; i++) {

                for (int j = 0; j < c2; j++) {

                    arrayT[j][i] = array2[i][j];

                }

            }

            // multiplicando cada uno de los elementos
            int cont1 = 0;

            int[] arrayFF = new int[f1 * c2];
            int micont = 0;
            while (cont1 < f1) {

                int[] arrUnt = new int[c1];

                for (int j = 0; j < c1; j++) {

                    arrUnt[j] = array1[cont1][j];

                }
                int cont2 = 0;

                while (cont2 < ft) {

                    int[] arrUnt2 = new int[ct];
                    int[] arrproducto = new int[c1];
                    int sumProd = 0;

                    for (int j = 0; j < ct; j++) {

                        arrUnt2[j] = arrayT[cont2][j];

                    }

                    for (int w = 0; w < c1; w++) {

                        arrproducto[w] = arrUnt[w] * arrUnt2[w];
                    }

                    for (int h = 0; h < c1; h++) {

                        sumProd = arrproducto[h] + sumProd;
                    }

 
                    arrayFF[micont] = sumProd;

                    cont2 = cont2 + 1;
                    micont = micont + 1;

                }
                cont1 = cont1 + 1;
            }

            System.out.println("el producto de las dos matrices es:");
            for (int i = 1; i < arrayFF.length + 1; i++) {

                System.out.print(" " + arrayFF[i - 1]);

                if (i % c2 == 0) {

                    System.out.println();
                }

            }

            //*******************************
        }

    }

}
