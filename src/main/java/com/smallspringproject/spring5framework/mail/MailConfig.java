package com.smallspringproject.spring5framework.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Testing another way of configuring beans
@Configuration
public class MailConfig {

    @Bean
    @Profile("dev")
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    @Bean
    @Profile("prod")
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
}
