// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.z;
import android.view.View$OnClickListener;

class im implements View$OnClickListener
{
    private final z a;
    private Tweet b;
    private UrlEntity c;
    
    im(final z a) {
        this.a = a;
    }
    
    public void a(final Tweet b) {
        this.b = null;
        this.c = null;
        if (b != null && !b.G.urls.c()) {
            this.c = (UrlEntity)b.G.urls.a(0);
            this.b = b;
        }
    }
    
    public void onClick(final View view) {
        if (this.b != null && this.c != null) {
            this.a.a(this.b, this.c);
        }
    }
}
