package ann;

public class assigment {
	public static void main(String[]args){
		int[] a={1,3,5};
		int[] b={2,4};
		int[] r=new int[a.length+b.length];
		int aindex;
		int bindex;
		int rindex;
		aindex=0;
		bindex=0;
		rindex=0;
		while(aindex<a.length && bindex<b.length){
			if(a[aindex]<=b[bindex]){
				r[rindex]=a[aindex];
				aindex ++;
			}else{
				r[rindex]=b[bindex];
				bindex ++;
			}
			rindex ++;
		}
		if(aindex<a.length){
			r[rindex]=a[aindex];
		}else{
			r[rindex]=b[bindex];
		}
		int i;
		for(i=0;i<a.length+b.length;i++){
		System.out.println(r[i]);
		}
		
		
		
		
	}

}
