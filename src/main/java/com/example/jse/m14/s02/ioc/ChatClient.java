package com.example.jse.m14.s02.ioc;

public class ChatClient {
    private String name;
    private ChatService service;

    public ChatClient(String name) {
        this.name = name;
        this.service = new ChatService(name, this::callback);
    }
    
    public void send(String recipient, String message) {
        System.out.printf("Client %s sends '%s' to %s%n", name, message, recipient);

        service.send(name, recipient, message);
    }

    public void callback(String sender, String message) {
        System.out.printf("Client %s receives '%s' from %s%n", name, message, sender);
    }
}
