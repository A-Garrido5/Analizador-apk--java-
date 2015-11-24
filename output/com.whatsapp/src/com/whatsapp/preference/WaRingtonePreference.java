// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.os.Parcelable;
import android.provider.Settings$System;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.RingtonePreference;

public class WaRingtonePreference extends RingtonePreference
{
    private static final String z;
    
    static {
        final char[] charArray = "J\tN=/B\u0003\u0004&._\u0002D;nN\u001f^=!\u0005\u0015C!'_\bD*no\"l\u000e\u0015g3u\u001a\u0012b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = 'g';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = 'O';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public WaRingtonePreference(final Context context) {
        super(context);
    }
    
    public WaRingtonePreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public WaRingtonePreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return WaPreference.a(WaPreference.b(super.onCreateView(viewGroup)));
    }
    
    protected void onPrepareRingtonePickerIntent(final Intent intent) {
        super.onPrepareRingtonePickerIntent(intent);
        if (this.getShowDefault() && (0x1 & this.getRingtoneType()) != 0x0 && (0x2 & this.getRingtoneType()) != 0x0) {
            intent.putExtra(WaRingtonePreference.z, (Parcelable)Settings$System.DEFAULT_NOTIFICATION_URI);
        }
    }
}
