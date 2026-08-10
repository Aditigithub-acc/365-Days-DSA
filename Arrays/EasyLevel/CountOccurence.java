package EasyLevel;
public class CountOccurence{
    public static void main(String[] args){
        int[] arr={1,2,3,4,2,5,4,2};
        int Key = 2;
        int Count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == Key){
                Count++;
            }
        }
        System.out.println("Total number of occurrence of 2 is: "+ Count);
    }
}