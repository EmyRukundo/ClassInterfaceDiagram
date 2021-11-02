import java.util.TreeSet;

public class CreateTreeSet {

    public static void main(String args[]){

        TreeSet seasons = new TreeSet();

        seasons.add("summer");
        seasons.add("spring");
        seasons.add("winter");
        seasons.add("autumn");


        System.out.println("seasons of the year :" + seasons);

        seasons.add("Summer");
//        allowing duplicate because it starts with the capital letter

        System.out.println("the seasons are:" +seasons);

    }

}
