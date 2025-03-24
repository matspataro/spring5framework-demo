package com.smallspringproject.spring5framework.controllers;

import com.smallspringproject.spring5framework.mail.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final MailSender mailSender;

    //Dependency injection by constructor
    public MailController(MailSender smtpMailSender) {
        this.mailSender = smtpMailSender;
    }

    @RequestMapping("/mail")
    public String mail() {

        mailSender.send("test@example.com", "Hello", "This is a test email");

        return "Mail sent";
    }
}
