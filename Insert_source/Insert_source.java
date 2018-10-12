package insert_source;

import java.util.Random;

public class Insert_source {

    public static void main(String[] args) {
        
        long tempInicial = System.currentTimeMillis();
        
        int[] valores = new int[10];
        int[] antigos = new int[10];
        
        Random rd = new Random();
        
        for(int i = 0; i < 10; i++) {
            valores[i] = rd.nextInt(100);
            //valores[i] = i;
            //valores[i] = 9 - i;
        }
        
        for(int x = 0; x < valores.length; x++) {
            System.out.print(valores[x] + " ");
        }
        
        System.out.println("");

        
        while(true) {
            
            int c = 0;
            
            for(int x = 0; x < valores.length; x++) {
                antigos[x] = valores[x];
            }
            
            for(int i = 1; i < valores.length; i++) {
                
                int v = i - 1;
               
                if(valores[i] < valores[v]) {
                    int temp = valores[i];
                    valores[i] = valores[v];
                    valores[v] = temp;
                    System.out.println("");
                    for(int x = 0; x < valores.length; x++) {
                        System.out.print(valores[x] + " ");
                    }
                }
                
            }
                     
            for(int x = 0; x < valores.length; x++) {
                if(antigos[x] == valores[x]) {
                    c++;
                }
            }
            
            if(c == valores.length) {
                break;
            }
            
        }
        
        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("\n%03d segundos  e %04d milisegundos", dif/60, dif%60));
    }
}