// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import java.util.StringTokenizer;
import org.aspectj.lang.reflect.TypePattern;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclarePrecedence;

public class DeclarePrecedenceImpl implements DeclarePrecedence
{
    private AjType<?> declaringType;
    private TypePattern[] precedenceList;
    private String precedenceString;
    
    public DeclarePrecedenceImpl(final String precedenceString, final AjType declaringType) {
        this.declaringType = (AjType<?>)declaringType;
        this.precedenceString = precedenceString;
        String substring = precedenceString;
        if (substring.startsWith("(")) {
            substring = substring.substring(1, -1 + substring.length());
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(substring, ",");
        this.precedenceList = new TypePattern[stringTokenizer.countTokens()];
        for (int i = 0; i < this.precedenceList.length; ++i) {
            this.precedenceList[i] = new TypePatternImpl(stringTokenizer.nextToken().trim());
        }
    }
    
    @Override
    public AjType getDeclaringType() {
        return this.declaringType;
    }
    
    @Override
    public TypePattern[] getPrecedenceOrder() {
        return this.precedenceList;
    }
    
    @Override
    public String toString() {
        return "declare precedence : " + this.precedenceString;
    }
}
