import javax.swing.*;

public class Verifica {

    public static double input() {
        double valor = 0.0;

        while (true) {

            String valorInformado = JOptionPane.showInputDialog("Escolha uma valorInformado");

            if (valorInformado != null && valorInformado.matches("\\d+")) {
                valor = Double.parseDouble(valorInformado);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite apenas números.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        return valor;
    }
}
