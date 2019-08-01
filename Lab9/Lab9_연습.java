import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Lab9_연습 extends JFrame {

	JLabel JL[] = new JLabel[3];
	JPanel contentMainPane = new JPanel();//메인 내용
	JLabel result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab9_연습();
	}

	Lab9_연습() {

		setContentPane(contentMainPane);
		contentMainPane.setLayout(null);
		setTitle("김정현 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		for (int i = 0; i < JL.length; i++) {

			JL[i] = new JLabel("0");
			JL[i].setSize(45,35);
			JL[i].setOpaque(true);
			add(JL[i]);
			
			contentMainPane.add(JL[i]);

		}
		
		//사이즈지정
		JL[0].setLocation(90,50);
		JL[1].setLocation(140,50);
		JL[2].setLocation(190,50);

		result = new JLabel("시작합니다.");
		result.setSize(100, 40);
		result.setLocation(110, 100);
		add(result);
		contentMainPane.add(result);
		
		addKeyListener(new MyKeyListener());//엔터키를 눌렀을때도 바뀌게 하기 위함
		setSize(300,200);//프레임 사이즈 지정
		setVisible(true);


	//컨테이너가 enter키 이벤트를 받을 수 있도록 함??
	
	class MouseEventDemo implements MouseListener {//마우스 클릭하면 바꾸기

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
		public void mousePressed(MouseEvent e) {//마우스를 클릭하면 바꾸기
			// TODO Auto-generated method stub
			int x1 = (int)(Math.random() * 5);
			JL[0].setText(x1 + " ");

			int x2 = (int)(Math.random() * 5);
			JL[1].setText(x2 + " ");

			int x3 = (int)(Math.random() * 5);
			JL[2].setText(x3 + " ");
			
			if(x1 == x2 && x2 == x3) {	//모두 같은 숫자일 경우
				result.setText("모두 일치합니다.");	
			}
			else {
				result.setText("아쉽네요");			
			}										
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub	
		}
	}
	contentMainPane.addMouseListener(new MouseEventDemo());
	
	}
	//엔터키를 눌러도 바뀌게 하기 위함
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

				if (x1 == x2 && x2 == x3)//모두 같은 숫자일 경우
					result.setText("모두 일치합니다.");
				else
					result.setText("아쉽네요");
			}

			}

		}

	}
}
