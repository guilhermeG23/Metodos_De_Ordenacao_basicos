package bubblesort;

import java.util.Random;

public class bubllesort {
    public static void main(String args[]) {

        //Método simplista de bubble sort

        long tempInicial = System.currentTimeMillis();

        Random rd = new Random();
    
        int contador = 10;

        int[] valores = new int[contador];
        int a = 0, b, i;
        
        for(i = 0; i < contador; i++) {
            //Tres métodos que ela pediu
            valores[i] = rd.nextInt(contador);
            //valores[i] = i;
            //valores[i] = contador - i;
        }
        
        for(i = 0; i < contador; i++) {
            System.out.print(valores[i] + " ");
        }
        
        while(a < contador) {
            for(i = 0; i < contador; i++) {
                b = i + 1;
                if(b == 10){
                    break;
                }
                if(valores[i] > valores[b]) {
                    int temp = valores[i];
                    valores[i] = valores[b];
                    valores[b] = temp;
                }
            }
            a++;
        }

        System.out.println("");
        
        for(i = 0; i < contador; i++) {
            System.out.print(valores[i] + " ");
        }
        
        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("\n%03d segundos  e %04d milisegundos", dif/60, dif%60));

    }
}
