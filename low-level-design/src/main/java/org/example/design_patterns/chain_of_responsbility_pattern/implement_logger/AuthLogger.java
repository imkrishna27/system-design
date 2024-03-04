package org.example.design_patterns.chain_of_responsbility_pattern.implement_logger;

public abstract class AuthLogger {

    public static  int INFO=1;
    public static  int DEBUG=2;
    public static  int ERROR=3;

    AuthLogger nextAuthLogger;
    AuthLogger(AuthLogger authLogger){
        this.nextAuthLogger = authLogger;
    }

    public void log(int logLevel,String logMessage) {
        if(this.nextAuthLogger!=null) {
            this.nextAuthLogger.log(logLevel,logMessage);
        } else {
            System.out.println("We can't log the request");
        }
    }
}
