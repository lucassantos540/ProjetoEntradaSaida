import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
      
        String nome;
        int idade;
        double salario;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));
        
        
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nIdade: "+idade+"\nSalario: "+salario);
        
    }
    
}
