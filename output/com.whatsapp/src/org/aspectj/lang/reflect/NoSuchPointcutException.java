// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

public class NoSuchPointcutException extends Exception
{
    private static final long serialVersionUID = 3256444698657634352L;
    private String name;
    
    public NoSuchPointcutException(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
