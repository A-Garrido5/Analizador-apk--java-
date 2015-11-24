// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.errorreporter;

import java.util.List;

public class ErrorReporter$ErrorLogException extends RuntimeException
{
    public final a errorLog;
    
    public ErrorReporter$ErrorLogException(final a errorLog) {
        super("An error was logged during a test.", a(errorLog));
        this.errorLog = errorLog;
    }
    
    private static Throwable a(final a a) {
        final List a2 = a.a();
        if (a2.size() == 1) {
            return a2.get(0).b();
        }
        return null;
    }
}
