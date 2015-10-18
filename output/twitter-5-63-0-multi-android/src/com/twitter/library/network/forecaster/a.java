// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.library.util.bh;
import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import com.twitter.util.platform.i;
import java.util.Set;

class a
{
    private static final Set a;
    private final boolean b;
    private final i c;
    
    static {
        a = new HashSet(Arrays.asList("AG", "AU", "AT", "AZ", "BS", "BH", "BB", "BY", "BE", "BT", "BW", "BN", "CA", "CN", "CR", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "HK", "IS", "IR", "IE", "IL", "IT", "JP", "KZ", "KR", "KW", "LV", "LT", "LU", "MY", "MV", "MT", "MU", "MN", "NL", "NZ", "NO", "OM", "PL", "PT", "QA", "RU", "SA", "SC", "SG", "SK", "SI", "ES", "LK", "SR", "SE", "CH", "TH", "TT", "TN", "AE", "GB", "US", "UZ", "VE"));
    }
    
    a(final Context context) {
        this(bh.a(context));
    }
    
    a(final String s) {
        this(s, i.a());
    }
    
    a(final String s, final i c) {
        this.b = (s == null || !com.twitter.library.network.forecaster.a.a.contains(s.toUpperCase()));
        this.c = c;
    }
}
