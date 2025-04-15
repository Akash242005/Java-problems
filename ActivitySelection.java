import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Start array : ");
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
            System.out.println("The element entered is :  "+start[i]+" ");
        }
        System.out.println("Enter the elements of End array : ");
        for(int i=0;i<n;i++){
            end[i] = sc.nextInt();
            System.out.println("The element entered is :  "+end[i]+" ");
        }
        Arrays.sort(end);
        int endPoint = -1;
        for(int i=0;i<n;i++){
            if(start[i]>=endPoint){
                System.out.println("The start is "+start[i]+" and end is "+end[i]);
                endPoint = end[i];
            }
        }
    }
}
