import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class JSAC {
	private JFrame frame;
	
	public JSAC() {
		setUpFrame();
		addStoreData();
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
        for (int i = 0; i < fields.length; i++) {
            JLabel l = new JLabel(fields[i], JLabel.TRAILING);
            spring.add(l);
            JTextField textField = new JTextField(10);
            l.setLabelFor(textField);
            spring.add(textField);
        }
        
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


