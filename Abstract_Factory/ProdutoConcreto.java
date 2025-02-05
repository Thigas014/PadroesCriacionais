package Abstract_Factory;

// Fábrica concreta para Windows
class WindowsFactory implements UIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoWindows();
    }
}

// Fábrica concreta para macOS
class MacOSFactory implements UIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoMacOS();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoMacOS();
    }
}
