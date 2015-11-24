// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import com.twitter.library.client.App;
import com.google.android.gms.common.e;
import android.content.Context;

public class f
{
    public static boolean a(final Context context) {
        return e.a(context) == 0;
    }
    
    public static boolean b(final Context context) {
        return a(context) && App.m();
    }
}
