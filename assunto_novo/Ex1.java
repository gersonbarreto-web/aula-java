public class Ex1 {
    public static void main(String[] args) {
        
        int a=10;
        int b=0;

        try{
            int resultado=a/b;
            System.out.println("resultado"+resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro Nao e possivel dividir por zero");

        }
        finally{
            System.out.println("Tchau");
        }
    }
}
