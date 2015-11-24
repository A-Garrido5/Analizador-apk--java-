// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.text.TextUtils;
import com.twitter.library.platform.PushService;
import android.widget.EditText;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.DialogPreference;

public class PushSettingsSummaryPreference extends DialogPreference
{
    public PushSettingsSummaryPreference(final Context context, final AttributeSet set) {
        this(context, set, 16842894);
    }
    
    public PushSettingsSummaryPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.setDialogLayoutResource(2130969016);
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        final EditText editText = (EditText)view.findViewById(2131887230);
        editText.setText((CharSequence)"Push settings parameters not recorded: Disable and re-enable push settings to see parameter values");
        final String a = PushService.a();
        if (!TextUtils.isEmpty((CharSequence)a)) {
            editText.setText((CharSequence)a);
        }
        editText.setEnabled(true);
    }
}
