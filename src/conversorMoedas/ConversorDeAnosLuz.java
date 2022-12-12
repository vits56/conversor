package conversorMoedas;

import javax.swing.*;

public class ConversorDeAnosLuz {

        public void ConverterAnosLuzParaQuilometros(double valor) {
            double quilometros = valor * 9460528400000.0;
            quilometros = (double) Math.round(quilometros * 100) / 100;
            JOptionPane.showMessageDialog(null, "O valor em Quilometros é: " + quilometros);
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
        }

        public void ConverterQuilometrosParaAnosLuz(double valor) {
            double anosLuz = valor / 9460528400000.0;
            anosLuz = (double) Math.round(anosLuz * 100) / 100;
            JOptionPane.showMessageDialog(null, "O valor em Anos Luz é: " + anosLuz);
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
        }

        public void ConverterAnosLuzParaMilhas(double valor) {
            double milhas = valor * 5878625373184.0;
            milhas = (double) Math.round(milhas * 100) / 100;
            JOptionPane.showMessageDialog(null, "O valor em Milhas é: " + milhas);
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
        }

        public void ConverterMilhasParaAnosLuz(double valor) {
            double anosLuz = valor / 5878625373184.0;
            anosLuz = (double) Math.round(anosLuz * 100) / 100;
            JOptionPane.showMessageDialog(null, "O valor em Anos Luz é: " + anosLuz);
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
        }


}
