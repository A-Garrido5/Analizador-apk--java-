// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.view.View;
import android.view.LayoutInflater;
import com.twitter.android.moments.ui.FillCropFrameLayout;
import android.content.Context;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.moments.viewmodels.MomentTweetPhotoPage;
import com.twitter.util.m;
import android.view.ViewGroup;
import com.twitter.android.moments.ui.sectionpager.a;
import com.twitter.util.n;

class p implements n
{
    final /* synthetic */ o a;
    
    p(final o a) {
        this.a = a;
    }
    
    public void a(final Event event) {
        switch (q.a[event.ordinal()]) {
            default: {}
            case 1: {
                this.a.b.a();
            }
            case 2: {
                this.a.b.b();
            }
        }
    }
}
