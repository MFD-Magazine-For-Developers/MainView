import java.awt.EventQueue;
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
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


public class newMainView {

	JFrame frame;
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
	//private TreeSelectionListener TreeSelectionEvent;

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
            // 버튼 크기 조정
            java.setPreferredSize(new Dimension(170, 90));
            btn.add(java);

            JButton python = new JButton("PYTHON");
            python.setBackground(mainOrange);
            python.setOpaque(true);
            python.setBorderPainted(false);
            python.setToolTipText("python 페이지로 이동합니다.");
            // 버튼 크기 조정
            python.setPreferredSize(new Dimension(170, 90));
            btn.add(python);

            JButton js = new JButton("JS");
            js.setBackground(mainOrange);
            js.setOpaque(true);
            js.setBorderPainted(false);
            js.setToolTipText("js 페이지로 이동합니다.");
            // 버튼 크기 조정
            js.setPreferredSize(new Dimension(170, 90));
            btn.add(js);

            JButton swift = new JButton("SWIFT");
            swift.setBackground(mainOrange);
            swift.setOpaque(true);
            swift.setBorderPainted(false);
            swift.setToolTipText("swift 페이지로 이동합니다.");
            // 버튼 크기 조정
            swift.setPreferredSize(new Dimension(170, 90));
            btn.add(swift);
            
            
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
			
			// JTree 사용하기
			DefaultMutableTreeNode root = new DefaultMutableTreeNode("Menu");
			DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Development Language");
			DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Our Magazine");
			DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("About");
			
			root.add(child1);
			root.add(child2);
			root.add(child3);
			
			
			DefaultMutableTreeNode child1_1 = new DefaultMutableTreeNode("Java");
			DefaultMutableTreeNode child1_2 = new DefaultMutableTreeNode("Python");
			DefaultMutableTreeNode child1_3 = new DefaultMutableTreeNode("Js");
			DefaultMutableTreeNode child1_4 = new DefaultMutableTreeNode("Swift");
			DefaultMutableTreeNode child2_1 = new DefaultMutableTreeNode("Write");
			DefaultMutableTreeNode child3_1 = new DefaultMutableTreeNode("MFD");
			DefaultMutableTreeNode child3_2 = new DefaultMutableTreeNode("Instructions");
			
			child1.add(child1_1);
			child1.add(child1_2);
			child1.add(child1_3);
			child1.add(child1_4);
			child2.add(child2_1);
			child3.add(child3_1);
			child3.add(child3_2);
			
			
			JTree tree = new JTree(root);
			tree.setBackground(mainYellow);
			tree.setCellRenderer(new MyCellRenderer());
			panel_3.add(tree);
			
			tree.addTreeSelectionListener(new TreeSelectionListener() {
	            @Override
	            public void valueChanged(TreeSelectionEvent e) {
	                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) 
	                		tree.getLastSelectedPathComponent();
	                
	                if (selectedNode == child1_1) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new java();
	                }
	                
	                else if (selectedNode == child1_2) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new python();
	                }
	                else if (selectedNode == child1_3) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new js();
	                }
	                else if (selectedNode == child1_4) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new swift();
	                }
	                else if (selectedNode == child2_1) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new write();
	                }
	                else if (selectedNode == child3_1) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new info();
	                }
	                else if (selectedNode == child3_2) {
	                	frame.dispose(); //현재 윈도우만 닫힘
	            		//setVisible(false);
	            		new Instructions();
	                }
	            }
			});
			
			// JTree 색상 바꾸기
			DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
	        renderer.setTextSelectionColor(Color.black);
	        renderer.setBackgroundSelectionColor(mainYellow);
	        renderer.setBorderSelectionColor(mainOrange);
			
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public class MyCellRenderer extends DefaultTreeCellRenderer {

	    @Override
	    public Color getBackgroundNonSelectionColor() {
	        return (null);
	    }

	    @Override
	    public Color getBackgroundSelectionColor() {
	        return Color.white;
	    }

	    @Override
	    public Color getBackground() {
	        return (null);
	    }

	    @Override
	    public Component getTreeCellRendererComponent(final JTree tree, final Object value, final boolean sel, final boolean expanded, final boolean leaf, final int row, final boolean hasFocus) {
	        final Component ret = super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

	        final DefaultMutableTreeNode node = ((DefaultMutableTreeNode) (value));
	        this.setText(value.toString());
	        return ret;
	    }
	}
}