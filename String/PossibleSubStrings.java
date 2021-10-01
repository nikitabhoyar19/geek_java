public class PossibleSubStrings {
    public static void main(String[] args) {
        System.out.println(calculateSubString(new String("nikita")));
    }

    public static int calculateSubString(String str) {
          int length = str.length();
          int countResult = 0;
          for(int i=0;i<str.length();i++) {
              if(isVowel(str.charAt(i))) {
                  countResult+= length-i;
              }  
          }

          return countResult;
    }

    public static boolean isVowel(char i) {
        i = Character.toLowerCase(i);
        return (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u');
    }
}

// output :
// 9

/* 
here we have to check possible substring which is started from letter vowel
so if string is nikita to substrings should be 
{ i, ik, iki, ikit, ikita } for i                     
{ i, it, ita } for again i                                    
{ a } for a                             
so count will be 9
so here we calculating by ( length - position where we found i )
*/
