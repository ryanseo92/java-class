package classcreate;

public class Lotto {
     //�ζ� ���α׷��� ���� Ŭ������ �ۼ�
	 //������ �����
	
	 //��ȣ�� 6���� �ʿ�
	 //�� 6���� ��ȣ�� ����
	 //�ߺ��� ���� �����ϰ� �ٽ� ������ 6���� ����
	 //1.�߻�ȭ
	 int [] lot = new int[6];  
	 
	
	 //3.������  **�����ڸ� ���������� �⺻������ default ���� ������.
	 Lotto()
	 {
		//�߰����� �ڵ�� ���⿡ �ۼ�.
		 
	 }
	
	 //4.�޼ҵ��߰�
	 /*
	 void genNum()
	 {
		 int pos = 0;
		 int genRandom;
		 boolean isExist = false;
		 while(pos < lot.length)
		 {
			 genRandom = (int)(Math.random()*45)+1; //��ȣ����
			 
			 for(int i = 0; i < lot.length;i++)
			 {
				 //��ȣ�� �ִ���
				 if (genRandom == lot[i])
				 {
					 isExist = true; //�����Ѵٸ� �ٽ�
					 break;
				 }
				 else
				 {}
			 }
			 
			 if (false == isExist) //�������� �ʴ´ٸ� ����
			 {                    //��ȣ�ڸ� 1�� ����
				 lot[pos] = genRandom;
				 pos = pos + 1;
			 }
			 else
			 {
				 isExist = false; //�ߺ��Ǽ� ���Դٸ� �ٽ� false�� �ʱ�ȭ
			 }
		 }
	 }
	 */
	 //�ζǹ�ȣ�� �����ϴ� �޼ҵ�.
	 boolean genLottoNumber()
	 {
		 int pos = 0;
		 int genRandom;
		 boolean isExist = false;
		 
		 while(pos < lot.length)
		 {
			 genRandom = (int)(Math.random()*45)+1; //��ȣ����
			 
			 for(int i = 0; i < lot.length;i++)
			 {
				 //��ȣ�� �ִ���
				 if (genRandom == lot[i])
				 {
					 isExist = true; //�����Ѵٸ� �ٽ�
					 break;
				 }
				 else
				 {}
			 }
			 
			 if (false == isExist) //�������� �ʴ´ٸ� ����
			 {                    //��ȣ�ڸ� 1�� ����
				 lot[pos] = genRandom;
				 pos = pos + 1;
			 }
			 else
			 {
				 isExist = false; //�ߺ��Ǽ� ���Դٸ� �ٽ� false�� �ʱ�ȭ
			 } 	  
		 
		 }	
		 return true; //�߰��� return false�� ������ ������ ����
		              //�׷����� �ұ��ϰ� return true��� ����Ѱ�
		              //1. ���� �Լ��� ���� ���� ������ �����µ�
		              //�׽�Ʈ�� �� �� ������ ����ٸ�, ������ �� �ִ� ����� �����ϱ� ����.
	 }                //Ʈ�縸 �����ϴ��� void�� �������� boolean�� ���°��� �ǽ������� �ض�
	 
	 //�ζǹ�ȣ�� �������� �޼ҵ�.
	 void getNumber(int [] target)
	 {
		 for(int i = 0; i < lot.length; i++)
		 {
			 target[i] = this.lot[i];
		 }
		 
	 }
	 
	 
	
	
	
}
