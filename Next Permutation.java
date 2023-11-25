import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> ar) 
	{
		// Write your code here.
		int hello = -1;
		for(int i=ar.size()-2;i>=0;i--){
			if(ar.get(i+1)>ar.get(i)){
				hello=i;
				break;
			}
		}
		if(hello==-1){
			ar.sort(Comparator.naturalOrder());
			return ar;
		}
		for(int i=ar.size()-1;i>=0;i--){
			if(ar.get(hello)<ar.get(i)){
				Collections.swap(ar, hello, i);
				break;
			}
		}
		int i=hello+1;
		int j = ar.size()-1;
        while(i<j){
			Collections.swap(ar, i, j);
			i++;
			j--;
		}
		return ar;
	}
}
