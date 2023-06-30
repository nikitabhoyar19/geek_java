import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;

      //define size of array
       s = input.nextInt();

     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }

       // declare max and average
      int max=arr[0];
      double sum=arr[0];  

   for(i=1;i<arr.length;i++)
	  { 
         sum=sum+arr[i]; 
         if(arr[i]>max)
            max =arr[i];
	  }
	
    result=max;	
    mark_avg=sum/(arr.length);
    
    System.out.println("maximum marks: " + result);
    System.out.println("Average of marks: " + mark_avg);
 }
}