package conversorMoedas;

import javax.swing.*;

public class Funcao {
    ConversorMoedas conversorMoedas = new ConversorMoedas();

    public void ConverterMoedas(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Dólares a Reais", "De Reais a Euro", "De Euro a Reais", "De Reais Para Libras Esterlinas", "De Libras Esterlinas Para Reais", "De Reais Para Peso Argentino", "De Peso Argentino Para Reais", "DE Reais Para Peso Chileno", "De Peso Chileno Para Reais"}, "Escolha")).toString();
        switch (opcao) {
            case "De Reais a Dólares":
                conversorMoedas.ConverterReaisParaDolar(valorRecebido);
                break;
            case "De Dólares a Reais":
                conversorMoedas.ConverterDolarParaReais(valorRecebido);
                break;
            case "De Reais a Euro":
                conversorMoedas.ConverterReaisParaEuro(valorRecebido);
                break;
            case "De Euro a Reais":
                conversorMoedas.ConverterEuroParaReais(valorRecebido);
                break;
            case "De Reais Para Libras Esterlinas":
                conversorMoedas.ConverterReaisParaLibraEsterlina(valorRecebido);
                break;
            case "De Libras Esterlinas Para Reais":
                conversorMoedas.ConverterLibraEsterlinaParaReais(valorRecebido);
                break;
            case "De Reais Para Peso Argentino":
                conversorMoedas.ConverterReaisParaPesoArgentino(valorRecebido);
                break;
            case "De Peso Argentino Para Reais":
                conversorMoedas.ConverterPesoArgentinoParaReais(valorRecebido);
                break;
            case "DE Reais Para Peso Chileno":
                conversorMoedas.ConverterReaisParaPesoChileno(valorRecebido);
                break;
            case "De Peso Chileno Para Reais":
                conversorMoedas.ConverterPesoChilenoParaReais(valorRecebido);
                break;
        }
    }

    ConversorTemperaturas conversorTemperaturas = new ConversorTemperaturas();

    public void ConverterTemperaturas(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a temperatura para qual você deseja converter", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"}, "Escolha")).toString();
        switch (opcao) {
            case "De Celsius a Fahrenheit":
                conversorTemperaturas.ConverterCelsiusParaFahrenheit(valorRecebido);
                break;
            case "De Fahrenheit a Celsius":
                conversorTemperaturas.ConverterFahrenheitParaCelsius(valorRecebido);
                break;
        }
    }

    ConversorQuilometro conversorQuilometros = new ConversorQuilometro();
    public void ConverterQuilometros(double valorRecebido3) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a medida para qual você deseja converter", "Medidas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Quilometros a Metros", "De Metros a Quilometros", "De Quilometros a Milhas", "De Milhas a Quilometros", "De milhas a Metros", "De Metros a Milhas"}, "Escolha")).toString();
        switch (opcao) {
case "De Quilometros a Metros":
                conversorQuilometros.ConverterQuilometroParaMetro(valorRecebido3);
                break;
            case "De Metros a Quilometros":
                conversorQuilometros.ConverterMetroParaQuilometro(valorRecebido3);
                break;
            case "De Quilometros a Milhas":
                conversorQuilometros.ConverterQuilometroParaMilha(valorRecebido3);
                break;
            case "De Milhas a Quilometros":
                conversorQuilometros.ConverterMilhaParaQuilometro(valorRecebido3);
                break;
            case "De milhas a Metros":
                conversorQuilometros.ConverterMilhaParaMetro(valorRecebido3);
                break;
            case "De Metros a Milhas":
                conversorQuilometros.ConverterMetroParaMilha(valorRecebido3);
                break;
        }
    }
}
