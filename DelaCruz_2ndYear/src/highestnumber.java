public class highestnumber {
    public static void main(String[] args) {

        int [] numberz = {1,2,3,4,5,66,45,51,21,51};
        int currentMax = 0;

        for (int i:numberz) currentMax = (currentMax < i) ? i : currentMax;
        System.out.println(currentMax);
    }

    public static int max(int num1, int num2){
        int result;

        if (num1 > num2) result = num1;
        else result = num2;

        return result;
    }
}
