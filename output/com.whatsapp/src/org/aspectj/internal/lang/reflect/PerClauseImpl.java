// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.PerClause;

public class PerClauseImpl implements PerClause
{
    private final PerClauseKind kind;
    
    protected PerClauseImpl(final PerClauseKind kind) {
        this.kind = kind;
    }
    
    @Override
    public PerClauseKind getKind() {
        return this.kind;
    }
    
    @Override
    public String toString() {
        return "issingleton()";
    }
}
