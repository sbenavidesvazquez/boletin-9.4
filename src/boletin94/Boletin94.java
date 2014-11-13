
package boletin94;


public class Boletin94 {

    
    public static void main(String[] args) {
        TablaMultiplicar tabla=new TablaMultiplicar();
        do{
            tabla.setNumero();
            if(tabla.getNumero()!=0){
                tabla.Resultado();
                
            }
            
            
        }while (tabla.getNumero()!=0);
        System.out.println("Terminado");
            
    
    }
    
}
