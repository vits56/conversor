package conversorMoedas;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura", "Conversor de Quilometros"},
                "Conversor de Moeda").toString();
        switch (opcoes) {
            case "Conversor de Moeda":
                String input = JOptionPane.showInputDialog("Insira um valor que deseja converter");
                Validacao.validar(input);
                double valorRecebido = Double.parseDouble(input);
                Funcao moedas = new Funcao();
                moedas.ConverterMoedas(valorRecebido);
                break;
            case "Conversor de Temperatura":
                String input2 = JOptionPane.showInputDialog("Insira um valor que deseja converter");
                Validacao.validar(input2);
                double valorRecebido2 = Double.parseDouble(input2);
                Funcao temperaturas = new Funcao();
                temperaturas.ConverterTemperaturas(valorRecebido2);
                break;
            case "Conversor de Quilometros":
                String input3 = JOptionPane.showInputDialog("Insira um valor que deseja converter");
                Validacao.validar(input3);
                double valorRecebido3 = Double.parseDouble(input3);
                Funcao quilometros = new Funcao();
                quilometros.ConverterQuilometros(valorRecebido3);
                break;
        }
    }

}
