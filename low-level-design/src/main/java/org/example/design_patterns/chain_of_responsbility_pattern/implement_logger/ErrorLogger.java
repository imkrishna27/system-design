package org.example.design_patterns.chain_of_responsbility_pattern.implement_logger;

public class ErrorLogger extends AuthLogger{
    public ErrorLogger(AuthLogger authLogger) {
        super(authLogger);
    }

    public void log(int logLevel,String message) {
        if(logLevel==AuthLogger.ERROR) {
            System.out.println("We are printing some error: "+  message);
        } else {
            super.log(logLevel,message);
        }
    }
}
