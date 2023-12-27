package project1;
import java.awt.*; 
import java.awt.event.*;
public class MenuExample implements ActionListener {
	Label l;
	MenuExample() {
		Frame f = new Frame("BVRITH College");
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("CSE");
		Menu s1 = new Menu("I Year");
		Menu s2 = new Menu("II Year");
		Menu s3 = new Menu("III Year");
		Menu s4 = new Menu("IV Year");
		MenuItem i1 = new MenuItem("A");
		MenuItem j1 = new MenuItem("B");
		MenuItem k1 = new MenuItem("C");
		MenuItem i2 = new MenuItem("A");
		MenuItem j2 = new MenuItem("B");
		MenuItem k2 = new MenuItem("C");
		MenuItem i3 = new MenuItem("A");
		MenuItem j3 = new MenuItem("B");
		MenuItem k3 = new MenuItem("C");
		MenuItem i4 = new MenuItem("A");
		MenuItem j4 = new MenuItem("B");
		MenuItem k4 = new MenuItem("C");
		l = new Label();
		l.setAlignment(Label.CENTER);
		l.setBounds(100,200,200,50);
		i1.addActionListener(this);
		j1.addActionListener(this);
		k1.addActionListener(this);
		i2.addActionListener(this);
		j2.addActionListener(this);
		k2.addActionListener(this);
		i3.addActionListener(this);
		j3.addActionListener(this);
		k3.addActionListener(this);
		i4.addActionListener(this);
		j4.addActionListener(this);
		k4.addActionListener(this);
		s1.add(i1);
		s1.add(j1);
		s1.add(k1);
		s2.add(i2);
		s2.add(j2);
		s2.add(k2);
		s3.add(i3);
		s3.add(j3);
		s3.add(k3);
		s4.add(i4);
		s4.add(j4);
		s4.add(k4);
		m1.add(s1);
		m1.add(s2);
		m1.add(s3);
		m1.add(s4);
		mb.add(m1);
		f.setMenuBar(mb);
		f.add(l);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		l.setText(e.getActionCommand() + " is selected.");
	}
	public static void main(String args[]){
		new MenuExample();
	}
}