// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.text.TextUtils;

public class GroupMembersSelector extends MultipleContactsSelector
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0006\u007f''";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = 'l';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'T';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000bd,!\"\u0001s.67\u001ee01>\tu7; Cr&'&\u001ey:";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u000bd,!\"\u0001s.67\u001ee01>\tu7; Cu113\u0018s";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected String a() {
        return this.getString(2131231407);
    }
    
    @Override
    protected String b() {
        return this.getString(2131230794).toUpperCase();
    }
    
    @Override
    protected int c() {
        return 1;
    }
    
    @Override
    protected int e() {
        return 2131231231;
    }
    
    @Override
    protected int f() {
        return ym.c;
    }
    
    @Override
    protected int g() {
        return 2131230985;
    }
    
    @Override
    protected void j() {
        final String d = this.d();
        if (TextUtils.isEmpty((CharSequence)d)) {
            App.a((Context)this, this.getString(2131231428), 0);
            return;
        }
        final Intent intent = new Intent();
        intent.putExtra(GroupMembersSelector.z[0], d);
        this.setResult(-1, intent);
        this.finish();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        Log.i(GroupMembersSelector.z[2]);
        super.onCreate(bundle);
    }
    
    @Override
    public void onDestroy() {
        Log.i(GroupMembersSelector.z[1]);
        super.onDestroy();
    }
}
