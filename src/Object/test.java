package Object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int a=o1.hashCode();
        int b=o2.hashCode();
        return a-b;
    }

    public static void main(String[] args) {
        List<String> lis=new ArrayList<String>();
        lis.add("ni");
        lis.add("到底");
        lis.add("sss");
        Collections.sort(lis,new test());
        System.out.println(lis);
    }
}
