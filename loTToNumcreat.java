package referenceex;

public class referenceexam1 {

	public static void main(String[] args) {
		
		//로또번호를 생성하는 프로그램을 작성하시오.
		//1. 1-45의 숫자가 랜덤하게 발생하게 작성
    //2. 생성된 숫자를 6번 반복해서 배열에 저장
	  //3. 숫자가 중복될 경우 다시 발생 후 저장
			
		int [] ar = new int [6];
		  		
		  for (int i = 0; i < 6; i++)
		  {
			  int rdm = (int)(Math.random()*45)+1;
			  ar[i] = rdm;
			                          
			  for(int j = 0; j < i; j++) //중복될 경우 i = i-1을 해서 다시 뽑기
			  {                          //같으면 i 증가하면서 저장     
				  if (rdm == ar[j])
				  {
					  i = i - 1;
					  break;
				  }
			  }
		  }
		  //생성된 로또번호를 크기순으로 표시
		  //해당번호가 비교하는번호보다 작다면 유지
		  //해당번호가 비교하는 번호보다 크다면 비교하는 번호와 위치 변경
		  int k;
		  for(int i = 0; i < 6; i++)
		  {
			  for(int j = 0; j < 6; j++)
			  {
				  if(ar[i] < ar[j])
				  {
				    k = ar[j];
				    ar[j] = ar[i];
				    ar[i] = k;
				  }
			  }  			  
		  }
		   //정렬된 배열을 메세지로 출력
		  for(int i = 0; i < 6; i++)
		  {
			  System.out.println(ar[i]);
		  }
		  
		  

	}

}
