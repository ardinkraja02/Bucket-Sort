import java.util.ArrayList;
public class BucketList {

	ArrayList<String> a = new ArrayList<String>();
	
	public void add(String data) {
		a.add(data);
	}
	public void sort() {
		mergeSort(a,0,a.size()-1);
	}
	public void mergeSort(ArrayList<String> b,int l, int r) {
		int m = (l+r) / 2;
		if(l<r) {
			mergeSort(b,l,m);
			mergeSort(b,m+1,r);
			merge(b, l, m, r);
		}
	}
	public void merge(ArrayList<String> b, int l, int m, int r) {
		int n = r-l + 1;
		String[] temp = new String[n];
		int p1=l;
		int p2=m+1;
		int k = 0;
		
		while (p1<=m && p2<=r) {
			if(b.get(p2).compareToIgnoreCase(b.get(p1))>0) {
				temp[k]= b.get(p1);
				k++;
				p1++;
				
			}
			else {
				temp[k++] = b.get(p2++);
				
			}
		}
		
		while (p1 <= m) {
			temp[k++] = b.get(p1++);
		
		}
		while (p2 <= r) {
			temp[k++] = b.get(p2++);
		}
		for (int i = 0; i < n; i++) {
			b.set(l+i,temp[i]);
		}
	}
	public void print() {
		for (int i = 0; i < a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
