package org.example.design_patterns.behavioual_patterns.chain_of_responsbility_pattern.implement_logger;

public class InfoLogger extends AuthLogger{

    public InfoLogger(AuthLogger authLogger) {
        super(authLogger);
    }
    public void log(int logLevel,String message) {
        if(logLevel==AuthLogger.INFO) {
            System.out.println("We are printing some information: "+  message);
        } else {
            super.log(logLevel,message);
        }
    }
}
