import java.util.*;
class Race {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int max = arr[N - 2] + arr[N - 1];
			System.out.println(max);
		}
	}
}
