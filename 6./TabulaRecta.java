
class C{
    public static void main(String[] args){
        int s=0;
        while(s<26){
            p(s,26);
            p(0,s++);
            p(-1,0);
        }}static void p(int s,int e){
            for(;s<e;s++)
            System.out.write(s<0?10:65+s);
            
        }
    }



        /*	public static char[][] populateArray(){
		char[][] tabulaRecta = new char [26][26];
		int k=0;
		
				
		for (int i=0;i<26;i++) {
			
			k=i;
			
			for (int j=0; j<26;j++) {
					
				tabulaRecta[i][j]= abc[k];
								
				if(k==25) {
					k=0;
				}else {
					k++;
				}	
				
			}
		}
		
		return tabulaRecta;
	} */
    
    
