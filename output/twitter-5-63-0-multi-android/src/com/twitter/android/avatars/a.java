// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.avatars;

import java.util.concurrent.Future;
import com.twitter.internal.android.util.Size;
import com.twitter.android.widget.MediaStoreItemView;
import android.support.annotation.LayoutRes;
import com.twitter.library.util.ak;
import android.content.Context;
import com.twitter.android.widget.bz;

public class a extends bz
{
    public a(final Context context, final ak ak, final int n, final boolean b, @LayoutRes final int n2, final boolean b2) {
        super(context, ak, n, b, n2, b2);
    }
    
    @Override
    protected Future a(final MediaStoreItemView mediaStoreItemView, final Size size) {
        return null;
    }
    
    @Override
    public int getCount() {
        return this.a.size();
    }
}
