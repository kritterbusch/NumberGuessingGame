/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessinggame;

import javax.swing.UIManager;

/**
 *
 * @author kritterbusch
 */
public class StartUp {

    private final static String LOOK_AND_FEEL_ERR = "Custom look and feel error. Default look and feel will take its place.";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Look and Feel
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(LOOK_AND_FEEL_ERR);
        }

        /**
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameDisplayWindow().setVisible(true);
            }
        });
    }

}
