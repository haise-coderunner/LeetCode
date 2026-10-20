class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       for (int i =0;i < ransomNote.length();i++){
        char index = ransomNote.charAt(i);
        int gay = magazine.indexOf(index);
        if (gay != -1){
            magazine = magazine.substring(0,gay) + magazine.substring(gay + 1);
        }
        else{
            return false;
        } 
       } 
       return true;
    }
}