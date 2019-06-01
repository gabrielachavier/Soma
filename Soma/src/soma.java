import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class soma extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    public soma()
    {
        super("Exemplo de soma");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,180,300,20);
        exibir.setFont(new Font("Cooper Preto",Font.BOLD,20));
        somar.setBounds(50,100,80,20);
        subtrair.setBounds(150,100,80,20);
        dividir.setBounds(150,150,80,20);
        multiplicar.setBounds(250,100,100,20);
        
        somar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int numero1, numero2, soma;
                soma=0;
                numero1=Integer.parseInt(texto1.getText());
                numero2=Integer.parseInt(texto2.getText());
                soma=numero1+numero2;
                exibir.setVisible(true);
                exibir.setText("O resultado da soma é: "+soma);
                }
            }
        );
        
        subtrair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int numero1, numero2, sub;
                sub=0;
                numero1=Integer.parseInt(texto1.getText());
                numero2=Integer.parseInt(texto2.getText());
                sub=numero1-numero2;
                exibir.setVisible(true);
                exibir.setText("O resultado da substração é: "+sub);
                }
            }
        );
        
        multiplicar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int numero1, numero2, mult;
                mult=0;
                numero1=Integer.parseInt(texto1.getText());
                numero2=Integer.parseInt(texto2.getText());
                mult=numero1*numero2;
                exibir.setVisible(true);
                exibir.setText("O resultado da multiplicação é: "+mult);
                }
            }
        );
        
        dividir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                int numero1, numero2, div;
                div=0;
                numero1=Integer.parseInt(texto1.getText());
                numero2=Integer.parseInt(texto2.getText());
                div=numero1/numero2;
                exibir.setVisible(true);
                exibir.setText("O resultado da divisão é: "+div);
                }
            }
        );
        exibir.setVisible(false);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        
        setSize(400,250);
        setVisible(true);
    } 
    public static void main(String[] args) {
        soma app = new soma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
