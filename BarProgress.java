package ihm;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

//CTRL + SHIFT + O pour générer les imports nécessaires
public class BarProgress extends JPanel{
private Thread t;
private JProgressBar bar;
private JButton launch ;
private JButton nolaunch ;
private boolean begin;
private int val,v;

private int maxi =65;
 
JPanel Butpan2;
JPanel Bcontainer ;
JPanel south ;



public  BarProgress(){    
	
      
    
  t = new Thread(new Traitement());
  bar  = new JProgressBar();
  bar.setMaximum(maxi);
  bar.setMinimum(0);
 // bar.setStringPainted(true);
    
  
   
  launch = new JButton("Lancer");
  nolaunch = new JButton("Stop");
  
  JPanel Butpan = new JPanel();
  //Butpan.setBackground(Color.white);
  Butpan.setLayout(new BoxLayout(Butpan, BoxLayout.LINE_AXIS));
  Butpan.add(launch);
  Butpan.add(nolaunch);
  
  Butpan2 = new JPanel();
 //Butpan2.setBackground(Color.white);
  Butpan2.setLayout(new BoxLayout(Butpan2, BoxLayout.LINE_AXIS));
  Butpan2.add(Butpan);
  
  launch.addActionListener(new Blaunch());
  nolaunch.addActionListener(new Bnolaunch());
  
  JPanel Bar = new JPanel();
  //bar.setBackground(Color.white);
  bar.setPreferredSize(new Dimension(550, 50));
  Bar.setLayout(new BoxLayout(Bar, BoxLayout.LINE_AXIS));
  Bar.add(bar);
    
  Bcontainer = new JPanel();
  //Bcontainer.setBackground(Color.white);
  Bcontainer.setLayout(new BoxLayout(Bcontainer, BoxLayout.PAGE_AXIS));
  Bcontainer.add(bar);
  Bcontainer.add(Butpan2);
  
  
 south = new JPanel();
 //south.setBackground(Color.white);
 south.setLayout(new BoxLayout(south, BoxLayout.PAGE_AXIS));
 south.add(Bcontainer);
     
  t.start();      
  
  
 
}





private void go(){
	
	 v=getVal();
	 
	 if (v==maxi){
		 v=0;
		
	 }
	 while (this.begin & (v<=maxi) ){
		 
		 	setVal(v++);
		 		   
		
		 
		  //for(int val = 0; val <= 500; val++){
		      bar.setValue(getVal());
		      try {
		        Thread.sleep(50);
		      } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		      e.printStackTrace();
		      }
		    
		   
		  } 	
	 launch.setEnabled(true);
}




class Traitement implements Runnable{   
  public void run(){
	     go();
  					}
    }






//Classe écoutant notre bouton
public class Blaunch implements ActionListener{
   public void actionPerformed(ActionEvent arg0) {
	   t = new Thread(new Traitement());
	      t.start();      
	      begin =true;
	      launch.setEnabled(false);
		  nolaunch.setEnabled(true);
  }
}

class Bnolaunch implements ActionListener{
  public void actionPerformed(ActionEvent e) {
	  begin = false;  
      launch.setEnabled(true);
      nolaunch.setEnabled(false);
  }  
}  


public int getVal(){
	return val;
}

public void setVal(int val){
	this.val = val;
}


}