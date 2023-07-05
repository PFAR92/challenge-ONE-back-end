public class EscolhaConversor {
    static String escolha = "";

    public static String conversorEscolhido(String conversor, double valor) {

        if (conversor.equals("Conversor de moedas")) {
            escolha = ConversorMoedas.conversao(valor);
        } else if (conversor.equals("Conversor de temperatura")) {
            escolha = ConversorTemperatura.conversao(valor);
        }
        return escolha;
    }
}
