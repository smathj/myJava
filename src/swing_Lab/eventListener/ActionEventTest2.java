package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	public MyFrame2() {
		
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel p = new JPanel();
		button = new JButton("버튼을 누르세여");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		button.addActionListener(new MyListener());			// 리스너를 컴포넌트에 부착!
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("마침내 버튼이 눌러졌습니다");
			}
		}
	}
}




public class ActionEventTest2 {

	public static void main(String[] args) {
		
		MyFrame2 f = new MyFrame2();

	}

}
