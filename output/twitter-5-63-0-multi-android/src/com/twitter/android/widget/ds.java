// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.Toast;
import com.twitter.library.network.s;
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
import android.view.View$OnClickListener;

class ds implements View$OnClickListener
{
    final /* synthetic */ LinearLayout a;
    final /* synthetic */ NetworkPerformanceEmulatorPreference b;
    
    ds(final NetworkPerformanceEmulatorPreference b, final LinearLayout a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.e = "Custom";
        this.a.setVisibility(0);
    }
}
