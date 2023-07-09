import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s=in.nextLine();
        char[] ca=s.toCharArray();
        int num = 0;
        HashMap<Object,Integer> hm=new HashMap<>();
        for(int i=0;i<ca.length;i++){
            if(hm.containsKey(ca[i])){
                continue;
            }
            for(int j=i+1;j<ca.length;j++){
                if(ca[i]==ca[j]){
                    hm.put(ca[i],i);
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
