// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import org.json.JSONException;

class hp implements Runnable
{
    final /* synthetic */ JSONException a;
    final /* synthetic */ FeatureSwitchesSettingsActivity b;
    
    hp(final FeatureSwitchesSettingsActivity b, final JSONException a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Toast.makeText(this.b.getApplicationContext(), (CharSequence)("Invalid json string. " + this.a.getMessage()), 1).show();
    }
}
