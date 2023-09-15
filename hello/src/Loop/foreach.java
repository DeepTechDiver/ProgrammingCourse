package Loop;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class foreach {
    public static void main(String args[]){
        foreach test = new foreach();
        test.listToArray();
        test.testArray();
        test.test();
        test.test();
    }

    public void listToArray() {
//        创建List并添加元素
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("4");
        System.out.println(list);

//        利用foreach语句输出集合元素
        System.out.println("foreach语句输出");
        for (String x : list){
            System.out.println(x);
        }

        //将ArrayList转换为数组
        Object s[] = list.toArray();
        System.out.println(s.toString());
        for (Object x : s) {
            //逐个输出数组元素的值
            System.out.println(x.toString());
        }
    }
/**

 * foreach输出二维数组测试

 */
        public void testArray() {
            int arr2[][] = {{1, 2}, {4, 3}};
            System.out.println("foreach输出二维数组测试");
            for (int x[] : arr2) {
                for (int e : x) {
                    //逐个输出数组元素的值
                    System.out.println(e);
                }
            }
        }

        public void test() {
            List<String> list = new ArrayList<>();
            list.add("{date: \"2016-05-02\",name: \"王小虎\"}");
            list.add("{date: \"2016-05-04\",name: \"王小虎\"}");
            list.add("{date: \"2016-05-01\",name: \"王小虎\"}");
            Object s[] = list.toArray();
            for (Object x : s) {
                System.out.println(s[0].toString());
            }
        }




}
