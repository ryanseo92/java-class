package classcreate;

public class Student 
{
		//�߻�ȭ�� �غ��� �κ�, �߿��Ѱ� ��������, �ٽɵǴ� ��, �� �ȹٲ�� ��
		// �̸�
		String mName;
		// �г�
	    int mGrade;
	    // ��ȣ
	    int mNumber;
	    
	    //Ŭ������ �ν��Ͻ�ȭ �� �� ȣ��Ǵ� �Լ�.
	    //�����ڸ� ���鶧�� ����
	    //1. ����Ʈ �����ڴ� ������ ������ �Ѵ�.
	    //2. ���� ������� ������ �����ε������� ���ش�.
	    //3.
	    Student()
	    {
	    	// �̸�
			mName =  "noname";
			// �г�
		    mGrade = 1;
		    // ��ȣ
		    mNumber = 0;
	    }
	    //Function Overloading(��ǿ����ε�)
	    //�Լ��� �̸��� ������ �Ķ���Ͱ� �ٸ��� �־��� �Լ��� ����� ���
	    //���� �ڵ���������� ��ǿ����ε��� ������ �Ǵ��߱� ������
	    //���ó��� ����̱� ������ �̸��� ���� ��.
	    //���ǻ��� : ������� ������ �߻��� �� ����.
	    //�Ķ������ ������Ÿ���� ������ �� ȣ���ؾ��ϴ��� �����Ϸ��� �򰥸� �� �ִ�.
	    //�׷��� ������Ÿ���� �ٸ��� �����ε��ؾ��Ѵ�.
	    Student(String name, int grade, int number)
	    {
	    	// �̸�
			mName =  name;
			// �г�
		    mGrade = grade;
		    // ��ȣ
		    mNumber = number;
	    }
	
	    void setName(String name)
	    {
	    	this.mName = name;
	    	mName = name;
	    }
	    
	    String getName()
	    {
	    	return mName;
	    }
	    
}
