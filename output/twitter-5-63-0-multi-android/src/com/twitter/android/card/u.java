// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.provider.ae;
import com.twitter.library.client.App;
import android.net.Uri;

public abstract class u
{
    public static final String a;
    public static final Uri b;
    
    static {
        a = App.a(".app.installed_check");
        b = Uri.withAppendedPath(ae.e, "app_installed_polling");
    }
}
