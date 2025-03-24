package com.smallspringproject.spring5framework.mail;

public interface MailSender {

    public void send(String to, String subject, String body);
}
