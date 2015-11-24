// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import java.util.Map;
import java.util.LinkedHashMap;

final class LeadSubmissionTask$1 extends LinkedHashMap
{
    LeadSubmissionTask$1(final int n, final float n2, final boolean b) {
        super(n, n2, b);
    }
    
    public boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > 4;
    }
}
