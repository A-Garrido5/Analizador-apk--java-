// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.twitter.library.featureswitch.d;

public enum LogCategory
{
    a("DDG_IMPRESSION", 0, "ddg_impression");
    
    private final String mName;
    
    private LogCategory(final String s, final int n, final String mName) {
        this.mName = mName;
    }
    
    public String a() {
        if (d.h("thrift_logging_whitelisted_categories").contains(this.mName)) {
            return this.mName;
        }
        return "test_" + this.mName;
    }
}
