// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.twitter.library.network.r;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.LinearLayout;
import com.twitter.library.network.s;
import android.view.View$OnClickListener;

class dr implements View$OnClickListener
{
    final /* synthetic */ s a;
    final /* synthetic */ String b;
    final /* synthetic */ LinearLayout c;
    final /* synthetic */ NetworkPerformanceEmulatorPreference d;
    
    dr(final NetworkPerformanceEmulatorPreference d, final s a, final String b, final LinearLayout c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final View view) {
        this.d.b.setText((CharSequence)Integer.toString(this.a.b()));
        this.d.c.setText((CharSequence)Integer.toString(this.a.c()));
        this.d.e = this.b;
        this.c.setVisibility(8);
    }
}
