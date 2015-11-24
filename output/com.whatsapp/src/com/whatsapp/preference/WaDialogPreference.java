// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.View;
import android.view.ViewGroup;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.preference.DialogPreference;

public class WaDialogPreference extends DialogPreference
{
    private DialogInterface$OnClickListener a;
    
    public WaDialogPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = null;
    }
    
    public void a(final DialogInterface$OnClickListener a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (this.a != null) {
            this.a.onClick(dialogInterface, n);
        }
        super.onClick(dialogInterface, n);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return WaPreference.a(WaPreference.b(super.onCreateView(viewGroup)));
    }
}
