import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
       System.out.println(aVeryBigSum()); 
    }

    public static long aVeryBigSum() {
        // Write your code here
        List<Long> ansList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++) {
            ansList.add(sc.nextLong());
        }
        
        // System.out.println(ansList);
        
        long sum = 0;
        for(int i = 0; i < ansList.size(); i++) {
            sum += ansList.get(i);   
        }
        
       return sum;
        }
    
}