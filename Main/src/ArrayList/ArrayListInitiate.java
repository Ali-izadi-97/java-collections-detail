package ArrayList;

import java.util.*;

public class ArrayListInitiate {
    public static void main(String[] args) {
        ArrayList<String> obj =
                new ArrayList<String>(Arrays.asList("one", "two"));


        //anonymous inner class
        ArrayList<String> user = new ArrayList<String>(){{
            add("admin");
            add("developer");
            add("scrum master");
        }};

        ArrayList<ArrayList<String>> obj2d = new ArrayList<ArrayList<String>>();
        obj2d.add(new ArrayList<>(Arrays.asList("1", "2", "3")));
        obj2d.add(new ArrayList<>(Arrays.asList("4", "5", "6")));

        ArrayList<Integer> obj3 =
                new ArrayList<Integer>(Collections.nCopies(13, 5));

        //iterate with enumeration
        Enumeration<ArrayList<String>> en = Collections.enumeration(obj2d);
        while (en.hasMoreElements()) {
            Iterator<String> inside = en.nextElement().iterator();
            while (inside.hasNext()) {
                System.out.println(inside.next());
            }
        }

//        System.out.println(obj3/;
    }
}
