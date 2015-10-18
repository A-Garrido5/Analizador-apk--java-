// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.util.m;
import android.content.res.Resources;
import android.view.View;
import android.widget.Toast;
import com.twitter.util.n;

class e implements n
{
    final /* synthetic */ d a;
    
    e(final d a) {
        this.a = a;
    }
    
    public void a(final Event event) {
        switch (f.a[event.ordinal()]) {
            default: {}
            case 1: {
                Toast.makeText(this.a.a.getContext(), (CharSequence)"Favorited", 0).show();
            }
            case 2: {
                this.a.a(this.a.a, 0.0f);
                this.a.a(this.a.b, 0.0f);
            }
            case 3: {
                this.a.a(this.a.a, 1.0f);
                this.a.a(this.a.b, 1.0f);
            }
        }
    }
}
