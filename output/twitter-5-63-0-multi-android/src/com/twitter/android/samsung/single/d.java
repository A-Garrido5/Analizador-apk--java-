// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.model.WidgetViewModel$ModelType;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.Iterator;
import com.twitter.library.media.manager.o;
import com.twitter.library.media.manager.al;
import com.twitter.android.samsung.model.WidgetViewModel;
import com.twitter.internal.android.util.Size;
import java.util.ArrayList;
import com.twitter.android.samsung.data.j;
import android.content.Intent;
import com.twitter.library.media.manager.q;
import android.content.Context;
import java.util.List;
import android.util.SparseBooleanArray;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.media.manager.m;

class d implements m
{
    final /* synthetic */ FlipperViewsFactory a;
    
    d(final FlipperViewsFactory a) {
        this.a = a;
    }
    
    public void a(final p p) {
        Label_0036: {
            if (p.c() == null) {
                break Label_0036;
            }
            synchronized (this.a.h) {
                this.a.a.remove(p.b());
                // monitorexit(FlipperViewsFactory.a(this.a))
                this.a.a();
            }
        }
    }
}
