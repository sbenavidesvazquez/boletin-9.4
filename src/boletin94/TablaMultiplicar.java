
package boletin94;

import java.util.Scanner;


public class TablaMultiplicar {
    
    int n;
    
    public TablaMultiplicar(){
        
    }
    public void setNumero(){
        Scanner dato=new Scanner(System.in);
        System.out.println("número:");
        n=dato.nextInt();
    }
    public int getNumero(){
        return n;
    }
    public void Resultado(){
    
        for(int m=0;m<=10;m++){
        System.out.println("producto= "+ n*m);
        }
    }
}
