import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String optionOne = "Conversor de moedas";
        String optionTwo = "Conversor de temperatura";
        String[] options = {optionOne, optionTwo};
        boolean retornar = true;

        while (retornar) {

            String escolha = "";
            String selectedOption = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Conversor",
                    JOptionPane.PLAIN_MESSAGE, null, options, optionOne);

            double valor = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma valor"));

            if (selectedOption.equals(optionOne)) {
                escolha = ConversorMoedas.conversao(valor);
            } else if (selectedOption.equals(optionTwo)) {
                escolha = ConversorTemperatura.conversao(valor);
            }

            JOptionPane.showMessageDialog(null, escolha,
                    "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}