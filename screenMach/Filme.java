public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    // Método para exibir a ficha técnica
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    // Método para avaliar o filme
    public void avalia(int nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Método para pegar a média das avaliações
    public double pegaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return (double) somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // Getters para somaDasAvaliacoes e totalDeAvaliacoes
    public int getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
