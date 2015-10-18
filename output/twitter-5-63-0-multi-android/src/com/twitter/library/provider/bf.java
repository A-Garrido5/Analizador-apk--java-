// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class bf implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    
    static {
        a = Uri.parse(ae.d + "users");
        b = Uri.parse(ae.d + "users" + "/id");
    }
    
    public static boolean a(final int n) {
        return (n & 0x40) == 0x0;
    }
    
    public static boolean b(final int n) {
        return (n & 0x80) == 0x0;
    }
    
    public static boolean c(final int n) {
        return (n & 0x100) == 0x0;
    }
    
    public static boolean d(final int n) {
        return (n & 0x1) != 0x0;
    }
}
