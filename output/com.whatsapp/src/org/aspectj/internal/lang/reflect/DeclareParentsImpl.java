// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.TypePattern;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareParents;

public class DeclareParentsImpl implements DeclareParents
{
    private AjType<?> declaringType;
    private String firstMissingTypeName;
    private boolean isExtends;
    private Type[] parents;
    private boolean parentsError;
    private String parentsString;
    private TypePattern targetTypesPattern;
    
    public DeclareParentsImpl(final String s, final String parentsString, final boolean isExtends, final AjType<?> declaringType) {
        this.parentsError = false;
        this.targetTypesPattern = new TypePatternImpl(s);
        this.isExtends = isExtends;
        this.declaringType = declaringType;
        this.parentsString = parentsString;
        try {
            this.parents = StringToType.commaSeparatedListToTypeArray(parentsString, declaringType.getJavaClass());
        }
        catch (ClassNotFoundException ex) {
            this.parentsError = true;
            this.firstMissingTypeName = ex.getMessage();
        }
    }
    
    @Override
    public AjType getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public Type[] getParentTypes() throws ClassNotFoundException {
        if (this.parentsError) {
            throw new ClassNotFoundException(this.firstMissingTypeName);
        }
        return this.parents;
    }
    
    @Override
    public TypePattern getTargetTypesPattern() {
        return this.targetTypesPattern;
    }
    
    @Override
    public boolean isExtends() {
        return this.isExtends;
    }
    
    @Override
    public boolean isImplements() {
        return !this.isExtends;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("declare parents : ");
        sb.append(this.getTargetTypesPattern().asString());
        String s;
        if (this.isExtends()) {
            s = " extends ";
        }
        else {
            s = " implements ";
        }
        sb.append(s);
        sb.append(this.parentsString);
        return sb.toString();
    }
}
