// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.c;
import android.widget.SpinnerAdapter;
import android.view.View;
import java.util.List;
import com.twitter.util.i;
import java.util.Comparator;
import java.util.Arrays;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Locale;
import android.widget.Spinner;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;

class dc implements RadioGroup$OnCheckedChangeListener
{
    final /* synthetic */ LocalePreference a;
    
    dc(final LocalePreference a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        this.a.d.setEnabled(n == 2131886896);
    }
}
