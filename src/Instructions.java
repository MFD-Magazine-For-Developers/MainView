import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Instructions extends JFrame {
	Color mainYellow = Color.decode("#FFEB94");
    Color mainOrange = Color.decode("#FD9F28");
    Container container;
    
	public Instructions() {
		
		setTitle("About MFD");
		setVisible(true);
		// 잡지 규격에 맞춤. (약간씩만 늘림.)
        this.setSize(736,950);
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
        new Instructions();
	}
}
