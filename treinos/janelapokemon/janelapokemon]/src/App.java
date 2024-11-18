import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class App {

    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame("Janela com pokemon");

        janela.setSize(600, 500);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("charmander.png");
        ImageIcon image2 = new ImageIcon("bulbasaur.png");
        ImageIcon image3 = new ImageIcon("squirtle.png");
        JLabel agua = new JLabel(image);
        JLabel labelComImagem = new JLabel(image3);
        JLabel label = new JLabel(image2);


        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(2,2));

        panel.add(labelComImagem);
        panel.add(label);
        panel.add(agua);
        janela.add(panel);
        janela.setVisible(true);
    }
}
