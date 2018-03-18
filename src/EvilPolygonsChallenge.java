import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot dwight = new Robot();
		//2. Set the speed to 100
dwight.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		dwight.setPenColor(colorChoice);
		//4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog("How many polygons do you want drawn?");
		int poly = Integer.parseInt(polygon);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < poly; i++) {
			
		
		dwight.move(10);
		dwight.turn(90);
		dwight.move(10);
		dwight.turn(90);
		dwight.move(10);
		dwight.turn(90);
		dwight.move(10);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

