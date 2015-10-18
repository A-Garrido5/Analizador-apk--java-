// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class ak implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    public static final String[] c;
    
    static {
        a = Uri.parse(ae.d + "conversation_participants");
        b = Uri.parse(ae.d + "conversation_participants" + "/id");
        c = new String[] { "conversation_id", "user_id", "join_time" };
    }
}
