// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Field;
import org.aspectj.lang.reflect.FieldSignature;

public class FieldSignatureImpl extends MemberSignatureImpl implements FieldSignature
{
    private Field field;
    Class fieldType;
    
    FieldSignatureImpl(final int n, final String s, final Class clazz, final Class fieldType) {
        super(n, s, clazz);
        this.fieldType = fieldType;
    }
    
    FieldSignatureImpl(final String s) {
        super(s);
    }
    
    @Override
    protected String createToString(final StringMaker stringMaker) {
        final StringBuffer sb = new StringBuffer();
        sb.append(stringMaker.makeModifiersString(this.getModifiers()));
        if (stringMaker.includeArgs) {
            sb.append(stringMaker.makeTypeName(this.getFieldType()));
        }
        if (stringMaker.includeArgs) {
            sb.append(" ");
        }
        sb.append(stringMaker.makePrimaryTypeName(this.getDeclaringType(), this.getDeclaringTypeName()));
        sb.append(".");
        sb.append(this.getName());
        return sb.toString();
    }
    
    @Override
    public Field getField() {
        Label_0022: {
            if (this.field != null) {
                break Label_0022;
            }
            try {
                this.field = this.getDeclaringType().getDeclaredField(this.getName());
                return this.field;
            }
            catch (Exception ex) {
                return this.field;
            }
        }
    }
    
    @Override
    public Class getFieldType() {
        if (this.fieldType == null) {
            this.fieldType = this.extractType(3);
        }
        return this.fieldType;
    }
}
