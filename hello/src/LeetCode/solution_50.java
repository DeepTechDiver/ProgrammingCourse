package LeetCode;

public class solution_50 {
    public static void main(String[] args) {
        int[] gem1 = new int[] {100,0,50,100};
        int[][] operations1 = new int[][] {{0,2},{0,1},{3,0},{3,0}};
        solution_50 result = new solution_50();
        result.giveGem(gem1, operations1);
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
        return mx - mn;
    }
}