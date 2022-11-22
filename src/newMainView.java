import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.ToolTipManager;

public class newMainView {

	private JFrame frame;
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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newMainView window = new newMainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public newMainView() {
		try {
			frame = new JFrame();
			// 잡지 규격에 맞춤. (약간씩만 늘림.)
			frame.setSize(1024,768);
			// 모니터 가운데 배치
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			int xpos = (int)(screen.getWidth()/2 - frame.getWidth()/2);
			int ypos = (int)(screen.getHeight()/2 - frame.getHeight()/2);
			frame.setLocation(xpos, ypos);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.NORTH);
			panel.setBackground(mainYellow);
			panel.setSize(1024, 50);

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

			panel.add(textPanel);

			// 중간 컨텐츠
			JPanel panel_2 = new JPanel(new GridLayout(2,1));
			panel_2.setBackground(mainYellow);
			frame.getContentPane().add(panel_2, BorderLayout.CENTER);

			// Image (gif)
			ImageIcon ii = new ImageIcon("images/300mainImage.gif");

			// ImageIcon ii = new ImageIcon("images/mainImage.gif");
			imageLabel.setIcon(ii);
			imageLabel.setHorizontalAlignment(JLabel.CENTER);
			panel_2.add(imageLabel);

			Label.setFont(mEngFont);
			Label.setText("MFD는 개발 입문자와 초보자를 위한 웹 매거진입니다.");
			Label.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 0 , 0));
			Label.setHorizontalAlignment(JLabel.CENTER);
			panel_2.add(Label);
			
			// 아래쪽 아이템 버튼
			JPanel panel_1 = new JPanel();
			frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
			panel_1.setBackground(mainYellow);
			JPanel btn = new JPanel(new GridLayout(2,2, 20, 20));
			btn.setBackground(mainYellow);
			panel_1.add(btn);
			
			JButton java = new JButton("JAVA");
            java.setBackground(mainOrange);
            java.setOpaque(true);
            java.setBorderPainted(false);
            java.setToolTipText("Java 페이지로 이동합니다.");
            btn.add(java);

            JButton python = new JButton("PYTHON");
            python.setBackground(mainOrange);
            python.setOpaque(true);
            python.setBorderPainted(false);
            python.setToolTipText("python 페이지로 이동합니다.");
            btn.add(python);

            JButton js = new JButton("JS");
            js.setBackground(mainOrange);
            js.setOpaque(true);
            js.setBorderPainted(false);
            js.setToolTipText("js 페이지로 이동합니다.");
            btn.add(js);

            JButton swift = new JButton("SWIFT");
            swift.setBackground(mainOrange);
            swift.setOpaque(true);
            swift.setBorderPainted(false);
            swift.setToolTipText("swift 페이지로 이동합니다.");
            btn.add(swift);
            
            // 버튼 크기 조정
            //java.setPreferredSize(new Dimension(170, 90));
            
            
            java.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		frame.dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new java();
            	}
            });
            
            python.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		frame.dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new python();
            	}
            });
            
            js.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		frame.dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new js();
            	}
            });
            
            swift.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		frame.dispose(); //현재 윈도우만 닫힘
            		//setVisible(false);
            		new swift();
            	}
            });

			// 왼쪽 아이템 
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(mainYellow);
			frame.getContentPane().add(panel_3, BorderLayout.WEST);

			JTree tree = new JTree();
			tree.setBackground(mainYellow);
			panel_3.add(tree);
			

			frame.setLocationRelativeTo(null);
			frame.setVisible(true);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}


	// JButton write
	//				write.setHorizontalAlignment(JLabel.RIGHT);
	//				write.setToolTipText("글쓰기 페이지로 이동합니다.");
	//				textPanel.add(write, BorderLayout.NORTH);
	//
	//				panel.add(textPanel);
	//
	//				write.addActionListener(new ActionListener() {
	//					public void actionPerformed(ActionEvent e) {
	//						frame.dispose(); //현재 윈도우만 닫힘
	//						//setVisible(false);
	//						new write();
	//					}
	//				});

}
