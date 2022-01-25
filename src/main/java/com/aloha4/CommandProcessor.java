package com.aloha4;

import com.aloha4.service.CommandService;

import java.util.Scanner;

public class CommandProcessor {

    CommandService commandService;

    public static void main(String[] args) {
        System.out.println("Enter command..");
        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.run();
    }

    public void run() {
        commandService = new CommandService();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.next();
            commandService.run(inputString);
        }
    }
}
