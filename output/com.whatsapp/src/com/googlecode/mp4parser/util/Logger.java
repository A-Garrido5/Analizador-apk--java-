// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

public abstract class Logger
{
    public static Logger getLogger(final Class clazz) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new AndroidLogger(clazz.getSimpleName());
        }
        return new JuliLogger(clazz.getSimpleName());
    }
    
    public abstract void logDebug(final String p0);
    
    public abstract void logError(final String p0);
    
    public abstract void logWarn(final String p0);
}
