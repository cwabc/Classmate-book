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
		jf.setTitle("�೤");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container = jf.getContentPane();
		container.setLayout(null);
		JButton bSelect=new JButton("��ѯ");
		bSelect.setBounds(30, 30, 200, 50);
		bSelect.addActionListener(new ActionListener() {        // �����������ڼ�������¼�
	           @Override
	           public void actionPerformed(ActionEvent e) {
	        	   newSelcetFrame("����ѧ�ſ���");
	            }
	        });
		container.add(bSelect);
		JTextArea content =new JTextArea("");
	    content.setLineWrap(true);
		content.setBounds(30,95,625,500);
		container.add(content);
		JButton output= new JButton("����excel");
		output.setBounds(425,610,200,50);
		container.add(output);
		output.addActionListener(new ActionListener() {        // �����������ڼ�������¼�
	           @Override
	           public void actionPerformed(ActionEvent e) {
	               
	            }
	        });
		JLabel jl = new JLabel("16�������ĳ��");
		jl.setBounds(30,250,300,50);
		container.add(jl);
		
		
	}
	public static void main(String[] args)
	{
		new banzhang().createFrame("����һ���µĴ���");
	}
	
	public void newSelcetFrame(String title)
	{
		JFrame inputStuID= new JFrame(title);
		inputStuID.setVisible(true);
	    inputStuID.setBounds(250, 250, 300, 300);	
	    inputStuID.setTitle("����ѧ��");
	    JTextArea content =new JTextArea("");
		content.setBounds(10,10,250,250);
		content.setLineWrap(true);
		Container container = inputStuID.getContentPane();
		container.setLayout(null);
		container.add(content);
		
	}
}
