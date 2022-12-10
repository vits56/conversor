package conversorMoedas;

import javax.swing.*;

public class ConversorTemperaturas {
    public void ConverterCelsiusParaFahrenheit(double valor) {
        double temperaturaFahrenheit = (valor * 1.8) + 32;
        temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Fahrenheit é: " + temperaturaFahrenheit);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterFahrenheitParaCelsius(double valor) {
        double temperaturaCelsius = (valor - 32) / 1.8;
        temperaturaCelsius = (double) Math.round(temperaturaCelsius * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Celsius é: " + temperaturaCelsius);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }
}
