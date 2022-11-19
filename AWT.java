import java.awt.*; 
import java.awt.event.*;       
import java.awt.event.WindowEvent.*;    
import java.awt.event.WindowListener.*; 
class awt{    
    
   awt() {  
  
      Frame f = new Frame();  
      Label l = new Label("Amount of water used:");   
      Button b = new Button("Submit");  
      TextField t = new TextField(); 
       Label l1=new Label("Amount of electricity used:");
       Button b1=new Button("Submit");
       TextField t1= new TextField(); 
      Label finwat=new Label();
      Label finele=new Label();
      Label addl = new Label("Enter your address");   
      Button addb = new Button("Submit");  
      TextField addt = new TextField(); 
      Label finadd=new Label();



      /*final TextField finwat = new TextField(6);
      final TextField finele = new TextField(6);
      final TextField addt = new TextField(6);
*/

       b.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Water used " + finwat.getText();
            finwat.setText(data);   
         }
       });
       b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Electricity used " + finele.getText();
            finele.setText(data);   
         }
       }); 
       addb.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Address" + addt.getText();
            finadd.setText(data);   
         }
       });     
      
      // setting position of above components in the frame  
      addl.setBounds(20, 70, 120, 30);
      addt.setBounds(20, 100, 180, 100);  
      addb.setBounds(200, 130, 80, 20);
      l.setBounds(20, 200, 120, 30);
      t.setBounds(20, 230, 80, 20);  
      b.setBounds(100, 230, 80, 20);  
      l1.setBounds(20, 250, 150, 30); 
      t1.setBounds(20, 280, 80, 20);
      b1.setBounds(100, 280, 80, 20);  
      finwat.setBounds(20,360,120,20);
      finele.setBounds(20,380,120,20);
      finadd.setBounds(20,300,120,20);



   
      
      f.add(b);
      f.add(l);  
      f.add(t);  
      f.add(l1);  
      f.add(t1);  
      f.add(b1);  
      f.add(finwat);
      f.add(finele);
      f.add(addb);  
      f.add(addl);  
      f.add(addt);
      f.add(finadd);
    
      f.setSize(400,440);
      f.setTitle("Bill Calculator");   
      f.setLayout(null);   
      f.setVisible(true);  

 /*   b.addActionListener(new ActionListener() {
    public void actionPerformed (ActionEvent e) {    
            t1.setText("Welcome to Javatpoint."); 
    }
      });
*/
f.addWindowListener(new WindowAdapter() 
{
	@Override
	public void windowClosing(WindowEvent e) 
   {
		System.exit(0);
	}
});

 
}    

public static void main(String args[]) {   
awt awt_obj = new awt();
}  
  
}
Mango
