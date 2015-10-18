// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal;

import org.aspectj.lang.ProceedingJoinPoint;

public abstract class AroundClosure
{
    protected int bitflags;
    protected Object[] preInitializationState;
    protected Object[] state;
    
    public AroundClosure() {
        this.bitflags = 1048576;
    }
    
    public AroundClosure(final Object[] state) {
        this.bitflags = 1048576;
        this.state = state;
    }
    
    public int getFlags() {
        return this.bitflags;
    }
    
    public Object[] getPreInitializationState() {
        return this.preInitializationState;
    }
    
    public Object[] getState() {
        return this.state;
    }
    
    public ProceedingJoinPoint linkClosureAndJoinPoint() {
        final ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)this.state[-1 + this.state.length];
        proceedingJoinPoint.set$AroundClosure(this);
        return proceedingJoinPoint;
    }
    
    public ProceedingJoinPoint linkClosureAndJoinPoint(final int bitflags) {
        final ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)this.state[-1 + this.state.length];
        proceedingJoinPoint.set$AroundClosure(this);
        this.bitflags = bitflags;
        return proceedingJoinPoint;
    }
    
    public abstract Object run(final Object[] p0) throws Throwable;
}
