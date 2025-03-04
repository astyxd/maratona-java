package academy.devdojo.maratonajava.introducao;

/*
    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereco <endereco>,
    confirmo que recebi o salario de <salario>, na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Naruto";
        String endereco = "Rua Ambrosina 52";
        double salario = 3500.00D;
        String dataRecebimentoSalario = "30/02/2012";
        String relatorio = "Eu " + nome + ", morando no endereco " + endereco + ", " +
                "confirmo que recebi o salario de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
