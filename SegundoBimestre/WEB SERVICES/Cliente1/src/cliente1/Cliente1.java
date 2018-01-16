/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente1;

import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class Cliente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double x = 5.5;
        //double y = 3.1;
        
        //System.out.println(resta(x, y));
        
        String numero1;
        String numero2;
        
        numero1 = JOptionPane.showInputDialog("Ingresa un primer número");
        numero2 = JOptionPane.showInputDialog("Ingresa un segundo número");
        
        double num1;
        double num2;
        
        
        num1 = Double.parseDouble(numero1);
        num2 = Double.parseDouble(numero2);
        
 
        JOptionPane.showMessageDialog(null,"LA RESPUESTA ES: " + resta(num1, num2));
              
    }

    private static double resta(double a, double b) {
        servicio.ServicioResta_Service service = new servicio.ServicioResta_Service();
        servicio.ServicioResta port = service.getServicioRestaPort();
        return port.resta(a, b);
    }
    
}
