public class TiaoTaiJie {
    public int jumpFloor(int target) {
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }
        return jumpFloor(target-1)+jumpFloor(target-2);
    }
}
