package ihm;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Details {
	
	JPanel money, infoItem ;
	String name,autor,category;
	int initialprice,finalprice,rarity;
	
	 JLabel  Initialprice ,Finalprice, Autor,Category, Rarity,Budget,Spent,Rest,space, Name ;
	
	int  budget=1000;
	int spent =200;
	int  rest =budget- spent;
	
	

	public JPanel Bidderinfo(String name,int budget,int spent,int rest){
		 space = new JLabel(" ");
		 Name = new JLabel("Name : "+(this.name = name));
		 Budget = new JLabel("Budget : "+(this.budget=budget));
		 Spent = new JLabel ("Spent  : "+(this.spent=spent));
		 Rest = new JLabel ("Rest : "+(this.rest=rest));
		 
		 money = new JPanel();
		 money.setLayout(new BoxLayout(money, BoxLayout.Y_AXIS));
		 money.setBackground(Color.white);
		 money.add(space);
		 money.add(Name);
		 money.add(Budget);
		 money.add(Spent);
		 money.add(Rest);
		 
		return  money;
		
	}
	
	
	public JPanel Iteminfos(String name,String autor,String category,int initialprice,int finalprice,int rarity){
	 
		 
			 Name = new JLabel("Name : "+name);
			 Initialprice = new JLabel ("Initial price : "+(this.initialprice= initialprice));
			 Finalprice = new JLabel ("Final price  : "+(this.finalprice=finalprice));
			 Category = new JLabel ("Category : "+(this.category=category));
			 Autor = new JLabel ("Autor : "+(this.autor=autor));
			 Rarity = new JLabel ("Rarity : "+(this.rarity=rarity));
			 
			 infoItem = new JPanel();
			 infoItem.setLayout(new BoxLayout(infoItem, BoxLayout.Y_AXIS));
			 infoItem.setBackground(Color.white);
			 infoItem.add(Name);
			 infoItem.add(Autor);
			 infoItem.add(Initialprice);
			 infoItem.add(Finalprice);
			 infoItem.add(Category);
			 infoItem.add(Rarity);
			 
	
			 
		return  infoItem;
		
	}
	
	
}
