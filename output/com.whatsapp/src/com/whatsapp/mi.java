// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Matcher;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import android.app.PendingIntent;

class mi implements kf
{
    private static final String[] z;
    final AccountInfoActivity a;
    
    static {
        final String[] z2 = new String[5];
        String s = "8Rd\tO|`'PKxf<T";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
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
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014H9\n\u001a5Od\u001c\u0002$\u0015y\u0018\u0006";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5Xt\u0012\u0007:O:\u0014\u001c2T8\r\u0013-Vr\u0013\u0006yTu\u000e\u0017&Mr\u000f]1W~\u001a\u001b6R{\u0014\u0006-\u0014~\u0013\u00178Rp\u0014\u00108^7";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0014H9\n\u001a5Od\u001c\u0002$\u0015y\u0018\u0006";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "5Xt\u0012\u0007:O:\u0014\u001c2T8\r\u0013-Vr\u0013\u0006yTu\u000e\u0017&Mr\u000f]1W~\u001a\u001b6R{\u0014\u0006-\u0014r\u000f\u0000;I7";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    mi(final AccountInfoActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        AccountInfoActivity.o(this.a).sendEmptyMessage(3);
    }
    
    @Override
    public void a(final int n) {
        AccountInfoActivity.o(this.a).sendMessage(AccountInfoActivity.o(this.a).obtainMessage(7, n, 0));
    }
    
    @Override
    public void a(final PendingIntent pendingIntent) {
        AccountInfoActivity.o(this.a).sendMessage(AccountInfoActivity.o(this.a).obtainMessage(6, 0, 0, (Object)pendingIntent));
    }
    
    @Override
    public void a(final g2 g2) {
        int n = 1;
        final boolean i = App.I;
        final String c = g2.c();
        int n2 = 0;
        Label_0059: {
            if ("1".equals(c)) {
                if (!i) {
                    n2 = n;
                    break Label_0059;
                }
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if ("3".equals(c)) {
                n2 = 3;
                if (!i) {
                    break Label_0059;
                }
            }
            if ("5".equals(c)) {
                n2 = 5;
            }
        }
        final String e = g2.e();
        String s;
        if (e != null) {
            final Matcher matcher = Pattern.compile(mi.z[0]).matcher(e);
            if (matcher.find()) {
                final String[] split = matcher.group(n).split(",");
                if (split.length != n) {
                    n = 0;
                }
                Log.b(n != 0);
                s = split[0];
            }
            else {
                s = e;
            }
        }
        else {
            s = null;
        }
        AccountInfoActivity.o(this.a).sendMessage(AccountInfoActivity.o(this.a).obtainMessage(4, n2, 0, (Object)s));
    }
    
    @Override
    public void a(final Integer n, final String[] array) {
        final boolean i = App.I;
        AccountInfoActivity.o(this.a).removeMessages(10);
        this.a.c();
        if (n != null) {
            Log.e(mi.z[4] + n);
            this.a.a(2131231044);
            AccountInfoActivity.a(this.a, (Runnable)null);
            if (!i) {
                return;
            }
        }
        if (array.length > 0 && !TextUtils.isEmpty((CharSequence)array[0])) {
            final String s = array[0];
            AccountInfoActivity.a(this.a, s.substring(0, s.length() - mi.z[1].length()));
            AccountInfoActivity.b(this.a, AccountInfoActivity.i(this.a));
            if (AccountInfoActivity.c(this.a) != null) {
                AccountInfoActivity.c(this.a).run();
            }
            if (!i) {
                return;
            }
        }
        Log.i(mi.z[2] + AccountInfoActivity.i(this.a));
        final a_9 e = App.S.e(AccountInfoActivity.i(this.a) + mi.z[3]);
        String s2;
        if (e == null) {
            s2 = a_9.a(AccountInfoActivity.i(this.a));
        }
        else {
            s2 = e.a((Context)this.a);
        }
        this.a.a(2131231045, new String[] { s2 });
        AccountInfoActivity.a(this.a, (Runnable)null);
    }
}
