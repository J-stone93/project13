package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);

//		frame.addKeyListener(new KeyListener(){
//			@Override
//			public void keyTyped(KeyEvent e) {
//				System.out.println("키를 눌렀습니다!");
//			}
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//				
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//			} 
//		});
//		
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
			}
		});
		
//		frame.addKeyListener(new EventHandler1());
		
	}

}

//class EventHandler1 implements KeyListener {
//
//	@Override
//	public void keyTyped(KeyEvent e) {
////		System.out.println("키를 눌렀습니다!");
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
////		System.out.println("키를 눌렀습니다!");
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("키를 눌렀습니다!");
//	}
//}








