package bubblesort;

import java.util.Random;

public class bubllesort {
    public static void main(String args[]) {

        long tempInicial = System.currentTimeMillis();

        Random rd = new Random();

        int[] valores = new int[10];
        int a = 0;
        int b;
        int i;
        
        for(i = 0; i < 10; i++) {
            //Tres métodos que ela pediu
            valores[i] = rd.nextInt(10000);
            //valores[i] = i;
            //valores[i] = 9 - i;
        }
        
        for(i = 0; i < 10; i++) {
            System.out.print(valores[i] + " ");
        }
        
        while(a < 10) {
            for(i = 0; i < 10; i++) {
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
        
        for(i = 0; i < 10; i++) {
            System.out.print(valores[i] + " ");
        }
        
        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("\n%03d segundos  e %04d milisegundos", dif/60, dif%60));

    }
}
