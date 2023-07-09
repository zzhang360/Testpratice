import java.util.*;

public class ShanChuZiFuChuanZhongChuXianCiShuZuiShaoZiFu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String input=in.nextLine();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        char[] ar=input.toCharArray();
        for(Character a:ar){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Collection<Integer> num = map.values();
        int mins= Collections.min(num);
        for (Character a:ar) {
            if(map.get(a)==mins){
                input=input.replaceAll(String.valueOf(a),"");
            }
        }
        System.out.println(input);

    }
}
