public class BinarysearchDesc {
    public static void main(String[] args) {
        int arr[]={90,87,54,36,22,1};
        BinarysearchDesc(arr,54);
        
    }
     static void BinarysearchDesc(int arr[],int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<target) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

            
        }
        if(ans==-1){
            System.out.println("elemnt not found");
        }
        else{
            System.out.println("found element"+target+"at index:"+ans);
        }

     }
    
}
