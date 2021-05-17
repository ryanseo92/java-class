package referenceexam;

public class functionexam {

	public static void main(String[] args) {
		int dan = 2;
		
		for (int i = 0; i < 8; i++)
		{
		    System.out.println(dan + "단 출력합니다.");
			printDan(dan);
			dan++;
			
		}
        
	}

	public static void printDan(int dan)
	{
		//n단을 출력하는 함수
		//int dan = 2 부터 시작하므로 printDan 함수에 그 외 부분을 코딩
		
		int mul = 1;
		
		for(int i = 0; i < 9; i++)
		{
		   System.out.println(dan + " * " + mul + " = " + (dan*mul));
		   mul = mul + 1;
		}
		
		mul = 1;
		
		
		
		
	}
	
	
}
