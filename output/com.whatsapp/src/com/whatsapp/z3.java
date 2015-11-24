// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import java.util.Iterator;
import com.whatsapp.fieldstats.ak;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode$Callback;

class z3 implements ActionMode$Callback
{
    private static final String[] z;
    final ContactPicker a;
    
    static {
        final String[] z2 = new String[3];
        String s = "= M\u000f";
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
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = 'I';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = '|';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2']\u000e_\b9F\u0015H#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "= M\u000f";
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
    
    z3(final ContactPicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        final boolean i = App.I;
        Label_0165: {
            switch (menuItem.getItemId()) {
                case 2131755028: {
                    final StringBuilder sb = new StringBuilder();
                    for (final String s : ContactPicker.b(this.a).keySet()) {
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(s);
                        if (i) {
                            break;
                        }
                    }
                    final Intent intent = new Intent((Context)this.a, (Class)ListMembersSelector.class);
                    intent.putExtra(z3.z[2], sb.toString());
                    this.a.startActivity(intent);
                    this.a.finish();
                    if (i) {
                        break Label_0165;
                    }
                    break;
                }
                case 2131755032: {
                    final StringBuilder sb2 = new StringBuilder();
                    for (final String s2 : ContactPicker.b(this.a).keySet()) {
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(s2);
                        if (i) {
                            break;
                        }
                    }
                    final Intent intent2 = new Intent((Context)this.a, (Class)NewGroup.class);
                    intent2.putExtra(z3.z[1], ak.MULTISELECT.getCode());
                    intent2.putExtra(z3.z[0], sb2.toString());
                    this.a.startActivity(intent2);
                    this.a.finish();
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755028, 0, 2131231405), 6);
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755032, 0, 2131231303), 6);
        return true;
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        ContactPicker.a(this.a, (HashMap)null);
        ContactPicker.w(this.a);
        ContactPicker.a(this.a, (ActionMode)null);
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return false;
    }
}
