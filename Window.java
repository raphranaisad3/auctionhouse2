package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private ImagePanel imagepanel = new ImagePanel();
	private BarProgress barprogress = new BarProgress();
	
	
	private JPanel contItemAuctioneer = new JPanel();
	private JPanel contBar= new JPanel();
	private JPanel contAll = new JPanel();
	private JPanel contCenterBidders1 = new JPanel();
	private JPanel contCenterBidders2 = new JPanel();
	private JPanel contCenterBidders = new JPanel();
	private JPanel contWestBidder = new JPanel();
	private JPanel contEastBidder = new JPanel();
	
	
	private JButton label = new JButton("Start");
	private Thread t;
	
	
	public Window(){
		
		this.setTitle("auction house");
		this.setSize(1200,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		
		contItemAuctioneer.setBackground(Color.white);
		contItemAuctioneer.add(imagepanel.itemAuctioneer);
		
		//validate();		
		
		contBar.add(barprogress.south);
		
		
		
	
		
		
		contCenterBidders.setBackground(Color.white);
		contCenterBidders.add(imagepanel.centerbidderspan);
		contCenterBidders.add(imagepanel.centerbidderspan2);
		
		
		
		
		contWestBidder.setBackground(Color.white);
		contWestBidder.add(imagepanel.westbidderspan);
		
		contEastBidder.setBackground(Color.white);
		contEastBidder.add(imagepanel.eastbidderspan);
		
						
		contAll.setBackground(Color.white);
		contAll.setLayout(new BorderLayout());
		contAll.add(contItemAuctioneer, BorderLayout.NORTH);
		contAll.add(contBar, BorderLayout.SOUTH);
		contAll.add(contCenterBidders, BorderLayout.CENTER);
		contAll.add(contWestBidder, BorderLayout.WEST);
		contAll.add(contEastBidder, BorderLayout.EAST);
		
		
		
		
		
	    this.setContentPane(contAll);
	    this.setVisible(true);      
	}
	

}
