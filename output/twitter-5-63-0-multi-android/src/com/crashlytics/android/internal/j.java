// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.ArrayList;
import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Locale;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

final class j
{
    private final v a;
    private final bi b;
    private ak c;
    private final bj d;
    private final int e;
    private List f;
    
    j(final v v, final bi bi, final bj bj) {
        this(v, bi, bj, 100);
    }
    
    private j(final v a, final bi b, final bj d, final int n) {
        this.f = new CopyOnWriteArrayList();
        this.a = a;
        this.d = d;
        (this.b = b).a();
        this.e = 100;
    }
    
    private void a(final String s) {
        for (final bk bk : this.f) {
            try {
                bk.c();
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "One of the roll over listeners threw an exception", ex);
            }
        }
    }
    
    private static long b(final String s) {
        final String[] split = s.split("_");
        if (split.length != 3) {
            return 0L;
        }
        try {
            return Long.valueOf(split[2]);
        }
        catch (NumberFormatException ex) {
            return 0L;
        }
    }
    
    private int e() {
        if (this.c == null) {
            return 8000;
        }
        return this.c.c;
    }
    
    final void a(final ak c) {
        this.c = c;
    }
    
    final void a(final bk bk) {
        if (bk != null) {
            this.f.add(bk);
        }
    }
    
    final void a(final u u) {
        final byte[] a = this.a.a(u);
        final int length = a.length;
        if (!this.d.a(length, this.e())) {
            bd.a(4, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", this.d.a(), length, this.e()));
            this.a();
        }
        this.d.a(a);
    }
    
    final void a(final List list) {
        this.d.a(list);
    }
    
    final boolean a() {
        int n = 1;
        String string;
        if (!this.d.b()) {
            final UUID randomUUID = UUID.randomUUID();
            final StringBuilder sb = new StringBuilder();
            sb.append("sa");
            sb.append("_");
            sb.append(randomUUID.toString());
            sb.append("_");
            sb.append(this.b.a());
            sb.append(".tap");
            string = sb.toString();
            this.d.a(string);
            final Locale us = Locale.US;
            final Object[] array = new Object[n];
            array[0] = string;
            bd.a(4, String.format(us, "generated new to-send analytics file %s", array));
            this.b.a();
        }
        else {
            string = null;
            n = 0;
        }
        this.a(string);
        return n != 0;
    }
    
    final List b() {
        return this.d.a(1);
    }
    
    final void c() {
        this.d.a(this.d.c());
        this.d.d();
    }
    
    final void d() {
        final List c = this.d.c();
        if (c.size() <= this.e) {
            return;
        }
        final int n = c.size() - this.e;
        bd.c(String.format(Locale.US, "Found %d files in session analytics roll over directory, this is greater than %d, deleting %d oldest files", c.size(), this.e, n));
        final TreeSet<l> set = new TreeSet<l>(new k(this));
        for (final File file : c) {
            set.add(new l(this, file, b(file.getName())));
        }
        final ArrayList<File> list = new ArrayList<File>();
        final Iterator<l> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            list.add(iterator2.next().a);
            if (list.size() == n) {
                break;
            }
        }
        this.d.a(list);
    }
}
