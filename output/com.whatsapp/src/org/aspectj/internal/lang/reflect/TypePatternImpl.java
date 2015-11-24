// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.TypePattern;

public class TypePatternImpl implements TypePattern
{
    private String typePattern;
    
    public TypePatternImpl(final String typePattern) {
        this.typePattern = typePattern;
    }
    
    @Override
    public String asString() {
        return this.typePattern;
    }
    
    @Override
    public String toString() {
        return this.asString();
    }
}
