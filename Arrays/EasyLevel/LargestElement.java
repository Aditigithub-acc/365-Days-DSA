package EasyLevel;
public class LargestElement{
    public static void main(String[] args){
        int[] arr={1,5,9,4, 120};
        int i=arr[0];
        for(int j=1;j<arr.length;j++){
            if (i<arr[j]){
                i=arr[j];
            }
        }
        System.out.println("The Largest Element is: " + i);
        
    }
}