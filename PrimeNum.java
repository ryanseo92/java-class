
public class PrimeNum {

	public static void main(String[] args) {
		int value = 8;
		int divisor = 2;
		boolean isPrimeNum = true;
		
		
		for (int i = 0; i < value-2; i++)
			
		{
			if ( 0 == value%divisor) // value가 divisor로 나눠떨어지면 소수가 아님.
			{
				System.out.println(value + "은/는 소수가 아님.");
				isPrimeNum = false;
				break;//나눠떨어지면 소수가 아님을 알았으므로 조건문을 빠져나옴.
			}
			
			 divisor++; //divisor로 value가 나눠질 때까지 올라서 같아지면 value는 소수임.
		} //for문의 끝
		
		 if (isPrimeNum == true)// divisor의 rsp가 무너짐.
			 {
				 System.out.println(value + "은/는 소수임."); 
			 }
		 else
			     System.out.println("합성수");

	}

}
