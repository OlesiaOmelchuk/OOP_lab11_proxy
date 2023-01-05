package ua.edu.ucu.task_2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailBox mailBox = new MailBox();
        Client me = new Client("Olesia", Gender.FEMALE, 19, "olesyao2003@gmail.com");
        MailInfo info = new MailInfo(me, new GiftMail());
        mailBox.addMailInfo(info);
        mailBox.sendAll();
    }
}