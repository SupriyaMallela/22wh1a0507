package project1;
import java.awt.*;
import java.awt.event.*;
public class BLExample {
	BLExample() {
		Frame frame= new Frame("BorderLayout Frame");  
		Panel pa= new Panel(); 
		frame.add(pa);
		pa.setLayout(new BorderLayout(5,5));
		pa.add(new Button("India"), BorderLayout.NORTH);
		pa.add(new Button("Pakistan"), BorderLayout.SOUTH);
		pa.add(new Button("Japan"), BorderLayout.EAST);
		pa.add(new Button("China"), BorderLayout.WEST);
		pa.add(new Button("Countries"), BorderLayout.CENTER);
		frame.setSize(300,300);
		frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
       	 public void windowClosing(WindowEvent e) {
       		 System.exit(0);
       	 }
        });
	}
	public static void main(String args[]) {
		new BLExample();
	}	
}