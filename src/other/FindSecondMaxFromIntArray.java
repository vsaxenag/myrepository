package other;

public class FindSecondMaxFromIntArray {

	public static void main(String[] args) {
	int [] intA = {1,2,3,4,5,6};
	
	int fMax=0;
	int sMax =0;
	if(intA.length >=2) {
		
		if(intA[0] > intA[1]) {
			fMax = intA[0];
			sMax = intA[1];
			
		}else if(intA[0] < intA[1]){
			fMax = intA[1];
			sMax = intA[0];
		}else {
			
			fMax=sMax=intA[0];
		}
			
		
		
		for (int i=2; i<intA.length;  i++ ) {
			
			int tmp = intA[i];
			
			if (tmp> fMax) {
				sMax= fMax;
				fMax=tmp;
				
			} else if(tmp < fMax && tmp> sMax) {
				sMax = tmp;
				
			}
			
			
		}
		
		System.out.println(sMax);

	}
	
		
	}
	

}
