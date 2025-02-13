public class DoWhileEFor7 {
    public static void main(String[] args) {
        int soma = 0;
  
        for(int i = 0; i < 101; ++i) {
           if (i % 2 != 0) {
              soma += i;
           }
        }
  
        System.out.println(soma);
     }
}
