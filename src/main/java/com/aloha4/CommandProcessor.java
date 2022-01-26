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
        Scanner scanner = new Scanner(System.in);
        AppContext context = new AppContext();
        while(true) {
            String inputString = scanner.nextLine();
            commandService.run(inputString, context);
        }
    }
}