// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Arrays;
import com.whatsapp.protocol.bt;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.ArrayList;
import com.whatsapp.protocol.ce;

public class dt implements ce
{
    public static final dt c;
    private static final String[] z;
    private final ArrayList a;
    private Runnable b;
    private final ArrayList d;
    private HashMap e;
    private final HashMap f;
    private final Object g;
    
    static {
        final String[] z2 = new String[30];
        String s = "\u0002ls?RR1";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0782:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\'';
                        break;
                    }
                    case 0: {
                        c3 = '\"';
                        break;
                    }
                    case 1: {
                        c3 = '\u000b';
                        break;
                    }
                    case 2: {
                        c3 = '\u0001';
                        break;
                    }
                    case 3: {
                        c3 = 'P';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ndb1SKdo#JEy.?Irjs$NAbq1IVXu1UVne\u0003OCyh>@ndb1SKdo\u007f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0002ls?RR1";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Ndb1SKdo#JEy.?Irjs$NAbq1IVXu?WRne\u0003OCyh>@ndb1SKdo\u007f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "Ndb1SKdo#JEy.?Irjs$NAbq1IVGn3FVbn>\b";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Ndb1SKdo#JEy.%WFju5xQnu$NLlrj";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Ndb1SKdo#JEy.9IK\u007f^#BV\u007fh>@Q1";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Ndb1SKdo#JEy.%WFju5xQnu$NLlr\u007fACbm5C";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Adl~PJju#FR{^ UGmd\"BLhd#";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 10;
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = z2;
                    s = "Ndb1SKdo#JEy.9IK\u007f^#BV\u007fh>@Q+f\"HW{!>HV+d(WGhu5C";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Ndb1SKdo#JEy.?Irjs$NAbq1IVxR8FPbo7kMh`$NMe.";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Ndb1SKdo#JEy.?Irjs$NAbq1IVxR8FPbo7kMh`$NMe.:NF1";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "Ndb1SKdo#JEy.#BV\u007fh>@Q$s5TG\u007f.6FKgd4";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "Adl~PJju#FR{^ UGmd\"BLhd#";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "Adl~PJju#FR{/\u0003OCyd\u001cHAju9HLXd\"QKhd~tvJS\u0004";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "Ndb1SKdo#JEy.?Iq\u007f`\"Sndb1SKdo\u0002BRds$NLl.";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "Ndb1SKdo#JEy.?Iq\u007f`\"Sndb1SKdo\u0002BRds$NLl.";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0002ot\"FVbn>\u001d";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "F~s1SKdo";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0002oh#F@gd4";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "Adl~PJju#FR{/\u0003OCyd\u001cHAju9HLXd\"QKhd~tvDQ";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "Ndb1SKdo#JEy.?Iq\u007fn kMh`$NMeS5WMyu9IE";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "Adl~PJju#FR{^ UGmd\"BLhd#";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "Ndb1SKdo\u000fTJjs9IE";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "Ndb1SKdo#JEy.#BV\u007fh>@Q$g1NNne";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    break Label_0782;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        c = new dt();
    }
    
    public dt() {
        this.f = new HashMap();
        this.d = new ArrayList();
        this.a = new ArrayList();
        this.g = new Object();
        this.b = new ob(this);
    }
    
    static ArrayList a(final dt dt) {
        return dt.a;
    }
    
