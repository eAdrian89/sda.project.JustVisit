package com.justvisit.justvisit.infrastructure.web.email;

public interface EmailSender {
    void send (String to, String email);
}
