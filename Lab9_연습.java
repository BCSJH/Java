import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Lab9_���� extends JFrame {

	JLabel JL[] = new JLabel[3];
	JPanel contentMainPane = new JPanel();//���� ����
	JLabel result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab9_����();
	}

	Lab9_����() {

		setContentPane(contentMainPane);
		contentMainPane.setLayout(null);
		setTitle("������ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		for (int i = 0; i < JL.length; i++) {

			JL[i] = new JLabel("0");
			JL[i].setSize(45,35);
			JL[i].setOpaque(true);
			add(JL[i]);
			
			contentMainPane.add(JL[i]);

		}
		
		//����������
		JL[0].setLocation(90,50);
		JL[1].setLocation(140,50);
		JL[2].setLocation(190,50);

		result = new JLabel("�����մϴ�.");
		result.setSize(100, 40);
		result.setLocation(110, 100);
		add(result);
		contentMainPane.add(result);
		
		addKeyListener(new MyKeyListener());//����Ű�� ���������� �ٲ�� �ϱ� ����
		setSize(300,200);//������ ������ ����
		setVisible(true);


	//�����̳ʰ� enterŰ �̺�Ʈ�� ���� �� �ֵ��� ��??
	
	class MouseEventDemo implements MouseListener {//���콺 Ŭ���ϸ� �ٲٱ�

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mousePressed(MouseEvent e) {//���콺�� Ŭ���ϸ� �ٲٱ�
			// TODO Auto-generated method stub
			int x1 = (int)(Math.random() * 5);
			JL[0].setText(x1 + " ");

			int x2 = (int)(Math.random() * 5);
			JL[1].setText(x2 + " ");

			int x3 = (int)(Math.random() * 5);
			JL[2].setText(x3 + " ");
			
			if(x1 == x2 && x2 == x3) {	//��� ���� ������ ���
				result.setText("��� ��ġ�մϴ�.");	
			}
			else {
				result.setText("�ƽ��׿�");			
			}										
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	contentMainPane.addMouseListener(new MouseEventDemo());
	
	}
	//����Ű�� ������ �ٲ�� �ϱ� ����
	class MyKeyListener extends KeyAdapter {

		public void keyPressed(KeyEvent e) {

			e.getKeyChar();
			switch (e.getKeyChar()) {

			case '\n': {
				int x1 = (int)(Math.random() * 5);
				JL[0].setText(x1 + " ");
				
				int x2 = (int)(Math.random() * 5);
				JL[1].setText(x2 + " ");
				
				int x3 = (int)(Math.random() * 5);
				JL[2].setText(x3 + " ");

				if (x1 == x2 && x2 == x3)//��� ���� ������ ���
					result.setText("��� ��ġ�մϴ�.");
				else
					result.setText("�ƽ��׿�");
			}

			}

		}

	}
}
