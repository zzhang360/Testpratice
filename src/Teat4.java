import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teat4 {
    public static void main(String[] args) {
        /*[0, 1, 4, 5, 6, 7]
        4*/
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int num = Integer.parseInt(in.nextLine());
        String[] a=s.split("\\[");
        String[] b=a[1].split("\\]");
        String fina=b[0];
        String[] fina2=fina.split(",");
        List<Integer> l1=new ArrayList<Integer>();
        List<Integer> l2=new ArrayList<Integer>();
        for(int i=0;i<fina2.length;i++){
            if(Integer.parseInt(fina2[i])<4){
                l1.add(Integer.parseInt(fina2[i]));
            }else{
                l2.add(Integer.parseInt(fina2[i]));
            }
        }
        if(num==1){
            int put=0;
            if(l1.size()==1){
                put=l1.get(0);
                System.out.println("[["+l1.get(0)+"]]");
            }else if(l2.size()==1){
                System.out.println("[["+l2.get(0)+"]]");
            }else if(l1.size()==3){
                System.out.println("[["+l1.get(0)+"]"+","+"["+l1.get(1)+"]"+","+"["+l1.get(2)+"]]");
            }else if(l2.size()==3){
                System.out.println("[["+l2.get(0)+"]"+","+"["+l2.get(1)+"]"+","+"["+l2.get(2)+"]]");
            }else if(l1.size()==2){
                System.out.println("[["+l2.get(0)+"]"+","+"["+l2.get(1)+"]"+","+"["+l2.get(2)+"]]");
            }else if(l2.size()==2){
                System.out.println("[["+l2.get(0)+"]"+","+"["+l2.get(1)+"]"+","+"["+l2.get(2)+"]]");
            }else if(l1.size()==4){
                System.out.println("[["+l2.get(0)+"]"+","+"["+l2.get(1)+"]"+","+"["+l2.get(2)+"]]");
            }else if(l2.size()==4){
                System.out.println("[["+l2.get(0)+"]"+","+"["+l2.get(1)+"]"+","+"["+l2.get(2)+"]]");
            }
        }else if(num==2){

        }else if(num==4){

        }else if(num==8){

        }

    }
}
