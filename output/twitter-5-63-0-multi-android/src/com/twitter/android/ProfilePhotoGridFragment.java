// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Bundle;
import com.twitter.android.metrics.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.widget.ScrollingHeaderPhotoGridFragment;

public class ProfilePhotoGridFragment extends ScrollingHeaderPhotoGridFragment
{
    private boolean c;
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.c) {
            return this.a(layoutInflater, 2130968998, viewGroup);
        }
        return super.a(layoutInflater, viewGroup);
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.c) {
            return this.a(layoutInflater, 2130968998, viewGroup);
        }
        return super.b(layoutInflater, viewGroup);
    }
    
    @Override
    protected void e() {
        (this.b = new com.twitter.android.metrics.b("timeline:bellbird_profile_photogrid", "timeline:bellbird_profile_photogrid", ih.n, this.av())).b(this.aE().b().g());
        this.b.i();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.c = this.getArguments().getBoolean("is_me");
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.c) {
            ((TypefacesTextView)onCreateView.findViewById(2131886114)).setText(2131296936);
        }
        return onCreateView;
    }
}
