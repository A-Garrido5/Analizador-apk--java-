// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.internal;

import org.aspectj.runtime.CFlow;

public class CFlowPlusState extends CFlow
{
    private Object[] state;
    
    public CFlowPlusState(final Object[] state) {
        this.state = state;
    }
    
    public CFlowPlusState(final Object[] state, final Object o) {
        super(o);
        this.state = state;
    }
    
    @Override
    public Object get(final int n) {
        return this.state[n];
    }
}
