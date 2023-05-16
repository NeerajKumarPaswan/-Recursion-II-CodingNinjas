package advance_recursion;

public class MergeSort {
	
	public static void mergeSort(int[] input){

		if(input.length<=1) {
			return;
		}
		int b[]=new int[input.length/2];
		int c[]=new int[input.length-b.length];
		
		for(int i=0;i<input.length/2;i++) {
			b[i]=input[i];
		}
		
		for(int i=input.length/2;i<input.length;i++) {
			c[i-input.length/2]=input[i];
		}
		
		mergeSort(b);
		mergeSort(c);
		merge(b,c,input);
		
	}
public static void merge(int[] b, int[] c, int[] d) {
		// TODO Auto-generated method stub
		int i=0;int j=0;int k=0;
		
		while(i<b.length && j< c.length) {
			if(b[i]<=c[j]) {
				d[k]=b[i];
				i++; k++;
			}else {
				d[k]=c[j];
				j++;
				k++;
			}
		}
		
		if(i<b.length) {
			while(i<b.length) {
				d[k]=b[i];
				i++; k++;
			}
		}
		
		if(j<c.length) {
			while(j<c.length) {
				d[k]=c[j];
				k++;j++;
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {6,3,9,5,2,8,9};
	
	mergeSort(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
