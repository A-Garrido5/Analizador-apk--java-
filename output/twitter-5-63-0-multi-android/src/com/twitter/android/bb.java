// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.TwitterUser;
import com.twitter.util.concurrent.d;
import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.library.util.bn;
import android.net.Uri;
import com.twitter.library.client.az;
import android.os.Build$VERSION;
import android.os.Build;
import com.twitter.util.c;
import com.twitter.library.client.App;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class bb extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        if (App.d()) {
            final String string = "TwitterAndroid/" + c.c(context);
            final String string2 = Build.MODEL + "/" + Build$VERSION.RELEASE;
            final TwitterUser f = az.a(context).b().f();
            String username;
            if (f == null) {
                username = "";
            }
            else {
                username = f.username;
            }
            bn.a(context, Uri.parse(context.getString(2131298169, new Object[] { string, string2, username })));
            return;
        }
        final com.twitter.android.az a = com.twitter.android.az.a(context);
        a.a(context.getResources().getString(2131298195), "", a.a() + "\n\n" + a.c() + "\n\n" + a.d() + "\n\n").a(new e().a(h.b).a(new bc(this, context)));
    }
}
