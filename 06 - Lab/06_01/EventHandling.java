import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventHandling implements ActionListener {
	
    private JTextField[] JTextFields;
    private JButton[] JButtons;
    private Contact contact;
    private ContactDAO contactDAO;
    private ArrayList<Contact> contacts;
    private int i;
    
    public EventHandling(JTextField[] JTextFields, JButton[] JButtons) {
		this.JTextFields = JTextFields;
		this.JButtons = JButtons;
		contact = new Contact();
		contactDAO = new ContactDAO();
		contacts = contactDAO.getContacts();
		i = 0;
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == JButtons[0]) {
			contact.setName(JTextFields[0].getText());
			contact.setAddress(JTextFields[1].getText());
			contact.setPhoneNo(JTextFields[2].getText());
			contact.setEmail(JTextFields[3].getText());
			if (contactDAO.create(contact)) {
				JOptionPane.showMessageDialog(null, "Contact has been added!");
			} else {
				JOptionPane.showMessageDialog(null, "Contact was not added!");
			}
			JTextFields[0].setText("");
			JTextFields[1].setText("");
			JTextFields[2].setText("");
			JTextFields[3].setText("");
		} else if (e.getSource() == JButtons[1]) {
			String name = JTextFields[0].getText();
			if (contactDAO.delete(name)) {
				JOptionPane.showMessageDialog(null, "Contact has been deleted!");
			} else {
				JOptionPane.showMessageDialog(null, "Contact was not deleted!");
			}
			JTextFields[0].setText("");
		} else if (e.getSource() == JButtons[2]) {
			contact.setName(JTextFields[0].getText());
			contact.setAddress(JTextFields[1].getText());
			contact.setPhoneNo(JTextFields[2].getText());
			contact.setEmail(JTextFields[3].getText());
			String searchName = JOptionPane.showInputDialog("Enter Name: ");
			if (contactDAO.update(searchName, contact)) {
				JOptionPane.showMessageDialog(null, "Contact has been updated!");
			} else {
				JOptionPane.showMessageDialog(null, "Contact was not updated!");
			}
		} else if (e.getSource() == JButtons[4]) {
			String name = JTextFields[0].getText();
			contact = contactDAO.read(name);
			if (contact != null) {
				JTextFields[1].setText(contact.getAddress());
				JTextFields[2].setText(contact.getPhoneNo());
				JTextFields[3].setText(contact.getEmail());
			} else {
				JOptionPane.showMessageDialog(null, "No contact was found!");
			}
		} else if (e.getSource() == JButtons[3]) {
			if ((i - 1) >= 0) {
				i--;
				contact = (Contact) contacts.get(i);
				JTextFields[0].setText(contact.getName());
				JTextFields[1].setText(contact.getAddress());
				JTextFields[2].setText(contact.getPhoneNo());
				JTextFields[3].setText(contact.getEmail());
			} else {
				JTextFields[0].setText("");
				JTextFields[1].setText("");
				JTextFields[2].setText("");
				JTextFields[3].setText("");
			}
		} else if (e.getSource() == JButtons[5]) {
			if ((i + 1) < contacts.size()) {
				i++;
				contact = (Contact) contacts.get(i);
				JTextFields[0].setText(contact.getName());
				JTextFields[1].setText(contact.getAddress());
				JTextFields[2].setText(contact.getPhoneNo());
				JTextFields[3].setText(contact.getEmail());
			} else {
				JTextFields[0].setText("");
				JTextFields[1].setText("");
				JTextFields[2].setText("");
				JTextFields[3].setText("");
			}
		} else if (e.getSource() == JButtons[6]) {
			i = 0;
			contactDAO.read();
			contacts = contactDAO.getContacts();
		}
	}

}
