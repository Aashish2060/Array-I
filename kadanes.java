import java.util.*;
public class kadanes {
    public static void kadaneSum(int arr[]){
        int maxSUm=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++) {
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSUm=Math.max(currentSum,maxSUm);
        }
        System.out.println("Maximum sum is: "+maxSUm);
    }

    public static void main(String[] args)
    {
        int arr[]={-2,4,5,-4,5,-5,3,5};
        kadaneSum(arr);
    }

}
