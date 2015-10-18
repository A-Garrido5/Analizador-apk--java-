// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.util.collection.CollectionUtils;
import java.util.Set;
import android.net.Uri;
import android.provider.BaseColumns;

public final class aj implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    public static final Set c;
    public static final Set d;
    public static final Set e;
    
    static {
        a = Uri.parse(ae.d + "conversation_entries");
        b = Uri.parse(ae.d + "conversation_entries" + "/id");
        c = CollectionUtils.a(0, 19, 1, 8, 10, 11, 17, 18);
        d = CollectionUtils.a(0, 19, 1);
        e = CollectionUtils.a(8, 10, 11, 17, 18);
    }
}
