
public class HW2 {
    public static int number(int x) {
        System.out.println();
        return 0;
    }
    public static int countfunc(int num){
        int count = 0;
        for (int i = 0; i < 100; i++){
            if (i % num == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countfunc(5));
    }
}
