package select_source;

import java.util.Random;

public class Select_source {
    public static void main(String[] args) {

        long tempInicial = System.currentTimeMillis();
        
        Random rd = new Random();

        int[] valores = new int[10];
        int menor ,a = 0, c = 0, i = 0;
         
        for(i = 0; i < 10; i++) {
            //Tres métodos que ela pediu
            valores[i] = rd.nextInt(10000);
            //valores[i] = i;
            //valores[i] = 9 - i;
        }
        
        for(i = 0; i < 10; i++) {
            System.out.print(valores[i] + " ");
        }
        
        System.out.println("");
        while(a < 10) {
            menor = valores[a];
            for(i = 0; i < 10; i++) {
                if(menor >= valores[i]) {
                    menor = valores[i];
                    c = i;
                }
            }
            valores[c] = 10000;
            System.out.print(menor + " ");
            a++;
        }

        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("\n%03d segundos  e %04d milisegundos", dif/60, dif%60));

    }
}
