import javax.swing.*;

public class Verifica {

    public static double input() {
        double valor = 0.0;

        while (true) {

            String valorInformado = JOptionPane.showInputDialog("Escolha uma valorInformado");
            if (valorInformado != null) {
                if (!valorInformado.isEmpty() && valorInformado.matches("\\d+")) {
                    valor = Double.parseDouble(valorInformado);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite apenas números.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                encerra();
            }
        }

        return valor;
    }

    public static void encerra (){
        JOptionPane.showMessageDialog(null, "Programa finalizado.",
                "Informação", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
