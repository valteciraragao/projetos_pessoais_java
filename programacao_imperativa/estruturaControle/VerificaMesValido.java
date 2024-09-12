import javax.swing.JOptionPane;

public class VerificaMesValido {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite o número do mês");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if(mes >=1 && mes <=12){
                    JOptionPane.showMessageDialog(null, "Número do mês válido!\n " + mes);
                } else {
                    JOptionPane.showMessageDialog(null, "Número do mês inválido!\n " + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros" + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada. ");
        }
        System.exit(0);
    }
}
