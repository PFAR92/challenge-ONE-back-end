import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] menu = {"Conversor de moedas", "Conversor de temperatura"};

        while (true) {
            String opcoes = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Conversor",
                    JOptionPane.PLAIN_MESSAGE, null, menu, menu[0]);

            if (opcoes == null) {
                Verifica.encerra();
            } else {
                double valor = Verifica.input();
                String resultado = EscolhaConversor.conversorEscolhido(opcoes, valor);
                JOptionPane.showMessageDialog(null, resultado,
                        opcoes, JOptionPane.INFORMATION_MESSAGE);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                    "Conversor", JOptionPane.YES_NO_CANCEL_OPTION);

            if (escolha == JOptionPane.NO_OPTION) {
                Verifica.encerra();
            } else if (escolha == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa concluído",
                        "Conversor", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

}