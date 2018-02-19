import javax.swing.JFrame;

/**
 * The application has the DrawLineAndPoint.
 * @author Jaemarie Solyst
 *
 */
public class ApplicationDrawLineAndPoint {
	/**
	 * Sets the width of the frame to 800 pixels
	 */
    public static int FRAME_WIDTH = 450;
	
	/**
	 * Sets the height of the frame to 1200 pixels
	 */
    public static int FRAME_HEIGHT = 300;
    
	/**
	 * Main method runs the DrawLineAndPoint.
	 * Creates the main frame for the app to be on and sizes it correctly.
	 * @param args arguments
	 */
	public static void main(String[]args) {
		//Create frame and put on instance of the GUI Controller.
		JFrame drawFrame = new JFrame("Draw a line");
		drawFrame.add(new DrawLineAndPoint());
		
		//Settings of frame
		drawFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawFrame.setVisible(true);
		
	}
}
