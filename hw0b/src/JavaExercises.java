import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        return new int[]{1,2,3,4,5,6};
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        ArrayList<String> tgt=new ArrayList<>();
        if(customer.equals("Ergun")){
            tgt.add("beyti");
            tgt.add("pizza");
            tgt.add("hamburger");
            tgt.add("tea");
        } else if (customer.equals("Erik")) {
            tgt.add("sushi");
            tgt.add("pasta");
            tgt.add("avocado");
            tgt.add("coffee");
        }
        else{
            return new String[3];
        }
        return tgt.toArray(new String[0]);
    }
    /*
    * public class EqualsExample {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // 使用 == 比较引用
        System.out.println(str1 == str2);  // 输出 false，因为引用不同

        // 使用 equals() 比较内容
        System.out.println(str1.equals(str2));  // 输出 true，因为内容相同
    }
}*/




    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int max=array[0],min=array[0];
        for(int i:array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        return Math.abs(min-max);
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        list.add(x);
        if(x%2==0){
            return hailstoneHelper(x/2,list);
        } else if (x!=1) {
            return hailstoneHelper(x*3+1,list);
        }
        else{
            return list;
        }
    }

}
