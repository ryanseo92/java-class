package classcreate;

public class classcreat {

	public static void main(String[] args) {
		int [] arLotto = new int [6]; 
		//2.필드추가
		Lotto lo = new Lotto();
		
		//lo.genNum(); //6개의 랜덤번호를 만든다.
		lo.genLottoNumber();
		
		
		boolean result = lo.genLottoNumber(); 
		 
		 if(result == false)
		 {
			 System.out.println("로또번호 생성시 문제가 발생");
		 }
		 else
		 {
			 System.out.println("로또번호 생성 성공");
		 
		 
			 lo.getNumber(arLotto);
		 
			 for(int i = 0; i<arLotto.length;i++)
			 {
				 System.out.println(arLotto[i]);
			 }
         
		 }
		
		
	//	lo.getNum(lot); //생성된 랜덤번호를 가져온다.
		
		

	}

}
