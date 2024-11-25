import java.util.*;
public class Linear_search {
    public static int search(int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
                return i;


        }
        return -1;
    }
    public static void largest(int num[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
         if(num[i]>max)
         {
             max=num[i];
         }
            if(num[i]<min)
            {
                min=num[i];
            }

        }
        System.out.println("largest value is: "+max);
        System.out.println("Smallest value is: "+min);

    }

    public static void main(String[] args)
    {
        int num[]={4,6,12,10,41,75};
        int key=10;
       int index= search(num,key);
       if(index==-1){
           System.out.println("Not found.");
       }
       else
       {
           System.out.println("Key found on index "+index);
       }
       largest(num);

    }
}
