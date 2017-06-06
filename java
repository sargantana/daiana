package kurven;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;


public class Diskusion {
	private static JTextField txt_1;
	private static JTextField txt_2;
	private static JTextField txt_3;
	
 public static void main(String args[]){
	 JFrame myFrame = new JFrame();
	 myFrame.getContentPane().setLayout(null);
	 
	 txt_1 = new JTextField();
	 txt_1.setBounds(10, 35, 35, 35);
	 myFrame.getContentPane().add(txt_1);
	 txt_1.setColumns(10);
	 
	 txt_2 = new JTextField();
	 txt_2.setBounds(50, 35, 35, 35);
	 myFrame.getContentPane().add(txt_2);
	 txt_2.setColumns(10);
	 
	 txt_3 = new JTextField();
	 txt_3.setBounds(90, 35, 35, 35);
	 myFrame.getContentPane().add(txt_3);
	 txt_3.setColumns(10);
	 
	 JButton Start = new JButton("Start");
	 Start.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent arg0) {
	 	}
	 });
	 Start.setBounds(130, 41, 89, 23);
	 myFrame.getContentPane().add(Start);
	 
	 JTextPane txtpnGebenSieAb = new JTextPane();
	 txtpnGebenSieAb.setText("Geben Sie a,b und c an");
	 txtpnGebenSieAb.setBounds(9, 11, 126, 20);
	 myFrame.getContentPane().add(txtpnGebenSieAb);
	 
	 JTextArea textArea = new JTextArea();
	 textArea.setBounds(10, 100, 414, 150);
	 myFrame.getContentPane().add(textArea);
	 
	 JTextPane txtpnMitDiesemProgramm = new JTextPane();
	 txtpnMitDiesemProgramm.setText("Mit diesem Programm k\u00F6nnen Sie Kurvendiskussionen f\u00FCr Quadratische Funktionen durchf\u00FChren\r\n");
	 txtpnMitDiesemProgramm.setBounds(252, 11, 172, 78);
	 myFrame.getContentPane().add(txtpnMitDiesemProgramm);
	 
	 JTextPane txtpnAllgemeineFormY = new JTextPane();
	 txtpnAllgemeineFormY.setText("Allgemeine Form: y= ax^2 +bx+ d");
	 txtpnAllgemeineFormY.setBounds(10, 69, 209, 20);
	 myFrame.getContentPane().add(txtpnAllgemeineFormY);
	 
 }
 public void main(){
 
 double a = 0;
 double b = 0;
 double c = 0;
 
 a= Double.parseDouble(txt_1.getText());
 b= Double.parseDouble(txt_2.getText());
 c= Double.parseDouble(txt_3.getText());
 
 
 double x = 0;
 double y = 0;

 
 y = a*x*x + b*x + c; 
 double y2 = a*(-x)*(-x) + b*(-x) + c;
 double y3 = -(a*(-x)*(-x) + b*(-x) + c);
 
 if(y==y2){
	 textArea.setText("Es gibt eine Achsensymmetrie");
	 
 }
 else{
	 textArea.setText("Es gibt keine Achsensymmetrie");
 }
 if (y2==y3){
	 textArea.setText("Es gibt eine Punktsymmetrie");
 }
 else {
	 textArea.setText("Es gibt keine Achsensymmetrie");
 }
 
 double p = (b/a);
 double q = (c/a);
 
 double Wurzel= p/2 * p/2 - q;
  
 if (Wurzel>0){
	 double x1 = -p/2 + Wurzel;
	 double x2 = -p/2 - Wurzel;
	 textArea.setText("Es gibt zwei Nullstellen:" + x1 + "und" + x2);
 }
 else {
	 textArea.setText("Es gibt keine Nullstellen");
 }
 
 
 
 }
}
