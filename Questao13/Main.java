public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("Philips", 60, "LED", 25.99f, "Branco Quente", 50);
        Lampada lampada2 = new Lampada("Osram", 40, "Fluorescente", 15.50f, "Branco Frio", 30);

        System.out.println("Informações da Lâmpada 1:");
        lampada1.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Lâmpada 2:");
        lampada2.exibirInformacoes();
        System.out.println();
    }
}
