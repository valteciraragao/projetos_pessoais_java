import javax.swing.JOptionPane;

public class CalculaDesconto {
    public static void main(String[] args) {
        String produto, aux;
        double preco, precoAtualizado;

        produto = JOptionPane.showInputDialog("Digite o nome do produto.");
        aux = JOptionPane.showInputDialog("Digite o preço do produto.");
        preco = Double.parseDouble(aux);

        try {
            if(preco >= 50 && preco < 200){
                precoAtualizado = preco * 0.95;
                JOptionPane.showMessageDialog(null, "Produto: " + 
                    produto + "\nPreço original: R$ " + preco 
                    + "\nPreço com desconto: R$ " + precoAtualizado);
            } else if(preco >= 200 && preco < 500){
                precoAtualizado = preco * 0.94;
                JOptionPane.showMessageDialog(null, "Produto: " 
                    + produto + "\nPreço original: R$ " 
                    + preco + "\nPreço com desconto: R$ " + precoAtualizado);
            } else if(preco >= 500 && preco < 1000){
                precoAtualizado = preco * 0.93;
                JOptionPane.showMessageDialog(null, "Produto: " 
                    + produto + "\nPreço original: R$ " + 
                    preco + "\nPreço com desconto: R$ " + precoAtualizado);
            }else{
                precoAtualizado = preco * 0.92;
                JOptionPane.showMessageDialog(null, "Produto: " + 
                    produto + "\nPreço original: R$ " + 
                    preco + "\nPreço com desconto: R$ " + precoAtualizado);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter o preço, digite um valor valido no fomarto xx.xx" +  
                e.toString() + JOptionPane.ERROR_MESSAGE);
        }
    }
}
