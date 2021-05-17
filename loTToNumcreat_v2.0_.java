package referenceex;

public class referenceexam1 {

	public static void main(String[] args) {
		
		int lotto_number;
		int [] arlotto = new int [6];
		
		
		boolean isExist = false;
		int pos = 0;
		
		while(pos < arlotto.length)
		{
			lotto_number = (int)(Math.random()*45) + 1;
		
		
				for(int k = 0; k < arlotto.length; k++)
				{	
					if(lotto_number == arlotto[k])
					{
				         isExist = true;
				         break;
					}
				}
		
				if (isExist == false)
				{
					arlotto[pos] = lotto_number;
					pos = pos + 1;
			
				}
				else
				{
					isExist = false;
				}
		
		} 
       for (int i = 0; i < arlotto.length; i++)
      {
         System.out.println(arlotto[i]);
      }
	}

}
