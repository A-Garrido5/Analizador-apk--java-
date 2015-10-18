// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.util.Map;
import java.util.LinkedHashMap;

class RegexCache$LRUCache$1 extends LinkedHashMap
{
    final /* synthetic */ g this$0;
    
    RegexCache$LRUCache$1(final g this$0, final int n, final float n2, final boolean b) {
        this.this$0 = this$0;
        super(n, n2, b);
    }
    
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > this.this$0.b;
    }
}
