import java.util.*;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        List<String> str1= str.subList(0,2);
//        String[] newValueArray = str.subList(0,2).toArray(new String[0]);
        String newValuesJoined = String.join(",", str1);

        System.out.println("value "+ newValuesJoined);
    }
}
