import java.awt.*;
import java.awt.event.InputEvent;

public class TypeWord {
    public static void type(Robot robot, String text){

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(200);
        int ascii;
        for(int i = 0; i < text.length(); i++) {
            ascii = (int)text.charAt(i);
            robot.keyPress(ascii);
            robot.delay(20);
            robot.keyRelease(ascii);
            robot.delay(20);
        }
        robot.delay(Main.pressMS);
    }
}
