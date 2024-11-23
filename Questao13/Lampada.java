public class Lampada {
    private String marca;
    private int potencia;
    private String tipo;
    private float preco;
    private String cor;
    private int estoque;

    public Lampada(String marca, int potencia, String tipo, float preco, String cor, int estoque) {
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.preco = preco;
        this.cor = cor;
        this.estoque = estoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Cor: " + cor);
        System.out.println("Estoque: " + estoque);
    }
}
