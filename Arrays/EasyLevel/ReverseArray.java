package EasyLevel;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int Left=0;
        int Right=arr.length-1;
        for(int i=0; i<arr.length;i++){
            int temp = arr[Left];
            arr[Left] = arr[Right];
            arr[Right] = temp;
            Left++;
            Right--;
        }
        System.out.println("Reverse of an array is: "+ Right);
    }
}
