import java.util.Stack;

public class PaiLieZuHe {

    /*public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        int shu[] = {1,2,3,4};
        f(shu,4,0);
    }

    private static void f(int[] shu, int targ, int cur) {
        // TODO Auto-generated method stub
        if(cur == targ) {
            System.out.println(stack.get(0)+""+stack.get(1)+":"+stack.get(2)+""+stack.get(3));
            return;
        }

        for(int i=0;i<shu.length;i++) {
            stack.add(shu[i]);
            f(shu, targ, cur+1);
            stack.pop();

        }
    }*/
    /*无重复
     public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        int shu[] = {1,2,3,4};
        f(shu,4,0);
    }

    private static void f(int[] shu, int targ, int cur) {
        // TODO Auto-generated method stub
        if(cur == targ) {
            System.out.println(stack);
            return;
        }

        for(int i=0;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f(shu, targ, cur+1);
                stack.pop();
            }

        }
    }

     */



     public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        int shu[] = {1,2,3,4};

        f(shu,3,0,0); // 从这个数组4个数中选择三个
    }


    private static void f(int[] shu, int targ, int has, int cur) {
        if(has == targ) {
            System.out.println(stack);
            return;
        }

        for(int i=cur;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f(shu, targ, has+1, i);
                stack.pop();
            }
        }

    }


}
