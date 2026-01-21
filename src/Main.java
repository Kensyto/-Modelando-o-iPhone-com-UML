import model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIPhone.ligar("11999999999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
