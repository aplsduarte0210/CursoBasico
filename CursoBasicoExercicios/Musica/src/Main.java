
public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Titulo da Musica", "Nome do Artista", 2024);
        musica.exibirFichaTecnica();

        musica.avaliar(4.5);
        musica.avaliar(5.0);
        musica.exibirFichaTecnica();

        double media = musica.calcularMediaAvaliacoes();
        System.out.println("Média de Avaliações: " + media);
    }
}
