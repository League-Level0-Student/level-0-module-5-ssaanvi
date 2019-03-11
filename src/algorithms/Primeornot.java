package algorithms;

import javax.swing.JOptionPane;

public class Primeornot {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Dear user, please enter your name into the box below!");
	String number = JOptionPane.showInputDialog("Okay, " +name+ ". Please enter a number into the box below. I will then tell you wether the number is prime or not. Ready? Go! ");
int x = Integer.parseInt(number);
	
	System.out.println(x);
	for (int s=2; s<x; s++) {
if (x % s==0) {
	JOptionPane.showMessageDialog(null, "This number is not prime.");
	System.exit(0);
}

	}
	JOptionPane.showMessageDialog(null, "This number is prime.");
	
	
	
	
}
}
