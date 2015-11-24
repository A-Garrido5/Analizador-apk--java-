// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.model.SegmentedVideoFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableAnimatedGif;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import com.twitter.ui.widget.f;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.twitter.internal.android.widget.RichImageView;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableMedia;
import android.view.View;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;

class j implements b
{
    final /* synthetic */ EditableMediaView a;
    
    j(final EditableMediaView a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.b((Drawable)null);
        if (this.a.i) {
            this.a.g.a();
        }
        else {
            this.a.g.c();
        }
        this.a.g.setOnClickListener((View$OnClickListener)new k(this));
    }
    
    @Override
    public void b() {
        this.a.i = false;
        this.a.g.setVisibility(8);
        this.a.getImageView().setVisibility(0);
        this.a.j();
    }
    
    @Override
    public void c() {
        this.a.b(this.a.f);
    }
}
