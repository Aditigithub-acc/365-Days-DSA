package EasyLevel;
public class MoveZeros{
    public static void main(String[] args){
        int[] arr={0,12,0,5,0,7,9,0,3};
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}