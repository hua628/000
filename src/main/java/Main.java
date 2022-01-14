import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    static int globalMS=3000,pressMS = 700;
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        int XaxisPreFix=0,YaxisPreFix=30;
//        String Name = "洪祥瑞",Email = "jeff87218@gmail.com",Phone = "0983162068",CreditCard = "1234 5678 1234 5678",CreditCardName="HuangXiangRui",SafeCode="123",ExpireDay="1010",Seven11="喜樹";
        String CreditCard = "9876 5432 9876 5432",CreditCardName="LINJIAHUA",SafeCode="802",ExpireDay="1223",Seven11="海利";

        int globalMS=3000,pressMS = 900;
//        String url = "https://www.habitselect.com/products/tightbooth-loop-boa-hat-2-colors";
//        Desktop.getDesktop().browse( java.net.URI.create(url));
        System.out.println("Thread Sleep");
        Thread.sleep(3500);
        Robot robot = new Robot();
//        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//        //取得螢幕截圖
//        BufferedImage bufferedImage = robot.createScreenCapture(screenRect);
//        int mousex = 0;
//        int mousey = 0;
//        //掃描購買鈕
//        for(int x = 0;x<bufferedImage.getWidth();x++){
//            for(int y = 0;y<bufferedImage.getHeight();y++){
//                if ((bufferedImage.getRGB(x, y) & 0x00FFFFFF) == 0x848257){
//                    mousex=x;
//                    mousey=y;
//                    break;
//                }
//            }
//        }
//        robot.mouseMove(mousex,mousey);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        robot.delay(globalMS);
//
//        robot.mouseMove(1484+XaxisPreFix,1007+YaxisPreFix);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        robot.delay(globalMS);

//        robot.mouseMove(840+XaxisPreFix,705+YaxisPreFix);
//        robot.mouseWheel(1);
//        robot.delay(100);
//        robot.mouseWheel(-1);
//        robot.delay(100);
//        writeTextBox.write(robot,Name);
//
//
//        robot.mouseMove(840+XaxisPreFix,776+YaxisPreFix);
//        writeTextBox.write(robot,Email);
//
//
//        robot.mouseMove(840+XaxisPreFix,878+YaxisPreFix);
//        writeTextBox.write(robot,Phone);

        robot.mouseWheel(1);
        robot.delay(100);
        robot.mouseWheel(-1);
        robot.delay(100);
        robot.mouseMove(990+XaxisPreFix,631);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);
        //-------------------門市選擇------------------

        robot.mouseMove(1496+XaxisPreFix,883+YaxisPreFix); //進入門市頁面
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(globalMS);

        robot.mouseMove(1154+XaxisPreFix,104+YaxisPreFix);//門市名稱搜尋
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(524+XaxisPreFix,262+YaxisPreFix);//搜尋框
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        writeTextBox.write(robot,Seven11);

        robot.mouseMove(678+XaxisPreFix,262+YaxisPreFix);//搜尋
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(803+XaxisPreFix,262+YaxisPreFix);//選擇門市
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(945+XaxisPreFix,359+YaxisPreFix);//門市確認
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(1204+XaxisPreFix,422+YaxisPreFix);//同意
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(994+XaxisPreFix,430+YaxisPreFix);//確認
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(globalMS*2);
        robot.mouseWheel(-5);
        robot.delay(700);


        //-------------------信用卡------------------

        robot.mouseWheel(3);
        robot.delay(500);


        robot.mouseMove(1487,804);
        robot.mouseMove(1487-10,804);
        robot.delay(500);
        writeTextBox.write(robot,CreditCardName);
        robot.delay(500);

        robot.mouseMove(1538,880);
        robot.delay(300);
        writeTextBox.write(robot,SafeCode);


        robot.mouseMove(1228,858);
        TypeWord.type(robot,ExpireDay);

        robot.mouseMove(1492,750);
        TypeWord.type(robot,CreditCard);

        robot.mouseWheel(9);
        robot.delay(150);
        robot.mouseMove(987,835);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(1353+XaxisPreFix,883+YaxisPreFix);
    }
}
