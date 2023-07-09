import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LiangShuZhiHe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.nextLine();
        String[] a=s.split("\\[");
        String[] b=a[1].split("\\]");
        String[] bb=b[1].split(",");
        int target=Integer.parseInt(bb[1]);
        String[] c=b[0].split(",");
        int[] z=new int[c.length];
        Map<Integer,Integer> ind=new HashMap<Integer,Integer>();
        for(int i=0;i<c.length;i++){
            z[i]=Integer.parseInt(c[i]);
            ind.put(z[i],i+1);
        }
        Arrays.sort(z);
        int g=0;//要查找的数
        int o=0;//下标
        int f=0;//下标
        for(int i=0;i<z.length;i++){
            /*if((target+10)<z[i])
                return;
            }*/
            g=target-z[i];
            int begin=i+1;
            int end=z.length-1;
            int mid=(begin+end)/2;

            while(begin<end){
                mid=(begin+end)/2;
                if(g==(z[mid])){
                    o=i;
                    f=mid;
                    if(ind.get(z[i])>ind.get(z[mid])){
                        o=ind.get(z[mid]);
                        f=ind.get(z[i]);
                    }else{
                        f=ind.get(z[mid]);
                        o=ind.get(z[i]);
                    }
                    System.out.println("["+o+","+f+"]");
                    return;
                }else if(g<(z[mid])){
                    end=mid-1;
                }else{
                    begin=mid+1;
                }
            }
            if(begin==end){
                if(g==z[begin]){
                    if(ind.get(z[i])>ind.get(z[begin])){
                        o=ind.get(z[begin]);
                        f=ind.get(z[i]);
                    }else{
                        f=ind.get(z[begin]);
                        o=ind.get(z[i]);
                    }
                    System.out.println("["+o+","+f+"]");
                    return;
                }
            }

        }


    }
}
