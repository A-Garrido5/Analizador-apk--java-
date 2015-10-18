// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.view.TweetActionType;
import android.content.DialogInterface;
import java.util.Map;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;
import com.twitter.ui.dialog.e;

final class vj implements e
{
    final /* synthetic */ vf a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ TweetView c;
    final /* synthetic */ Map d;
    
    vj(final vf a, final Tweet b, final TweetView c, final Map d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        this.a.a(this.b, this.c, this.d.get(n2));
    }
}
