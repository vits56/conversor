package conversorMoedas;

import javax.swing.*;

public class ConversorQuilometro {
    public void ConverterQuilometroParaMilha(double valor) {
        double quilometroParaMilha = valor * 0.621371;
        quilometroParaMilha = (double) Math.round(quilometroParaMilha * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Milha é: " + quilometroParaMilha);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterMilhaParaQuilometro(double valor) {
        double milhaParaQuilometro = valor * 1.60934;
        milhaParaQuilometro = (double) Math.round(milhaParaQuilometro * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Quilometro é: " + milhaParaQuilometro);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterQuilometroParaMetro(double valor) {
        double quilometroParaMetro = valor * 1000;
        quilometroParaMetro = (double) Math.round(quilometroParaMetro * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Metro é: " + quilometroParaMetro);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterMetroParaQuilometro(double valor) {
        double metroParaQuilometro = valor * 0.001;
        metroParaQuilometro = (double) Math.round(metroParaQuilometro * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Quilometro é: " + metroParaQuilometro);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterMilhaParaMetro(double valor) {
        double milhaParaMetro = valor * 1609.34;
        milhaParaMetro = (double) Math.round(milhaParaMetro * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Metro é: " + milhaParaMetro);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }

    public void ConverterMetroParaMilha(double valor) {
        double metroParaMilha = valor * 0.000621371;
        metroParaMilha = (double) Math.round(metroParaMilha * 100) / 100;
        JOptionPane.showMessageDialog(null, "O valor em Milha é: " + metroParaMilha);
        ConverterNovamente converterNovamente = new ConverterNovamente();
        converterNovamente.ConverterNovamente();
    }
}
