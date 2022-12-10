package conversorMoedas;

import javax.swing.*;

public class ConversorMoedas {
    public  void ConverterReaisParaDolar(double valor) {
        double moedaDolar = valor / 5.50;
        moedaDolar = (double) Math.round(moedaDolar * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em dolar é: " + moedaDolar);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public  void ConverterDolarParaReais(double valor) {
        double moedaReal = valor * 5.50;
        moedaReal = (double) Math.round(moedaReal * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em real é: " + moedaReal);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }
}
