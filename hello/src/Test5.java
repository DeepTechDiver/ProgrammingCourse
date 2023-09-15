import java.util.Arrays;

//二维数组
public class Test5 {
    public static void main(String[] args){
        int[] [] ns = {
                {1,2,3,4,5},
                {5,6,7},
                {7,8}
        };
        int[] arr0 = ns[0];
        System.out.println(arr0.length);

        //两层嵌套for循环打印一个二维数组
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(",");
            }
        }
        System.out.println();
        //用java标准库的Arrays.deepToString()方法
        System.out.println(Arrays.deepToString(ns));
    }
}
