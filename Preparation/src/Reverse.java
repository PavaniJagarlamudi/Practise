

public class Reverse {
	public int[] teddy(int[] p) {
	int[] q=new int[p.length];
	int j=0;
	for(int i=p.length-1;i>=0;i--)
	
	{
		q[j]=p[i];
		j++;
	}
	return q;
		
	}

	public static void main(String[] args) {
	Reverse s = new Reverse();
	int[] r= {1,2,3};
	int[] rev=s.teddy(r);
	for(int i=0; i<rev.length;i++)
		System.out.println(rev[i]);
	
	
	}

}
