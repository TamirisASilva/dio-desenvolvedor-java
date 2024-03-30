public class MaiorIdade {
    public static void main(String[] args) {
        int idade = 3;

    String maiorIdade = idade >= 18 && idade < 25 ? "Você já é Adulto" : idade >= 25 ? "Você já deveria morar sozinho" : "Você é criança ou adolescente";

        System.out.println(maiorIdade);

    }
}
