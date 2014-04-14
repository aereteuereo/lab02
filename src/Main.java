import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button = new JButton();
		label.setText("AQUI DEBIESE IR UN TEXTO MUY INTERESANTE");
		frame.add(label);
		frame.add(button);
	    button.setText("PRESIONAME");
		frame.setTitle("Mi primera ventana");
		frame.setSize(1024,800);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.setVisible(true);
	}

}
