// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.app.Activity;
import android.content.Context;

public final class d extends b
{
    @Override
    public final e a(final Context context, final String s, final az az, final ba ba) {
        return new ap(context, s, context.getPackageName(), bg.d(context), az, ba);
    }
    
    @Override
    public final i a(final Activity activity, final e e) {
        return w.a(activity, e.a());
    }
}
