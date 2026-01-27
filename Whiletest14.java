package whileloops;

public class Whiletest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5) {
		int j=1;
		while(j<=5) {
			System.out.print(i+" ");
			j=j+1;
		}
		i=i+1;
		System.out.println();
		}
		System.out.println("==================");

		i=1;
		while(i<=5) {
		int j=1;
		while(j<=5) {
			System.out.print(j+" ");
			j=j+1;
		}
		i=i+1;
		System.out.println();
		}
	}

}
