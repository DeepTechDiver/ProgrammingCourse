public class hello {
    public static void main(String[] args){
        System.out.println("hello world");
        // 判断年龄
        int age = 7;
        boolean judgeage = age > 16;
        System.out.println(judgeage ? "yes" : "no");
        //
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t);


        //new int[5]表示创建一个可容纳5个int元素的数组。
        var ns = new int[] {1 , 2 , 3 , 4 , 5};
        //简写成
        //int[] ns = new int[] {1 , 2 , 3 , 4 , 5}
        //int[] ns = {1 , 2 , 3 , 4 , 5}
        ns[0] = 1;
        System.out.println(ns.length);

    }
}