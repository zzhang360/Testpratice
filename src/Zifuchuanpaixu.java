import java.util.*;

public class Zifuchuanpaixu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=Integer.parseInt(in.nextLine());
        String[] se=new String[a];
        for(int i=0;i<a;i++){
            //se.add(in.nextLine());
            se[i]=in.nextLine();
        }
        Arrays.sort(se);
        for (int i=0;i<a;i++) {
            System.out.println(se[i]);
        }
    }
}
