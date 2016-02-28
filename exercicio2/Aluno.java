public class Aluno {
    
    String nome, numeroMatricula;
    int idade;
   
    public void imprimirDadosCadastrais(){
           System.out.println("Nome: " + this.nome);
           System.out.println("Nome: " + this.idade);
           System.out.println("Nome: " + this.numeroMatricula);
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
            ob1.nome="Herbert";
            ob1.idade=35;
            ob1.numeroMatricula="123456789";
            ob1.imprimirDadosCadastrais();
        System.out.println("OBEJTO 3: ");
            ob1.nome="Pedrinho";
            ob1.idade=30;
            ob1.numeroMatricula="01020304";
            ob1.imprimirDadosCadastrais();
        System.out.println("OBEJTO 4: ");
            ob1.nome="Obama";
            ob1.idade=50;
            ob1.numeroMatricula="5555555";
            ob1.imprimirDadosCadastrais();
    }
    
}
