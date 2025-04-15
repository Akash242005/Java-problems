import java.util.*;
public class LCS {
    public static int check(String one,String two){
        int n = one.length();
        int m = two.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(one.charAt(i-1) == two.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String one = sc.next();
        System.out.print("Enter the String 2 : ");
        String two = sc.next();
        int Max_length = check(one,two);
        System.out.println("The longest Sub sequence is : "+Max_length);
    }
}
