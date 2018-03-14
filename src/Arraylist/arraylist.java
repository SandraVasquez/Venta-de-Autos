/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author UTBIS
 */
public class arraylist {

    /**
     *
     * @param args
     */
    public static void main(String args[]){
        // Scanner scanner = new Scanner(System.in);
        ArrayList<wagen> List = new ArrayList<>();
        boolean flag=true;
        
        do{
            int oper = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú"
            +"-------------"
            +"1) Ver lista de autos"
            +"2) Agregar auto"
            +"3) Vender auto"
            +"4) Obtener precio"
            +"-------------"
            +"0) Salir"));
            
            switch (oper){
                case 1:
                    if(List.size()>0){
                    for (int i=0; i < List.size(); i++){
                        System.out.println(List.get(i).getModelo());    //Se imprimirán las propiedades de cada auto (objeto) en la lista
                        System.out.println(List.get(i).getColor());
                        System.out.println(List.get(i).getPlacas());
                        System.out.println(List.get(i).getPrecio());
                        System.out.println("---------------------------");
                    }//end of for
                    }//end of if
                    else{
                        System.out.println("La lista está vacía, por favor agrege autos con la opción 2 del Menú");    //si la Lista está vacía, te enviará un mensaje pidiendo llenarlo
                        System.out.println("--------------------------------------------------------------------");
                    }//end of else
                    break;//end of case 1: Ver lista de autos
                case 2:
                    String a = JOptionPane.showInputDialog("Modelo del auto: ");    //pedirá una a una la información del auto para almacenarla en la Lista
                    String b = JOptionPane.showInputDialog("Color del auto: ");
                    String c = JOptionPane.showInputDialog("Placas del auto: ");
                    int d = Integer.parseInt(JOptionPane.showInputDialog("Precio del auto: "));
                    List.add(new wagen(a, b, c, d));
                    break;//end of case 2: Agregar auto
                case 3:
                    int R = Integer.parseInt(JOptionPane.showInputDialog("Auto a vender (posición en la lista)"
                    +"-------------"
                    +"En caso de no saber la posición el la lista, vaya a 'Ver lista de autos'"
                    +"-------------"
                    +"Recuerda: La lista comienza con posición 0"));
                    int po = Integer.parseInt(JOptionPane.showInputDialog("¿Vender?"
                    +"1) Sí"
                    +"2) No"));
                    if (po==1){
                        List.remove(R);
                        System.out.println("Vendido!!!");
                        System.out.println("-------------------------------");
                    }//end of if
                    else{
                    }//end of else
                    break;//end of case 3: Vender auto
                case 4:
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Auto a vender (posición en la lista)"
                    +"-------------"
                    +"En caso de no saber la posición el la lista, vaya a 'Ver lista de autos'"));
                    for (int i=0; i < List.size(); i++){
                        System.out.println(List.get(p).getPrecio());
                    }//end of for
                    break;
                case 0:
                    System.exit(0);
                    break;
            }//end of switch
            
        }//end of do
        while (flag);
    }//end of main
}//end of 
