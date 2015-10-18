// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import com.whatsapp.adc;
import java.util.Iterator;
import java.util.Map;
import android.os.Handler;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.text.format.DateUtils;
import android.os.Build$VERSION;
import com.whatsapp.util.Log;
import android.text.Html;
import android.text.TextUtils;
import com.whatsapp.util.cq;
import com.whatsapp.App;
import com.whatsapp.ConversationRowDivider;
import com.whatsapp.a_9;
import com.whatsapp.protocol.bi;
import android.content.Context;
import java.util.HashMap;

public final class y
{
    public static HashMap a;
    public static HashMap b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[51];
        String s = "\u0000S";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = ')';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'E';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\ud814\udcbfe";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\ud815\udfd6e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\t[";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0000S";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "\ud815\udfc6";
                    n = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    array = z2;
                    s = "\ud814\udcbfe";
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\ud815\udfd7";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\ud814\udc17e";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0000S";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\ud814\udc84e";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\ud814\udc84e";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\t[";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0013S";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\ud815\udfd6e";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "J\u001c(\u0010rA\u00121MdY\u0003\u001aNwL\u0015 L`G\u0010 M";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "G\u001c1Wc@\u0010$JlF\u001djM`],(KqL,,PcF\\#_lE\u0016!";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "G\u001c1Wc@\u0010$JlF\u001djS`Z\u0000$Y`Y\u0001 HlL\u0004jY`]\u001d$S`\t\u0001 Sj]\u0016\u001aL`Z\u001c0LfLS+KiE";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\t3e";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\t3e";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "N\u00161pj]\u001a#WfH\u0007,Qk}\u001a&U`[\\(WvZ\u001a+YZ[\u001e1av[\u0010\u007f";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "J\u001c(\u0010rA\u00121MdY\u0003\u001aNwL\u0015 L`G\u0010 M";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "G\u001c1Wc@\u0010$JlF\u001djKuM\u00121[ZD\u00061[Z@\u001d#Q*O\u0012,R`M";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "G\u001c1Wc@\u0010$JlF\u001djL`Z\u00161ah\\\u0007 alG\u0015*\u0004";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0013S";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0013S";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u0013S";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\t3e";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\t3e";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "D\u00166MdN\u0016\u0015L`_\u001a I*D\u001a6MlG\u0014\u001aLh],6Lf\u0013";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u0013Sy\u0011g\u0017";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u0013S";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0013S";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u0015\u0011{";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0013S";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0013S";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "\u0015\u0011{";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u0013Sy\u0011g\u0017";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 40;
                    n2 = 41;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    array = z2;
                    s = "l!\u0017qW\t\u00065Zd]\u0016!\u001eqA\u0016eSdYS'[cF\u0001 ";
                    n = 41;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\\\u00175_qLS,PcFI";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "J\u001c(\u0010rA\u00121MdY\u0003\u001aNwL\u0015 L`G\u0010 M";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "G\u001c1Wc@\u0010$JlF\u001djKuM\u00121[ZD\u00061[Z@\u001d#Q*O\u0012,R`M";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "D\u00061[Z@\u001d#Q";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "G\u001c1Wc@\u0010$JlF\u001djWk@\u0007\u001aSp]\u0016\u001aWkO\u001c\u007f";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "\t3e";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\t3e";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    break Label_1307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        y.a = new HashMap();
    }
    
    public static u a(final Context context, final bi bi, final a_9 a_9) {
        if (bi == null) {
            return new u("", "");
        }
        if (bi.I == 0) {
            String s = bi.c();
            if (s != null && s.length() > 1024L) {
                s = a(s);
            }
            if (!a_9.m()) {
                return new u(a_9.a(context), s);
            }
            if (bi.c == 6) {
                return new u(a_9.a(context), ConversationRowDivider.a(bi));
            }
            if (bi.t != null) {
                return new u(App.S.e(bi.t).a(context) + y.z[49] + a_9.a(context), s);
            }
            return new u(a_9.a(context), s);
        }
        else {
            final String a = a(context, bi);
            if (!a_9.m() || bi.t == null) {
                return new u(a_9.a(context), a);
            }
            return new u(App.S.e(bi.t).a(context) + y.z[50] + a_9.a(context), a);
        }
    }
    
    public static CharSequence a(final Context context, final bi bi, final a_9 a_9, final boolean b, final boolean b2) {
        String s;
        if (bi == null) {
            s = "";
        }
        else if (bi.I == 0) {
            s = bi.c();
            if (s != null && s.length() > 1024L) {
                s = a(s);
            }
            if (a_9.m()) {
                if (bi.c == 6) {
                    return ConversationRowDivider.a(bi);
                }
                if (b) {
                    if (!bi.a.b) {
                        return a(bi.t, context) + y.z[31] + a_9.a(context) + y.z[29] + s;
                    }
                    return a_9.a(context) + y.z[28] + s;
                }
                else if (b2) {
                    if (!bi.a.b) {
                        return TextUtils.concat(new CharSequence[] { d(cq.a((CharSequence)(a(bi.t, context) + " "))), cq.a((CharSequence)s) });
                    }
                    return TextUtils.concat(new CharSequence[] { d(context.getString(2131231980) + " "), cq.a((CharSequence)s) });
                }
                else {
                    if (!bi.a.b) {
                        return (CharSequence)Html.fromHtml(y.z[36] + a(bi.t, context) + y.z[33] + s);
                    }
                    Log.e(y.z[32] + Log.a(bi));
                    return context.getString(2131230922) + y.z[27] + s;
                }
            }
            else {
                if (b) {
                    return a_9.a(context) + y.z[38] + s;
                }
                if (b2) {
                    if (!bi.a.b) {
                        return TextUtils.concat(new CharSequence[] { d(cq.a((CharSequence)a_9.a(context)) + " "), cq.a((CharSequence)s) });
                    }
                    return TextUtils.concat(new CharSequence[] { d(context.getString(2131231980) + " "), cq.a((CharSequence)s) });
                }
            }
        }
        else {
            s = a(context, bi);
            if (a_9.m()) {
                if (b) {
                    if (!bi.a.b) {
                        return a(bi.t, context) + y.z[30] + a_9.a(context) + y.z[37] + s;
                    }
                    return a_9.a(context) + y.z[34] + s;
                }
                else {
                    if (!b2) {
                        return (CharSequence)Html.fromHtml(y.z[39] + a(bi.t, context) + y.z[40] + s);
                    }
                    if (!bi.a.b) {
                        return TextUtils.concat(new CharSequence[] { d(cq.a((CharSequence)(a(bi.t, context) + " "))), cq.a((CharSequence)s) });
                    }
                    return TextUtils.concat(new CharSequence[] { d(context.getString(2131231980) + " "), cq.a((CharSequence)s) });
                }
            }
            else {
                if (b) {
                    return a_9.a(context) + y.z[35] + s;
                }
                if (b2) {
                    if (!bi.a.b) {
                        return TextUtils.concat(new CharSequence[] { d(cq.a((CharSequence)(a_9.a(context) + " "))), cq.a((CharSequence)s) });
                    }
                    return TextUtils.concat(new CharSequence[] { d(context.getString(2131231980) + " "), cq.a((CharSequence)s) });
                }
            }
        }
        return s;
    }
    
    public static String a(final Context context, final bi bi) {
        final boolean a = PopupNotification.A;
        String s = "";
        Label_0825: {
            switch (bi.I) {
                case 1: {
                    if (Build$VERSION.SDK_INT >= 16) {
                        if (TextUtils.isEmpty((CharSequence)bi.M)) {
                            s = y.z[10] + context.getString(2131230976);
                            if (!a) {
                                return s;
                            }
                        }
                        s = y.z[11] + bi.M;
                        if (!a) {
                            return s;
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence)bi.M)) {
                        s = context.getString(2131230976);
                        if (!a) {
                            return s;
                        }
                    }
                    s = "(" + context.getString(2131230976) + y.z[4] + bi.M;
                    if (a) {
                        break Label_0825;
                    }
                    return s;
                }
                case 2: {
                    if (Build$VERSION.SDK_INT >= 16) {
                        final StringBuilder sb = new StringBuilder();
                        String s2;
                        if (bi.E == 1) {
                            s2 = y.z[7];
                        }
                        else {
                            s2 = y.z[5];
                        }
                        s = sb.append(s2).append(" ").toString();
                    }
                    final StringBuilder append = new StringBuilder().append(s);
                    int n;
                    if (bi.E == 1) {
                        n = 2131230980;
                    }
                    else {
                        n = 2131230970;
                    }
                    s = append.append(context.getString(n)).toString();
                    if (bi.D == 0) {
                        return s;
                    }
                    s = s + y.z[3] + DateUtils.formatElapsedTime((long)bi.D) + ")";
                    if (a) {
                        break Label_0825;
                    }
                    return s;
                }
                case 3: {
                    Label_0493: {
                        if (Build$VERSION.SDK_INT >= 16) {
                            if (TextUtils.isEmpty((CharSequence)bi.M)) {
                                s = y.z[14] + context.getString(2131230979);
                                if (!a) {
                                    break Label_0493;
                                }
                            }
                            s = y.z[2] + bi.M;
                            if (!a) {
                                break Label_0493;
                            }
                        }
                        if (TextUtils.isEmpty((CharSequence)bi.M)) {
                            s = context.getString(2131230979);
                            if (!a) {
                                break Label_0493;
                            }
                        }
                        s = "(" + context.getString(2131230979) + y.z[0] + bi.M;
                    }
                    if (bi.D == 0) {
                        return s;
                    }
                    s = s + y.z[12] + DateUtils.formatElapsedTime((long)bi.D) + ")";
                    if (a) {
                        break Label_0825;
                    }
                    return s;
                }
                case 4: {
                    if (Build$VERSION.SDK_INT >= 16) {
                        s = y.z[8];
                    }
                    s += context.getString(2131230975);
                    if (TextUtils.isEmpty((CharSequence)bi.k)) {
                        return s;
                    }
                    s = s + y.z[13] + bi.k;
                    if (a) {
                        break Label_0825;
                    }
                    return s;
                }
                case 5: {
                    final boolean empty = TextUtils.isEmpty((CharSequence)bi.k);
                    String s3 = null;
                    if (!empty) {
                        final String[] split = bi.k.split("\n");
                        s3 = null;
                        if (split != null) {
                            final int length = split.length;
                            s3 = null;
                            if (length != 0) {
                                s3 = split[0];
                            }
                        }
                    }
                    if (Build$VERSION.SDK_INT >= 16) {
                        if (TextUtils.isEmpty((CharSequence)s3)) {
                            final String s4 = y.z[1] + context.getString(2131230977);
                            if (!a) {
                                return s4;
                            }
                        }
                        final String s4 = y.z[6] + s3;
                        if (!a) {
                            return s4;
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence)s3)) {
                        final String s4 = context.getString(2131230977);
                        if (!a) {
                            return s4;
                        }
                    }
                    s = "(" + context.getString(2131230977) + y.z[9] + s3;
                    if (a) {
                        break Label_0825;
                    }
                    return s;
                }
                case 8: {
                    s = context.getString(2131230971);
                    if (a) {
                        break;
                    }
                    return s;
                }
            }
        }
        s = context.getString(2131230978);
        return s;
    }
    
    private static String a(final String s) {
        return (Object)s.subSequence(0, 1020) + "\u2026";
    }
    
    private static String a(final String s, final Context context) {
        if (s == null) {
            Log.w(y.z[18]);
            return "";
        }
        return App.S.e(s).a(context);
    }
    
    public static void a() {
        y.a.clear();
    }
    
    private static void a(final Context context) {
        final boolean a = PopupNotification.A;
        y.b = new HashMap();
        final SharedPreferences sharedPreferences = context.getSharedPreferences(y.z[44], 0);
        final String string = sharedPreferences.getString(y.z[47], "");
        Log.i(y.z[48] + string);
        if (string.length() > 0) {
            final String[] split = string.split(",");
            int i = -1 + split.length;
            int n = 0;
            while (i >= 0) {
                final String s = split[i];
                Label_0242: {
                    if (s.length() > 1) {
                        final String[] split2 = s.split("#");
                        if (App.S.c(split2[0]) != null) {
                            if (y.b.containsKey(split2[0])) {
                                Log.e(y.z[42]);
                                if (!a) {
                                    n = 1;
                                    break Label_0242;
                                }
                                n = 1;
                            }
                            if (split2.length >= 3) {
                                y.b.put(split2[0], new x(Long.parseLong(split2[1]), Boolean.parseBoolean(split2[2])));
                                if (!a) {
                                    break Label_0242;
                                }
                            }
                            y.b.put(split2[0], new x(Long.parseLong(split2[1]), true));
                            if (!a) {
                                break Label_0242;
                            }
                        }
                        n = 1;
                    }
                }
                --i;
                if (a) {
                    break;
                }
            }
            if (n != 0) {
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                final String b = b();
                Label_0310: {
                    if (y.b.isEmpty()) {
                        edit.remove(y.z[41]);
                        if (!a) {
                            break Label_0310;
                        }
                    }
                    edit.putString(y.z[46], b);
                }
                Log.e(y.z[43] + b);
                if (!edit.commit()) {
                    Log.e(y.z[45]);
                }
            }
        }
    }
    
    public static void a(final Context context, final String s, final long n, final boolean b) {
        a(context, s, n, b, true);
    }
    
    public static void a(final Context context, final String s, final long n, final boolean b, final boolean b2) {
        if (y.b == null) {
            a(context);
        }
        y.b.put(s, new x(n, b));
        final SharedPreferences$Editor edit = context.getSharedPreferences(y.z[15], 0).edit();
        edit.putString(y.z[17], b());
        if (!edit.commit()) {
            Log.e(y.z[16]);
        }
        App.d(s);
        if (b2) {
            App.a(5, s, n);
        }
    }
    
    public static void a(final Context context, final String s, final boolean b) {
        if (y.b == null) {
            a(context);
        }
        if (y.b.remove(s) != null) {
            final SharedPreferences$Editor edit = context.getSharedPreferences(y.z[22], 0).edit();
            final String b2 = b();
            Label_0089: {
                if (y.b.isEmpty()) {
                    edit.remove(y.z[25]);
                    if (!PopupNotification.A) {
                        break Label_0089;
                    }
                }
                edit.putString(y.z[23], b2);
            }
            Log.i(y.z[26] + b2);
            if (!edit.commit()) {
                Log.e(y.z[24]);
            }
            new Handler(context.getMainLooper()).post((Runnable)new ah(s));
            if (b) {
                App.a(6, s);
            }
        }
    }
    
    public static boolean a(final Context context, final String s) {
        return d(context, s) || b(s);
    }
    
    private static String b() {
        final boolean a = PopupNotification.A;
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : y.b.entrySet()) {
            final String s = entry.getKey();
            final x x = (x)entry.getValue();
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(s).append('#').append(x.b);
            if (!x.a) {
                sb.append('#').append(Boolean.toString(false));
            }
            if (a) {
                break;
            }
        }
        return sb.toString();
    }
    
    public static String b(final Context context, final bi bi, final a_9 a_9) {
        final boolean a = PopupNotification.A;
        if (!a_9.m()) {
            final String s = context.getString(2131231434, new Object[] { a_9.a(context) });
            if (!a) {
                return cq.a((CharSequence)s);
            }
        }
        if (bi.c == 6) {
            final String s = ConversationRowDivider.a(bi);
            if (!a) {
                return cq.a((CharSequence)s);
            }
        }
        String s2 = null;
        Label_0184: {
            if (bi.t != null) {
                s2 = App.S.e(bi.t).a(context) + y.z[20] + a_9.a(context);
                if (!a) {
                    break Label_0184;
                }
            }
            Log.e(y.z[21] + Log.a(bi));
            s2 = context.getString(2131230922) + y.z[19] + a_9.a(context);
        }
        final String s = context.getString(2131231434, new Object[] { s2 });
        return cq.a((CharSequence)s);
    }
    
    public static void b(final Context context, final String s) {
        a(context, s, true);
    }
    
    public static boolean b(final String s) {
        final Long n = y.a.get(s);
        if (n == null) {
            return false;
        }
        if (n <= System.currentTimeMillis()) {
            y.a.remove(s);
            return false;
        }
        return true;
    }
    
    public static void c(final String s) {
        y.a.put(s, System.currentTimeMillis() + Math.min(30000L + 5000L * adc.a(s).j() - 1L, 120000L));
    }
    
    public static boolean c(final Context context, final String s) {
        if (y.b == null) {
            a(context);
        }
        if (y.b.containsKey(s)) {
            if (y.b.get(s).b > System.currentTimeMillis()) {
                return y.b.get(s).a;
            }
            b(context, s);
        }
        return true;
    }
    
    private static CharSequence d(final String s) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence)s);
        spannableStringBuilder.setSpan((Object)new StyleSpan(1), 0, s.length(), 0);
        return (CharSequence)spannableStringBuilder;
    }
    
    public static boolean d(final Context context, final String s) {
        return e(context, s) != 0L;
    }
    
    public static long e(final Context context, final String s) {
        if (y.b == null) {
            a(context);
        }
        if (y.b.containsKey(s)) {
            final long b = y.b.get(s).b;
            if (b > System.currentTimeMillis()) {
                return b;
            }
            b(context, s);
        }
        return 0L;
    }
}
