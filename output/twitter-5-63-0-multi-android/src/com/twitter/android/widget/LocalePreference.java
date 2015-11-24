// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.c;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.SpinnerAdapter;
import android.view.View;
import java.util.List;
import com.twitter.util.i;
import java.util.Comparator;
import java.util.Arrays;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Locale;
import android.widget.RadioGroup;
import android.widget.Spinner;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.content.SharedPreferences;
import android.preference.DialogPreference;

public class LocalePreference extends DialogPreference
{
    private final SharedPreferences a;
    private final ArrayAdapter b;
    private final ArrayList c;
    private Spinner d;
    private RadioGroup e;
    private boolean f;
    private String g;
    private Locale h;
    
    public LocalePreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.setDialogLayoutResource(2130968854);
        final SharedPreferences sharedPreferences = context.getSharedPreferences("debug_prefs", 0);
        String string;
        if (sharedPreferences.getBoolean("custom_locale_enabled", false)) {
            string = "Current Locale: " + sharedPreferences.getString("custom_language", "system default") + "_" + sharedPreferences.getString("custom_country", "system default");
        }
        else {
            string = "Current Locale: system default";
        }
        this.setSummary((CharSequence)string);
        this.a = sharedPreferences;
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayList<String> c = new ArrayList<String>();
        final Locale[] availableLocales = Locale.getAvailableLocales();
        Arrays.sort(availableLocales, new db(this));
        if (availableLocales != null) {
            for (final Locale locale : availableLocales) {
                if (i.d(locale)) {
                    c.add(i.e(locale));
                    list.add(locale.getLanguage() + " - " + locale.getDisplayName(locale));
                }
            }
        }
        this.h = context.getResources().getConfiguration().locale;
        this.c = c;
        final ArrayAdapter b = new ArrayAdapter(context, 17367048, (List)list);
        b.setDropDownViewResource(17367049);
        this.b = b;
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        final SharedPreferences a = this.a;
        final boolean boolean1 = a.getBoolean("custom_locale_enabled", false);
        final Spinner d = (Spinner)view.findViewById(2131886897);
        d.setAdapter((SpinnerAdapter)this.b);
        final String string = a.getString("custom_language", "");
        final String string2 = a.getString("custom_country", "");
        String g;
        if (a.getBoolean("custom_locale_enabled", false)) {
            g = string + "_" + string2;
        }
        else {
            g = i.e(this.h);
        }
        final int index = this.c.indexOf(g);
        if (index != -1) {
            d.setSelection(index);
        }
        d.setEnabled(boolean1);
        this.d = d;
        final RadioGroup e = (RadioGroup)view.findViewById(2131886894);
        if (boolean1) {
            e.check(2131886896);
        }
        else {
            e.check(2131886895);
        }
        e.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new dc(this));
        this.e = e;
        this.f = boolean1;
        this.g = g;
    }
    
    protected void onDialogClosed(final boolean b) {
        if (b) {
            final boolean b2 = this.e.getCheckedRadioButtonId() == 2131886896;
            final String s = this.c.get(this.d.getSelectedItemPosition());
            final String[] split = s.split("_");
            this.a.edit().putBoolean("custom_locale_enabled", b2).putString("custom_language", split[0]).putString("custom_country", split[1]).apply();
            if (b2 != this.f || (b2 && !s.equals(this.g))) {
                com.twitter.util.c.a(this.getContext(), 1000L);
            }
        }
    }
}
