public class LeaderInArray {
    public static void main(String args[]) {
        int arr[]= {11,8,9,0,5,8,3,2,6,3};
        int n = arr.length;
        int currentLeader= arr[n-1];
        // leader code
        for(int i=n-1;i>=0;i--) {
            if(currentLeader<=arr[i]) {
                currentLeader=arr[i];
                // to print all the leaders
                System.out.println(currentLeader);
            }
        }
        // when we want to print a large leader mean to say single leader
       // System.out.println(currentLeader);
    }
}