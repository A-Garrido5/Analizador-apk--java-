// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

public class WaPrivacyPreference extends WaListPreference
{
    private boolean b;
    private ProgressBar c;
    
    public WaPrivacyPreference(final Context context) {
        super(context);
    }
    
    public WaPrivacyPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void a(final boolean b) {
        this.b = b;
        if (this.c != null) {
            final ProgressBar c = this.c;
            int visibility;
            if (this.b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            c.setVisibility(visibility);
        }
    }
    
    protected void onBindView(final View view) {
        super.onBindView(view);
        this.c = (ProgressBar)view.findViewById(2131755723);
        final ProgressBar c = this.c;
        int visibility;
        if (this.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        c.setVisibility(visibility);
    }
}
