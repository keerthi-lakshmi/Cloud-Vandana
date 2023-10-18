import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		shuffleArray(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}
	public static int[] shuffleArray(int[] arr) {
		int N=arr.length;
		Random random=new Random();
		for(int i=0;i<N;i++) {
			int j=random.nextInt(N);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}

}
