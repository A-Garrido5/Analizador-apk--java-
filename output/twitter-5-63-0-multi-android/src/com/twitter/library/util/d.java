// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.library.provider.Tweet;
import android.util.SparseArray;

public class d extends SparseArray
{
    public Boolean a(final int n) {
        return (Boolean)this.get(n);
    }
    
    public Integer b(final int n) {
        return (Integer)this.get(n);
    }
    
    public String c(final int n) {
        return (String)this.get(n);
    }
    
    public Tweet d(final int n) {
        return (Tweet)this.get(n);
    }
}
