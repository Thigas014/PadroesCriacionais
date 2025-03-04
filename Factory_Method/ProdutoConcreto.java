package Factory_Method;

class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println(" Enviando E-mail: " + mensagem);
    }
}

class SMSNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println(" Enviando SMS: " + mensagem);
    }
}

class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println(" Enviando Push Notification: " + mensagem);
    }
}
