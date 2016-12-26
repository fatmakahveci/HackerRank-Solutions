    static boolean isAnagram(String a, String b) {
        int[] alphabet=new int[26];
        String first=a.toLowerCase();
        String second=b.toLowerCase();
        
        for(int i=0;i<26;i++) {
            alphabet[i]=0;
        }
        for(int i=0;i<first.length();i++) {
            alphabet[first.charAt(i)-'a']++;
        }
        for(int i=0;i<second.length();i++) {
            alphabet[second.charAt(i)-'a']--;
        }
        int sum=0;
        for(int i=0;i<26;i++)
            sum+=Math.abs(alphabet[i]);
        if(sum==0)
            return true;        
        else
            return false;
    }
