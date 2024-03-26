package java0326;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class NewFrame extends JFrame{
	public NewFrame() {
		super("Hello");
		this.setLocation(300,100);
		this.setSize(300,300);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("Closing Window");
				System.exit(0);
			}
		});
		this.setVisible(true);
	}
}

public class Ex11_AnonyWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewFrame f=new NewFrame();
		System.out.println();
	}
}
