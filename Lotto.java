package classcreate;

public class Lotto {
     //로또 프로그램을 만들 클래스를 작성
	 //껍데기 만들기
	
	 //번호가 6개가 필요
	 //그 6개의 번호가 랜덤
	 //중복된 수는 제외하고 다시 돌려서 6개를 추출
	 //1.추상화
	 int [] lot = new int[6];  
	 
	
	 //3.생성자  **생성자를 설정했을때 기본적으로 default 값을 가진다.
	 Lotto()
	 {
		//추가적인 코드는 여기에 작성.
		 
	 }
	
	 //4.메소드추가
	 /*
	 void genNum()
	 {
		 int pos = 0;
		 int genRandom;
		 boolean isExist = false;
		 while(pos < lot.length)
		 {
			 genRandom = (int)(Math.random()*45)+1; //번호생성
			 
			 for(int i = 0; i < lot.length;i++)
			 {
				 //번호가 있는지
				 if (genRandom == lot[i])
				 {
					 isExist = true; //존재한다면 다시
					 break;
				 }
				 else
				 {}
			 }
			 
			 if (false == isExist) //존재하지 않는다면 저장
			 {                    //번호자리 1개 증가
				 lot[pos] = genRandom;
				 pos = pos + 1;
			 }
			 else
			 {
				 isExist = false; //중복되서 나왔다면 다시 false로 초기화
			 }
		 }
	 }
	 */
	 //로또번호를 생성하는 메소드.
	 boolean genLottoNumber()
	 {
		 int pos = 0;
		 int genRandom;
		 boolean isExist = false;
		 
		 while(pos < lot.length)
		 {
			 genRandom = (int)(Math.random()*45)+1; //번호생성
			 
			 for(int i = 0; i < lot.length;i++)
			 {
				 //번호가 있는지
				 if (genRandom == lot[i])
				 {
					 isExist = true; //존재한다면 다시
					 break;
				 }
				 else
				 {}
			 }
			 
			 if (false == isExist) //존재하지 않는다면 저장
			 {                    //번호자리 1개 증가
				 lot[pos] = genRandom;
				 pos = pos + 1;
			 }
			 else
			 {
				 isExist = false; //중복되서 나왔다면 다시 false로 초기화
			 } 	  
		 
		 }	
		 return true; //중간에 return false가 없으면 무조건 성공
		              //그럼에도 불구하고 return true라고 명시한건
		              //1. 내가 함수를 돌릴 적에 문제가 없었는데
		              //테스트를 할 때 문제가 생긴다면, 대응할 수 있는 방안을 마련하기 위해.
	 }                //트루만 리턴하더라도 void를 쓰지말고 boolean을 쓰는것을 의식적으로 해라
	 
	 //로또번호를 가져오는 메소드.
	 void getNumber(int [] target)
	 {
		 for(int i = 0; i < lot.length; i++)
		 {
			 target[i] = this.lot[i];
		 }
		 
	 }
	 
	 
	
	
	
}
