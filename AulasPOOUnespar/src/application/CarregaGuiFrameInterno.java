package application;

import javax.swing.JFrame;

public class CarregaGuiFrameInterno {

    public static void main(String[] args){

        JFrame frame = new JFrame ("Uso de Combo");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GuiFrameInterno());
        frame.setBounds(0,0,500,300);

        frame.setVisible (true);
    }
}