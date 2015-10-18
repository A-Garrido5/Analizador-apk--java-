// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Modifier;
import org.aspectj.lang.reflect.AjTypeSystem;
import java.lang.reflect.Field;
import org.aspectj.lang.reflect.AjType;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.InterTypeFieldDeclaration;

public class InterTypeFieldDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeFieldDeclaration
{
    private Type genericType;
    private String name;
    private AjType<?> type;
    
    public InterTypeFieldDeclarationImpl(final AjType<?> ajType, final String s, final int n, final String name, final AjType<?> type, final Type genericType) {
        super(ajType, s, n);
        this.name = name;
        this.type = type;
        this.genericType = genericType;
    }
    
    public InterTypeFieldDeclarationImpl(final AjType<?> ajType, final AjType<?> ajType2, final Field field) {
        super(ajType, ajType2, field.getModifiers());
        this.name = field.getName();
        this.type = AjTypeSystem.getAjType(field.getType());
        final Type genericType = field.getGenericType();
        if (genericType instanceof Class) {
            this.genericType = AjTypeSystem.getAjType((Class<Object>)genericType);
            return;
        }
        this.genericType = genericType;
    }
    
    @Override
    public Type getGenericType() {
        return this.genericType;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public AjType<?> getType() {
        return this.type;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(this.getModifiers()));
        sb.append(" ");
        sb.append(this.getType().toString());
        sb.append(" ");
        sb.append(this.targetTypeName);
        sb.append(".");
        sb.append(this.getName());
        return sb.toString();
    }
}
