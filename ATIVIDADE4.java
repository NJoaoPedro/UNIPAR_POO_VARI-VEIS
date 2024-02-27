public class ControleEstoque {
    public static void main(String[] args) {
        
        String nomeAlimento = "Morango";
        String nomeBebida = "Suco de Laranja";
        String nomeHigiene = "Protetor Solar";
        double precoUniAlimento = 4.50;
        double precoUniBebida = 8.20;
        double precoUniHigiene = 10.99;
        int quantAlimento = 10;
        int quantBebida = 20;
        int quantHigiene = 15;
        
        System.out.println("Produto: " + nomeAlimento);
        System.out.println("Preco unitario: " + precoUniAlimento + " por Kg de morango");
        System.out.println("Quantidade no estoque: " + quantAlimento + " Kg de morango");
        System.out.println("Produto: " + nomeBebida);
        System.out.println("Preco unitario: " + precoUniBebida + " cada Garrafa de suco de laranja");
        System.out.println("Quantidade no estoque: " + quantBebida + " Garrafas de suco de laranja");
        System.out.println("Produto: " + nomeHigiene);
        System.out.println("Preco unitario: " + precoUniHigiene + " cada frasco de protetor solar");
        System.out.println("Quantidade no estoque: " + quantHigiene + " frascos de protetor solar");
 

    }
}
