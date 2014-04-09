import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setText("AQUI DEBIESE IR UN TEXTO MUY INTERESANTE");
		frame.add(label);
		frame.setTitle("Mi primera ventana");
		frame.setSize(1240,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.setVisible(true);
	}

}
