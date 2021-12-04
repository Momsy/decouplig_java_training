package fr.lernejo.logger;
import java.util.function.Predicate;

public class LoggerFactory {
    Logger logger = LoggerFactory.getLogger("launcher");

    public static Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
