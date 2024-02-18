package logictest;

import org.example.Main;

public class LogicTest {
    Main main = new Main();
    public void testLogic(){
        int k = main.getLogic(10);
        System.out.println("value of k: "+k);
    }
    public void testLogic2(){
        int l = main.getLogic(20);
        System.out.println("value of l"+l);
    }
}
