/*
 Implemente un algoritmo que le permita:
1) Desplegar el nombre del proyecto de su paper.
2) Que es una red neuronal.
3) cuales son los elementos que forman una red neuronal.
4) Como utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5) Como utilizaria usted la red neuronal como mejoramiento al proyecto propuesto.
6) En que consistió el entrenamiento utilizando la red neuronal, e indique
   el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author: Quishpe Urrutia Job Nicolas.
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in); //new, reserva espacio de memoria.
        
        System.out.println("Desplegar el nombre de proyecto de su paper:");
        String nombrepaper=objeto.nextLine();
        
        System.out.println("Que es una red neuronal:");
        String redneuronal=objeto.nextLine();
        
        System.out.println("Cuales son los elementos que forman una red neuronal:");
        String elementos=objeto.nextLine();
        
        System.out.println("Como utilizaron la red neuronal en el proyecto que usted ha seleccionado:");
        String utilizaron=objeto.nextLine();
        
        System.out.println("Como utilizaria usted la red neuronal como mejoramiento al proyecto propuesto:");
        String utilizariausted=objeto.nextLine();
        
        System.out.println("En que consistió el entrenamiento utilizando la red neuronal, e indique el algoritmo utilizado:");
        String consistió=objeto.nextLine();
    
    }
    
}
