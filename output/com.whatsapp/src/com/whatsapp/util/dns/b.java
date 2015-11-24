// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import com.whatsapp.vp;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.net.InetAddress;
import java.util.ArrayList;
import java.net.UnknownHostException;
import com.whatsapp.a9f;
import java.util.List;
import android.content.Context;
import java.io.File;
import java.util.HashMap;

public final class b
{
    public static boolean a;
    private static final String[] z;
    private final HashMap b;
    @Deprecated
    private final File c;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u000bZ!nb\u001c^0x,\u001cQ1!~\u001dL-my\fV-o,\u001e^+mi\u001c\u001f$n~X";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\f';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bM+lm\nFbeb\u000b\u001f0d\u007f\u0017S7ue\u0017Qbgm\u0011S'e,\u001eP0!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0010^0eo\u0017['e,\u0011Obsi\u000bP.tx\u0011P,!j\u0019V.dhXY-s,";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\nZ1n`\u000eV,f,";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0016Pbim\n[!nh\u001d[bh|\u000b\u001f$ny\u0016[bgc\n\u001f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001cQ1^o\u0019\\*d";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public b(final Context context) {
        this.c = new File(context.getCacheDir(), com.whatsapp.util.dns.b.z[5]);
        this.b = new HashMap();
    }
    
    private List a(final String s) {
        final List list = a9f.b.get(s);
        if (list == null || list.isEmpty()) {
            throw new UnknownHostException(com.whatsapp.util.dns.b.z[4] + s);
        }
        this.a(s, list);
        return list;
    }
    
    private void a(final String s, final Iterable iterable) {
        final boolean a = com.whatsapp.util.dns.b.a;
        final long n = 3600000L + System.currentTimeMillis();
        final ArrayList<DnsCacheEntrySerializable> list = new ArrayList<DnsCacheEntrySerializable>();
        final Iterator<InetAddress> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(new DnsCacheEntrySerializable(n, iterator.next()));
            if (a) {
                break;
            }
        }
        synchronized (this) {
            this.b.put(s, list);
        }
    }
    
    private List b(final String s) {
        final boolean a = com.whatsapp.util.dns.b.a;
        final g[] a2 = h.a(s, 20000);
        final InetAddress[] array = new InetAddress[a2.length];
        int i = 0;
        while (i < a2.length) {
            array[i] = a2[i].b;
            ++i;
            if (a) {
                break;
            }
        }
        final List<InetAddress> list = Arrays.asList(array);
        this.a(s, list);
        return list;
    }
    
    private List c(final String s) {
        final List<InetAddress> list = Arrays.asList(InetAddress.getAllByName(s));
        this.a(s, list);
        return list;
    }
    
    private List e(final String s) {
        while (true) {
        Label_0119_Outer:
            while (true) {
                while (true) {
                    final boolean a;
                    Label_0160: {
                        synchronized (this) {
                            a = com.whatsapp.util.dns.b.a;
                            final List<DnsCacheEntrySerializable> list = this.b.get(s);
                            List<InetAddress> list2;
                            if (list == null) {
                                list2 = null;
                            }
                            else {
                                final ArrayList<InetAddress> list3 = new ArrayList<InetAddress>();
                                final HashSet<Object> set = new HashSet<Object>();
                                final Iterator<DnsCacheEntrySerializable> iterator = list.iterator();
                                if (iterator.hasNext()) {
                                    final DnsCacheEntrySerializable dnsCacheEntrySerializable = iterator.next();
                                    if (dnsCacheEntrySerializable.isExpired()) {
                                        set.add(dnsCacheEntrySerializable);
                                        if (!a) {
                                            break Label_0160;
                                        }
                                    }
                                    list3.add(dnsCacheEntrySerializable.getInetAddress());
                                    break Label_0160;
                                }
                                list.removeAll(set);
                                if (list.isEmpty()) {
                                    this.b.remove(s);
                                }
                                list2 = list3;
                            }
                            return list2;
                        }
                    }
                    if (a) {
                        continue;
                    }
                    break;
                }
                continue Label_0119_Outer;
            }
        }
    }
    
    public void a() {
        synchronized (this) {
            this.b.clear();
            this.c.delete();
        }
    }
    
    public List d(final String s) {
        Log.i(com.whatsapp.util.dns.b.z[3] + s);
        final List e = this.e(s);
        if (e != null) {
            try {
                if (!e.isEmpty()) {
                    return e;
                }
            }
            catch (UnknownHostException ex) {
                try {
                    throw ex;
                }
                catch (UnknownHostException ex2) {
                    throw ex2;
                }
            }
        }
        try {
            return this.c(s);
        }
        catch (UnknownHostException ex3) {
            Log.w(com.whatsapp.util.dns.b.z[1] + s + ' ' + ex3);
            try {
                return this.b(s);
            }
            catch (UnknownHostException ex4) {
                Log.w(com.whatsapp.util.dns.b.z[0] + s + ' ' + ex4);
                try {
                    return this.a(s);
                }
                catch (UnknownHostException ex5) {
                    Log.w(com.whatsapp.util.dns.b.z[2] + s + ' ' + ex5);
                    throw ex3;
                }
            }
        }
    }
    
    public void onEvent(final vp vp) {
        this.a();
    }
}
