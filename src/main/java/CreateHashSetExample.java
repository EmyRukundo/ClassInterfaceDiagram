import java.util.HashSet;
import java.util.Set;

//A Set is a Collection that cannot contain duplicate elements.
//It models the mathematical set abstraction. The Set interface contains
//only methods inherited from Collection and adds the restriction
//that duplicate elements are prohibited.

public class CreateHashSetExample {

    public static void main(String args[]) {

        Set<String> daysOfWeek = new HashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
    }
}
