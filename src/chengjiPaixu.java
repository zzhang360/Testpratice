import java.util.*;

public class chengjiPaixu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int ord =Integer.parseInt(in.nextLine());
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(int i=0;i<num;i++){
            String data=in.nextLine();
            String[] d1=data.split("\\ ");
            map.put(d1[0],Integer.parseInt(d1[1]));
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        if(ord==1){
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue()-o2.getValue();
                }
            });
        }else{
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
        }


    }
}
