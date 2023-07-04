import javax.swing.*;

public class ConversorMoedas {

    public static String conversao(double valor) {

        String resultado;


        String[] moedas = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Ienes",
                "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais",
                "De Ienes a Reais", "De Won Coreano a Reais"};


        String selectedOption = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Conversor",
                JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);


        switch (selectedOption) {
            case "De Reais a Dólares" -> resultado ="US$"+valor * 0.21;
            case "De Reais a Euros" -> resultado ="€ "+valor * 0.19;
            case "De Reais a Libras" -> resultado ="£ "+valor * 0.16;
            case "De Reais a Ienes" -> resultado ="¥ "+valor * 29.85;
            case "De Reais a Won Coreano" -> resultado ="₩ "+valor * 267.44;
            case "De Dólares a Reais" -> resultado ="R$"+valor * 4.81;
            case "De Euros a Reais" -> resultado ="R$"+valor * 5.27;
            case "De Libras a Reais" -> resultado ="R$"+valor * 6.16;
            case "De Ienes a Reais" -> resultado ="R$"+valor * 0.034;
            case "De Won Coreano a Reais" -> resultado ="R$"+valor * 0.0037;
            default -> resultado = "opção invalida";
        }
        return resultado;
    }

}
