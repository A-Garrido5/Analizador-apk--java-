// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class q implements BaseColumns
{
    public static final Uri a;
    
    static {
        a = Uri.parse("content://" + GlobalDatabaseProvider.a + "/" + "user_values");
    }
}
