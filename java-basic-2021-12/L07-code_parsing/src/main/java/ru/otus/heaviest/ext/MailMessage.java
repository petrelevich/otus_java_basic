package ru.otus.heaviest.ext;

public class MailMessage {
    private final String text;

    public MailMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "MailMessage{" +
                "text='" + text + '\'' +
                '}';
    }
}
