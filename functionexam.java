package referenceexam;

public class functionexam {

	public static void main(String[] args) {
		int dan = 2;
		
		for (int i = 0; i < 8; i++)
		{
		    System.out.println(dan + "�� ����մϴ�.");
			printDan(dan);
			dan++;
			
		}
        
	}

	public static void printDan(int dan)
	{
		//n���� ����ϴ� �Լ�
		//int dan = 2 ���� �����ϹǷ� printDan �Լ��� �� �� �κ��� �ڵ�
		
		int mul = 1;
		
		for(int i = 0; i < 9; i++)
		{
		   System.out.println(dan + " * " + mul + " = " + (dan*mul));
		   mul = mul + 1;
		}
		
		mul = 1;
		
		
		
		
	}
	
	
}
