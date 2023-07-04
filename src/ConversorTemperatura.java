import javax.swing.*;

public class ConversorTemperatura {

    public static String conversao(double valor) {

        String resultado;

        String[] temperaturas = {"De Celsius para Kelvin", "De Celsius para Fahrenheit", "De Kelvin para Celsius",
                "De Fahrenheit para Celsius"};

        String opcoes = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:",
                "Conversor de temperatura", JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]);

        switch (opcoes) {
            case "De Celsius para Kelvin" -> resultado = (valor + 273.15) + " K";
            case "De Celsius para Fahrenheit" -> resultado = ((valor * 1.8) + 32) + "°F";
            case "De Kelvin para Celsius" -> resultado = (valor - 273.15) + "ºC";
            case "De Fahrenheit para Celsius" -> resultado = ((valor - 32) / 1.8) + "ºC";
            default -> resultado = "opção invalida";
        }


        return resultado;
    }

}
