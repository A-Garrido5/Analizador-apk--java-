// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.preference.PreferenceManager;
import com.twitter.library.provider.aa;
import com.twitter.internal.network.f;
import android.content.Context;

public class ab extends z
{
    public ab(final Context context) {
        super(context);
    }
    
    @Override
    protected f a(final Context context) {
        return new ad(wj.a(context), aa.a(context), PreferenceManager.getDefaultSharedPreferences(context));
    }
}
