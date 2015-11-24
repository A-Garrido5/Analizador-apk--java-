// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.SourceLocation;

class SourceLocationImpl implements SourceLocation
{
    String fileName;
    int line;
    Class withinType;
    
    SourceLocationImpl(final Class withinType, final String fileName, final int line) {
        this.withinType = withinType;
        this.fileName = fileName;
        this.line = line;
    }
    
    @Override
    public int getColumn() {
        return -1;
    }
    
    @Override
    public String getFileName() {
        return this.fileName;
    }
    
    @Override
    public int getLine() {
        return this.line;
    }
    
    @Override
    public Class getWithinType() {
        return this.withinType;
    }
    
    @Override
    public String toString() {
        return new StringBuffer().append(this.getFileName()).append(":").append(this.getLine()).toString();
    }
}
