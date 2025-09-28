public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2020);
        Carro carro = new Carro("Honda", "Civic", 2022, 4);

        veiculo.exibirDetalhes();
        carro.exibirDetalhes();
    }
}
