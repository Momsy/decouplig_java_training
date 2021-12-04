package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {


    private final Logger logger = LoggerFactory.getLogger("player");
    private final Scanner scanner = new Scanner((System.in));  //TODO add variable type


    @Override
    public long askNextGuess() {
        System.out.println("Write a number please");
        long useranswer = scanner.nextLong();
        logger.log("Processing..." + useranswer);
        System.out.println("Checking");
        return useranswer;

    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("bignbre");
            System.out.println("the number is to high");
        } else {
            logger.log("smallnbre");
            System.out.println("the number is to small");
        }
    }
}
