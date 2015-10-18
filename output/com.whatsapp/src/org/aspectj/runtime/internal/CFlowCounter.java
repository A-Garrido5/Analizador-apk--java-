// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal;

import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadCounter;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;

public class CFlowCounter
{
    private static ThreadStackFactory tsFactory;
    private ThreadCounter flowHeightHandler;
    
    static {
        selectFactoryForVMVersion();
    }
    
    public CFlowCounter() {
        this.flowHeightHandler = CFlowCounter.tsFactory.getNewThreadCounter();
    }
    
    private static String getSystemPropertyWithoutSecurityException(final String s, final String s2) {
        try {
            return System.getProperty(s, s2);
        }
        catch (SecurityException ex) {
            return s2;
        }
    }
    
    private static ThreadStackFactory getThreadLocalStackFactory() {
        return new ThreadStackFactoryImpl();
    }
    
    private static ThreadStackFactory getThreadLocalStackFactoryFor11() {
        return new ThreadStackFactoryImpl11();
    }
    
    public static String getThreadStackFactoryClassName() {
        return CFlowCounter.tsFactory.getClass().getName();
    }
    
    private static void selectFactoryForVMVersion() {
        final String systemPropertyWithoutSecurityException = getSystemPropertyWithoutSecurityException("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        int n;
        if (systemPropertyWithoutSecurityException.equals("unspecified")) {
            if (System.getProperty("java.class.version", "0.0").compareTo("46.0") >= 0) {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        else if (systemPropertyWithoutSecurityException.equals("yes") || systemPropertyWithoutSecurityException.equals("true")) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            CFlowCounter.tsFactory = getThreadLocalStackFactory();
            return;
        }
        CFlowCounter.tsFactory = getThreadLocalStackFactoryFor11();
    }
    
    public void dec() {
        this.flowHeightHandler.dec();
        if (!this.flowHeightHandler.isNotZero()) {
            this.flowHeightHandler.removeThreadCounter();
        }
    }
    
    public void inc() {
        this.flowHeightHandler.inc();
    }
    
    public boolean isValid() {
        return this.flowHeightHandler.isNotZero();
    }
}
