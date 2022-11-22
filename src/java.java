import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class java extends JFrame{
	
	Color mainYellow = Color.decode("#FFEB94");
    Color mainOrange = Color.decode("#FD9F28");
    Container container;
    
	public java() {
		
		setTitle("Java");
		setVisible(true);
		// 잡지 규격에 맞춤. (약간씩만 늘림.)
        this.setSize(1024,768);
        // 모니터 가운데 배치
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
        int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
        setLocation(xpos, ypos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = getContentPane();
        container.setBackground(mainYellow);
        
	}
	
	public static void main(String[] args) {
        new java();
	}
}
