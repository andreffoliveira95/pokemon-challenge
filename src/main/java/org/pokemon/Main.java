package org.pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter your input: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = reader.readLine();

            Pattern pattern = Pattern.compile("[^nNeEsSoO]");
            Matcher matcher = pattern.matcher(input);

            while(matcher.find()){
                System.out.println("Only N, S, E and O characters are allowed!!\n");
                System.out.print("Please enter your input again: ");
                input = reader.readLine();
                pattern = Pattern.compile("[^nNeEsSoO]");
                matcher = pattern.matcher(input);
            }

            Game game = new Game(input);
            game.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
