// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;
import com.twitter.library.media.widget.BackgroundImageView;
import com.twitter.library.media.manager.j;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.media.manager.m;

class h implements m
{
    final /* synthetic */ ad a;
    final /* synthetic */ HeaderImageView b;
    
    h(final HeaderImageView b, final ad a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final p p) {
        final Bitmap bitmap = (Bitmap)p.c();
        if (bitmap == null && this.a.g()) {
            this.a.h();
            this.b.setProfileUser(this.a);
        }
        else {
            this.b.a(bitmap);
            if (this.b.d != null) {
                this.b.d.a(((j)p.b()).a(), bitmap);
            }
        }
    }
}
