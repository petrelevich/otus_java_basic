package ru.otus.heaviest.ext;

public class MailSenderStub implements MailSender {

    @Override
    public void sendMessage(MailMessage message){
        System.out.printf("%nПосылаем письмо: %n%s%n%n", message);
    }
}
