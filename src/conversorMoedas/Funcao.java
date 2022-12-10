package conversorMoedas;

import javax.swing.*;

public class Funcao {
    ConversorMoedas conversorMoedas = new ConversorMoedas();
    public void ConverterMoedas(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Dólares a Reais"}, "Escolha")).toString();
        switch (opcao) {
            case "De Reais a Dólares":
                conversorMoedas.ConverterReaisParaDolar(valorRecebido);
                break;
            case "De Dólares a Reais":
                conversorMoedas.ConverterDolarParaReais(valorRecebido);
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


}
