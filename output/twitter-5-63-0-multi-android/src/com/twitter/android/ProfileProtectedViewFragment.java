// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.View;
import android.view.ViewStub;

public class ProfileProtectedViewFragment extends ProfileSingleViewFragment
{
    @Override
    protected int e() {
        return 2130969000;
    }
    
    public void onInflate(final ViewStub viewStub, final View view) {
        final TypefacesTextView typefacesTextView = (TypefacesTextView)view.findViewById(2131887195);
        final TypefacesTextView typefacesTextView2 = (TypefacesTextView)view.findViewById(2131887196);
        if (typefacesTextView2 != null && typefacesTextView != null) {
            typefacesTextView.setText((CharSequence)this.getString(2131298003, new Object[] { this.a.c() }));
            typefacesTextView2.setText((CharSequence)this.getString(2131297840, new Object[] { this.a.c() }));
        }
    }
}
