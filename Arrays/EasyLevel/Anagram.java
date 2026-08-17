package EasyLevel;
public class Anagram{
    public static void main(String[] args){
        String s1= "listen";
        String s2="silent";
        
        if(s1.length()!= s2.length()){
            System.out.print("Not Anagram");
            return;
        }
        int[] count= new int[256];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        boolean isAnagram= true;
        for(int i=0; i<256; i++){
            if(count[i]!=0){
                isAnagram= false;
                break;
            }
        }
        if(isAnagram){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not Anagram");
        }
    }
}