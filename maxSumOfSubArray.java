public class maxSumOfSubArray {
    public static void SumOfSubArray(int arr[])
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++)
            {
                int end =j;
                currentSum=0;

                for(int k=start;k<=end;k++)

                {

                    currentSum+=arr[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }

        }
        System.out.println("Max sum"+maxSum);


    }
    public static void main(String[] args)
    {
        int arr[]={4,65,55,6,65,56,2,4};
        int arr2[]={2,-2,8,-2,-8,5,8};
        SumOfSubArray(arr);
        SumOfSubArray(arr2);
    }
}

