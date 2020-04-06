import java.awt.*;

import java.awt.event.*;



class BackgroundColor extends Frame implements ItemListener

{
    
    
Choice c;
    
 public void itemStateChanged(ItemEvent e)
    
{
       
 if(e.getItem()=="Red")
       
 {
            
Color clr=Color.red;
  
          setBackground(clr);


       
 }
       
 else if(e.getItem()=="Blue")
    
    {
   
         Color clr=Color.blue;
 
           setBackground(clr);


  
      }
else if(e.getItem()=="Green")
       
 {
         
   Color clr=Color.green;
      
      setBackground(clr);


       
 }
else if(e.getItem()=="Yellow")
    
    {
      
      Color clr=Color.yellow;
          
  setBackground(clr);


       
 }

else if(e.getItem()=="White")
      
  {
          
  Color clr=Color.white;
           
 setBackground(clr);


     
   }

    
}



  
  BackgroundColor()
   
 {
       
 setTitle("BackGround Color");
    
    setLayout(new FlowLayout());
  
      setSize(300,300);
       
 Color clr=Color.white;

    
    setBackground(clr);

   
     c=new Choice();
      
  c.setBounds(100,100,80,80);
     
   c.addItem("White");
    
    c.addItem("Yellow");
    
    c.addItem("Green");
       
 c.addItem("Blue");
     
   c.addItem("Red");
        
add(c);
       
 c.addItemListener(this);
 
       setVisible(true);
  
  }

   

   
 static public void main(String args[])
   
 {
        BackgroundColor b=new BackgroundColor();
   
 }



}