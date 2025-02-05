package Abstract_Factory;
// Implementação do Botão para Windows
class BotaoWindows implements Botao {
    @Override
    public void renderizar() {
        System.out.println(" Renderizando Botão estilo Windows");
    }
}

// Implementação do Botão para macOS
class BotaoMacOS implements Botao {
    @Override
    public void renderizar() {
        System.out.println(" Renderizando Botão estilo macOS");
    }
}

// Implementação da Caixa de Texto para Windows
class CaixaTextoWindows implements CaixaTexto {
    @Override
    public void exibir() {
        System.out.println(" Exibindo Caixa de Texto estilo Windows");
    }
}

// Implementação da Caixa de Texto para macOS
class CaixaTextoMacOS implements CaixaTexto {
    @Override
    public void exibir() {
        System.out.println(" Exibindo Caixa de Texto estilo macOS");
    }
}
