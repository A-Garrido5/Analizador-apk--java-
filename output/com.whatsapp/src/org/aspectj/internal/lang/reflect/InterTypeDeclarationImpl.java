// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.InterTypeDeclaration;

public class InterTypeDeclarationImpl implements InterTypeDeclaration
{
    private AjType<?> declaringType;
    private int modifiers;
    private AjType<?> targetType;
    protected String targetTypeName;
    
    public InterTypeDeclarationImpl(final AjType<?> declaringType, final String targetTypeName, final int modifiers) {
        this.declaringType = declaringType;
        this.targetTypeName = targetTypeName;
        this.modifiers = modifiers;
        try {
            this.targetType = (AjType<?>)StringToType.stringToType(targetTypeName, declaringType.getJavaClass());
        }
        catch (ClassNotFoundException ex) {}
    }
    
    public InterTypeDeclarationImpl(final AjType<?> declaringType, final AjType<?> targetType, final int modifiers) {
        this.declaringType = declaringType;
        this.targetType = targetType;
        this.targetTypeName = targetType.getName();
        this.modifiers = modifiers;
    }
    
    @Override
    public AjType<?> getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public int getModifiers() {
        return this.modifiers;
    }
    
    @Override
    public AjType<?> getTargetType() throws ClassNotFoundException {
        if (this.targetType == null) {
            throw new ClassNotFoundException(this.targetTypeName);
        }
        return this.targetType;
    }
}
