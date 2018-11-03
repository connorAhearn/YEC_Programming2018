import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

//Source:https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/SpringFormProject/src/layout/SpringForm.java
public class AddLink {
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private Store store; 
	private Link l; 
	public AddLink(Store s) {
		store=s; 
		createGUI();
	}
	
	public void createGUI() {
		String[] labels = { "Title: ", "Link: " };
		int numPairs = labels.length;
		JPanel p = new JPanel(new SpringLayout());
		JPanel box = new JPanel();
		JPanel add = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		add.setLayout(new BoxLayout(add, BoxLayout.Y_AXIS));
		
		JLabel l1 = new JLabel(labels[0], JLabel.TRAILING);
		p.add(l1);
		textField1 = new JTextField(10);
		l1.setLabelFor(textField1);
		p.add(textField1);

		JLabel l2 = new JLabel(labels[1], JLabel.TRAILING);
		p.add(l2);
		textField2 = new JTextField(10);
		l2.setLabelFor(textField2);
		p.add(textField2);
		JLabel label = new JLabel("");
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l=new Link(textField1.getText(),textField2.getSelectedText()); 
				label.setText(textField1.getText() + " has been added.");
				store.linkList.add(l);
				textField1.setText("");
				textField2.setText("");
			}
		});
		add.add(label);
		add.add(button);

		box.add(p);
		box.add(add);
		
		// Lay out the panel.
				SpringUtilities.makeCompactGrid(p, numPairs, 2, 6, 6, 6, 6);

				JFrame frame = new JFrame("SpringForm");
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				p.setOpaque(true); // content panes must be opaque
				frame.setContentPane(box);

				// Display the window.
				frame.setSize(500,150);;
				frame.setVisible(true);


	}
}
