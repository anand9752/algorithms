class Solution {
    public int strStr(String haystack, String needle) {
        
        String ns = needle + "$" + haystack;


        int z[] = new int[ns.length()];
        int n= ns.length();

        int l = 0;
        int r=0;

        for(int i = 1 ; i< ns.length();i++){
            if(i<=r){
                z[i] = Math.min(r-i+1, z[i-l]);
            }

            while( z[i] +i < n && ns.charAt(z[i]) == ns.charAt(z[i] + i)){
                z[i]++;
            }

            if(z[i] + i-1 <r){
                l=i;
                r= z[i] + i-1;
            }

             if(z[i]==needle.length())
                return i-needle.length()-1;
        } 
        return -1;
        }
}


    