package com.smallspringproject.spring5framework.mail;

import jakarta.mail.MessagingException;

public interface MailSender {

    public void send(String to, String subject, String body) throws MessagingException;
}
