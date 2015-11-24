// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.net.Uri;
import android.content.Context;

public class z implements gp
{
    @Override
    public gm a(final Context context, final Uri uri) {
        final Bundle a = MainActivity.a(context);
        a.putInt("activity_type", 1);
        return new go(uri, ActivityFragment.class).a(a).a((CharSequence)context.getString(2131296292)).a("network_activity").a(false).a();
    }
}
