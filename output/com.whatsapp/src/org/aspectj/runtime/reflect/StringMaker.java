// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;

class StringMaker
{
    static StringMaker longStringMaker;
    static StringMaker middleStringMaker;
    static StringMaker shortStringMaker;
    int cacheOffset;
    boolean includeArgs;
    boolean includeEnclosingPoint;
    boolean includeJoinPointTypeName;
    boolean includeModifiers;
    boolean includeThrows;
    boolean shortKindName;
    boolean shortPrimaryTypeNames;
    boolean shortTypeNames;
    
    static {
        StringMaker.shortStringMaker = new StringMaker();
        StringMaker.shortStringMaker.shortTypeNames = true;
        StringMaker.shortStringMaker.includeArgs = false;
        StringMaker.shortStringMaker.includeThrows = false;
        StringMaker.shortStringMaker.includeModifiers = false;
        StringMaker.shortStringMaker.shortPrimaryTypeNames = true;
        StringMaker.shortStringMaker.includeJoinPointTypeName = false;
        StringMaker.shortStringMaker.includeEnclosingPoint = false;
        StringMaker.shortStringMaker.cacheOffset = 0;
        StringMaker.middleStringMaker = new StringMaker();
        StringMaker.middleStringMaker.shortTypeNames = true;
        StringMaker.middleStringMaker.includeArgs = true;
        StringMaker.middleStringMaker.includeThrows = false;
        StringMaker.middleStringMaker.includeModifiers = false;
        StringMaker.middleStringMaker.shortPrimaryTypeNames = false;
        StringMaker.shortStringMaker.cacheOffset = 1;
        StringMaker.longStringMaker = new StringMaker();
        StringMaker.longStringMaker.shortTypeNames = false;
        StringMaker.longStringMaker.includeArgs = true;
        StringMaker.longStringMaker.includeThrows = false;
        StringMaker.longStringMaker.includeModifiers = true;
        StringMaker.longStringMaker.shortPrimaryTypeNames = false;
        StringMaker.longStringMaker.shortKindName = false;
        StringMaker.longStringMaker.cacheOffset = 2;
    }
    
    StringMaker() {
        this.shortTypeNames = true;
        this.includeArgs = true;
        this.includeThrows = false;
        this.includeModifiers = false;
        this.shortPrimaryTypeNames = false;
        this.includeJoinPointTypeName = true;
        this.includeEnclosingPoint = true;
        this.shortKindName = true;
    }
    
    public void addSignature(final StringBuffer sb, final Class[] array) {
        if (array == null) {
            return;
        }
        if (this.includeArgs) {
            sb.append("(");
            this.addTypeNames(sb, array);
            sb.append(")");
            return;
        }
        if (array.length == 0) {
            sb.append("()");
            return;
        }
        sb.append("(..)");
    }
    
    public void addThrows(final StringBuffer sb, final Class[] array) {
        if (!this.includeThrows || array == null || array.length == 0) {
            return;
        }
        sb.append(" throws ");
        this.addTypeNames(sb, array);
    }
    
    public void addTypeNames(final StringBuffer sb, final Class[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.makeTypeName(array[i]));
        }
    }
    
    String makeKindName(final String s) {
        final int lastIndex = s.lastIndexOf(45);
        if (lastIndex == -1) {
            return s;
        }
        return s.substring(lastIndex + 1);
    }
    
    String makeModifiersString(final int n) {
        if (!this.includeModifiers) {
            return "";
        }
        final String string = Modifier.toString(n);
        if (string.length() == 0) {
            return "";
        }
        return new StringBuffer().append(string).append(" ").toString();
    }
    
    public String makePrimaryTypeName(final Class clazz, final String s) {
        return this.makeTypeName(clazz, s, this.shortPrimaryTypeNames);
    }
    
    public String makeTypeName(final Class clazz) {
        return this.makeTypeName(clazz, clazz.getName(), this.shortTypeNames);
    }
    
    String makeTypeName(final Class clazz, final String s, final boolean b) {
        if (clazz == null) {
            return "ANONYMOUS";
        }
        if (clazz.isArray()) {
            final Class componentType = clazz.getComponentType();
            return new StringBuffer().append(this.makeTypeName(componentType, componentType.getName(), b)).append("[]").toString();
        }
        if (b) {
            return this.stripPackageName(s).replace('$', '.');
        }
        return s.replace('$', '.');
    }
    
    String stripPackageName(final String s) {
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex == -1) {
            return s;
        }
        return s.substring(lastIndex + 1);
    }
}
