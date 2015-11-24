// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import com.whatsapp.DialogToastActivity;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import android.app.AlertDialog$Builder;
import android.util.AttributeSet;
import android.content.Context;

public class WaFontListPreference extends WaListPreference
{
    public static int b;
    private int c;
    
    static {
        WaFontListPreference.b = 0;
    }
    
    public WaFontListPreference(final Context context) {
        super(context);
    }
    
    public WaFontListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    static int a(final WaFontListPreference waFontListPreference, final int c) {
        return waFontListPreference.c = c;
    }
    
    protected void onDialogClosed(final boolean b) {
        super.onDialogClosed(b);
        final CharSequence[] entryValues = this.getEntryValues();
        if (b && this.c >= 0 && entryValues != null) {
            final String string = entryValues[this.c].toString();
            if (this.callChangeListener((Object)string)) {
                this.setValue(string);
            }
        }
    }
    
    protected void onPrepareDialogBuilder(final AlertDialog$Builder alertDialog$Builder) {
        final boolean a = WaListPreference.a;
        super.onPrepareDialogBuilder(alertDialog$Builder);
        alertDialog$Builder.setSingleChoiceItems((ListAdapter)new c(this, this.getEntries(), this.getEntryValues()), this.c = this.findIndexOfValue(this.getValue()), (DialogInterface$OnClickListener)new b(this));
        alertDialog$Builder.setPositiveButton((CharSequence)null, (DialogInterface$OnClickListener)null);
        if (a) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
    }
    
    public boolean persistString(final String s) {
        WaFontListPreference.b = Integer.parseInt(s);
        return super.persistString(s);
    }
}
