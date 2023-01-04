import java.util.ArrayList;

public class File1 {
    public static void main(String[] args) {
        ArrayList<Integer> sa = new ArrayList<>();

        sa.add(12);
        sa.add(450);
        sa.add(354);
        sa.add(89);

        for (int x : sa) {
            System.out.println("list is = " + x);
        }

    }
}