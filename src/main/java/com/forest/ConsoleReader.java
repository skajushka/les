package com.forest;

import com.forest.tale.StoryTeller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConsoleReader {

    private static String RESOURCE_PATH = "consoleReader/messages.properties";
    private static String INIT_QUESTION = "initial.question";
    private static String FIRST_VAR = "first.variant";
    private static String SECOND_VAR = "second.variant";
    private static String WRONG_NUMBER = "wrong.number";
    private static String NEGATIVE_ANSWER = "answer.ifNo";
    private static String INVALID_ANSWER = "invalid.answer";

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

    public boolean startJourney() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(messages.get(INIT_QUESTION));
        System.out.println(messages.get(FIRST_VAR));
        System.out.println(messages.get(SECOND_VAR));

        Integer option = null;

        try {
            option = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(messages.get(WRONG_NUMBER));
            option = 0;
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
}
