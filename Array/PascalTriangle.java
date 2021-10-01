import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generatePascalList(5));
    }

    public static List<List<Integer>> generatePascalList(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> rowList, previousList = null;
        
        for(int i = 0; i < numRows; i++) {
            rowList = new ArrayList<Integer>();
            
            for(int j=0; j<=i; j++) {
                if(j == 0 || j == i) {
                    rowList.add(1);
                } 
                else {
                    rowList.add(previousList.get(j-1) + previousList.get(j));
                }
                
            }
            previousList = rowList;
            result.add(rowList);
        }
        return result;
    }
}
