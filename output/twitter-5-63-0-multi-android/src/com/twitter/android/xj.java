// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.b;
import com.twitter.library.client.az;
import com.twitter.library.api.Prompt;
import android.os.AsyncTask;

class xj extends AsyncTask
{
    final /* synthetic */ UmfInlinePromptView a;
    
    xj(final UmfInlinePromptView a) {
        this.a = a;
    }
    
    protected Void a(final Prompt... array) {
        final Context context = this.a.getContext();
        final long g = az.a(context).b().g();
        final b b = new b(context.getContentResolver());
        bg.a(context, g).a(array[0], b);
        b.a();
        return null;
    }
}
