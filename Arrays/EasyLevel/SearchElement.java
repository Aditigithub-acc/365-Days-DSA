package EasyLevel;

public class SearchElement {
    public static void main(String[] args){
        int[] arr={1,2,4,17,6};
        int key=17;
        boolean found=false;
        for(int i=0; i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element found at index: "+arr[i]);
                found = true;
                break;
            }  
            }
             if(!found){
                System.out.println("Element not found!");

            }
        }
    }
