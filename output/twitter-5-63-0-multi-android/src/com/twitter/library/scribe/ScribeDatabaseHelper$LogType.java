// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

public enum ScribeDatabaseHelper$LogType
{
    a("JSON", 0, "json"), 
    b("THRIFT", 1, "thrift");
    
    private final String mName;
    
    private ScribeDatabaseHelper$LogType(final String s, final int n, final String mName) {
        this.mName = mName;
    }
    
    @Override
    public String toString() {
        return this.mName;
    }
}
