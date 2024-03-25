package edu.tamiris.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Tamiris";
        String segundoNome = "Alves";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Metódo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
