// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class ax implements BaseColumns
{
    public static final Uri a;
    
    static {
        a = Uri.parse(ae.d + "status_groups");
    }
    
    public static boolean a(final int n) {
        return n == 5 || n == 23 || n == 24 || n == 25;
    }
}
