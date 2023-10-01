package com.learning;

import com.learning.service.EmailNotfiy;
import com.learning.service.TextNotification;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.runtime.Micronaut;
import jakarta.inject.Inject;

@Controller("/micronaut")
public class Application {

    @Inject
    TextNotification textNotification;

    @Inject
    EmailNotfiy emailNotfiy;

    @Get("/{name}")
    public String sayName(@PathVariable String name) {
        String emailNotify = emailNotfiy.notifyUser();
        String textNotify = textNotification.notifyUser();
        return  "Hello "+ name + emailNotify + textNotify;

    }

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}