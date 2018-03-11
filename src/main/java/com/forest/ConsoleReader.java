package com.forest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConsoleReader {

    private static String RESOURCE_PATH = "consoleReader/messages.properties";
    private static String INIT_QUESTION = "initial.question";
    private static String AGREE = "agree.toProceed";
    private static String DECLINE = "decline.toProceed";
    private static String WRONG_NUMBER = "wrong.number";
    private static String NEGATIVE_ANSWER = "answer.ifNo";
    private static String INVALID_ANSWER = "invalid.answer";
    private static String PROCEED_ACTIONS = "proceed.actions";
    private static String ADD_ANIMAL = "adding.animals";
    private static String ADD_PLANT = "adding.plants";
    private static String COLLECT_FLOWERS = "collecting.flowers";
    private static String ADD_CAT = "adding.cat";
    private static String ADD_DOG = "adding.dog";
    private static String ADD_BELLFLOWER = "adding.bellflower";
    private static String ADD_DAISY = "adding.daisy";
    private static String ADD_HEATHER = "adding.heather";
    private static String ADD_PINE = "adding.pine";

    private Properties messages;

    public ConsoleReader(){

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();

        try(InputStream resourceStream = classloader.getResourceAsStream(RESOURCE_PATH)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            System.out.println(e);
        }

        this.messages = properties;
    }

    public boolean startJourney() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(INIT_QUESTION));
        System.out.println(messages.get(AGREE));
        System.out.println(messages.get(DECLINE));

        Integer option = null;

        try {
            option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (option) {
            case 1:
                return true;
            case 2:
                System.out.println(messages.get(NEGATIVE_ANSWER));
                return false;
            default:
                System.out.println(messages.get(INVALID_ANSWER));
                return false;
        }
    }

    public int proceedActions() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(PROCEED_ACTIONS));
        System.out.println(messages.get(ADD_ANIMAL));
        System.out.println(messages.get(ADD_PLANT));
        System.out.println(messages.get(COLLECT_FLOWERS));

        Integer option = null;

        try {
            option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return option;
    }

    public int createAnimal() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(ADD_CAT));
        System.out.println(messages.get(ADD_DOG));

        Integer option = null;

        try {
            option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return option;
    }

    public int createPlant() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(ADD_BELLFLOWER));
        System.out.println(messages.get(ADD_DAISY));
        System.out.println(messages.get(ADD_HEATHER));
        System.out.println(messages.get(ADD_PINE));

        Integer option = null;

        try {
            option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return option;
    }
}
