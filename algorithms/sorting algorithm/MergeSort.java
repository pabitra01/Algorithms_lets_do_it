/**
 * MergeSort
 */
public class MergeSort {
    static int[] merge(int arr[],int left,int mid,int right){
        int nl=mid-left+1;//length of left subarray
        int nr=right-mid;//length of right subarray
        //creating two temp array of both side
        int[] leftArr=new int[nl];
        int[] rightArr=new int[nr];
        //now adding data to it
        
        for(int i=0;i<leftArr.length;i++){
            leftArr[i]=arr[left+i];
        }
        for(int i=0;i<rightArr.length;i++){
            rightArr[i]=arr[mid+1+i];
        }
        //merging two arrays
        int i=0;
        int j=0;
        int k=left;
        while(i<nl&&j<nr){
            if(leftArr[i]<rightArr[j]){
                arr[k]=leftArr[i];
                i++;
                
            }
            else{
                arr[k]=rightArr[j];
                j++;
                
            }
            k++;

        }
        //adding the rest elements
        while(i<nl){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<nr){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
        return arr;
    }
    static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(arr, left, mid);
            mergesort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+"  ");
        }
        
    }
}