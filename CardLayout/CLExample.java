package project1;
import java.awt.*;
import java.awt.event.*;
public class CLExample {
	CLExample() {
		Frame frame= new Frame("CardLayout Frame");  
		Panel pa= new Panel(); 
		frame.add(pa);
		pa.setLayout(new CardLayout());
		pa.add(new Button("India"));
		pa.add(new Button("Pakistan"));
		pa.add(new Button("Japan"));
		pa.add(new Button("China"));
		pa.add(new Button("Countries"));
		frame.setSize(300,300);
		frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
       	 public void windowClosing(WindowEvent e) {
       		 System.exit(0);
       	 }
        });
	}
	public static void main(String args[]) {
		new CLExample();
	}
}
