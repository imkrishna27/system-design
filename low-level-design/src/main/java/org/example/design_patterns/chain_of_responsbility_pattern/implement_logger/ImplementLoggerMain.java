package org.example.design_patterns.chain_of_responsbility_pattern.implement_logger;

public class ImplementLoggerMain {
    public static void main(String[] args) {
        AuthLogger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        String s ="this is a message";
        logger.log(2,s);
        logger.log(1,s);
        logger.log(3,s);
    }
}
