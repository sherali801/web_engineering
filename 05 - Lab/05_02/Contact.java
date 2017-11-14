import javax.swing.JOptionPane;

public class Contact {

    private String name;
    private String address;
    private String phoneNo;

    public Contact(String name, String address, String phoneNo) {
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNo(phoneNo);
    }

	public String getName() { return name;	}

	public void setName(String name) { this.name = name; }

	public String getAddress() { return address; }

	public void setAddress(String address) { this.address = address; }

	public String getPhoneNo() { return phoneNo; }

	public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    
    public void print() {
    	JOptionPane.showMessageDialog(null, "Name: " + this.getName() + "\nAddress: " + this.getAddress() + "\nPhone No.: " + this.getPhoneNo());
    }

}
