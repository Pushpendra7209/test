class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'A'){
                a++;
                l = 0;
            }
            else if(i>0 && s.charAt(i) == 'L'){
                l++;
            }
            else if(s.charAt(i) == 'L'){
                l++;
            }
            else {
                l = 0;
            }
            if(a>=2 || l>= 3){
                return false;
            }
        }
        return true;
    }
}
