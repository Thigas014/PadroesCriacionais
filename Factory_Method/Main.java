package Factory_Method;

public class Main {
    public static void main(String[] args) {
        // Criando a fábrica para notificações por E-mail
        NotificacaoFactory emailFactory = new EmailNotificacaoFactory();
        Notificacao email = emailFactory.criarNotificacao();
        email.enviar("Olá, você tem um novo e-mail!");

        // Criando a fábrica para notificações por SMS
        NotificacaoFactory smsFactory = new SMSNotificacaoFactory();
        Notificacao sms = smsFactory.criarNotificacao();
        sms.enviar("Seu código de verificação é 12345.");

        // Criando a fábrica para notificações Push
        NotificacaoFactory pushFactory = new PushNotificacaoFactory();
        Notificacao push = pushFactory.criarNotificacao();
        push.enviar("Você recebeu uma nova mensagem!");
    }
}
