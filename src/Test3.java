import java.util.*;
import java.util.Stack;
public class Test3 {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
       /* 4
        3 2 6 3
        0 1 1 0
        2

        4
        3 2 6 8
        0 1 1 1
        1*/
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());//供货商数量
        String[] goods =(in.nextLine()).split(" ");//供货数数组
        String[] type =(in.nextLine()).split(" ");//货物类型

        int carnum =Integer.parseInt(in.nextLine());

        List<Integer> gan=new ArrayList<Integer>();
        List<Integer> shi=new ArrayList<Integer>();


        int maxgan=0;
        int maxshi=0;
        for(int i=0;i<type.length;i++){
           if("0".equals(type[i])){

               gan.add(Integer.parseInt(goods[i]));
           }else if("1".equals(type[i])){

               shi.add(Integer.parseInt(goods[i]));
           }
        }
        Collections.sort(gan, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        Collections.sort(shi, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });


        if(gan.size()==carnum||gan.size()<carnum){
             maxgan=gan.get(gan.size()-1);
        }else{
            int l1=gan.size()-carnum;
            int gmax=0;
            for(int i=0;i<=l1;i++){
                gmax+=gan.get(i);
            }
            if(gmax<gan.get(gan.size()-1)){
                maxgan=gan.get(gan.size()-1);
            }else{
                maxgan=gmax;
            }

        }
        if(shi.size()==carnum||shi.size()<carnum){
            maxshi=shi.get(shi.size()-1);
        }else{
            int l1=shi.size()-carnum;
            int smax=0;
            for(int i=0;i<=l1;i++){
                smax+=shi.get(i);
            }
            if(smax<shi.get(shi.size()-1)){
                maxshi=shi.get(shi.size()-1);
            }else{
                maxshi=smax;
            }
        }

        if(maxgan<maxshi){
            System.out.println(maxshi);
        }else {
            System.out.println(maxgan);
        }

    }

}
