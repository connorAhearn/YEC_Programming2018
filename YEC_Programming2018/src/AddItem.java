
//Source:https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/SpringFormProject/src/layout/SpringForm.java

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddItem {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private Item i;
	private Store store;

	public AddItem(Store s) {
		createGUI();
		store = s;
	}


	public void createGUI() {
		String[] labels = { "Name: ", "Price: ", "ImageURL: ", "Description: " };
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

		JLabel l3 = new JLabel(labels[2], JLabel.TRAILING);
		p.add(l3);
		textField3 = new JTextField(10);
		l2.setLabelFor(textField3);
		p.add(textField3);

		JLabel l4 = new JLabel(labels[3], JLabel.TRAILING);
		p.add(l4);
		textField4 = new JTextField(10);
		l4.setLabelFor(textField4);
		p.add(textField4);

		JButton button = new JButton("Add");
		JLabel label = new JLabel("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = new Item(textField2.getText(), textField1.getText(), textField3.getText(), textField4.getText());
				label.setText(textField1.getText() + " has been added.");
				store.itemList.add(i);
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
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
		frame.setSize(500,200);;
		frame.setVisible(true);

	}
}
