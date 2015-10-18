// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.metrics.b;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Bundle;
import com.twitter.android.profiles.ah;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.widget.ScrollingHeaderTimelineFragment;

public class ProfileFavoriteTimelinesFragment extends ScrollingHeaderTimelineFragment
{
    private boolean k;
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.k) {
            return this.a(layoutInflater, 2130968999, viewGroup);
        }
        return super.a(layoutInflater, viewGroup);
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.k) {
            return this.a(layoutInflater, 2130968999, viewGroup);
        }
        return super.b(layoutInflater, viewGroup);
    }
    
    @Override
    protected String m() {
        return com.twitter.android.profiles.ah.a(this.k);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.k = this.getArguments().getBoolean("is_me");
        super.onCreate(bundle);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.k) {
            ((TypefacesTextView)onCreateView.findViewById(2131886114)).setText(2131296935);
        }
        return onCreateView;
    }
    
    @Override
    protected void x_() {
        (this.c = new com.twitter.android.metrics.b("timeline:bellbird_profile_favorites", "timeline:bellbird_profile_favorites", ih.n, this.av())).b(this.aE().b().g());
        this.c.i();
    }
}
