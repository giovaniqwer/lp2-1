//Rafaela Bárbara Custódio 3º Informática
public class Palindromo {
	public int inic,fim;
	public int achou(String p){
		int qtd = p.length();
		String p1 = "";
		String p2 = "";

		for(int i=0;i<=qtd-5;i++){
			p1=p.substring(i,i+5);
			for(int j=4;j>=0;j--){
				p2+=p1.charAt(j);
			} 
			if(p1.equals(p2)){
				this.inic=i;
				this.fim=i+4;
				return i;
			}
			p2 = "";
		}
		return -1;
		
	}
	public void ondeEsta(){
		System.out.println(this.inic+"-"+ this.fim);
	}
	//Rafaela Bárbara Custódio 3º Informática
     public static void main(String[] args) {
    		String p = args[0];
		Palindromo obj = new Palindromo();
		int aux=obj.achou(p);
		if(aux==-1){
			System.out.println("Palindrome não encontrado");		
		}else{
			System.out.println("O palindrome encontrado foi: " +p.substring(aux,aux+5));
			System.out.println("O palindromo está nas posicoes: ");
			obj.ondeEsta();		
		}
	  	
	}
}
