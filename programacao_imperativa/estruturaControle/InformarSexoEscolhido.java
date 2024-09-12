package estruturaControle;

import javax.swing.JOptionPane;


public class InformarSexoEscolhido {
    public static void main(String[] args) {
        Object [] op = {"Masculino", "Feminino"};
        String resposta = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n", 
            "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
        
        if(resposta.equals(null)){
            JOptionPane.showMessageDialog(null, "Você pressionou cancelar.");
        }
        if (resposta.equals("Masculino")) {
            JOptionPane.showMessageDialog(null, "Seja Bem-vindo!");
        }
        if (resposta.equals("Feminino")) {
            JOptionPane.showMessageDialog(null, "Seja Bem-vinda!");
        }
        System.exit(0);
    }
}
