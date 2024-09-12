import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o primeiro número:");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog("Forneça o segundo número:");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero \n" + e.toString() + "Erro: " + JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de conversão \n" + e.toString() + "Erro: " + JOptionPane.ERROR_MESSAGE);
        }catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tecla cancelar pressionada." + e.toString() + "Cancelado pelo usuário" + JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
