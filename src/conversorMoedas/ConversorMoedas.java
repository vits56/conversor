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

    public void ConverterReaisParaEuro(double valor) {
        double moedaEuro = valor / 6.50;
        moedaEuro = (double) Math.round(moedaEuro * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em euro é: " + moedaEuro);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterEuroParaReais(double valor) {
        double moedaReal = valor * 6.50;
        moedaReal = (double) Math.round(moedaReal * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em real é: " + moedaReal);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterReaisParaLibraEsterlina(double valor) {
        double moedaLibraEsterlina = valor / 7.50;
        moedaLibraEsterlina = (double) Math.round(moedaLibraEsterlina * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em libra esterlina é: " + moedaLibraEsterlina);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterLibraEsterlinaParaReais(double valor) {
        double moedaReal = valor * 7.50;
        moedaReal = (double) Math.round(moedaReal * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em real é: " + moedaReal);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterReaisParaPesoArgentino(double valor) {
        double moedaPesoArgentino = valor / 0.06;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em peso argentino é: " + moedaPesoArgentino);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterPesoArgentinoParaReais(double valor) {
        double moedaReal = valor * 0.06;
        moedaReal = (double) Math.round(moedaReal * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em real é: " + moedaReal);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterReaisParaPesoChileno(double valor) {
        double moedaPesoChileno = valor / 0.007;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em peso chileno é: " + moedaPesoChileno);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterPesoChilenoParaReais(double valor) {
        double moedaReal = valor * 0.007;
        moedaReal = (double) Math.round(moedaReal * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em real é: " + moedaReal);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }
}
