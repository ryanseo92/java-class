
public class PrimeNum {

	public static void main(String[] args) {
		int value = 8;
		int divisor = 2;
		boolean isPrimeNum = true;
		
		
		for (int i = 0; i < value-2; i++)
			
		{
			if ( 0 == value%divisor) // value�� divisor�� ������������ �Ҽ��� �ƴ�.
			{
				System.out.println(value + "��/�� �Ҽ��� �ƴ�.");
				isPrimeNum = false;
				break;//������������ �Ҽ��� �ƴ��� �˾����Ƿ� ���ǹ��� ��������.
			}
			
			 divisor++; //divisor�� value�� ������ ������ �ö� �������� value�� �Ҽ���.
		} //for���� ��
		
		 if (isPrimeNum == true)// divisor�� rsp�� ������.
			 {
				 System.out.println(value + "��/�� �Ҽ���."); 
			 }
		 else
			     System.out.println("�ռ���");

	}

}
