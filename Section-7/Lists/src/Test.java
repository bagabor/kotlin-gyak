import java.util.Arrays;
import java.util.List;



public class Test {

    public static void main(String[] args) {
        String[] s = new String[5];
        s[0] = "hello";
        s[1] = "goodbye";
        List x = Arrays.asList(s);
        x.set(1, "blah");
        for (String ss: s) {
            System.out.println(ss);
        }

    }

}
