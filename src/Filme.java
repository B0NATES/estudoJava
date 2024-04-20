public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibeFichaTecnica() {
            System.out.println("Nome Do Filme: " + nome);
            System.out.println("Ano de Lançamento: " + anoDeLancamento);
            System.out.println("Incluido no plano: " + incluidoNoPlano);
            System.out.println("Avaliação: " + somaDasAvaliacoes);
            System.out.println("Total de avaliações: " + totalDeAvaliacoes);
            System.out.println("Duração em minutos: " + duracaoEmMinutos);

    }

    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

}
