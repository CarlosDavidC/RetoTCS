package Utils;

import Model.Jugador;

import javax.swing.*;

import static Constants.ConstantesApuesta.ERROR_INCORRECTO;
import static Constants.ConstantesApuesta.ERROR_OBLIGATORIO;

public class GeneralUtils {

    public static boolean validateEmpty(JTextField textField) {
        if (textField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(textField, ERROR_OBLIGATORIO);
            return false;
        }
        return true;
    }

    public static boolean validateValue(JFormattedTextField jFormattedTextField, Jugador jugador) {
        int creditosApostados = Integer.parseInt(jFormattedTextField.getValue().toString());
        if (jugador.getCreditosTotales() != 0) {
            if (jFormattedTextField.getValue() == null || jFormattedTextField.getValue().toString().isEmpty()
                    || creditosApostados <= 0 || creditosApostados > jugador.getCreditosTotales()) {
                JOptionPane.showMessageDialog(jFormattedTextField, ERROR_INCORRECTO);
                return false;
            }

        }
        return true;
    }
}