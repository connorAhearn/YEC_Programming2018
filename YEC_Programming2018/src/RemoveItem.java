import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.text.SimpleDateFormat;

//source:https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/components/ComboBoxDemo2Project/src/components/ComboBoxDemo2.java
public class RemoveItem {
	JFrame frame;
	String currentPattern;
	JLabel result;
	int currentSel;
	
	public RemoveItem(Store s) {
		createGUI(s);
	}
	public void createGUI(Store s) {
		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
		String[] patternExamples = new String[s.itemList.size()];
		for (int i = 0; i < s.itemList.size(); i++) {
			patternExamples[i] = s.itemList.get(i).name;
		}

		currentPattern = patternExamples[0];
		currentSel = 0;

		JComboBox patternList = new JComboBox(patternExamples);
		patternList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentPattern = patternList.getName();
				currentSel = patternList.getSelectedIndex();
			}
		});

		JButton remove = new JButton("Remove");

		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s.itemList.remove(currentSel);
				frame.dispose();
			}
		});
		
		frame = new JFrame("Remove Item");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.getContentPane().add(patternList);
		frame.getContentPane().add(remove);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}
