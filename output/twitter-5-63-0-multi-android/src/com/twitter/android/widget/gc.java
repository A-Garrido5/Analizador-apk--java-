// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.client.App;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import com.google.android.gms.maps.SupportMapFragment;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class gc implements View$OnTouchListener
{
    final /* synthetic */ TwitterMapFragment a;
    
    gc(final TwitterMapFragment a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0: {
                view.getParent().requestDisallowInterceptTouchEvent(this.a.b);
                break;
            }
            case 1: {
                view.getParent().requestDisallowInterceptTouchEvent(!this.a.b);
                break;
            }
        }
        if (this.a.c != null) {
            this.a.c.a(view, motionEvent);
        }
        return false;
    }
}
