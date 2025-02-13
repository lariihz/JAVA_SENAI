public class DoWhileEFor28 {
    public static void main(String[] args) {


        int[] vetor = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int num : vetor) soma += num;
        System.out.println("Média: " + (soma / vetor.length));
    }
}
