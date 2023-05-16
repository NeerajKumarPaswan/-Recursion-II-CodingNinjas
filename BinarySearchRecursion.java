package advance_recursion;

public class BinarySearchRecursion {

	public static int binarySearch(int arr[],int si,int ei,int key) {
		if(si>ei) {
			return -1;
		}
		int mid=(si+ei)/2;
		if(arr[mid]==key) {
			return mid;
		}
		else
		if(arr[mid]<key) {
			return binarySearch(arr, mid+1, ei, key);
		}else {
			return binarySearch(arr, si, mid-1, key);
		}
	}
       public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};//Always in sorted order
	System.out.println(binarySearch(arr, 0, arr.length-1, 4));
}	
}
