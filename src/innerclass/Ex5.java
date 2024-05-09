package innerclass;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		Button button = new Button("Click");
		frame.add(button);

		// 2. 버튼 이벤트 등록하기
//		button.addActionListener(new EventHandler());

		// 3. 익명 클래스를  ActionListener라는 부모의 이름을 빌려 만들어 객체 생성 후 사용
		// 한번만 사용할 때 익명 클래스로 사용할 때가 많음
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!");
				
			}
			
		});

	}

}

// 클래스로 인터페이스 구현하기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");

	}

}
