// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.ScrollingHeaderActivity;
import com.twitter.library.service.y;
import com.twitter.android.PhotoGridFragment;

public class ScrollingHeaderPhotoGridFragment extends PhotoGridFragment
{
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof ScrollingHeaderActivity) {
            ((ScrollingHeaderActivity)activity).a(false);
        }
        this.c_(y.R());
        this.aC();
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && !this.a && cursor.getCount() < 400) {
            this.c(1);
        }
    }
    
    protected void k() {
    }
    
    @Override
    protected boolean z_() {
        return true;
    }
}
