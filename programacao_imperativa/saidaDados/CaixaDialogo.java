import javax.swing.JOptionPane;

public class CaixaDialogo {
    public static void main(String[] args) {
        String aux;
        float comprimento, largura, area, perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento: ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a largura: ");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = 2 * comprimento + 2 * largura;

            JOptionPane.showMessageDialog(null, "Área: " + area + ", Perimetro: " + perimetro);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Houve erro na conversão, digite apenas valores númericos.");
        }
        System.exit(0);
    }
}
