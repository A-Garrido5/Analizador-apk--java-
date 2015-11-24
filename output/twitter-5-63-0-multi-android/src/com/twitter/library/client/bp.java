// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.text.TextUtils;
import java.util.Iterator;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import android.net.Uri;
import java.util.ArrayList;
import android.content.Context;

public class bp
{
    private static bp b;
    protected final Context a;
    private final az c;
    private final ArrayList d;
    private final ArrayList e;
    
    private bp(final Context a) {
        this.d = new ArrayList(0);
        this.e = new ArrayList(0);
        this.a = a;
        this.c = az.a(a);
    }
    
    public static bp a(final Context context) {
        if (bp.b == null) {
            bp.b = new bp(context.getApplicationContext());
        }
        return bp.b;
    }
    
    public static String b(final Uri uri) {
        final String authority = uri.getAuthority();
        int n = authority.indexOf(".");
        if (n == -1) {
            n = authority.length();
        }
        return authority.substring(0, n);
    }
    
    private void b(final ArrayList list) {
        this.d.clear();
        final String string = new k(this.a, this.c.b().e(), "timelines").getString("page_order", null);
        if (string == null) {
            if (list != null) {
                final Iterator<Uri> iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.d.add(iterator.next());
                }
                this.a();
            }
        }
        else {
            final BufferedReader bufferedReader = new BufferedReader(new StringReader(string.trim()));
            try {
                for (String s = bufferedReader.readLine(); s != null; s = bufferedReader.readLine()) {
                    this.d.add(Uri.parse(s));
                }
            }
            catch (IOException ex) {}
            final Iterator<Uri> iterator2 = list.iterator();
            int n = 0;
            while (iterator2.hasNext()) {
                final Uri uri = iterator2.next();
                int n2;
                if (!this.d.contains(uri)) {
                    this.d.add(n, uri);
                    n2 = n + 1;
                }
                else {
                    n2 = n;
                }
                n = n2;
            }
        }
    }
    
    public final ArrayList a(final ArrayList list) {
        this.b(list);
        return this.d;
    }
    
    protected void a() {
        new k(this.a, this.c.b().e(), "timelines").a().a("page_order", TextUtils.join((CharSequence)"\n", (Iterable)this.d) + '\n').apply();
    }
    
    public final void a(final Uri uri) {
        if (this.d.remove(uri)) {
            final Iterator<bq> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(uri);
            }
        }
        this.a();
    }
    
    public void a(final bq bq) {
        if (bq != null && !this.e.contains(bq)) {
            this.e.add(bq);
        }
    }
    
    public void b(final bq bq) {
        this.e.remove(bq);
    }
}
