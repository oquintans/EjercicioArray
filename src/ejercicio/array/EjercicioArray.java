/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.array;

/**
 *
 * @author oquintansocampo
 */
public class EjercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni par1=new Dni(53193822);
        System.out.println("Numero letra DNI: "+par1.getDni());
        System.out.println("Letra DNI: "+par1.getLetra(par1.getDni()));
    }
    
}
