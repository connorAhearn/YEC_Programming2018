import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JSAC {
	private JFrame frame;
	
	private void setUpFrame() {
		frame = new JFrame("JSAC");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(217, 217, 217));
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
	}
	
	private void addStoreData() {
		JLabel storeName = new JLabel("PROMPT");
		storeName.setAlignmentX(Component.LEFT_ALIGNMENT);
		frame.getContentPane().add(storeName);
	}
}


