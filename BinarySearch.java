public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,5,7,11,4,5,87,90};
        BinarySearch(arr,87);
        
    }
    static void BinarySearch(int arr[],int target){
        int ans =-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2; //formula hai
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        if (ans==-1) {
            System.out.println("element not found");
            
        }
        else{
            System.out.println("found element"+target+"at index:"+ans);
        }
        
    }
}
