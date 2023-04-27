
public class Main {
		
	public static void main(String args[]){
		
		Escrever t = new Escrever();
		
		String verso1 = "patinhos foram passear";
		String verso2 = "Além das montanhas para brincar";
		String verso3 = "A mamãe gritou: ";
		String verso4 = "Mas só ";
		String verso5 = " patinhos voltaram de lá";
		String verso6 = "Mas nenhum patinho voltou de lá";
		
		final int pat = 5;
		int sob;
		String grasno = "Quá ";
		
		for(int i = pat; i>0; i--){
			t.esc(i+" "+verso1);
			t.esc(verso2);
			t.esc2(verso3);
			for(int j=1; j<=4; j++){
				t.esc2(grasno);
			}
			sob = i-1;
			System.out.println("");
			if (sob==0){
				System.out.println(verso6);
			}
			else{
				System.out.print(verso4);
				System.out.print(sob);
				System.out.println(verso5);
			}
			
		}
		
	}

}
