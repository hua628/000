import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    static int globalMS=2800,pressMS = 1200;
    public static void main(String[] args) throws IOException, InterruptedException, AWTException {
        int XaxisPreFix=0,YaxisPreFix=30;
//        String Name = "洪祥瑞",Email = "jeff87218@gmail.com",Phone = "0983162068",CreditCard = "1234 5678 1234 5678",CreditCardName="HuangXiangRui",SafeCode="123",ExpireDay="1010",Seven11="喜樹";
        String CreditCard = "5408 0589 0258 7026",CreditCardName="LINJIAHUA",SafeCode="802",ExpireDay="1226",Seven11="海利";

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


        robot.mouseMove(990,631);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);
        //-------------------門市選擇------------------

        robot.mouseMove(1290,920); //進入門市頁面
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(globalMS);

        robot.mouseMove(1160,140);//門市名稱搜尋
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(530,280);//搜尋框
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        writeTextBox.write(robot,Seven11);

        robot.mouseMove(680,285);//搜尋
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(920,295);//選擇門市
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(950,385);//門市確認
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(1265,460);//同意
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(pressMS);

        robot.mouseMove(995,460);//確認
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(globalMS*2);


        robot.mouseWheel(3);
        robot.delay(1000);
//-------------------信用卡------------------

        robot.mouseMove(1240,330);
        writeTextBox.write(robot,CreditCard);//卡號
        robot.delay(350);

        robot.mouseMove(1240,375);
        writeTextBox.write(robot,CreditCardName);//卡片名字
        robot.delay(350);


        robot.mouseMove(1100,440);
        TypeWord.type (robot,ExpireDay);//效期
        robot.delay(350);

        robot.mouseMove(1430,430);
        writeTextBox.write(robot,SafeCode);//安全碼
        robot.delay(350);

    }
}
