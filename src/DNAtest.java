
public class DNAtest{
	public static void main(String[] args) {
		char dnaInfo[][]={{'A','C','G','T','A','G','G','T','C','T'},
							{'C','A','T','G','T','T','G','A','C','A'},
							{'T','T','C','A','G','G','A','C','A','A'}};
		int score=0;
		int i,j=0;
		
			for (i=0; i<3; i++){
				for (j=0; j<10; j++){
				if(dnaInfo[i][j]==args[j].charAt(0)){
					score+=10;
					}
				}
				System.out.println((i+1)+"의 DNA와 "+score+"%만큼 일치합니다.");
				score=0;
		}
	}
}