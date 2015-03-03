/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveonscreen;

/**
 *
 * @author HbTO
 */
public class MoveOnScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Screen obj = new Screen();
       obj.setVisible(true);
       obj.conexion(7777, "192.10.11.47");
    }
}