    private void b() {
        final boolean i = App.I;
        this.e = new HashMap();
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(dt.z[9], 0);
        final String string = sharedPreferences.getString(dt.z[8], "");
        Log.i(dt.z[6] + string);
        if (string.length() > 0) {
            final String[] split = string.split(",");
            int j = -1 + split.length;
            int n = 0;
            while (j >= 0) {
                final String s = split[j];
                Label_0217: {
                    if (s.length() > 1) {
                        final String[] split2 = s.split("#");
                        if (App.S.c(split2[0]) != null) {
                            if (this.e.containsKey(split2[0])) {
                                Log.e(dt.z[12] + split2[0]);
                                if (!i) {
                                    n = 1;
                                    break Label_0217;
                                }
                                n = 1;
                            }
                            this.e.put(split2[0], Long.parseLong(split2[1]));
                            if (!i) {
                                break Label_0217;
                            }
                        }
                        n = 1;
                    }
                }
                --j;
                if (i) {
                    break;
                }
            }
            if (n != 0) {
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                final String d = this.d();
                Label_0287: {
                    if (this.e.isEmpty()) {
                        edit.remove(dt.z[10]);
                        if (!i) {
                            break Label_0287;
                        }
                    }
                    edit.putString(dt.z[11], d);
                }
                Log.e(dt.z[5] + d);
                if (!edit.commit()) {
                    Log.e(dt.z[7]);
                }
            }
        }
        this.c();
    }
    
    static void b(final dt dt) {
        dt.c();
    }
    
    static Object c(final dt dt) {
        return dt.g;
    }
    
