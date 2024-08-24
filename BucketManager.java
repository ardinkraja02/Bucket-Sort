
public class BucketManager {

	BucketList[] a = new BucketList[26];
	
	
	public BucketManager() {
			for (int i = 0; i < a.length; i++) {
				a[i] = new BucketList();
			}
		}
	public void add(String data) {
		int bucketList = (int)data.charAt(0);
		bucketList = bucketList - 65;
		a[bucketList].add(data);
		}
		
	
	public void print() {
		for (int i = 0; i < a.length; i++) {
			a[i].print();
		}
	}
	public void sort() {
		for (int i = 0; i < a.length; i++) {
			a[i].sort();
		}
	}
	
}
