// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.provider.ContactsContract$Contacts;
import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ub implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final GroupChatRecentLocationsActivity a;
    
    static {
        final String[] z2 = new String[7];
        String s = "Vj=/\u0002Rp3.\u0000T{74\u0006]w1;\u0006Xw<)]Rw<.\u0017Ilr)\u000bBl77RRw<.\u0013Rlr6\u001bBlr9\u001dDt6z\u001c^lr<\u001dDv6";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Pv6(\u001dX||3\u001cE}<.\\P{&3\u001d_6\u001b\u0014!tJ\u0006\u0005=cG\u0017\u001e;e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Gv6t\u0013_| 5\u001bU61/\u0000Bw t\u001bE}?u\u0011^v&;\u0011E";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Ap=4\u0017";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Pv6(\u001dX||3\u001cE}<.\\P{&3\u001d_6\u001b\u0014!tJ\u0006";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Ap=4\u0017";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Ap=4\u0017nl+*\u0017";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ub(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final boolean i = App.I;
        Label_0215: {
            switch (n) {
                case 0: {
                    this.a.startActivity(Conversation.a(GroupChatRecentLocationsActivity.c(this.a)));
                    if (i) {
                        break Label_0215;
                    }
                    break;
                }
                case 1: {
                    App.a(GroupChatRecentLocationsActivity.c(this.a), (Activity)this.a, bq.GROUP_CHAT_RECENT_LOCATION);
                    if (i) {
                        break Label_0215;
                    }
                    break;
                }
                case 2: {
                    if (GroupChatRecentLocationsActivity.c(this.a).e != null) {
                        ContactInfo.a(GroupChatRecentLocationsActivity.c(this.a), (Activity)this.a);
                        if (!i) {
                            break;
                        }
                    }
                    final String f = GroupChatRecentLocationsActivity.c(this.a).f();
                    final Intent intent = new Intent(ub.z[4], ContactsContract$Contacts.CONTENT_URI);
                    intent.putExtra(ub.z[5], f);
                    intent.setComponent(intent.resolveActivity(this.a.getPackageManager()));
                    Label_0211: {
                        if (intent.getComponent() != null) {
                            this.a.startActivityForResult(intent, 10);
                            if (!i) {
                                break Label_0211;
                            }
                        }
                        Log.i(ub.z[0]);
                        App.N();
                    }
                    if (i) {
                        break Label_0215;
                    }
                    break;
                }
                case 3: {
                    final Intent intent2 = new Intent(ub.z[1]);
                    intent2.setType(ub.z[2]);
                    intent2.putExtra(ub.z[3], GroupChatRecentLocationsActivity.c(this.a).a((Context)this.a));
                    intent2.putExtra(ub.z[6], 2);
                    intent2.setFlags(524288);
                    this.a.startActivityForResult(intent2, 11);
                    break;
                }
            }
        }
        dialogInterface.dismiss();
    }
}
