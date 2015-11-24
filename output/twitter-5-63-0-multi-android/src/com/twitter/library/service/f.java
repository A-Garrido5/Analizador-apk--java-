// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import android.net.Uri;
import android.preference.PreferenceManager;
import com.twitter.library.client.App;
import java.util.Collection;
import java.util.Iterator;
import android.util.Pair;
import org.apache.http.message.BasicNameValuePair;
import java.io.UnsupportedEncodingException;
import org.apache.http.entity.StringEntity;
import java.util.List;
import com.twitter.library.util.bn;
import android.text.TextUtils;
import com.twitter.library.network.a;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import org.apache.http.HttpEntity;
import android.content.Context;
import java.util.ArrayList;

public final class f
{
    protected final ArrayList a;
    private final ArrayList b;
    private final ArrayList c;
    private final Context d;
    private HttpEntity e;
    private String f;
    private StringBuilder g;
    private HttpOperation$RequestMethod h;
    private String i;
    private a j;
    private String k;
    
    f(final Context context) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = null;
        this.k = "https";
        this.i = "api.twitter.com";
        this.f = "1.1";
        this.g = new StringBuilder();
        this.h = HttpOperation$RequestMethod.a;
        this.d = context.getApplicationContext();
    }
    
    public e a() {
        final StringBuilder append = new StringBuilder().append(this.k).append("://").append(this.i);
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            append.append('/').append(this.f);
        }
        append.append((CharSequence)this.g);
        Label_0187: {
            if (!this.h.a()) {
                break Label_0187;
            }
            if (!this.c.isEmpty()) {
                throw new UnsupportedOperationException("Adding valueList with POST is notyet supported!");
            }
            if (this.e == null) {
                final ArrayList a = this.a;
                while (true) {
                    Label_0440: {
                        if (a.isEmpty()) {
                            break Label_0440;
                        }
                        final String a2 = bn.a(a);
                        if (a2 == null) {
                            break Label_0440;
                        }
                        try {
                            final StringEntity stringEntity = new StringEntity(a2, "UTF-8");
                            stringEntity.setContentType("application/x-www-form-urlencoded");
                            final Object e = stringEntity;
                            return new e(append, this.h, (HttpEntity)e, this.b, this.j);
                        }
                        catch (UnsupportedEncodingException ex) {
                            final StringEntity stringEntity = null;
                            continue;
                        }
                        break Label_0187;
                    }
                    final StringEntity stringEntity = null;
                    continue;
                }
            }
            final Object e = this.e;
            return new e(append, this.h, (HttpEntity)e, this.b, this.j);
        }
        if (this.a.isEmpty()) {
            final boolean empty = this.c.isEmpty();
            final Object e = null;
            if (empty) {
                return new e(append, this.h, (HttpEntity)e, this.b, this.j);
            }
        }
        if (this.e != null) {
            throw new UnsupportedOperationException("HttpEntity not allowed in GET");
        }
        append.append('?');
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final BasicNameValuePair basicNameValuePair = this.a.get(i);
            append.append(basicNameValuePair.getName()).append('=').append(com.twitter.library.network.a.a(basicNameValuePair.getValue()));
            if (i < size - 1) {
                append.append('&');
            }
        }
        final Iterator iterator = this.c.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final Object e = null;
            if (!hasNext) {
                return new e(append, this.h, (HttpEntity)e, this.b, this.j);
            }
            final Pair pair = iterator.next();
            append.append('&').append((String)pair.first).append('=');
            final String[] array = (String[])pair.second;
            for (int length = array.length, j = 0; j < length; ++j) {
                append.append(com.twitter.library.network.a.a(array[j]));
                if (j < length - 1) {
                    append.append(',');
                }
            }
        }
    }
    
    public f a(final HttpOperation$RequestMethod h) {
        if (h != null) {
            this.h = h;
        }
        return this;
    }
    
    public f a(final a j) {
        this.j = j;
        return this;
    }
    
    public f a(final String f) {
        this.f = f;
        return this;
    }
    
    public f a(final String s, final double n) {
        this.a(s, String.valueOf(n));
        return this;
    }
    
    public f a(final String s, final long n) {
        this.a(s, String.valueOf(n));
        return this;
    }
    
    public f a(final String s, final String s2) {
        this.a.add(new BasicNameValuePair(s, s2));
        return this;
    }
    
    public f a(final String s, final Collection collection) {
        final String[] array = new String[collection.size()];
        int n = 0;
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            array[n] = String.valueOf(iterator.next());
            ++n;
        }
        this.c.add(new Pair((Object)s, (Object)array));
        return this;
    }
    
    public f a(final String s, final boolean b) {
        this.a(s, String.valueOf(b));
        return this;
    }
    
    public f a(final String s, final long[] array) {
        final int length = array.length;
        final String[] array2 = new String[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = String.valueOf(array[i]);
        }
        this.c.add(new Pair((Object)s, (Object)array2));
        return this;
    }
    
    public f a(final String s, final String[] array) {
        this.c.add(new Pair((Object)s, (Object)array));
        return this;
    }
    
    public f a(final HttpEntity e) {
        this.e = e;
        return this;
    }
    
    public f a(final Object... array) {
        this.b(array);
        this.g.append(".json");
        return this;
    }
    
    public f b() {
        if (App.f() && PreferenceManager.getDefaultSharedPreferences(this.d).getBoolean("debug_show_catfood_cards", false)) {
            this.a("cards_platform", "Catfood-Android-12");
            return this;
        }
        this.a("cards_platform", "Android-12");
        return this;
    }
    
    public f b(final String i) {
        if (TextUtils.isEmpty((CharSequence)i)) {
            throw new IllegalArgumentException("host cannot be null");
        }
        if (i.indexOf(47) != -1) {
            throw new IllegalArgumentException("Invalid host: " + i);
        }
        this.i = i;
        return this;
    }
    
    public f b(final String s, final String s2) {
        this.b.add(new Pair((Object)s, (Object)s2));
        return this;
    }
    
    public f b(final Object... array) {
        if (array != null) {
            for (final Object o : array) {
                if (o.toString().charAt(0) != '/') {
                    this.g.append('/');
                }
                this.g.append(Uri.encode(o.toString(), "/"));
            }
        }
        return this;
    }
    
    public f c(final String k) {
        if (TextUtils.isEmpty((CharSequence)k)) {
            throw new IllegalArgumentException("scheme cannot be empty or null");
        }
        if (k.indexOf(47) != -1 || k.indexOf(58) != -1) {
            throw new IllegalArgumentException("Invalid scheme: " + k);
        }
        this.k = k;
        return this;
    }
}
