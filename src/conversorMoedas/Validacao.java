package conversorMoedas;

import javax.swing.*;

public class Validacao {
    // não pode letras e caracteres especiais
    public static boolean validar(String valorRecebido) {
        if (valorRecebido.matches("")) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor");
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
            return false;
        } else if (valorRecebido.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Por favor, não insira letras");
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
            return false;
        } else if (valorRecebido.matches("[!@#$%¨&*()_+|<>?:{}]+")) {
            JOptionPane.showMessageDialog(null, "Por favor, não insira caracteres especiais");
            ConverterNovamente converterNovamente = new ConverterNovamente();
            converterNovamente.ConverterNovamente();
            return false;
        } else {
            return true;
        }
    }

}
