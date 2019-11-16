package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortedArrayList {
    public static void main(String[] args) {

        ArrayList<String> sample =
                new ArrayList<String>(Arrays.asList("man", "salam", "modi"));

        
        //sorted alphabetically bu Collections.sort()
        Collections.sort(sample);

    }
}

class CompareTwoNumber implements Comparable<CompareTwoNumber> {

    private int num1;
    private int num2;

    public CompareTwoNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public int compareTo(CompareTwoNumber twoNumber) {
        int objNumber = twoNumber.getNum2();
        return num1-objNumber;
    }
}

class UseComparator {

    private int num1;
    private int num2;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public UseComparator(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static Comparator<UseComparator> withNameLen = new Comparator<UseComparator>() {
        @Override
        public int compare(UseComparator o1, UseComparator o2) {
            return o1.getName().length()-o2.getNum1();
        }

    };

    public static Comparator<UseComparator> withNumbers = new Comparator<UseComparator>() {
        @Override
        public int compare(UseComparator o1, UseComparator o2) {
            return o1.getNum1()-o2.getNum2();
        }

    };

}

