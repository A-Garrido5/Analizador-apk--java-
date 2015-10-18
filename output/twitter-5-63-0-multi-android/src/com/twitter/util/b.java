// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.content.Context;

public class b extends i
{
    @TargetApi(17)
    public static boolean a(final Context context) {
        if (Build$VERSION.SDK_INT >= 17) {
            return context.getResources().getConfiguration().getLayoutDirection() == 1;
        }
        return i.a();
    }
}
