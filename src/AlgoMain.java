
public class AlgoMain {

	public static void main(String[] args) {
		
		AlgoMain algo = new AlgoMain();
		
		long evenResult = algo.even(100L);
		long oddResult = algo.odd(4L);
		System.out.println(evenResult);
		System.out.println(oddResult);
		
		
	}
	
	public long even(long max){
		
		long num = max/2; //max�� ¦���̵� Ȧ���̵� max�� ������ max/2�� ���� ���� ����
		
		long total = num*(num+1);
		
		return total;

	}
	
	public long odd(long max){
		
		long num = (max+1)/2; //max�� ¦���̵� Ȧ���̵� max�� ������ (max+1)/2�� ���� ���� ����
		
		long total = num*num;
		
		return total;
	}

}
