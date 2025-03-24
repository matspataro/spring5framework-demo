package com.smallspringproject.spring5framework.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender implements MailSender{

    private static final Logger logger = LoggerFactory.getLogger(MockMailSender.class);


    @Override
    public void send(String to, String subject, String body) {
        logger.info("Sending SMTP mail to {}", to);
        logger.info("with subject {}", subject);
        logger.info("and body {}", body);
    }
}
