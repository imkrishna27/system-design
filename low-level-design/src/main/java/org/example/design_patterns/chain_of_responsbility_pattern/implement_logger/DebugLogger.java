package org.example.design_patterns.chain_of_responsbility_pattern.implement_logger;

public class DebugLogger extends AuthLogger {
    public DebugLogger(AuthLogger authLogger) {
        super(authLogger);
    }

    public void log(int logLevel,String message) {
        if(logLevel==AuthLogger.DEBUG) {
            System.out.println("We are debugging something" +
                    "" +
                    ": "+  message);
        } else {
            super.log(logLevel,message);
        }
    }
}
