// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Context;

public class fc implements gp
{
    @Override
    public gm a(final Context context, final Uri uri) {
        return new go(uri, DiscoverFragment.class).a(MainActivity.a(context)).a((CharSequence)context.getString(2131296814)).a(2130839310).a("discover").a(false).a();
    }
}
