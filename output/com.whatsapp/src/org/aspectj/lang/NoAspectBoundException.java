// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

public class NoAspectBoundException extends RuntimeException
{
    Throwable cause;
    
    public NoAspectBoundException() {
    }
    
    public NoAspectBoundException(String string, final Throwable cause) {
        if (cause != null) {
            string = new StringBuffer().append("Exception while initializing ").append(string).append(": ").append(cause).toString();
        }
        super(string);
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
