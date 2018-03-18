import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String numb = JOptionPane.showInputDialog("Enter a number");
	int count = Integer.parseInt(numb);
	boolean prime = true;
	for (int i = 2; i < count; i++) {
		if (count%i==0) {
			prime=false;
		}}
		if (prime==true) {
			JOptionPane.showMessageDialog(null, count + " is a prime number");
		}
		else {
			JOptionPane.showMessageDialog(null, count + " is not a prime number");
		}
	}}

