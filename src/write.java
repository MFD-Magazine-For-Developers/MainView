import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class write extends JFrame{
	
	Color mainYellow = Color.decode("#FFEB94");
    Color mainOrange = Color.decode("#FD9F28");
    Container container;
    
    JPanel p1;
    JLabel Label = new JLabel();
	JTextArea Text = new JTextArea(8, 20);
	JButton bt = new JButton("complete");

	Font sEngFont = new Font("Gmarket Sans", Font.BOLD, 20);
	
	public write() {
		
		setTitle("write");
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
        Label.setForeground(new Color(237, 169, 0));
        
        container.setLayout(new BorderLayout(10, 10));
        Label.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 0 , 0));
        
        Label.setFont(sEngFont);
        Label.setText("MFD의 개발 작가가 되어주세요!");
        Label.setHorizontalAlignment(JLabel.CENTER);
        
        container.add(Label, BorderLayout.NORTH);
        container.add(Text, BorderLayout.CENTER);
        container.add(bt, BorderLayout.SOUTH);
        
        
        
	}
	
	public static void main(String[] args) {
        new write();
	}	
}
