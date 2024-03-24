import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListJava {
    public static void main(String[] args) {

        //size of list is dynamic, depend on value [by default value is 10]

        List<Integer> L1 = new ArrayList<Integer>();
        L1.add(11);
        L1.add(22);
        L1.add(33);
        L1.add(44);
        L1.add(55);
        L1.add(66);
        System.out.println(L1);

        List<Integer> L2 = Arrays.asList(1, 2, 3, 4, 5, 6);
//        L2.add(10);
//        L2.add(20);
//        L2.add(30);
//        L2.add(40);
//        L2.add(50);
//        L2.add(60);
        System.out.println(L2 + "\n");


        //take input from odd index
        for (int i = 0; i < L1.size(); i = i + 2) {
            System.out.println(L1.get(i));
        }

        System.out.println("\n");

        //take input from even index
        for (int i = 1; i < L2.size(); i = i + 2) {
            System.out.println(L2.get(i));
        }
    }
}