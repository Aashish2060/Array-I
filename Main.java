import java.util.*;
public class Main {
    public static void update(int marks[]) {
        for(int i = 0; i <marks.length; i++)
        {
           marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int marks[] =new int[3];
        System.out.print("enter marks:");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

      System.out.println("phys= "+marks[0]);
      System.out.println("chem= "+marks[1]);
      System.out.println("maths= "+marks[2]);
      int percentage =(marks[0]+marks[1]+marks[2])/3;
      System.out.println("percentage is "+percentage+"%");

      System.out.println("Length of array is:" + marks.length);
      update(marks);
        for(int i = 0; i <marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}