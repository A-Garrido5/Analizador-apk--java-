// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.client.App;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import com.google.android.gms.maps.SupportMapFragment;

public class TwitterMapFragment extends SupportMapFragment
{
    private static final boolean a;
    private boolean b;
    private gd c;
    private View$OnTouchListener d;
    
    static {
        a = (Build$VERSION.SDK_INT >= 16);
    }
    
    public TwitterMapFragment() {
        this.d = (View$OnTouchListener)new gc(this);
    }
    
    private View a(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            View view = viewGroup.getChildAt(i);
            if (view instanceof ViewGroup) {
                view = this.a((ViewGroup)view);
                if (view != null) {
                    return view;
                }
            }
            else if ((TwitterMapFragment.a && view instanceof TextureView) || view instanceof SurfaceView) {
                return view;
            }
        }
        return null;
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        App.a(false);
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        App.a(true);
        onCreateView.setBackgroundColor(this.getResources().getColor(2131689503));
        final View a = this.a((ViewGroup)onCreateView);
        if (a != null) {
            a.setBackgroundColor(this.getResources().getColor(2131689503));
            a.setOnTouchListener(this.d);
            if (this.c() != null && this.c != null) {
                this.c.a();
                return onCreateView;
            }
        }
        return onCreateView;
    }
}
