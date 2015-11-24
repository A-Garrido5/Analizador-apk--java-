// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.m;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;
import com.twitter.library.media.widget.BackgroundImageView;

public class HeaderImageView extends BackgroundImageView
{
    private Set c;
    private i d;
    
    public HeaderImageView(final Context context) {
        this(context, null);
    }
    
    public HeaderImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public HeaderImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new HashSet(2);
        this.setAspectRatio(3.0f);
    }
    
    private m a(final ad ad) {
        return new h(this, ad);
    }
    
    private void a(final Bitmap bitmap) {
        if (bitmap != null && this.c.size() >= 2 && !this.c.contains(bitmap)) {
            this.c.clear();
        }
        this.c.add(bitmap);
    }
    
    public void a(final i headerLoadedListener, final Set c, final int n) {
        this.setHeaderLoadedListener(headerLoadedListener);
        this.setDefaultDrawable((Drawable)new ColorDrawable(n));
        if (c != null) {
            this.c = c;
        }
    }
    
    public Set getSavedBitmaps() {
        return this.c;
    }
    
    public void setHeaderLoadedListener(final i d) {
        this.d = d;
    }
    
    public void setProfileUser(final ad ad) {
        this.a((k)com.twitter.android.profiles.g.a(ad).a(this.a(ad)));
    }
}
