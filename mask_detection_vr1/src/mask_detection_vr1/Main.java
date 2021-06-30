package mask_detection_vr1;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Main {

		public static void main(String arg[]){
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
				e.printStackTrace(); 
			}
			MainFrame mainFrame=new MainFrame();
			mainFrame.displayScreen();
		}
	}


