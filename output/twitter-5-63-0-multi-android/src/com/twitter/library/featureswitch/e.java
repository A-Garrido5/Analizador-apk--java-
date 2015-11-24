// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.HashMap;
import com.fasterxml.jackson.core.JsonFactory;

public class e
{
    private static final JsonFactory b;
    public final HashMap a;
    
    static {
        b = new JsonFactory();
    }
    
    public e(final HashMap a) {
        this.a = a;
    }
}
