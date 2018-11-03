import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class JSAC {
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private Store store;
	
	public JSAC() {
		store = new Store();
		setUpFrame();
		addStoreData();
		frame.getContentPane().add(Box.createRigidArea(new Dimension(0,5)));
		addProducts();
		frame.getContentPane().add(Box.createRigidArea(new Dimension(0,5)));
		addLinks();
		addPublish();
		display();
	}
	
	private void addPublish() {
		JButton b1 = new JButton("Publish");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(
					    null,
					    "This will finalize your product, have you added all products and links needed?\nWould you like to continue?",
					    "HI",
					    JOptionPane.YES_NO_OPTION);
				if (option == JOptionPane.YES_OPTION) {
					store.storeName = tf1.getText();
					store.slogan = tf2.getText();
					HTMLPrinter p = new HTMLPrinter(store);
				}
			}
		});
		
		GridBagConstraints boxCon = new GridBagConstraints();
		boxCon.insets = new Insets(5, 5, 5, 5);
		boxCon.gridx = 0;
		boxCon.gridy = 4;
		frame.getContentPane().add(b1, boxCon);
	}
	
	private void addProducts() {
		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		JPanel buttons = new JPanel();
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.X_AXIS));
		JButton b1 = new JButton("ADD");
		JButton b2 = new JButton("Remove");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddItem i = new AddItem(store);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveItem i = new RemoveItem(store);
			}
		});
		JLabel products = new JLabel("Products");
		buttons.add(b1);
		buttons.add(b2);
		products.setAlignmentX(Box.LEFT_ALIGNMENT);
		box.add(products);
		box.add(buttons);
		GridBagConstraints boxCon = new GridBagConstraints();
		boxCon.insets = new Insets(5, 5, 5, 5);
		boxCon.gridx = 0;
		boxCon.gridy = 1;
		frame.getContentPane().add(box, boxCon);
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
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddLink i = new AddLink(store);
			}
		});
		
		buttons.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveLink i = new RemoveLink(store);
			}
		});
		products.setAlignmentX(Box.LEFT_ALIGNMENT);
		box.add(products);
		box.add(buttons);
		GridBagConstraints boxCon = new GridBagConstraints();
		boxCon.insets = new Insets(5, 5, 5, 5);
		boxCon.gridx = 0;
		boxCon.gridy = 2;
		frame.getContentPane().add(box, boxCon);
	}
	
	private void display() {
		frame.pack();
		frame.setVisible(true);
	}
	
	private void setUpFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 200 };
		gridBagLayout.rowHeights = new int[] { 50, 50, 50, 50 };
		gridBagLayout.columnWeights = new double[] { 1.0 };
		gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE, 1.0, 1.0, 1.0 };
		
		frame = new JFrame("JSAC");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(gridBagLayout);
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
		
		GridBagConstraints springCon = new GridBagConstraints();
		springCon.insets = new Insets(5, 5, 5, 5);
		springCon.gridx = 0;
		springCon.gridy = 0;
		frame.getContentPane().add(spring, springCon);
	}
}


