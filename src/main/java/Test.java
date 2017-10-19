import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        List<Object> objs = list;
        try {
            Thread.sleep(15000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void demo(Source<String> strs) {
        Source<Object> objects = strs; // ！！！在 Java 中不允许
        // ……
    }
}


interface Source<? extends Object> {
    void  nextT();
}