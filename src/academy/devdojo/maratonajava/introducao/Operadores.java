package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        @@ -24,5 +24,15 @@ public static void main(String[] args) {
            System.out.println("isDezIgualVinte "+isDezIgualVinte);
            System.out.println("isDezIgualDez "+isDezIgualDez);
            System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

            // && (AND) || (or) !
            int idade = 29;
            float salario = 3500F;
            boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
            boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

            System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
            System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
    }
}
