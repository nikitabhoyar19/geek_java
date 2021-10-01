public class FrequenciesOfCharacter {
    public static void main(String[] args) {
        System.out.println();
        calculateFrequencyString("geeksforgeeks");
    }

    public static void calculateFrequencyString(String str) {
        int count[] = new int[26];

        for(int i=0; i<str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        /*  this first for loop store elements like this
        let's take if string is 'g' then (g-a) which mean ( 103 - 97 ) = 6 = 6++ 7

        for(int i=0; i<26;i++) {
            System.out.print(count[i] + " ");
        count // 0 0 0 0 4 1 2 0 0 0 2 0 0 0 1 0 0 1 2 0 0 0 0 0 0 0
        
        index // 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5
        
        alpha //  a b c d e f g h i j k l m n o p q r s t u v w x y z
        }
        */

        for(int i=0; i<26; i++) {
            if(count[i]>0) {
                System.out.println((char)(i + 'a') + " " + count[i]);
            }
        }

        /*  Output: 
        e 4
        f 1
        g 2
        k 2
        o 1
        r 1
        s 2
        */
    }
}
