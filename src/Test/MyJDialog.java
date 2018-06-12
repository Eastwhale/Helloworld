package Test;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJDialog extends JDialog {
	public MyJDialog(MyFrame frame) {
		super(frame,"第一个JDiaglog窗口",true);
		Container container =getContentPane();
		container.add(new JLabel("这是第一个对话框"));
		setBounds(120,120,100,100);
	}
}
