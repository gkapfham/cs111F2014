//==========================================
// 
//==========================================


import javax.swing.*;

public class Lab4Test
{
    public static void main(String[] args)
    {
        	JFrame window = new JFrame(" Your name ");

      		// Add the drawing canvas and do necessary things to
     		// make the window appear on the screen!
        	window.getContentPane().add(new Lab4());
        	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	window.setVisible(true);
			window.setSize(600, 400);
        	
    }
}

