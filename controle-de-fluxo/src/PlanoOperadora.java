public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";
        // Uma melhor forma de usar o switch case, é quando você precisa criar um
        // programa complementar, como por exemplo ir incrementando como no exemplo
        // abaixo.
        switch (plano) {
            case "T":
                System.out.println("5Gb de Youtube");
            case "M":
                System.out.println("Whats e Instagram Grátis");
            case "B":
                System.out.println("100 Minutos de Ligação");
        }

    }
}
