import java.util.*;
public class sscode_test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		//첫째 줄, 2부터 10 사이의 원하는 숫자 N의 개수 입력
		System.out.print("수의 개수 입력: ");
		int N = sc.nextInt();		
		N_range(N); //범위가 2부터 10까지일 조건
		
		//둘째 줄, 1부터 100사이 원하는 숫자 N개 입력
		System.out.print("숫자 N개 입력: ");
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		Arr_range(arr, N); //범위가 1부터 100까지일 조건
		
		//셋째 줄, 합이 N-1인 4개의 정수(+,-,*,/)
		System.out.print("+, -, *, /의 개수: ");
		int[] arr_arith = new int[4];
		int[] temp = new int[arr_arith.length];
		for(int i = 0; i<arr_arith.length; i++) {
			arr_arith[i] = sc.nextInt();
		}
		Arith(arr_arith, N); //합이 N-1일 조건
	}
	
	
	public static void N_range(int n) {		
		if(2<= n && n<=10) {
			return;
		}
		else {
			System.out.print("재입력");
		}
	}
	
	
	public static void Arr_range(int[] arrr, int NN) {
		for(int i = 0; i<arrr.length; i++) {
			if(1<=arrr[i] && arrr[i]<=100) {
				return;
			}
			else {
				System.out.print("재입력");
			}
		}
	}
	
	
	public static void Arith(int[] arrr_arith, int NN) {
		if(arrr_arith[0] + arrr_arith[1] + arrr_arith[2] + arrr_arith[3] == NN-1) {
			return;
		}
		else {
			System.out.print("재입력");
		}
	}
	

}
