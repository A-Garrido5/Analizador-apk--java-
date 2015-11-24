// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.b7;
import com.whatsapp.util.Log;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import java.util.Map;
import com.whatsapp.protocol.bi;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.support.v7.view.ActionMode$Callback;

class a0m implements ActionMode$Callback
{
    private static final String z;
    private MenuItem a;
    private MenuItem b;
    private MenuItem c;
    final Conversation d;
    private MenuItem e;
    private MenuItem f;
    private MenuItem g;
    private MenuItem h;
    
    static {
        final char[] charArray = "\fO=1Y\u001dS23U\u0000N|4Y\u0003E03U\u0000N6)X\nD".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = 'o';
                    break;
                }
                case 1: {
                    c2 = ' ';
                    break;
                }
                case 2: {
                    c2 = 'S';
                    break;
                }
                case 3: {
                    c2 = 'G';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a0m(final Conversation d) {
        this.d = d;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return false;
            }
            case 1: {
                Conversation.ag(this.d);
                return true;
            }
            case 0: {
                Conversation.s(this.d);
                return true;
            }
            case 2: {
                Conversation.i(this.d);
                Conversation.u(this.d);
                return true;
            }
            case 6: {
                Conversation.b(this.d, this.d.aw.entrySet().iterator().next().getValue());
                Conversation.u(this.d);
                return true;
            }
            case 4: {
                Conversation.c(this.d, this.d.aw.entrySet().iterator().next().getValue());
                Conversation.u(this.d);
                return true;
            }
            case 5: {
                Conversation.f(this.d, this.d.aw.entrySet().iterator().next().getValue());
                Conversation.u(this.d);
                return true;
            }
            case 15: {
                Conversation.a(this.d, this.d.aw.entrySet().iterator().next().getValue());
                Conversation.u(this.d);
                return true;
            }
        }
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        this.h = Conversation.a(this.d, menu, 15, 2131231245, 2130838723);
        this.b = Conversation.a(this.d, menu, 0, 2131230992, 2130838718);
        this.a = Conversation.a(this.d, menu, 2, 2131230981, 2130838716);
        this.e = Conversation.a(this.d, menu, 6, 2131231732, 2130838733);
        this.f = Conversation.a(this.d, menu, 4, 2131230874, 2130838714);
        this.c = Conversation.a(this.d, menu, 5, 2131230874, 2130838714);
        MenuItemCompat.setShowAsAction(this.g = Conversation.a(this.d, menu, 1, 2131230967, 2130838722), 2);
        MenuItemCompat.setShowAsAction(this.b, 2);
        MenuItemCompat.setShowAsAction(this.a, 2);
        MenuItemCompat.setShowAsAction(this.e, 2);
        MenuItemCompat.setShowAsAction(this.f, 2);
        MenuItemCompat.setShowAsAction(this.c, 2);
        MenuItemCompat.setShowAsAction(this.h, 2);
        return true;
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        Log.i(a0m.z);
        this.d.aw = null;
        this.d.u.notifyDataSetChanged();
        Conversation.a(this.d, (ActionMode)null);
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        final boolean i = App.I;
        this.b.setVisible(true);
        this.g.setVisible(true);
        this.e.setVisible(false);
        this.f.setVisible(false);
        this.c.setVisible(false);
        this.h.setVisible(false);
        final Iterator<bi> iterator = this.d.aw.values().iterator();
        boolean b = true;
    Label_0127:
        while (true) {
            while (iterator.hasNext()) {
                boolean visible;
                if (iterator.next().I != 0) {
                    if (!i) {
                        visible = false;
                        break Label_0127;
                    }
                    visible = false;
                }
                else {
                    visible = b;
                }
                if (!i) {
                    b = visible;
                    continue;
                }
                this.a.setVisible(visible);
                if (this.d.aw.size() == 1) {
                    final bi bi = this.d.aw.entrySet().iterator().next().getValue();
                    Label_0311: {
                        switch (bi.I) {
                            case 0: {
                                if (i) {
                                    break Label_0311;
                                }
                                break;
                            }
                            case 5: {
                                if (i) {
                                    break Label_0311;
                                }
                                break;
                            }
                            case 1:
                            case 2:
                            case 3: {
                                final MediaData mediaData = (MediaData)bi.N;
                                if (bi.a.b || mediaData.transferred) {
                                    this.e.setVisible(true);
                                }
                                if (mediaData.transferring) {
                                    if (bi.a.b) {
                                        this.f.setVisible(true);
                                        this.b.setVisible(false);
                                        this.g.setVisible(false);
                                        if (!i) {
                                            break;
                                        }
                                    }
                                    this.c.setVisible(true);
                                    this.b.setVisible(false);
                                    this.g.setVisible(false);
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    final MenuItem h = this.h;
                    final boolean b2 = bi.a.b;
                    boolean visible2 = false;
                    if (b2) {
                        final int a = b7.a(bi.c, 4);
                        visible2 = false;
                        if (a >= 0) {
                            visible2 = true;
                        }
                    }
                    h.setVisible(visible2);
                }
                actionMode.setTitle(String.valueOf(this.d.aw.size()));
                return true;
            }
            boolean visible = b;
            continue Label_0127;
        }
    }
}
