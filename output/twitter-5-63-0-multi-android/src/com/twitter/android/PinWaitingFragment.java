// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class PinWaitingFragment extends AbsFragment implements View$OnClickListener
{
    private nv a;
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.a = (nv)activity;
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887359: {
                this.a.g();
            }
            case 2131887360: {
                this.a.h();
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130969203, viewGroup, false);
        inflate.findViewById(2131887359).setOnClickListener((View$OnClickListener)this);
        inflate.findViewById(2131887360).setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
}
