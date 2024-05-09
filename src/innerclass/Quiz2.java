package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Quiz2 {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);

		TextArea textArea = new TextArea("텍스트상자", 10, 50);
		frame.add(textArea);

		frame.setVisible(true);

		// 마우스가 텍스트창에 포커스
//		textArea.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				System.out.println("텍스트에 포커스가 되었습니다!");
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				System.out.println("텍스트에 포커스가 벗어났습니다!");
//			}
//		});

		textArea.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다!");
			}

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!");
			}
		});
		
//		MyFocusHandler listener = new MyFocusHandler();
//		textArea.addFocusListener(listener);

	}
}

class MyFocusHandler implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("텍스트에 포커스가 되었습니다!");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("텍스트에 포커스가 벗어났습니다!");
	}

}
