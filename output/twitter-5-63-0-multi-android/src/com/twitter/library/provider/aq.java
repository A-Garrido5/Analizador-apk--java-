// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class aq implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    
    static {
        a = Uri.parse(ae.d + "lists_view");
        b = Uri.parse(ae.d + "lists_view" + "/id");
    }
}
