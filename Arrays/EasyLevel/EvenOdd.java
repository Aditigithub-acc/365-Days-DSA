package EasyLevel;
public class EvenOdd{
    public static void main(String[] args){
        int[] arr={1,2,3,5,4,16,21};
        int Even=0;
        int Odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                Even++;
            }
            else{
                Odd++;
            }
        }
        System.out.println("Total no of Even numbers in array are: "+ Even);
        System.out.println("Total number of Odd numbers in array are: "+Odd);
    }
}