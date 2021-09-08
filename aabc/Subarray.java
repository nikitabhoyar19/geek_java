public class Subarray {
    public static void main(String arg[]) {
        String s="abc";
        ArrayList<String> ans = getSub(s,0);
        for(int i=0;i<arr.size();i++) {
            System.out.println(ans.get(i));
        }
    }

    public static ArrayList<String> getSub(String s, int index) {
        if(s.length==index) {
            ArrayList<String> toReturn = new ArrayList<>();
            toReturn.add("");
            return toReturn;
        }

        ArrayList<String> returnedSS = getSub(s, index+1);
        ArrayList<String> ansSS = new ArrayList<>();

        char myself=s.charAt(index);

        for(int i=0; i<returnedSS.size();i++) {
            ansSS.add(returnedSS.get(i));
            ansSS.add(myself+returnedSS.get(i));
        }

        return ansSS;
    }
}