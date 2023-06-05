package app.run;

import app.Ui.TelaPrincipal;

import javax.swing.*;

public class MainTelaPrincipal {
    public static void main(String[] args) {
        //Instanciado a TelaPrincipal
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        //Setado o pane dela,aqui diz que a telaPrincipal vai modificar o panelPrincipal
        telaPrincipal.setContentPane(telaPrincipal.panelPrincipal);
        telaPrincipal.setVisible(true);
    }


}
