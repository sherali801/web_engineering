import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.*;

public class Calculator implements ActionListener, KeyListener {
	
	private JFrame frame;
	private Container c;
	private JPanel panel;
	private JButton[] buttons;
	private String[] buttonsText = { "1", "2", "3", "C", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "+", "=" };
	private JTextField textField;
	private JLabel label;
	
	public Calculator() {
		panel = new JPanel(new GridLayout(4, 4));
		buttons = new JButton[16];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(buttonsText[i]);
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		textField = new JTextField();
		textField.addKeyListener(this);
		label = new JLabel("My Calculator");
		frame = new JFrame();
		c = frame.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(textField, BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		c.add(label, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	private String calculate(String expression) {
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    try {
	    	return engine.eval(expression) + "";
	    } catch (Exception e) {
	    	return "Syntax Error!";
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons[3]) {
			textField.setText("");
		} else if (e.getSource() == buttons[15]) {
			textField.setText(calculate(textField.getText()));
		} else {
			int i = 0; 
			while (e.getSource() != buttons[i]) {
				i++;
			}
			textField.setText(textField.getText() + buttons[i].getText());
		}
	}

	@Override
	public void keyPressed(KeyEvent e) { }

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
			textField.setText("");
		} else if (e.getKeyChar() == '\n') {
			textField.setText(calculate(textField.getText()));
		}
	}

	@Override
	public void keyTyped(KeyEvent e) { }
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

}
