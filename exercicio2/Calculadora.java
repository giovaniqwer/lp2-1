public class Calculadora {
    int v1,v2;
     public void soma(){
        int soma;
        soma=this.v1+this.v2;
        System.out.println("A soma dos dois números são: "+ soma);
    }
     public void subtracao(){
        int sub;
        sub=this.v1-this.v2;
        System.out.println("A subtracao dos dois números são: "+ sub);
    }
     public void multiplicacao(){
        int mult;
        mult=this.v1*this.v2;
        System.out.println("A multiplicacao dos dois números são: "+ mult);
    }
     public void divisao(){
        int div;
        div=this.v1/this.v2;
        System.out.println("A divisão dos dois números são: "+ div);
    }
    public static void main(String[] args) {
      Calculadora ob1 = new Calculadora();
      Calculadora ob2 = new Calculadora();
      Calculadora ob3 = new Calculadora();
      System.out.println("OBJETO 1");
                ob1.v1=10;
                ob1.v2=5;
                ob1.soma();
                ob1.subtracao();
                ob1.multiplicacao();
                ob1.divisao();
      System.out.println("OBJETO 2");
                ob2.v1=100;
                ob2.v2=2;
                ob2.soma();
                ob2.subtracao();
                ob2.multiplicacao();
                ob2.divisao();
      System.out.println("OBJETO 3");
               ob3.v1=30;
               ob3.v2=15;
               ob3.soma();
               ob3.subtracao();
               ob3.multiplicacao();
               ob3.divisao();
    }
    
}
