import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ZiFuGeShuTongJi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s=in.nextLine();
        char[] ca=s.toCharArray();

        Set<Object> se=new TreeSet<>();
        for(int i=0;i<ca.length;i++){
            se.add(ca[i]);
        }
        System.out.println(se.size());
    }
}
