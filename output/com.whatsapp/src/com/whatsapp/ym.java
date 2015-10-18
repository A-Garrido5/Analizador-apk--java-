// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.text.TextUtils;
import java.util.Hashtable;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

public class ym
{
    public static boolean a;
    public static int b;
    public static int c;
    public static boolean d;
    public static int e;
    public static int f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static boolean o;
    public static int p;
    private static final String[] z;
    
    static {
        int n = -1;
        final String[] z2 = new String[34];
        int n2 = 0;
        String[] array = z2;
        String s = "/-mP\u0000-\u0016zW\u0017*%z]";
        int n3 = n;
        String z3 = null;
    Label_0858:
        while (true) {
            z3 = z(z(s));
            switch (n3) {
                default: {
                    array[n2] = z3;
                    s = "$&|X\u0002!&qf\u0013&(}U\u0013,";
                    n2 = 1;
                    array = z2;
                    n3 = 0;
                    continue;
                }
                case 0: {
                    array[n2] = z3;
                    s = "*;pX\u0012+(lM)$ lM); e\\)$ rP\u0002";
                    n2 = 2;
                    array = z2;
                    n3 = 1;
                    continue;
                }
                case 1: {
                    array[n2] = z3;
                    n2 = 3;
                    array = z2;
                    s = "!$~^\u0013\u0017$~A)--x\\";
                    n3 = 2;
                    continue;
                }
                case 2: {
                    array[n2] = z3;
                    n2 = 4;
                    s = "%(gf\u0011:&jI\u0005";
                    n3 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = z3;
                    s = ";,mO\u0013:\u0016oK\u00198:%U\u0017;=@O\u0013::vV\u0018";
                    n3 = 4;
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = z3;
                    n2 = 6;
                    array = z2;
                    s = "$&|X\u0002!&q";
                    n3 = 5;
                    continue;
                }
                case 5: {
                    array[n2] = z3;
                    n2 = 7;
                    s = "-{zf\u0011:&jI\u0005";
                    n3 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = z3;
                    n2 = 8;
                    s = "%,{P\u0017\u0017%vT\u001f<\u0016r[";
                    n3 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = z3;
                    n2 = 9;
                    s = "!$~^\u0013\u0017$~A)#+fM\u0013;";
                    n3 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = z3;
                    n2 = 10;
                    s = "!$~^\u0013\u0017$~A)--x\\";
                    n3 = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = z3;
                    n2 = 11;
                    s = "8%~P\u0018<,gM):,zW\u0017*%zf\u0002 ;zJ\u001e'%{";
                    n3 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = z3;
                    n2 = 12;
                    s = "%(gf\u0006);kP\u0015!9~W\u0002;";
                    n3 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = z3;
                    n2 = 13;
                    s = "8%~P\u0018<,gM), lX\u0014$,{";
                    n3 = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = z3;
                    n2 = 14;
                    s = ");|Q\u001f>,";
                    n3 = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = z3;
                    n2 = 15;
                    s = "%,{P\u0017";
                    n3 = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = z3;
                    n2 = 16;
                    s = "8(mM\u001f+ oX\u0018<:@J\u001f2,@U\u001f% k";
                    n3 = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = z3;
                    n2 = 17;
                    s = ";<}S\u0013+=@U\u0013&.kQ)$ rP\u0002";
                    n3 = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = z3;
                    n2 = 18;
                    s = "+&r\u0017\u0001 (kJ\u001789@I\u0004-/zK\u0013&*zJ";
                    n3 = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = z3;
                    n2 = 19;
                    s = "!$~^\u0013\u00178jX\u001a!=f";
                    n3 = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = z3;
                    n2 = 20;
                    s = "8%~P\u0018<,gM):,zW\u0017*%zf\u0002 ;zJ\u001e'%{";
                    n3 = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = z3;
                    n2 = 21;
                    s = "/;pL\u0006\u0017'jT\u0014-;@U\u001f% k";
                    n3 = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = z3;
                    n2 = 22;
                    s = "!$~^\u0013\u0017$~A)#+fM\u0013;";
                    n3 = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = z3;
                    n2 = 23;
                    s = "8%~P\u0018<,gM), lX\u0014$,{";
                    n3 = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = z3;
                    n2 = 24;
                    s = "%(gf\u001a!:kf\u0004-*vI\u001f-'kJ";
                    n3 = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = z3;
                    n2 = 25;
                    s = "!$~^\u0013\u00178jX\u001a!=f";
                    n3 = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = z3;
                    n2 = 26;
                    s = "/;pL\u0006;\u0016l\\\u0004>,mf\u0006:&oJ)$(lM):,yK\u0013;!@M\u001f%,";
                    n3 = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = z3;
                    n2 = 27;
                    s = ";,mO\u0013:9mV\u0006;fpW%-;i\\\u0004\u0018;pI\u0013:=v\\\u0005g/~P\u001a--";
                    n3 = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = z3;
                    n2 = 28;
                    s = "%:o\\\u0005";
                    n3 = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = z3;
                    n2 = 29;
                    s = "%,lJ\u0017/,lf\u0005<(mM)8,q]\u001f&.@\\D-\u0016l\\\u0005; pW";
                    n3 = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = z3;
                    n2 = 30;
                    s = "%(gf\u0005=+u\\\u0015<";
                    n3 = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = z3;
                    n2 = 31;
                    s = "-{zf\u0011:&jI\u0005";
                    n3 = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = z3;
                    n2 = 32;
                    s = ".&mZ\u0013\u0017%pW\u0011\u0017*pW\u0018-*k";
                    n3 = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = z3;
                    n2 = 33;
                    s = ".&mZ\u0013\u0017%pW\u0011\u0017*pW\u0018-*k";
                    n3 = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    break Label_0858;
                }
            }
        }
        array[n2] = z3;
        z = z2;
        ym.e = 9999;
        ym.c = 50;
        ym.m = 25;
        ym.b = 256;
        ym.k = 16;
        ym.g = false;
        ym.l = 5120;
        ym.p = 80;
        ym.j = 1280;
        ym.h = true;
        ym.n = 5;
        ym.d = true;
        ym.i = false;
        ym.o = (App.aV >= 2);
        ym.a = false;
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(z(z("+&r\u0017\u0001 (kJ\u001789@I\u0004-/zK\u0013&*zJ")), 0);
        String s2 = ";,mO\u0013:\u0016oK\u00198:%U\u0017;=@O\u0013::vV\u0018";
        SharedPreferences sharedPreferences2 = sharedPreferences;
        int n4 = n;
        String z4 = null;
    Label_1091:
        while (true) {
            z4 = z(z(s2));
            switch (n4) {
                default: {
                    ym.f = sharedPreferences2.getInt(z4, 0);
                    s2 = "/;pL\u0006\u0017'jT\u0014-;@U\u001f% k";
                    sharedPreferences2 = sharedPreferences;
                    n4 = 0;
                    continue;
                }
                case 14: {
                    break Label_1091;
                }
                case 0: {
                    ym.e = sharedPreferences2.getInt(z4, ym.e);
                    s2 = "8(mM\u001f+ oX\u0018<:@J\u001f2,@U\u001f% k";
                    sharedPreferences2 = sharedPreferences;
                    n4 = 1;
                    continue;
                }
                case 1: {
                    ym.c = sharedPreferences2.getInt(z4, ym.c);
                    s2 = ";<}S\u0013+=@U\u0013&.kQ)$ rP\u0002";
                    sharedPreferences2 = sharedPreferences;
                    n4 = 2;
                    continue;
                }
                case 2: {
                    ym.m = sharedPreferences2.getInt(z4, ym.m);
                    s2 = "%,{P\u0017\u0017%vT\u001f<\u0016r[";
                    n4 = 3;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 3: {
                    ym.k = sharedPreferences2.getInt(z4, ym.k);
                    s2 = "*;pX\u0012+(lM)$ lM); e\\)$ rP\u0002";
                    n4 = 4;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 4: {
                    ym.b = sharedPreferences2.getInt(z4, ym.b);
                    s2 = "$&|X\u0002!&qf\u0013&(}U\u0013,";
                    sharedPreferences2 = sharedPreferences;
                    n4 = 5;
                    continue;
                }
                case 5: {
                    ym.g = sharedPreferences2.getBoolean(z4, ym.g);
                    s2 = "!$~^\u0013\u0017$~A)#+fM\u0013;";
                    n4 = 6;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 6: {
                    ym.l = sharedPreferences2.getInt(z4, ym.l);
                    s2 = "!$~^\u0013\u00178jX\u001a!=f";
                    n4 = 7;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 7: {
                    ym.p = sharedPreferences2.getInt(z4, ym.p);
                    s2 = "!$~^\u0013\u0017$~A)--x\\";
                    n4 = 8;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 8: {
                    ym.j = sharedPreferences2.getInt(z4, ym.j);
                    s2 = "8%~P\u0018<,gM), lX\u0014$,{";
                    n4 = 9;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 9: {
                    ym.h = sharedPreferences2.getBoolean(z4, ym.h);
                    s2 = "8%~P\u0018<,gM):,zW\u0017*%zf\u0002 ;zJ\u001e'%{";
                    n4 = 10;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 10: {
                    ym.n = sharedPreferences2.getInt(z4, ym.n);
                    s2 = "%,lJ\u0017/,lf\u0005<(mM)8,q]\u001f&.@\\D-\u0016l\\\u0005; pW";
                    n4 = 11;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 11: {
                    ym.d = sharedPreferences2.getBoolean(z4, ym.d);
                    s2 = "/-mP\u0000-\u0016zW\u0017*%z]";
                    n4 = 12;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 12: {
                    ym.i = sharedPreferences2.getBoolean(z4, ym.i);
                    s2 = "-{zf\u0011:&jI\u0005";
                    n4 = 13;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
                case 13: {
                    ym.o = sharedPreferences2.getBoolean(z4, ym.o);
                    s2 = ".&mZ\u0013\u0017%pW\u0011\u0017*pW\u0018-*k";
                    n4 = 14;
                    sharedPreferences2 = sharedPreferences;
                    continue;
                }
            }
        }
        ym.a = sharedPreferences2.getBoolean(z4, ym.a);
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        String s3 = "9;@\\\u0018)+s\\\u0012";
        SharedPreferences$Editor sharedPreferences$Editor = edit;
        String z5 = null;
    Label_1650:
        while (true) {
            z5 = z(z(s3));
            switch (n) {
                default: {
                    sharedPreferences$Editor.remove(z5);
                    s3 = "+(sU))%sV\u0001--";
                    sharedPreferences$Editor = edit;
                    n = 0;
                    continue;
                }
                case 0: {
                    sharedPreferences$Editor.remove(z5);
                    s3 = "+(sU";
                    n = 1;
                    sharedPreferences$Editor = edit;
                    continue;
                }
                case 1: {
                    sharedPreferences$Editor.remove(z5);
                    s3 = "/;pL\u0006;\u0016i\u000b)-'~[\u001a--";
                    n = 2;
                    sharedPreferences$Editor = edit;
                    continue;
                }
                case 2: {
                    break Label_1650;
                }
            }
        }
        sharedPreferences$Editor.remove(z5);
        edit.commit();
    }
    
    public static void a(final int f, final Hashtable hashtable) {
        int a = 1;
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(ym.z[18], 0).edit();
        ym.f = f;
        edit.putInt(ym.z[5], f);
        final String s = hashtable.get(ym.z[12]);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            ym.c = -1 + Integer.parseInt(s);
            edit.putInt(ym.z[16], ym.c);
        }
        final String s2 = hashtable.get(ym.z[30]);
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            ym.m = Integer.parseInt(s2);
            edit.putInt(ym.z[17], ym.m);
        }
        final String s3 = hashtable.get(ym.z[4]);
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            ym.e = Integer.parseInt(s3);
            edit.putInt(ym.z[21], ym.e);
        }
        final String s4 = hashtable.get(ym.z[15]);
        if (!TextUtils.isEmpty((CharSequence)s4)) {
            ym.k = Integer.parseInt(s4);
            edit.putInt(ym.z[8], ym.k);
        }
        final String s5 = hashtable.get(ym.z[24]);
        if (!TextUtils.isEmpty((CharSequence)s5)) {
            final int int1 = Integer.parseInt(s5);
            if (int1 != ym.b) {
                ym.b = int1;
                edit.putInt(ym.z[2], ym.b);
            }
        }
        final String s6 = hashtable.get(ym.z[6]);
        if (!TextUtils.isEmpty((CharSequence)s6)) {
            int g;
            if (Integer.parseInt(s6) != 0) {
                g = a;
            }
            else {
                g = 0;
            }
            if (g != (ym.g ? 1 : 0)) {
                ym.g = (g != 0);
                edit.putBoolean(ym.z[a], ym.g);
            }
        }
        final String s7 = hashtable.get(ym.z[22]);
        if (!TextUtils.isEmpty((CharSequence)s7)) {
            ym.l = Integer.parseInt(s7);
            edit.putInt(ym.z[9], ym.l);
        }
        final String s8 = hashtable.get(ym.z[19]);
        if (!TextUtils.isEmpty((CharSequence)s8)) {
            ym.p = Integer.parseInt(s8);
            edit.putInt(ym.z[25], ym.p);
        }
        final String s9 = hashtable.get(ym.z[3]);
        if (!TextUtils.isEmpty((CharSequence)s9)) {
            ym.j = Integer.parseInt(s9);
            edit.putInt(ym.z[10], ym.j);
        }
        final String s10 = hashtable.get(ym.z[23]);
        int h;
        if (!TextUtils.isEmpty((CharSequence)s10)) {
            if (Integer.parseInt(s10) != 0) {
                h = a;
            }
            else {
                h = 0;
            }
        }
        else {
            h = 0;
        }
        if (h != (ym.h ? 1 : 0)) {
            ym.h = (h != 0);
            edit.putBoolean(ym.z[13], ym.h);
        }
        final String s11 = hashtable.get(ym.z[11]);
        if (!TextUtils.isEmpty((CharSequence)s11)) {
            ym.n = Integer.parseInt(s11);
            edit.putInt(ym.z[20], ym.n);
        }
        final String s12 = hashtable.get(ym.z[28]);
        int d;
        if (!TextUtils.isEmpty((CharSequence)s12)) {
            if (Integer.parseInt(s12) != 0) {
                d = a;
            }
            else {
                d = 0;
            }
        }
        else {
            d = 0;
        }
        if (d != (ym.d ? 1 : 0)) {
            ym.d = (d != 0);
            edit.putBoolean(ym.z[29], ym.d);
        }
        final String s13 = hashtable.get(ym.z[7]);
        final boolean o = ym.o;
        int o2;
        if (!TextUtils.isEmpty((CharSequence)s13)) {
            if (Integer.parseInt(s13) != 0) {
                o2 = a;
            }
            else {
                o2 = 0;
            }
        }
        else {
            o2 = (o ? 1 : 0);
        }
        if (o2 != (ym.o ? 1 : 0)) {
            ym.o = (o2 != 0);
            edit.putBoolean(ym.z[31], ym.o);
        }
        final String s14 = hashtable.get(ym.z[14]);
        if (!TextUtils.isEmpty((CharSequence)s14)) {
            int i;
            if (Integer.parseInt(s14) != 0) {
                i = a;
            }
            else {
                i = 0;
            }
            if (i != (ym.i ? 1 : 0)) {
                ym.i = (i != 0);
                edit.putBoolean(ym.z[0], ym.i);
            }
        }
        final String s15 = hashtable.get(ym.z[32]);
        if (!TextUtils.isEmpty((CharSequence)s15)) {
            if (Integer.parseInt(s15) == 0) {
                a = 0;
            }
            if (a != (ym.a ? 1 : 0)) {
                ym.a = (a != 0);
                edit.putBoolean(ym.z[33], ym.a);
            }
        }
        edit.putLong(ym.z[26], System.currentTimeMillis());
        if (!edit.commit()) {
            Log.e(ym.z[27]);
        }
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = 'H';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = '\u001f';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= 'v';
        }
        return charArray;
    }
}
