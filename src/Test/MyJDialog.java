package Test;

import java.awt.Container;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJDialog extends JDialog {
	public MyJDialog(MyFrame frame) {
		super(frame,"��һ��JDiaglog����",true);
		Container container =getContentPane();
		container.add(new JLabel("���ǵ�һ���Ի���"));
		setBounds(120,120,100,100);
	}
}
