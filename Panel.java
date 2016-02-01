package car;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

	public Panel() {
		JFrame frame = new JFrame("Car store");
		frame.setLocation(300, 100);
		frame.setMinimumSize(new Dimension(800, 600));

		frame.setVisible(true);

		frame.getContentPane().add(createPanel());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();

		JLabel nameLabel = new JLabel("Customer Name");
		JTextField nameText = new JTextField(10);
		panel.add(nameLabel);
		panel.add(nameText);

		JLabel phoneLabel = new JLabel("Phone number");
		JTextField phoneText = new JTextField(10);
		panel.add(phoneLabel);
		panel.add(phoneText);

		JLabel dateLabel = new JLabel("Date of purchase");
		JTextField dateText = new JTextField(10);
		panel.add(dateLabel);
		panel.add(dateText);

		JLabel modelLabel = new JLabel("Car Model");
		JTextField modelText = new JTextField(10);
		panel.add(modelLabel);
		panel.add(modelText);
		return panel;
	}

}
