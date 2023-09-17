package LeetCode;


/**
 * 宝石分配的任务
 */
public class solution_50 {
    public static void main(String[] args) {
        int[] gem1 = new int[] {90,1,50,100};
        int[][] operations1 = new int[][] {{0,2},{0,1},{3,0},{3,0}};
        solution_50 solution_50 = new solution_50();
        int result = solution_50.giveGem(gem1, operations1);
        System.out.println(result);
    }

    public int giveGem(int[] gem, int[][] operations) {
        for(int[] operation : operations){
             int x =  operation[0], y = operation[1];
             int number = gem[x] / 2;
             gem[x] -= number;
             gem[y] += number;
        }
        int mn = gem[0], mx = gem[0];
        for (int number : gem) {
            mn = Math.min(number, mn);
            mx = Math.max(number, mx);
        }
        return (mx - mn);
    }
}