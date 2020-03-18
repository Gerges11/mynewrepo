package ann;

public class Gerges {
	public static void main(String[]args){
		int[] a={1,2,3,4,5,6,7};
		int i;
		int j;
		for(i=0;i<a.length-1;i++){
			for(j=i+1;j<a.length;j++){
				if((a[i]+a[j])==9){
				System.out.println("the two numbers are "+a[i]+' '+a[j]+" at positions"+i+' '+j);
				}
			}
		}
	}
}
