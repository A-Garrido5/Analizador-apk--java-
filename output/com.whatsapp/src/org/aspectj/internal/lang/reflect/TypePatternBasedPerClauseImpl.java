// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.TypePattern;
import org.aspectj.lang.reflect.TypePatternBasedPerClause;

public class TypePatternBasedPerClauseImpl extends PerClauseImpl implements TypePatternBasedPerClause
{
    private TypePattern typePattern;
    
    public TypePatternBasedPerClauseImpl(final PerClauseKind perClauseKind, final String s) {
        super(perClauseKind);
        this.typePattern = new TypePatternImpl(s);
    }
    
    @Override
    public TypePattern getTypePattern() {
        return this.typePattern;
    }
    
    @Override
    public String toString() {
        return "pertypewithin(" + this.typePattern.asString() + ")";
    }
}
