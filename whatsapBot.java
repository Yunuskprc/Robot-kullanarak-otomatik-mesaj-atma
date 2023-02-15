import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

import java.awt.datatransfer.Clipboard;
public class whatsapBot {
    public static void main(String[] args) throws AWTException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Robot nesneRobot = new Robot(); 
        StringSelection stringSelection = new StringSelection("Bane");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        int i=0;
        while(i<500)
        {
            nesneRobot.keyPress(KeyEvent.VK_CONTROL);
            nesneRobot.keyPress(KeyEvent.VK_V);
            nesneRobot.keyRelease(KeyEvent.VK_CONTROL);
            nesneRobot.keyRelease(KeyEvent.VK_V);
    
            nesneRobot.keyPress(KeyEvent.VK_ENTER);
            nesneRobot.keyRelease(KeyEvent.VK_ENTER);
            i++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }

        
    }
}
