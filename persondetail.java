import javax.swing.*;

class Persondetail {
        String name;
        String address;
        String phoneNum;
//parameterized constructor
    public Persondetail(String n, String a, String p) {
    	
         name = n;
		 address = a;
		 phoneNum = p;
       }
    
//method for displaying person record on GUI 
    
    public void print( ) {
          JOptionPane.showMessageDialog(null, "Name: " + name + "\n Address: " +address + "\n phone no: " + phoneNum);
    }
   
}