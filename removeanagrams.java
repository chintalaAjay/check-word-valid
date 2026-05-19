class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        String first=words[0];
        list.add(first);
        for(int i=1;i<words.length;i++){
            if(!isAnagram(first,words[i])){
                    list.add(words[i]);
                    first=words[i];
            }
        }
        return list;
        
    }
    public static boolean isAnagram(String x,String y){
        char ch1[]=x.toCharArray();
        char ch2[]=y.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return (new String(ch1)).equals(new String (ch2));
    }
}