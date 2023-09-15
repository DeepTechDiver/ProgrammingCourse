public class Test3 {
//    public static void main(String[] args){
//        String fruit = "orange";
//        int opt = switch (fruit){
//            case "apple" -> 1;
//            case  "pear" ,"mango" -> 2;
//            default -> {
//                int code = fruit.hashCode();
//                yield code;
//            }
//        };
//        System.out.println("opt =" + opt);
//    }

    public static void main(String[] args){
        int[] ns = {1, 4, 9, 16, 25};
        for (int i=4; i<ns.length; i--){
            System.out.println(ns[i]);
        }
    }
}
