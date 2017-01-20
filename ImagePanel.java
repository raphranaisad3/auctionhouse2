package ihm;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel  extends JPanel{

	JLabel items ;
	
	Details details = new Details();
	
	
	
	
	 JLabel bidder1 ,bidder2,bidder3,bidder4,auctioneer ;	
	 JPanel centerbidderspan;
	 JPanel centerbidderspan2;
	 JPanel westbidderspan;
	 JPanel eastbidderspan;
	 JPanel itemAuctioneer;
	 //JPanel money;
	 
	
	 
	 
	 public ImagePanel(){
		 
		 
		 bidder1 = new JLabel(new ImageIcon("avatars/bidder1.png"));
		 bidder2 = new JLabel(new ImageIcon("avatars/bidder2.png"));
		 bidder3 = new JLabel(new ImageIcon("avatars/bidder3.png"));
		 bidder4 = new JLabel(new ImageIcon("avatars/bidder4.png"));
		 auctioneer = new JLabel(new ImageIcon("avatars/auctioneer.png"));
		 items = new JLabel(new ImageIcon("items/monalisa.png"));
		
		 centerbidderspan = new JPanel();
		 centerbidderspan.setLayout(new BoxLayout(centerbidderspan, BoxLayout.LINE_AXIS));
		 centerbidderspan.setBackground(Color.white);
		 centerbidderspan.add(bidder2);
		 centerbidderspan.add(details.Bidderinfo("Bidder2",8,6,10));
		 
		 centerbidderspan2 = new JPanel();
		 centerbidderspan2.setLayout(new BoxLayout(centerbidderspan2, BoxLayout.LINE_AXIS));
		 centerbidderspan2.setBackground(Color.white);
		 centerbidderspan2.add(bidder3);
		 centerbidderspan2.add(details.Bidderinfo("Bidder3",8,6,10));
		 
		 westbidderspan = new JPanel();
		 westbidderspan.setLayout(new BoxLayout(westbidderspan, BoxLayout.LINE_AXIS));
		 westbidderspan.setBackground(Color.white);
		 westbidderspan.add(bidder1);
		 westbidderspan.add(details.Bidderinfo("Bidder1",5,4,4));
		 
		 eastbidderspan = new JPanel();
		 eastbidderspan.setLayout(new BoxLayout(eastbidderspan, BoxLayout.LINE_AXIS));
		 eastbidderspan.setBackground(Color.white);
		 eastbidderspan.add(bidder4);
		 eastbidderspan.add(details.Bidderinfo("Bidder4",5,3,2));
		 
		 
		 itemAuctioneer = new JPanel();
		 itemAuctioneer.setLayout(new BoxLayout(itemAuctioneer, BoxLayout.LINE_AXIS));
		 itemAuctioneer.setBackground(Color.white);
		 itemAuctioneer.add(auctioneer);
		 itemAuctioneer.add(items);
		 itemAuctioneer.add(details.Iteminfos("Monalisa","Hugo","tableau",1000000,2000000,5));
		 
	 }
}
