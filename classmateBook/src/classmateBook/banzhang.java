package classmateBook;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

import model.Users;
import excel.ExcelTool;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class banzhang extends JFrame{
	public static JTextArea content =new JTextArea("");
	public static List<Users> list1= new ArrayList<>();
	public void mainActivity(String ID)
	{
		setBounds(200, 150, 700, 700);
		setTitle("�೤");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(null);
		JButton bSelect=new JButton("�޸Ļ��ѯ");
		bSelect.setBounds(30, 30, 200, 50)
		bSelect.addActionListener(new ActionListener() {        // �����������ڼ�������¼�
	           @Override
	           public void actionPerformed(ActionEvent e) {
	        	   selectAndChange.newSelcetFrame("");
	            }
	        });
		container.add(bSelect);
		//�����ı�
		content.setLineWrap(true);        //�����Զ����й��� 
		content.setWrapStyleWord(true);// ������в����ֹ���
		JScrollPane jsp = new JScrollPane(content);
		jsp.setBounds(30,95,600,500);
		container.add(jsp);
		//������ť
		JButton output= new JButton("����excel");
		output.setBounds(425,610,200,50);
		container.add(output);
		output.addActionListener(new ActionListener() {        // �����������ڼ�������¼�
	           @Override
	           public void actionPerformed(ActionEvent e) {
	        	   ExcelTool.outExcel(list1);
	            }
	        });
		JLabel jl = new JLabel("16�������ͬѧ¼�����༶��");
		jl.setFont(new Font("����", Font.BOLD,20));
		jl.setBounds(250,30,300,50);
		container.add(jl);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new banzhang().mainActivity("");
	}
	
	
}
