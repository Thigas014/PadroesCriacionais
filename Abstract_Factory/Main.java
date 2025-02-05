package Abstract_Factory;
//exemplo de interface gráfica de botões e caixas de texto, onde podemos gerar uma interface
// para Windows ou macOS, dependendo da fábrica utilizada.
public class Main {
    public static void main(String[] args) {
        // Escolhendo a fábrica dinamicamente
        UIFactory fabrica;
        
        String sistemaOperacional = "macOS"; // Simulação de escolha

        if (sistemaOperacional.equalsIgnoreCase("Windows")) {
            fabrica = new WindowsFactory();
        } else {
            fabrica = new MacOSFactory();
        }

        // Criando os componentes da UI
        Botao botao = fabrica.criarBotao();
        CaixaTexto caixaTexto = fabrica.criarCaixaTexto();

        // Renderizando os componentes
        botao.renderizar();
        caixaTexto.exibir();
    }
}

