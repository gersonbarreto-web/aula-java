import javax.naming.directory.AttributeInUseException;

public class Ex2 {
    public static void main(String[] args) {
        int[] numeros ={10,20,30};
      
        try{
            System.out.println(numeros[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: indice fora do limite");
        }
        finally{
            System.err.println("fim do programa");
        }
    }
}
