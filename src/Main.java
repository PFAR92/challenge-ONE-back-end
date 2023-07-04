import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String optionOne = "Conversor de moedas";
        String optionTwo = "Conversor de temperatura";
        String[] options = {optionOne, optionTwo};


        String escolha = "";
        String opcoes = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Conversor",
                JOptionPane.PLAIN_MESSAGE, null, options, optionOne);

        double valor = Verifica.input();

        if (opcoes.equals(optionOne)) {
            escolha = ConversorMoedas.conversao(valor);
        } else if (opcoes.equals(optionTwo)) {
            escolha = ConversorTemperatura.conversao(valor);
        }

        JOptionPane.showMessageDialog(null, escolha,
                "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE);
    }

}