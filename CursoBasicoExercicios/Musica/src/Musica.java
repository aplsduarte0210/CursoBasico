//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
// e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int numAvaliacoes;
    private double avaliacao;

    //Construtor
    public Musica(String titulo, String artista, int anoLancamento){
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.avaliacao = 0.0;
        this.numAvaliacoes = 0;
    }

    //criação de uma método para exibir a ficha técnica
    public void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numAvaliacoes);
    }

    //criação para avaliar a música
    public void avaliar(double novaAvaliacao){
        if (novaAvaliacao < 0 || novaAvaliacao > 5){
            System.out.println("Avaliação inválida! Deve estar entre 0 e 5");
            return;
        }
     this.avaliacao = ((this.avaliacao * this.numAvaliacoes) + novaAvaliacao) / (this.numAvaliacoes + 1);
     this.numAvaliacoes++;
    }

    //criação de um método para calcular a média de avaliações
    public double calcularMediaAvaliacoes(){
        return this.avaliacao;
    }
}
