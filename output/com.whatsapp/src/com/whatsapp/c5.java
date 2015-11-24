// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import android.database.Cursor;
import android.text.TextUtils;
import android.telephony.PhoneNumberUtils;
import android.provider.ContactsContract$CommonDataKinds$Phone;
import android.provider.ContactsContract$Data;
import java.util.ArrayList;
import android.content.Context;
import android.os.AsyncTask;

class c5 extends AsyncTask
{
    private static final String[] z;
    final ContactInfo a;
    
    static {
        final String[] z2 = new String[17];
        String s = ")w\u0002n\u0014)l\u0005t\u0013%7\u0019j\u0011+l\t~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'u';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "8y\u001bE\u0016%v\u0018{\u0016>G\u0005~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ")w\u0002n\u0014)l3s\u0011";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "8y\u001bE\u0016%v\u0018{\u0016>G\u0005~";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0015q\b";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ")w\u0002n\u0014)l3s\u0011";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0015q\b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ")w\u0002n\u0014)l3s\u0011w'L[;\u000e8\u0001s\u0018/l\u0015j\u0010w?\u001at\u0011dy\u0002~\u0007%q\b4\u0016?j\u001fu\u0007dq\u0018\u007f\u0018eh\u0004u\u001b/G\u001a(R";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ".y\u0018{G";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ".y\u0018{G";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ".y\u0018{D";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "8y\u001bE\u0016%v\u0018{\u0016>G\u0005~Hu8-T1ju\u0005w\u0010>a\u001c\u007fHmn\u0002~[+v\bh\u001a#|By\u00008k\u0003h[#l\twZ:p\u0003t\u0010\u0015n^=";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0016\\";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = ".y\u0018{F";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = ".y\u0018{F";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0016\\";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = ".y\u0018{D";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    c5(final ContactInfo a) {
        this.a = a;
    }
    
    private void a() {
        final int a = ChatInfoActivity.a((Context)this.a, ContactInfo.c(this.a).u, new rp(this));
        if (a != 0 && !this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new xm(this, a));
        }
    }
    
    static void a(final c5 c5, final ArrayList list) {
        c5.a(list);
    }
    
    private void a(final ArrayList list) {
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new ot(this, list));
        }
    }
    
    private void b() {
        final boolean i = App.I;
        final Cursor query = this.a.getContentResolver().query(ContactsContract$Data.CONTENT_URI, new String[] { c5.z[4], c5.z[2] }, c5.z[11], new String[] { String.valueOf(ContactInfo.c(this.a).v()) }, (String)null);
        String s;
        Cursor cursor;
        if (query != null) {
            String string;
            if (query.moveToNext()) {
                string = query.getString(query.getColumnIndex(c5.z[5]));
            }
            else {
                string = null;
            }
            query.close();
            s = string;
            cursor = null;
        }
        else {
            cursor = query;
            s = null;
        }
        final ArrayList<adg> list = new ArrayList<adg>();
        list.add(new adg(this.a, ContactInfo.c(this.a)));
        Cursor query2;
        if (s != null) {
            query2 = this.a.getContentResolver().query(ContactsContract$Data.CONTENT_URI, new String[] { c5.z[6], c5.z[1], c5.z[16], c5.z[9], c5.z[13] }, c5.z[7], new String[] { s }, (String)null);
        }
        else {
            query2 = cursor;
        }
        if (query2 != null) {
            int n = 1;
        Label_0587_Outer:
            while (query2.moveToNext()) {
                final String string2 = query2.getString(query2.getColumnIndex(c5.z[10]));
                if (string2 != null || i) {
                    if (!this.isCancelled() || i) {
                        final long long1 = query2.getLong(query2.getColumnIndex(c5.z[3]));
                        final int int1 = query2.getInt(query2.getColumnIndex(c5.z[8]));
                        String s2 = query2.getString(query2.getColumnIndex(c5.z[14]));
                        if (int1 != 0 || s2 == null) {
                            s2 = this.a.getResources().getString(ContactsContract$CommonDataKinds$Phone.getTypeLabelResource(int1));
                        }
                        final adg adg = new adg(this.a, string2, s2);
                        final a_9 a = App.S.a(new xg(long1, PhoneNumberUtils.stripSeparators(string2)));
                        if (a != null && a.b) {
                            com.whatsapp.adg.a(adg, a.u);
                            com.whatsapp.adg.a(adg, a);
                        }
                        final String replaceAll = string2.replaceAll(c5.z[12], "");
                        final Iterator<adg> iterator = list.iterator();
                        int n2 = 1;
                    Label_0587:
                        while (true) {
                            while (iterator.hasNext()) {
                                final String replaceAll2 = com.whatsapp.adg.c(iterator.next()).toString().replaceAll(c5.z[15], "");
                                int n3;
                                if (replaceAll.endsWith(replaceAll2) || replaceAll2.endsWith(replaceAll)) {
                                    if (!i) {
                                        n3 = 0;
                                        break Label_0587;
                                    }
                                    n3 = 0;
                                }
                                else {
                                    n3 = n2;
                                }
                                if (!i) {
                                    n2 = n3;
                                    continue Label_0587_Outer;
                                }
                                int n4;
                                if (n3 != 0 && com.whatsapp.adg.d(adg) != null) {
                                    list.add(n, adg);
                                    n4 = n + 1;
                                }
                                else {
                                    n4 = n;
                                }
                                if (i) {
                                    break Label_0587_Outer;
                                }
                                n = n4;
                                continue Label_0587_Outer;
                            }
                            int n3 = n2;
                            continue Label_0587;
                        }
                    }
                    break;
                }
            }
            int n5;
            for (int j = 1; j < list.size(); j = n5) {
                final adg adg2 = list.get(j);
                Label_0713: {
                    if (adg.d(adg2) != null) {
                        adg.b(adg2, a_9.b(adg.d(adg2)));
                        if (!i) {
                            break Label_0713;
                        }
                    }
                    if (!TextUtils.isEmpty((CharSequence)adg.c(adg2)) && adg.c(adg2).charAt(0) == '+') {
                        adg.b(adg2, a_9.a(adg.c(adg2).substring(1)));
                    }
                }
                n5 = j + 1;
                if (i) {
                    break;
                }
            }
            query2.close();
        }
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new fp(this, list));
        }
    }
    
    private void c() {
        final boolean i = App.I;
        final ArrayList b = App.S.b();
        final ArrayList<a_9> list = new ArrayList<a_9>();
        for (final a_9 a_9 : b) {
            if (this.isCancelled() && !i) {
                break;
            }
            if (a_9.m() && !a_9.o() && a_9.t != null) {
                final Set l = adc.a(a_9.u).l();
                if (l != null && l.contains(ContactInfo.c(this.a).u)) {
                    list.add(a_9);
                }
            }
            if (i) {
                break;
            }
        }
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new ln(this, list));
        }
    }
    
    private void d() {
        final Bitmap a = ContactInfo.c(this.a).a(640, 0.0f, false);
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new aqb(this, a));
        }
    }
    
    public Void a(final Void[] array) {
        if (!this.isCancelled()) {
            this.d();
        }
        if (!this.isCancelled()) {
            this.a();
        }
        if (!this.isCancelled()) {
            this.c();
        }
        if (!this.isCancelled()) {
            this.b();
        }
        return null;
    }
    
    public void a(final Void void1) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(c5.z[0]);
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
