public class Iphone implements Aparelho_Telefonico, Reprodutor_Musical, Navegador_Internet {
    public static void main(String[] args) throws Exception {
    Iphone user_iphone = new Iphone();
    user_iphone.ligar("123456789");
    user_iphone.atender();
    user_iphone.iniciarCorreioVoz("");

    user_iphone.tocar_musica();
    user_iphone.pausar_musica();
    user_iphone.selecionar_Musica("Blinding Lights");

    user_iphone.exibirPagina("www.google.com");
    user_iphone.adicionarNovaAba();
    user_iphone.atualizarPagina();
    
        

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz(String musica) {
        System.out.println("Iniciando correio de voz com a música " + musica);
    }

    @Override
    public void tocar_musica() {
        System.out.println("Tocando música");
    }
    
    @Override  
    public void pausar_musica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionar_Musica(String musica) {
        System.out.println("Selecionando música " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