    private void c() {
        while (true) {
            final boolean i = App.I;
            App.aq.a5().removeCallbacks(this.b);
            Long n = null;
        Label_0090_Outer:
            while (true) {
                Long n2 = null;
                while (true) {
                    Label_0158: {
                        Label_0146: {
                            Label_0140: {
                                synchronized (this.g) {
                                    final Iterator<Map.Entry<K, Long>> iterator = this.e.entrySet().iterator();
                                    if (!iterator.hasNext()) {
                                        break Label_0146;
                                    }
                                    n2 = iterator.next().getValue();
                                    if (n == null) {
                                        break Label_0158;
                                    }
                                    if (n2 < n) {
                                        break Label_0158;
                                    }
                                    break Label_0140;
                                    while (true) {
                                        App.aq.a5().postDelayed(this.b, n2 - System.currentTimeMillis());
                                        Label_0132: {
                                            return;
                                        }
                                        continue Label_0090_Outer;
                                    }
                                }
                                // monitorexit(this.g)
                                // iftrue(Label_0132:, n2 == null || n2.longValue() <= System.currentTimeMillis())
                            }
                            n2 = n;
                            break Label_0158;
                        }
                        n2 = n;
                        continue;
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                n = n2;
                continue Label_0090_Outer;
            }
        }
    }
    
    private String d() {
        final boolean i = App.I;
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, V> entry : this.e.entrySet()) {
            final String s = entry.getKey();
            final Long n = (Long)entry.getValue();
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(s).append('#').append(n);
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    static HashMap d(final dt dt) {
        return dt.e;
    }
    
    @Override
    public int a(final String s, final long n) {
        Log.i(dt.z[20] + s + dt.z[22] + n);
        if (this.a(s)) {
            final Intent intent = new Intent((Context)App.aq, (Class)LocationSharingService.class);
            intent.setAction(dt.z[19]);
            intent.putExtra(dt.z[23], n);
            App.aq.startService(intent);
            return 0;
        }
        Log.w(dt.z[21] + s + dt.z[24]);
        return 401;
    }
    
    @Override
    public void a() {
        Log.i(dt.z[26]);
        final Intent intent = new Intent((Context)App.aq, (Class)LocationSharingService.class);
        intent.setAction(dt.z[25]);
        App.aq.startService(intent);
    }
    
    public void a(final gt gt) {
        this.a.remove(gt);
    }
    
    public void a(final i4 i4) {
        if (!this.d.contains(i4)) {
            this.d.add(i4);
        }
    }
    
    @Override
    public void a(final bt bt) {
        while (true) {
            final boolean i = App.I;
            Log.i(dt.z[4] + bt);
        Label_0173_Outer:
            while (true) {
            Label_0075_Outer:
                while (true) {
                Label_0226:
                    while (true) {
                        synchronized (this.f) {
                            final Iterator<ArrayList<bt>> iterator = this.f.values().iterator();
                            if (!iterator.hasNext()) {
                                // monitorexit(this.f)
                                final Iterator<i4> iterator2 = this.d.iterator();
                                while (iterator2.hasNext()) {
                                    iterator2.next().a(bt);
                                    if (i) {
                                        break;
                                    }
                                }
                                return;
                            }
                            final Iterator<bt> iterator3 = iterator.next().iterator();
                            if (!iterator3.hasNext()) {
                                break Label_0226;
                            }
                            final bt bt2 = iterator3.next();
                            if (bt2.e.equals(bt.e)) {
                                bt2.f = bt.f;
                                bt2.c = bt.c;
                                bt2.a = bt.a;
                                bt2.h = bt.h;
                                bt2.i = bt.i;
                                bt2.d = bt.d;
                                if (!i) {
                                    break Label_0226;
                                }
                            }
                        }
                        if (!i) {
                            continue;
                        }
                        break;
                    }
                    if (i) {
                        continue Label_0075_Outer;
                    }
                    break;
                }
                continue Label_0173_Outer;
            }
        }
    }
    
    public void a(final String s, final long n) {
        synchronized (this.g) {
            if (this.e == null) {
                this.b();
            }
            this.e.put(s, n);
            final SharedPreferences$Editor edit = App.aq.getSharedPreferences(dt.z[27], 0).edit();
            edit.putString(dt.z[28], this.d());
            if (!edit.commit()) {
                Log.e(dt.z[29]);
            }
            // monitorexit(this.g)
            this.c();
            App.aq.a5().post((Runnable)new ca(this, s));
        }
    }
    
    @Override
    public void a(final String s, final String s2) {
        while (true) {
            final boolean i = App.I;
            Log.i(dt.z[3] + s2 + dt.z[2] + s);
        Label_0124_Outer:
            while (true) {
                while (true) {
                    Label_0176: {
                        synchronized (this.f) {
                            final ArrayList<bt> list = this.f.get(s);
                            if (list != null) {
                                final Iterator<bt> iterator = list.iterator();
                                if (iterator.hasNext()) {
                                    final bt bt = iterator.next();
                                    if (!bt.e.equals(s2)) {
                                        break Label_0176;
                                    }
                                    list.remove(bt);
                                    if (i) {
                                        break Label_0176;
                                    }
                                }
                            }
                            // monitorexit(this.f)
                            final Iterator<i4> iterator2 = this.d.iterator();
                            while (iterator2.hasNext()) {
                                iterator2.next().b(s, s2);
                                if (i) {
                                    break;
                                }
                            }
                            return;
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0124_Outer;
            }
        }
    }
    
    @Override
    public void a(final String s, final bt[] array) {
        while (true) {
            final boolean i = App.I;
            Log.i(dt.z[13] + s + " " + array.length);
            while (true) {
                synchronized (this.f) {
                    ArrayList<bt> list = this.f.get(s);
                    Label_0097: {
                        if (list == null) {
                            list = new ArrayList<bt>();
                            this.f.put(s, list);
                            if (!i) {
                                break Label_0097;
                            }
                        }
                        list.clear();
                    }
                    list.addAll(Arrays.asList(array));
                    final Iterator<bt> iterator = list.iterator();
                    if (!iterator.hasNext()) {
                        return;
                    }
                    final bt bt = iterator.next();
                    Log.i(dt.z[14] + bt.e + " " + bt.a());
                    if (bt.a()) {
                        final Iterator<i4> iterator2 = (Iterator<i4>)this.d.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().a(bt);
                            if (i) {
                                break;
                            }
                        }
                    }
                }
                if (i) {
                    return;
                }
                continue;
            }
        }
    }
    
    public boolean a(final String s) {
        synchronized (this.g) {
            if (this.e == null) {
                this.b();
            }
            if (this.e.containsKey(s)) {
                final long longValue = this.e.get(s);
                if (longValue == 0L || longValue > System.currentTimeMillis()) {
                    return true;
                }
                this.c(s);
            }
            return false;
        }
    }
    
    public ArrayList b(final String s) {
        while (true) {
            final boolean i = App.I;
            while (true) {
                final ArrayList<bt> list;
                Label_0114: {
                    synchronized (this.f) {
                        list = new ArrayList<bt>();
                        final ArrayList<bt> list2 = this.f.get(s);
                        if (list2 != null) {
                            final Iterator<bt> iterator = list2.iterator();
                            if (iterator.hasNext()) {
                                final bt bt = iterator.next();
                                if (bt.a() && 7200000L + bt.d > System.currentTimeMillis()) {
                                    list.add(bt);
                                }
                                break Label_0114;
                            }
                        }
                        return list;
                    }
                }
                if (i) {
                    return list;
                }
                continue;
            }
        }
    }
    
    public void b(final gt gt) {
        if (!this.a.contains(gt)) {
            this.a.add(gt);
        }
    }
    
    public void b(final i4 i4) {
        this.d.remove(i4);
    }
    
    @Override
    public void b(final String s, final String e) {
    Label_0143_Outer:
        while (true) {
            int n = 0;
            final boolean i = App.I;
            Log.i(dt.z[1] + e + dt.z[0] + s);
            while (true) {
            Label_0143:
                while (true) {
                Label_0255:
                    while (true) {
                        ArrayList<bt> list = null;
                        Label_0248: {
                            Label_0242: {
                                Label_0236: {
                                    ArrayList<bt> list2;
                                    ArrayList<bt> list3;
                                    Iterator<bt> iterator;
                                    int n2;
                                    Iterator<i4> iterator2;
                                    bt bt;
                                    Label_0230:Label_0183_Outer:Label_0171_Outer:Block_8_Outer:
                                    while (true) {
                                        synchronized (this.f) {
                                            list = this.f.get(s);
                                            if (list != null) {
                                                break Label_0248;
                                            }
                                            list2 = new ArrayList<bt>();
                                            this.f.put(s, list2);
                                            list3 = list2;
                                            iterator = list3.iterator();
                                            if (!iterator.hasNext()) {
                                                break Label_0242;
                                            }
                                            if (!iterator.next().e.equals(e)) {
                                                break Label_0236;
                                            }
                                            if (i) {
                                                n2 = 1;
                                                break Label_0255;
                                            }
                                            break Label_0230;
                                            // iftrue(Label_0183:, !i)
                                            // iftrue(Label_0215:, !iterator2.hasNext())
                                            // monitorexit(this.f)
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            iterator2.next().a(s, e);
                                                            return;
                                                            continue Label_0183_Outer;
                                                        }
                                                        Label_0215: {
                                                            return;
                                                        }
                                                        iterator2 = this.d.iterator();
                                                        continue Label_0171_Outer;
                                                    }
                                                    bt = new bt();
                                                    bt.e = e;
                                                    list3.add(bt);
                                                    continue Block_8_Outer;
                                                }
                                                continue Label_0143_Outer;
                                            }
                                        }
                                        // iftrue(Label_0171:, n2 != 0)
                                        n = n2;
                                        continue Label_0143_Outer;
                                    }
                                    n2 = 1;
                                    continue Label_0143;
                                }
                                int n2 = n;
                                break Label_0255;
                            }
                            int n2 = n;
                            continue Label_0143;
                        }
                        ArrayList<bt> list3 = list;
                        continue Label_0143_Outer;
                    }
                    if (i) {
                        continue Label_0143;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    public void c(final String s) {
        synchronized (this.g) {
            if (this.e == null) {
                this.b();
            }
            if (this.e.remove(s) == null) {
                return;
            }
            final SharedPreferences$Editor edit = App.aq.getSharedPreferences(dt.z[17], 0).edit();
            final String d = this.d();
            Label_0107: {
                if (this.e.isEmpty()) {
                    edit.remove(dt.z[18]);
                    if (!App.I) {
                        break Label_0107;
                    }
                }
                edit.putString(dt.z[16], d);
            }
            if (!edit.commit()) {
                Log.e(dt.z[15]);
            }
            App.aq.a5().post((Runnable)new h(this, s));
            // monitorexit(this.g)
            this.c();
            App.aq.a5().post((Runnable)new a6b(this, s));
        }
    }
}
