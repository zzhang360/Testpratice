import sun.misc.Unsafe;

import java.util.Scanner;

public class ZuoBiaoYiDong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String inp=in.nextLine();
        String[] s= inp.split(";",-1);
        int[] a=new int[]{0,0};
        String dir="";
        String dis="";
        for(int i=0;i<s.length;i++){
            dir=s[i].substring(0,1);
            dis=s[i].substring(1);
            if(!dis.matches("^[0-9]*$")){
                continue;
            }
            if(s[i].length()<2){
                continue;
            }
            if("A".equals(dir)){
                a[0]=a[0]-Integer.parseInt(dis);
            }else if("D".equals(dir)){
                a[0]=a[0]+Integer.parseInt(dis);
            }else if("W".equals(dir)){
                a[1]=a[1]+Integer.parseInt(dis);
            }else if("S".equals(dir)){
                a[1]=a[1]-Integer.parseInt(dis);
            }else{
                continue;

            }
        }
        System.out.println("("+a[0]+","+a[1]+")");
    }
}
