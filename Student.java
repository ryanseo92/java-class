package classcreate;

public class Student 
{
		//추상화를 해보는 부분, 중요한게 무엇인지, 핵심되는 것, 잘 안바뀌는 것
		// 이름
		String mName;
		// 학년
	    int mGrade;
	    // 번호
	    int mNumber;
	    
	    //클래스가 인스턴스화 될 때 호출되는 함수.
	    //생성자를 만들때의 기준
	    //1. 디폴트 생성자는 무조건 만들어야 한다.
	    //2. 가장 상식적인 수준의 오버로딩까지는 해준다.
	    //3.
	    Student()
	    {
	    	// 이름
			mName =  "noname";
			// 학년
		    mGrade = 1;
		    // 번호
		    mNumber = 0;
	    }
	    //Function Overloading(펑션오버로딩)
	    //함수의 이름은 같지만 파라메터가 다르게 주어진 함수를 만드는 기법
	    //옛날 코딩기법에서는 펑션오버로딩을 에러로 판단했기 때문에
	    //오늘날의 기술이기 때문에 이름을 붙인 것.
	    //주의사항 : 엔비기어스한 문제가 발생할 수 있음.
	    //파라미터의 데이터타입이 같을때 뭘 호출해야하는지 컴파일러가 헷갈릴 수 있다.
	    //그래서 데이터타입을 다르게 오버로딩해야한다.
	    Student(String name, int grade, int number)
	    {
	    	// 이름
			mName =  name;
			// 학년
		    mGrade = grade;
		    // 번호
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
