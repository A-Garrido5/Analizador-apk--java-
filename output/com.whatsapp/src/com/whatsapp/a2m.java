// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import java.util.Iterator;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.protocol.bi;
import android.net.Uri;
import java.util.ArrayList;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.support.v7.view.ActionMode$Callback;

class a2m implements ActionMode$Callback
{
    private static final String[] z;
    private MenuItem a;
    final MediaGallery b;
    
    static {
        final String[] z2 = new String[2];
        String s = "&t}EC.~7^B3\u007fwC\u0002\"bmEMiIMei\u0006W";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = '7';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "m53";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a2m(final MediaGallery b) {
        this.b = b;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        final boolean i = App.I;
        Label_0210: {
            switch (menuItem.getItemId()) {
                case 2131755027: {
                    final ArrayList<Uri> list = new ArrayList<Uri>();
                    String type = null;
                Label_0147_Outer:
                    for (final bi bi : MediaGallery.b(this.b).values()) {
                        list.add(Uri.fromFile(((MediaData)bi.N).file));
                        while (true) {
                            String b = null;
                            Label_0220: {
                                if (type == null) {
                                    b = App.b(bi.I);
                                    if (!i) {
                                        break Label_0220;
                                    }
                                }
                                else {
                                    b = type;
                                }
                                if (b.equals(App.b(bi.I))) {
                                    break Label_0220;
                                }
                                type = a2m.z[1];
                                if (i) {
                                    break;
                                }
                                continue Label_0147_Outer;
                            }
                            type = b;
                            continue;
                        }
                    }
                    final Intent intent = new Intent((Context)this.b, (Class)ContactPicker.class);
                    intent.setType(type);
                    intent.putParcelableArrayListExtra(a2m.z[0], (ArrayList)list);
                    this.b.startActivity(intent);
                    MediaGallery.e(this.b).finish();
                    if (i) {
                        break Label_0210;
                    }
                    break;
                }
                case 2131755026: {
                    this.b.showDialog(1);
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755026, 0, 2131230992).setIcon(2130838718), 2);
        MenuItemCompat.setShowAsAction(this.a = menu.add(0, 2131755027, 0, 2131230967).setIcon(2130838722), 2);
        if (Build$VERSION.SDK_INT >= 21) {
            this.b.getWindow().setStatusBarColor(this.b.getResources().getColor(2131624026));
        }
        return true;
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        MediaGallery.b(this.b).clear();
        MediaGallery.a(this.b, null);
        if (Build$VERSION.SDK_INT >= 21) {
            this.b.getWindow().setStatusBarColor(this.b.getResources().getColor(17170444));
        }
        MediaGallery.c(this.b).notifyDataSetChanged();
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        actionMode.setTitle(String.format(this.b.getResources().getQuantityString(2131296287, MediaGallery.b(this.b).size()), MediaGallery.b(this.b).size()));
        final MenuItem a = this.a;
        final int size = MediaGallery.b(this.b).size();
        boolean visible = false;
        if (size <= 10) {
            visible = true;
        }
        a.setVisible(visible);
        return true;
    }
}
