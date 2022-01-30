public class QuickSort {

    static void quick_sort(int[] arr,int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            quick_sort(arr,l,p-1);
            quick_sort(arr, p+1, h);
        }
    }
    static int partition(int[] arr,int l,int h){
        int i=l;
        int j=h;
        int pivot=arr[l];
        while(i<j){
            while(arr[i]<=pivot&&i<h){
                i++;
            }
            while(arr[j]>pivot&&j>l){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr, l, j);
        return j;
    }
    static void swap(int[] arr,int l,int h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        quick_sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    
}
