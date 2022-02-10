import java.util.HashMap;

public class Main {
    public static void subarrays(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum-k==0){
                System.out.println(0+" "+i);
            }
            if(map.containsKey(sum-k)){
                System.out.println(map.get(sum-k)+1+"  "+i);
            }
            map.put(sum, i);
        }
    }
 public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7};
     int k=10;
    subarrays(arr, k);
 }   
}
