public class binary_search {
    public static int binarySearch(int arr[],int key)
    {
        int start=0 ,end=arr.length-1;
        while (start<=end)
        {
            int mid =(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,23,55,78,99};
        int key=23;
        System.out.println("index for key is: "+binarySearch(arr,key));

    }
}
