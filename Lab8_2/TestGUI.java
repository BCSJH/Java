import java.awt.FlowLayout;
import javax.swing.*; 
import java.awt.*;

public class TestGUI  extends JFrame{

TestGUI(){
	setTitle("김정현 프레임");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); //수평, 수직 간격
	c.setBackground(Color.YELLOW);//배경색
	
	//버튼 추가하기
	c.add(new JButton("+"));
	c.add(new JButton("-"));
	c.add(new JButton("*"));
	c.add(new JButton("/"));
	c.add(new JButton("="));
	c.add(new JButton("1"));
	c.add(new JButton("2"));
	c.add(new JButton("3"));
	c.add(new JButton("4"));
	c.add(new JButton("5"));
	c.add(new JButton("6"));
	c.add(new JButton("7"));
	c.add(new JButton("8"));
	c.add(new JButton("9"));
	c.add(new JButton("0"));
	c.add(new JButton("-"));
	c.add(new JButton("-"));
	c.add(new JButton("-"));
	setSize(300,200);//사이즈
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestGUI();//출력

	}

}
