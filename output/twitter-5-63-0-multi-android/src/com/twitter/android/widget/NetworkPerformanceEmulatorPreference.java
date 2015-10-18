// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.Toast;
import android.view.View$OnClickListener;
import com.twitter.library.network.s;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import com.twitter.library.network.r;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.preference.DialogPreference;

public class NetworkPerformanceEmulatorPreference extends DialogPreference
{
    private final SharedPreferences a;
    private EditText b;
    private EditText c;
    private CheckBox d;
    private String e;
    
    public NetworkPerformanceEmulatorPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
        this.setDialogLayoutResource(2130968938);
        this.a();
    }
    
    private void a() {
        String summary;
        if (r.a(this.a)) {
            summary = "Emulation enabled";
        }
        else {
            summary = "Emulation disabled";
        }
        this.setSummary((CharSequence)summary);
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        this.d = (CheckBox)view.findViewById(2131887050);
        this.b = (EditText)view.findViewById(2131887054);
        this.c = (EditText)view.findViewById(2131887055);
        final RadioGroup radioGroup = (RadioGroup)view.findViewById(2131887051);
        final RadioButton radioButton = (RadioButton)view.findViewById(2131887052);
        final LinearLayout linearLayout = (LinearLayout)view.findViewById(2131887053);
        if (r.a(this.a)) {
            this.d.setChecked(true);
            this.b.setText((CharSequence)Integer.toString(r.b(this.a)));
            this.c.setText((CharSequence)Integer.toString(r.c(this.a)));
        }
        else {
            this.d.setChecked(false);
        }
        final String d = r.d(this.a);
        for (final s s : s.a) {
            final String a2 = s.a();
            final RadioButton radioButton2 = new RadioButton(this.getContext());
            radioButton2.setText((CharSequence)a2);
            radioGroup.addView((View)radioButton2, 0);
            radioButton2.setOnClickListener((View$OnClickListener)new dr(this, s, a2, linearLayout));
            if (a2.equals(d)) {
                radioButton2.setChecked(true);
            }
        }
        radioButton.setText((CharSequence)"Custom");
        radioButton.setOnClickListener((View$OnClickListener)new ds(this, linearLayout));
        if ("Custom".equals(d)) {
            radioButton.setChecked(true);
            linearLayout.setVisibility(0);
        }
    }
    
    protected void onDialogClosed(final boolean b) {
        super.onDialogClosed(b);
        final boolean checked = this.d.isChecked();
        while (true) {
            if (!b) {
                break Label_0067;
            }
            try {
                r.a(this.getContext(), this.a, checked, Integer.parseInt(this.b.getText().toString()), Integer.parseInt(this.c.getText().toString()), this.e);
                this.a();
            }
            catch (NumberFormatException ex) {
                Toast.makeText(this.getContext(), (CharSequence)"Invalid emulation settings", 0).show();
                continue;
            }
            break;
        }
    }
}
