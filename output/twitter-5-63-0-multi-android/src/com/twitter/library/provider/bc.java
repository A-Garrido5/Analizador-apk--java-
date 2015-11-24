// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class bc implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    
    static {
        a = Uri.parse(ae.d + "timeline_view");
        b = Uri.parse(ae.d + "timeline_view" + "/home");
        c = Uri.parse(ae.d + "timeline_view" + "/user");
        d = Uri.parse(ae.d + "timeline_view" + "/trends");
        e = Uri.parse(ae.d + "timeline_view" + "/trendsplus");
        f = Uri.parse(ae.d + "timeline_view" + "/custom");
        g = Uri.parse(ae.d + "timeline_view" + "/place");
    }
}
