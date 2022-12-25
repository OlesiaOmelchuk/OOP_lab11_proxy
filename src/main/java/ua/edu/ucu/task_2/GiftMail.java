package ua.edu.ucu.task_2;

public class GiftMail implements MailCode{
    private static final String TEMPLATE = "BLACK FRIDAY! %NAME receive your discount right now!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
