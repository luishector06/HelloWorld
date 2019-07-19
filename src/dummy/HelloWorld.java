package dummy;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    HelloWorld helloWorld = new HelloWorld();
	    helloWorld.go();
	    
	}

	public void go(){
		
		String respuesta = JOptionPane.showInputDialog(null, "HelloWorld");
		JOptionPane.showConfirmDialog(null, respuesta, "ssss", JOptionPane.YES_NO_CANCEL_OPTION);
	   	
	}
	
}
