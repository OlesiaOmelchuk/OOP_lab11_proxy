package ua.edu.ucu.task_2;

public class BirthdayMail implements MailCode {
    private static final String TEMPLATE = "Happy %AGE-th Birthday %NAME!!!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName())
                .replace("%AGE", Integer.toString(client.getAge()));
    }
}
