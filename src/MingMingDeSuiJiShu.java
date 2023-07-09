import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MingMingDeSuiJiShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        Set<Integer> s1=new TreeSet<Integer>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            s1.add(in.nextInt());
        }

        s1.forEach(e->{
            System.out.println(e);
        });
    }
}
