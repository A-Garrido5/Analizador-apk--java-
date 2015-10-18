// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.support.v7.app.ActionBar$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.support.v7.app.ActionBar;
import android.app.Activity;

public class a81
{
    public static View a(final Activity activity, final ActionBar actionBar, final String s, final View$OnClickListener onClickListener) {
        final View a = alm.a(LayoutInflater.from(actionBar.getThemedContext()), 2130903068, null, false);
        final ActionBar$LayoutParams actionBar$LayoutParams = new ActionBar$LayoutParams(-2, -2);
        int gravity;
        if (App.ak() || !alm.c) {
            gravity = 5;
        }
        else {
            gravity = 3;
        }
        actionBar$LayoutParams.gravity = gravity;
        actionBar.setCustomView(a, actionBar$LayoutParams);
        ((TextView)a.findViewById(2131755166)).setText((CharSequence)s.toUpperCase());
        a.findViewById(2131755165).setOnClickListener(onClickListener);
        return a;
    }
}
