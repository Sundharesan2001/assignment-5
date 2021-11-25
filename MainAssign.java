package edyoda.assignment5;
import java.util.*;
public class MainAssign {
        public static void main(String[] args)
        {
            List<Integer> l = new ArrayList<>();
            l.add(7);
            l.add(12);
            l.add(58);
            l.add(18);
            l.add(33);
            l.add(55);
            l.add(100);
            int minimum = Collections.min(l);
            int maximum = Collections.max(l);
            if (minimum == maximum) {
                System.out.println("All elements are equal");
            }
            else {
                System.out.println("Min value of our list : "
                        + minimum);
                System.out.println("Max value of our list : "
                        + maximum);
            }
        }
    }
