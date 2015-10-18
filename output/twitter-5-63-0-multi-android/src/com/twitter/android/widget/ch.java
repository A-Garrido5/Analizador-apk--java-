// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Bitmap;
import com.twitter.library.media.model.EditableMedia;
import java.lang.ref.WeakReference;

class ch implements Runnable
{
    private final WeakReference a;
    private final EditableMedia b;
    private final Bitmap c;
    
    public ch(final WeakReference a, final EditableMedia b, final Bitmap c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        final bz bz = (bz)this.a.get();
        if (bz != null) {
            bz.a(this.b, this.c);
        }
    }
}
