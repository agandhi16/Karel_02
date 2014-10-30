/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Alex Gandhi>
* @version <29/10/14> // 
*/

import edu.fcps.karel2.Display;

public class Lab02 {

     public static void main(String[] args) {
          
         Display.openWorld("maps/maze.map");
         Display.setSize(8, 8);
            
         Athlete karel = new Athlete();
            
         karel.putBeeper();
         karel.move();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.putBeeper();
         karel.turnLeft();
         karel.move();
         karel.putBeeper();
         karel.turnLeft();
         karel.move();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.putBeeper();
         karel.move();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.putBeeper();
         karel.turnLeft();
         karel.move();
         karel.putBeeper();
         karel.turnLeft();
         karel.move();
         karel.putBeeper();
         karel.move();
         karel.putBeeper();
         karel.move();
         karel.putBeeper();
         karel.move();
         karel.putBeeper();
         karel.turnRight();
         karel.move();
         karel.putBeeper();
         karel.move();

     }
}
