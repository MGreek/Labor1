import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (String s : args)
        {
            try {
                sum += Integer.parseInt(s);
                ++count;
            }
            catch (NumberFormatException e) {
            }
        }
        if (count != 0) {
            System.out.println(((double) sum) / count);
        }
        else {
            System.out.println("No integer numbers were given as input!");
        }
    }
}