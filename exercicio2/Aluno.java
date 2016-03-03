public class Aluno {
    
    String nome, numeroMatricula;
    int idade;
   
    public void imprimirDadosCadastrais(){
           System.out.println("Nome: " + this.nome);
           System.out.println("Idade: " + this.idade);
           System.out.println("Matricula: " + this.numeroMatricula);
    }
         
    public static void main(String[] args) {
        Aluno ob1 = new Aluno();
        Aluno ob2 = new Aluno();
        Aluno ob3 = new Aluno();
        Aluno ob4 = new Aluno();
        System.out.println("OBEJTO 1: ");
            ob1.nome="Rafaela";
            ob1.idade=17;
            ob1.numeroMatricula="201418110230";
            ob1.imprimirDadosCadastrais();

        System.out.println("OBEJTO 2: ");
            ob2.nome="Herbert";
            ob2.idade=35;
            ob2.numeroMatricula="123456789";
            ob2.imprimirDadosCadastrais();
        System.out.println("OBEJTO 3: ");
            ob3.nome="Pedrinho";
            ob3.idade=30;
            ob3.numeroMatricula="01020304";
            ob3.imprimirDadosCadastrais();
        System.out.println("OBEJTO 4: ");
            ob4.nome="Obama";
            ob4.idade=50;
            ob4.numeroMatricula="5555555";
            ob4.imprimirDadosCadastrais();
    }
    
}
