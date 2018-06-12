package Test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame {
	public static void main(String args[]) {
		new MyFrame();
	}
	public  MyFrame() {
		JFrame jf=new JFrame("hello");
		Container container=jf.getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个Frame窗体");
		jl.setSize(150,150);
		jl.setBackground(Color.red);
		container.add(jl);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb=new JButton("弹出对话框");
		jb.setBounds(10,10,100,21);
		jf.setSize(200, 150);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		jf.setVisible(true);
		container.add(jb);
		System.out.println("hello,world");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}
