package ReferenceList;

public class SumOfK {
	public static void main(String[] args) {
		int[] a = {5, 8, 50, 4};
		int k = 50;
		int  sum=0; int min=Integer.MAX_VALUE;
		int n=a.length; int start=0,end;
		    for (end = 0; end < n; end++) {
		    	sum=sum+a[end];
		    	
		    	while(sum>=k) {
		    		if(sum==k) {
		    			min=Math.min(min, end-start+1);
		    		}
		    		sum=sum-a[start];
		    		start++;
		    	}
		    }
		    int ans= (min==Integer.MAX_VALUE)?-1:min;
		    System.out.println(ans);
	}
}
