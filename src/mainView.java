import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;

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
    Font sEngFont = new Font("Gmarket Sans", Font.BOLD, 10);
    Font lEngFont = new Font("Gmarket Sans", Font.BOLD, 90);

    // MainView
    public mainView() {
        try {
            // 잡지 규격에 맞춤. (약간씩만 늘림.)
            this.setSize(736,950);
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

            add(textPanel);
        }
    }

    class ItemPanel extends JPanel {
        public ItemPanel() {
            // Image (gif)
            ImageIcon ii = new ImageIcon("images/300mainImage.gif");
            // Image 사이즈가 2개인데 주석처리 된 건 너무 큰 것 같아서 300 사이즈로 일단 해뒀습니다!
//            ImageIcon ii = new ImageIcon("images/mainImage.gif");
            imageLabel.setIcon(ii);
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            add(imageLabel, BorderLayout.SOUTH);
        }
    }

    // 버튼 위에 마우스가 올라가면 페이지로 이동한다는 안내 메시지가 있으면 좋을 것 같아요!!
    class MainButton extends JPanel {
        public MainButton() {
            JButton java = new JButton("JAVA");
            java.setBackground(mainOrange);
            java.setOpaque(true);
            java.setBorderPainted(false);
            add(java);

            JButton python = new JButton("PYTHON");
            python.setBackground(mainOrange);
            python.setOpaque(true);
            python.setBorderPainted(false);
            add(python);

            JButton js = new JButton("JS");
            js.setBackground(mainOrange);
            js.setOpaque(true);
            js.setBorderPainted(false);
            add(js);

            JButton swift = new JButton("SWIFT");
            swift.setBackground(mainOrange);
            swift.setOpaque(true);
            swift.setBorderPainted(false);
            add(swift);
        }
    }


	
	public static void main(String[] args) {
        new mainView();
	}
}
