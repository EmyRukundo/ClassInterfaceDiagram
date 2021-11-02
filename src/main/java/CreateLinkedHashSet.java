import java.util.LinkedHashSet;

public class CreateLinkedHashSet {

    public static void main(String args []){

        LinkedHashSet<String> months = new LinkedHashSet<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("January");

        System.out.println(months);

    }
}
