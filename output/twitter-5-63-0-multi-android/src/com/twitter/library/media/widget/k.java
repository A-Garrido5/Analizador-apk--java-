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
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View$OnClickListener;

class k implements View$OnClickListener
{
    final /* synthetic */ j a;
    
    k(final j a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.a.g.d()) {
            this.a.a.b(this.a.a.f);
            this.a.a.g.b();
            return;
        }
        this.a.a.b((Drawable)null);
        this.a.a.g.a();
    }
}
