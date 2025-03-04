package Factory_Method;

class EmailNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}

class SMSNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new SMSNotificacao();
    }
}

class PushNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}

