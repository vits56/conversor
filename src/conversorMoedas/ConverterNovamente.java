package conversorMoedas;

import javax.swing.*;

public class ConverterNovamente {
    //*
    // Função que pergunta se quer converter novanete*/
    public void ConverterNovamente() {
        String opcao = (JOptionPane.showInputDialog(null,
                "Deseja converter novamente?", "Novamente", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Sim", "Não"}, "Escolha")).toString();
        switch (opcao) {
            case "Sim":
                Principal.main(null);
                break;
            case "Não":
                JOptionPane.showMessageDialog(null, "Obrigado por usar o conversor");
                break;
        }
    }
}
