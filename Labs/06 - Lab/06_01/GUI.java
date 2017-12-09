import java.awt.*;
import javax.swing.*;

public class GUI {
	
	private JFrame frame;
	private JLabel[] JLabels;
	private String[] labels = { "Name: ", "Address: ", "Phone No: ", "Email: " };
    private JTextField[] JTextFields;
    private JButton[] JButtons;
    private String[] buttons = { "Save", "Delete", "Update", "<<", "Search", ">>", "Refresh Database" };
    private JPanel[] JPanels;
    private EventHandling eventHandling;
    
    public GUI() {
    	initGUI();
    }
	
    private void initGUI() {
    	JLabels = new JLabel[4];
    	for (int i = 0; i < JLabels.length; i++) {
    		JLabels[i] = new JLabel(labels[i]);
    	}
    	JTextFields = new JTextField[4];
    	for (int i = 0; i < JTextFields.length; i++) {
    		JTextFields[i] = new JTextField();
    	}
    	JButtons = new JButton[7];
    	for (int i = 0; i < JButtons.length; i++) {
    		JButtons[i] = new JButton(buttons[i]);
    	}
    	JPanels = new JPanel[2];
    	for (int i = 0; i < JPanels.length; i++) {
    		JPanels[i] = new JPanel();
    	}
    	JPanels[0].setLayout(new GridLayout(4, 2));
    	JPanels[1].setLayout(new GridLayout(2, 3));
    	for (int i = 0; i < JLabels.length; i++) {
    		JPanels[0].add(JLabels[i]);
    		JPanels[0].add(JTextFields[i]);
    	}
    	for (int i = 0; i < JButtons.length - 1; i++) {
    		JPanels[1].add(JButtons[i]);
    	}
    	eventHandling = new EventHandling(JTextFields, JButtons);
    	for (int i = 0; i < JButtons.length; i++) {
    		JButtons[i].addActionListener(eventHandling);
    	}
    	frame = new JFrame();
    	Container c = frame.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(JPanels[0], BorderLayout.NORTH);
        c.add(JPanels[1], BorderLayout.CENTER);
        c.add(JButtons[6], BorderLayout.SOUTH);
    	frame.setSize(300, 200);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setResizable(false);
    	frame.setVisible(true);
    }
    
}
