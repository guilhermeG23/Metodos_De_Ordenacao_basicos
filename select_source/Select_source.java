package select_source;

import java.util.Random;

public class Select_source {
    public static void main(String[] args) {
        
        //Método simplista de select sort
        
        long tempInicial = System.currentTimeMillis();
        
        Random rd = new Random();

        int[] valores = new int[10];
        int menor ,a = 0, c = 0, i = 0, contador = 10;
        
         
        for(i = 0; i < contador; i++) {
            //Tres métodos que ela pediu
            //valores[i] = rd.nextInt(contador);
            valores[i] = i;
            //valores[i] = contador - i;
        }
        
        for(i = 0; i < contador; i++) {
            System.out.print(valores[i] + " ");
        }
        
        System.out.println("");

        
        System.out.println("");
        while(a < valores.length) {
            menor = valores[a];
            i = a;
            for(; i < valores.length; i++) {
                if(menor >= valores[i]) {
                    menor = valores[i];
                    valores[i] = valores[a];
                     valores[a]= menor;
                }
            }
            a++;
        }
        
        for(i = 0; i < contador; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println("");

        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("\n%03d segundos  e %04d milisegundos", dif/60, dif%60));
        
        
    }
}
