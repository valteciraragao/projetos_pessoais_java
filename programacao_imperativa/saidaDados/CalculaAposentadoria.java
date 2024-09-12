import javax.swing.JOptionPane;

public class CalculaAposentadoria {
    public static void main (String [] args){
        String dado, sexo;
        int idade, tempoContribuicao, diferencaContribuicao;

        try{
            dado = JOptionPane.showInputDialog("Digite sua idade: ");
            idade = Integer.parseInt(dado);

            dado = JOptionPane.showInputDialog("Digite o tempo de contribuição: ");
            tempoContribuicao = Integer.parseInt(dado);

            sexo = JOptionPane.showInputDialog("Digite seu sexo: ");

            if(sexo == "feminino" || sexo == "FEMININO" || sexo == "f" || sexo == "F"){
                if(idade >= 60 && tempoContribuicao >= 30){
                    JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria");
                } else{
                    diferencaContribuicao = 30 - tempoContribuicao;
                    JOptionPane.showMessageDialog(null,"Você precisar contribuir mais " + diferencaContribuicao + " anos de contribuição para ter direito a aposentadoria");
                }
            }

            if(sexo == "masculino" || sexo == "MASCULINO" || sexo == "m" || sexo == "M"){
                if(idade >= 65 && tempoContribuicao >= 35){
                    JOptionPane.showMessageDialog(null,"Você já tem direito a aposentadoria");
                }else{
                    diferencaContribuicao = 30 - tempoContribuicao;
                    JOptionPane.showMessageDialog(null,"Você precisar contribuir mais " + diferencaContribuicao + " anos de contribuição para ter direito a aposentadoria");
                }
            }


        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Houve erro na conversão, digite apenas valores númericos.");
        }
        System.exit(0);
    }
}
