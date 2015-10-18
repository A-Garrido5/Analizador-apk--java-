// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Parcelable;
import com.twitter.library.client.as;
import com.twitter.library.api.ao;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.android.oy;
import java.util.HashMap;
import android.support.v4.widget.CursorAdapter;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.au;
import java.util.Collection;
import android.content.Context;
import com.twitter.library.provider.bg;
import java.util.ArrayList;
import com.twitter.library.provider.b;
import com.twitter.library.featureswitch.d;
import com.twitter.library.api.Prompt;

public class ax implements ay
{
    final /* synthetic */ av a;
    
    public ax(final av a) {
        this.a = a;
    }
    
    @Override
    public void a(final Prompt prompt) {
        if (!prompt.g() || d.f("app_graph_enabled")) {
            final b b = new b(this.a.a.getContentResolver());
            final ArrayList<Prompt> list = new ArrayList<Prompt>();
            list.add(prompt);
            final bg a = bg.a((Context)this.a.a, this.a.h);
            if ("profile_other".equals(prompt.c)) {
                if (this.a.i != 0L) {
                    a.a((Collection)list, this.a.i, b);
                }
            }
            else {
                a.a((Collection)list, this.a.h, b);
            }
            b.a();
        }
    }
}
