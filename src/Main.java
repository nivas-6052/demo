import java.util.*;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("hai");
        str.add("hello");
        str.add("welcome");
        str.add("world");
         str.add("world");
        List<String> str1= str.subList(0,2);
//        String[] newValueArray = str.subList(0,2).toArray(new String[0]);
        String newValuesJoined = String.join(",", str1);

        System.out.println("value "+ newValuesJoined);
        str.add("world");stash 2
        str.add("world");commit 2
    }
}
