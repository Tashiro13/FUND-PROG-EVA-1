/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;// TODO code application logic here
        String modelo;
        int anio;
        double precio;
        Scanner captura = new Scanner(System.in);

        //hay un paquete System, dentro un paquete Out y dentro esta println
        System.out.println("Introduzca la marca del auto");
        marca = captura.nextLine ();
        System.out.println("Introduzca el modelo del auto");
        modelo = captura.nextLine();
        System.out.println("Introduzca el año del auto");
        anio = captura.nextInt();
        System.out.println("Introduzca el precio del auto");
        precio = captura.nextDouble();
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(anio);
        System.out.println(precio);
    }
    

}
