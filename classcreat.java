package classcreate;

public class classcreat {

	public static void main(String[] args) {
		int [] arLotto = new int [6]; 
		//2.�ʵ��߰�
		Lotto lo = new Lotto();
		
		//lo.genNum(); //6���� ������ȣ�� �����.
		lo.genLottoNumber();
		
		
		boolean result = lo.genLottoNumber(); 
		 
		 if(result == false)
		 {
			 System.out.println("�ζǹ�ȣ ������ ������ �߻�");
		 }
		 else
		 {
			 System.out.println("�ζǹ�ȣ ���� ����");
		 
		 
			 lo.getNumber(arLotto);
		 
			 for(int i = 0; i<arLotto.length;i++)
			 {
				 System.out.println(arLotto[i]);
			 }
         
		 }
		
		
	//	lo.getNum(lot); //������ ������ȣ�� �����´�.
		
		

	}

}
