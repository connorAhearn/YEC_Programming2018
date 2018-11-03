import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class JSAC {
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	
	public JSAC() {
		setUpFrame();
		addStoreData();
		frame.getContentPane().add(Box.createRigidArea(new Dimension(0,5)));
		addProducts();
		frame.getContentPane().add(Box.createRigidArea(new Dimension(0,5)));
		addLinks();
		display();
	}
	
	private void addProducts() {
		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		JPanel buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		JButton b1 = new JButton("ADD");
		JButton b2 = new JButton("Remove");
		JLabel products = new JLabel("Products");
		buttons.add(b1);
		buttons.add(b2);
		box.add(products);
		box.add(buttons);
		box.setAlignmentX(Component.LEFT_ALIGNMENT);
		frame.getContentPane().add(box);
	}
	
	private void addLinks() {
		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		JPanel buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		JButton b1 = new JButton("ADD");
		JButton b2 = new JButton("Remove");
		JLabel products = new JLabel("Links");
		buttons.add(b1);
		buttons.add(b2);
		box.add(products);
		box.add(buttons);
		box.setAlignmentX(Component.LEFT_ALIGNMENT);
		frame.getContentPane().add(box);
	}
	
	private void display() {
		frame.pack();
		frame.setVisible(true);
	}
	
	private void setUpFrame() {
		frame = new JFrame("JSAC");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(217, 217, 217));
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
	}
	
	private void addStoreData() {
		String[] fields = {"Store Name: ", "Slogan (optional): "};
		
		JPanel spring = new JPanel(new SpringLayout());
		
        JLabel l1 = new JLabel(fields[0], JLabel.TRAILING);
        JLabel l2 = new JLabel(fields[1], JLabel.TRAILING);
        
        spring.add(l1);
        tf1 = new JTextField(10);
        l1.setLabelFor(tf1);
        spring.add(tf1);
        
        spring.add(l2);
        tf2 = new JTextField(10);
        l2.setLabelFor(tf2);
        spring.add(tf2);
        
        SpringUtilities.makeCompactGrid(spring,
		                fields.length, 2, //rows, cols
		                6, 6,        //initX, initY
		                6, 6);
		spring.setOpaque(true);
		JPanel name = new JPanel();
		JPanel slogan = new JPanel();
		spring.setAlignmentX(Component.LEFT_ALIGNMENT);
		frame.getContentPane().add(spring);
	}
}


