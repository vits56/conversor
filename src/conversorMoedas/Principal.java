package conversorMoedas;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"},
                "Conversor de Moeda").toString();
        switch (opcoes) {
            case "Conversor de Moeda":
                String input = JOptionPane.showInputDialog("Insira um valor");

        }
    }
}
