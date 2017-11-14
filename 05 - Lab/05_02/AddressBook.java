import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class AddressBook extends JFrame implements ActionListener {

    ArrayList<Contact> contacts;
    
    JLabel label;
    JButton btnAdd, btnSearch, btnDelete, btnModify;

    public AddressBook() {
        this.contacts = new ArrayList<Contact>();
        initGUI();
    }

    private void initGUI() {

        this.label = new JLabel("Address Book");
        this.btnAdd = new JButton("Add Contact");
        this.btnAdd.addActionListener(this);
        this.btnSearch = new JButton("Search Contact");
        this.btnSearch.addActionListener(this);
        this.btnDelete = new JButton("Delete Contact");
        this.btnDelete.addActionListener(this);
        this.btnModify = new JButton("Modify Contact");
        this.btnModify.addActionListener(this);
        this.add(this.label);
        this.add(this.btnAdd);
        this.add(this.btnSearch);
        this.add(this.btnDelete);
        this.add(this.btnModify);

        this.setLayout(new GridLayout(5, 1, 10, 10));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);

    }
    
    private void addContact() {
    	String name, address, phoneNo;
    	name = JOptionPane.showInputDialog("Enter Name: ");
    	address = JOptionPane.showInputDialog("Enter Address: ");
    	phoneNo = JOptionPane.showInputDialog("Enter Phone No.: ");
    	if (name.equals("") || address.equals("") || phoneNo.equals("")) {
    		JOptionPane.showMessageDialog(null, "Contact Was Not Added Successfully.");
    	} else {
    		Contact c = new Contact(name, address, phoneNo);
        	this.contacts.add(c);
        	JOptionPane.showMessageDialog(null, "Contact Added Successfully.");
    	}
    }
    
    private void searchContact() {
    	String name = JOptionPane.showInputDialog("Enter Name: ");
    	for (int i = 0; i < this.contacts.size(); i++) {
    		Contact c = (Contact)  this.contacts.get(i);
    		if (name.equals(c.getName())) {
    			c.print();
    			return;
    		}
    	}
    	JOptionPane.showMessageDialog(null, "No Contact Was Found.");
    }
    
    private void deleteContact() {
    	String name = JOptionPane.showInputDialog("Enter Name: ");
    	for (int i = 0; i < this.contacts.size(); i++) {
    		Contact c = (Contact)  this.contacts.get(i);
    		if (name.equals(c.getName())) {
    			this.contacts.remove(i);
    			JOptionPane.showMessageDialog(null, "Contact Has Been Deleted.");
    			return;
    		}
    	}
    	JOptionPane.showMessageDialog(null, "No Contact Was Found.");
    }
    
    private void modifyContact() {
    	String name, address, phoneNo;
    	name = JOptionPane.showInputDialog("Enter Name: ");
    	for (int i = 0; i < this.contacts.size(); i++) {
    		Contact c = (Contact)  this.contacts.get(i);
    		if (name.equals(c.getName())) {
    			this.contacts.remove(i);
    			name = JOptionPane.showInputDialog("Enter Name: ");
    	    	address = JOptionPane.showInputDialog("Enter Address: ");
    	    	phoneNo = JOptionPane.showInputDialog("Enter Phone No.: ");
    	    	c = new Contact(name, address, phoneNo);
    	    	this.contacts.add(c);
    	    	JOptionPane.showMessageDialog(null, "Contact Has Been Modified.");
    	    	return;
    	    	
    		}
    	}
    	JOptionPane.showMessageDialog(null, "No Contact Was Found.");
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnAdd) {
			this.addContact();
		} else if (e.getSource() == this.btnSearch) {
			this.searchContact();
		} else if (e.getSource() == this.btnDelete) {
			this.deleteContact();
		} else if (e.getSource() == this.btnModify) {
			this.modifyContact();
		}
	}
	
    public static void main(String[] args) {
    	
    	AddressBook ab = new AddressBook();
    	
    }

}
