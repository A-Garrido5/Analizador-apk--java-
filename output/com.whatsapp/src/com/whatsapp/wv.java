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

class wv implements ActionMode$Callback
{
    private static final String[] z;
    final ContactsFragment a;
    
    static {
        final String[] z2 = new String[3];
        String s = "*]\u0013H";
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
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
                        break;
                    }
                    case 3: {
                        c2 = ';';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*]\u0013H";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "%Z\u0003I<\u001fD\u0018R+4";
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
    
    wv(final ContactsFragment a) {
        this.a = a;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        final boolean i = App.I;
        Label_0161: {
            switch (menuItem.getItemId()) {
                case 2131755028: {
                    final StringBuilder sb = new StringBuilder();
                    for (final String s : ContactsFragment.b(this.a).keySet()) {
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(s);
                        if (i) {
                            break;
                        }
                    }
                    final Intent intent = new Intent((Context)this.a.getActivity(), (Class)ListMembersSelector.class);
                    intent.putExtra(wv.z[1], sb.toString());
                    this.a.startActivity(intent);
                    if (i) {
                        break Label_0161;
                    }
                    break;
                }
                case 2131755032: {
                    final StringBuilder sb2 = new StringBuilder();
                    for (final String s2 : ContactsFragment.b(this.a).keySet()) {
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(s2);
                        if (i) {
                            break;
                        }
                    }
                    final Intent intent2 = new Intent((Context)this.a.getActivity(), (Class)NewGroup.class);
                    intent2.putExtra(wv.z[2], ak.MULTISELECT.getCode());
                    intent2.putExtra(wv.z[0], sb2.toString());
                    this.a.startActivity(intent2);
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
        ContactsFragment.a(this.a, (HashMap)null);
        ContactsFragment.a(this.a).notifyDataSetChanged();
        ContactsFragment.a(this.a, (ActionMode)null);
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return false;
    }
}
