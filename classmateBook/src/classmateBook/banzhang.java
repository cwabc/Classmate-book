package classmateBook;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class banzhang extends JFrame{

	
	public void createFrame(String title)
	{
		JFrame jf = new JFrame(title);
		jf.setVisible(true);
		jf.setBounds(200, 150, 700, 700);
		jf.setTitle("班长");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container = jf.getContentPane();
		container.setLayout(null);
		JButton bSelect=new JButton("查询");
		bSelect.setBounds(30, 30, 200, 50);
		bSelect.addActionListener(new ActionListener() {        // 监听器，用于监听点击事件
	           @Override
	           public void actionPerformed(ActionEvent e) {
	        	   newSelcetFrame("输入学号框体");
	            }
	        });
		container.add(bSelect);
		JTextArea content =new JTextArea("");
	    content.setLineWrap(true);
		content.setBounds(30,95,625,500);
		container.add(content);
		JButton output= new JButton("导出excel");
		output.setBounds(425,610,200,50);
		container.add(output);
		output.addActionListener(new ActionListener() {        // 监听器，用于监听点击事件
	           @Override
	           public void actionPerformed(ActionEvent e) {
	               
	            }
	        });
		JLabel jl = new JLabel("16级计算机某班");
		jl.setBounds(30,250,300,50);
		container.add(jl);
		
		
	}
	public static void main(String[] args)
	{
		new banzhang().createFrame("创建一个新的窗体");
	}
	
	public void newSelcetFrame(String title)
	{
		JFrame inputStuID= new JFrame(title);
		inputStuID.setVisible(true);
	    inputStuID.setBounds(250, 250, 300, 300);	
	    inputStuID.setTitle("输入学号");
	    JTextArea content =new JTextArea("");
		content.setBounds(10,10,250,250);
		content.setLineWrap(true);
		Container container = inputStuID.getContentPane();
		container.setLayout(null);
		container.add(content);
		
	}
}
