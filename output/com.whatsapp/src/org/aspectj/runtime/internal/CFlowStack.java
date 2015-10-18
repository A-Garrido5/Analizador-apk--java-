// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal;

import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.runtime.CFlow;
import java.util.Stack;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadStack;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;

public class CFlowStack
{
    private static ThreadStackFactory tsFactory;
    private ThreadStack stackProxy;
    
    static {
        selectFactoryForVMVersion();
    }
    
    public CFlowStack() {
        this.stackProxy = CFlowStack.tsFactory.getNewThreadStack();
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
    
    private Stack getThreadStack() {
        return this.stackProxy.getThreadStack();
    }
    
    public static String getThreadStackFactoryClassName() {
        return CFlowStack.tsFactory.getClass().getName();
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
            CFlowStack.tsFactory = getThreadLocalStackFactory();
            return;
        }
        CFlowStack.tsFactory = getThreadLocalStackFactoryFor11();
    }
    
    public Object get(final int n) {
        final CFlow peekCFlow = this.peekCFlow();
        if (peekCFlow == null) {
            return null;
        }
        return peekCFlow.get(n);
    }
    
    public boolean isValid() {
        return !this.getThreadStack().isEmpty();
    }
    
    public Object peek() {
        final Stack threadStack = this.getThreadStack();
        if (threadStack.isEmpty()) {
            throw new NoAspectBoundException();
        }
        return threadStack.peek();
    }
    
    public CFlow peekCFlow() {
        final Stack threadStack = this.getThreadStack();
        if (threadStack.isEmpty()) {
            return null;
        }
        return threadStack.peek();
    }
    
    public Object peekInstance() {
        final CFlow peekCFlow = this.peekCFlow();
        if (peekCFlow != null) {
            return peekCFlow.getAspect();
        }
        throw new NoAspectBoundException();
    }
    
    public CFlow peekTopCFlow() {
        final Stack threadStack = this.getThreadStack();
        if (threadStack.isEmpty()) {
            return null;
        }
        return (CFlow)threadStack.elementAt(0);
    }
    
    public void pop() {
        final Stack threadStack = this.getThreadStack();
        threadStack.pop();
        if (threadStack.isEmpty()) {
            this.stackProxy.removeThreadStack();
        }
    }
    
    public void push(final Object o) {
        this.getThreadStack().push(o);
    }
    
    public void push(final Object[] array) {
        this.getThreadStack().push(new CFlowPlusState(array));
    }
    
    public void pushInstance(final Object o) {
        this.getThreadStack().push(new CFlow(o));
    }
}
