import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class mainView extends JFrame {
    Color mainYellow = Color.decode("#FFEB94");
    Color mainOrange = Color.decode("#FD9F28");
    Container container;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JLabel imageLabel = new JLabel();
    JLabel sLabel = new JLabel();
    JLabel lLabel = new JLabel();
    JLabel Label = new JLabel();
    JButton write = new JButton("writing");
    
    Font sEngFont = new Font("Gmarket Sans", Font.BOLD, 10);
    Font lEngFont = new Font("Gmarket Sans", Font.BOLD, 90);
    Font mEngFont = new Font("Gmarket Sans", Font.BOLD, 20);

    // MainView
    public mainView() {
        try {
            // 잡지 규격에 맞춤. (약간씩만 늘림.)
            this.setSize(1024,768);
            // 모니터 가운데 배치
            Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
            int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
            int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
            setLocation(xpos, ypos);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Text, Item 넣기
            p1 = new TextPanel();
            p1.setBackground(mainYellow);
            p2 = new ItemPanel();
            p2.setBackground(mainYellow);
            p3 = new MainButton();
            p3.setBackground(mainYellow);

            // Main View -> scrollPane
            container = getContentPane();
            container.setLayout(new BorderLayout());
            container.setBackground(mainYellow);
            setTitle("Magazine for Developers");

            container.add(p1, BorderLayout.NORTH);
            container.add(p2, BorderLayout.CENTER);
            container.add(p3, BorderLayout.SOUTH);
            GridLayout grid = new GridLayout(2, 2, 5, 5);
            p3.setLayout(grid);

            this.setLocationRelativeTo(null);
            this.setVisible(true);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    class TextPanel extends JPanel {
 
        public TextPanel() {
            // textPanel
            JPanel textPanel = new JPanel();
            textPanel.setLayout(new BorderLayout());
            textPanel.setBackground(mainYellow);
            // Text(Label) - small
            sLabel.setFont(sEngFont);
            sLabel.setText("I WANT TO BE A");
            sLabel.setHorizontalAlignment(JLabel.LEFT);
            textPanel.add(sLabel, BorderLayout.NORTH);
            // Text(Label) - Large
            lLabel.setFont(lEngFont);
            lLabel.setText("Developers");
            lLabel.setHorizontalAlignment(sLabel.getVerticalAlignment());
            lLabel.setHorizontalAlignment(JLabel.CENTER);
            textPanel.add(lLabel, BorderLayout.CENTER);
            
            // JButton write
            write.setHorizontalAlignment(JLabel.RIGHT);
            write.setToolTipText("글쓰기 페이지로 이동합니다.");
            textPanel.add(write, BorderLayout.NORTH);
            
            add(textPanel);
            
            write.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new write();
            	}
            });
        }
    }

    class ItemPanel extends JPanel {
        public ItemPanel() {
        	JPanel p = new JPanel();
        	p.setLayout(new BorderLayout());
        	p.setBackground(mainYellow);
        	add(p, BorderLayout.CENTER);
        	
            // Image (gif)
            ImageIcon ii = new ImageIcon("images/300mainImage.gif");

            // ImageIcon ii = new ImageIcon("images/mainImage.gif");
            imageLabel.setIcon(ii);
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            p.add(imageLabel, BorderLayout.CENTER);
            
            Label.setFont(mEngFont);
            Label.setText("MFD는 개발 입문자와 초보자를 위한 웹 매거진입니다.");
            Label.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 0 , 0));
            Label.setHorizontalAlignment(JLabel.CENTER);
            p.add(Label, BorderLayout.SOUTH);
        }
    }

    // 버튼 위에 마우스가 올라가면 페이지로 이동한다는 안내 메시지가 있으면 좋을 것 같아요!!
    class MainButton extends JPanel {
        public MainButton() {
        	
        	ToolTipManager m = ToolTipManager.sharedInstance();
            m.setInitialDelay(0);
            m.setDismissDelay(3000);
        	
            JButton java = new JButton("JAVA");
            java.setBackground(mainOrange);
            java.setOpaque(true);
            java.setBorderPainted(false);
            java.setToolTipText("Java 페이지로 이동합니다.");
            add(java);

            JButton python = new JButton("PYTHON");
            python.setBackground(mainOrange);
            python.setOpaque(true);
            python.setBorderPainted(false);
            python.setToolTipText("python 페이지로 이동합니다.");
            add(python);

            JButton js = new JButton("JS");
            js.setBackground(mainOrange);
            js.setOpaque(true);
            js.setBorderPainted(false);
            js.setToolTipText("js 페이지로 이동합니다.");
            add(js);

            JButton swift = new JButton("SWIFT");
            swift.setBackground(mainOrange);
            swift.setOpaque(true);
            swift.setBorderPainted(false);
            swift.setToolTipText("swift 페이지로 이동합니다.");
            add(swift);
            
            // 버튼 크기 조정
            //java.setPreferredSize(new Dimension(170, 90));
            
            java.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new java();
            	}
            });
            
            python.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new python();
            	}
            });
            
            js.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new js();
            	}
            });
            
            swift.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new swift();
            	}
            });
        }
    }
 
	public static void main(String[] args) {
        new mainView();
	}
}