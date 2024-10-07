import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();
		int[] arr = new int[n];
		ArrayList<String> list = new ArrayList<>();

		for(int i=0; i<n; i++) arr[i] = sc.nextInt();

		int j = 0;
		for(int i=0; i<n; i++) {
			stack.push(i+1);
			list.add("+");

			while(!stack.empty() && stack.peek()==arr[j]) {
				stack.pop();
				list.add("-");
				j++;
			}
		}

		if(stack.empty()) {
			for(String str : list) System.out.println(str);
		} else {
			System.out.println("NO");
		}
	}
}