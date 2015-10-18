// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.text.TextUtils;
import java.util.List;
import android.content.SharedPreferences;
import java.util.StringTokenizer;
import java.util.ArrayList;
import com.twitter.library.api.UrlConfiguration;
import android.content.Context;

public class cd
{
    private static cd a;
    private final Context b;
    private UrlConfiguration c;
    
    private cd(final Context b) {
        this.b = b;
    }
    
    public static cd a(final Context context) {
        synchronized (cd.class) {
            if (cd.a == null) {
                cd.a = new cd(context.getApplicationContext());
            }
            return cd.a;
        }
    }
    
    private UrlConfiguration b() {
        if (this.c != null) {
            return this.c;
        }
        final SharedPreferences sharedPreferences = this.b.getSharedPreferences("config", 0);
        final int int1 = sharedPreferences.getInt("short_url_len", 0);
        final String string = sharedPreferences.getString("scribe_url", "https://twitter.com/scribe");
        final String string2 = sharedPreferences.getString("url_whitelist", (String)null);
        final ArrayList<String> list = new ArrayList<String>();
        if (string2 != null) {
            final StringTokenizer stringTokenizer = new StringTokenizer(string2, ",");
            while (stringTokenizer.hasMoreTokens()) {
                list.add(stringTokenizer.nextToken());
            }
        }
        else {
            com.twitter.android.client.c.a(this.b).h();
        }
        return this.c = new UrlConfiguration(int1, string, list);
    }
    
    public int a(final boolean b) {
        final UrlConfiguration b2 = this.b();
        int a;
        if (b2.a > 0) {
            a = b2.a;
        }
        else {
            a = 22;
        }
        if (b) {
            ++a;
        }
        return a;
    }
    
    public List a() {
        return this.b().c;
    }
    
    void a(final UrlConfiguration c) {
        final SharedPreferences sharedPreferences = this.b.getSharedPreferences("config", 0);
        this.c = c;
        String string;
        if (c.c == null) {
            string = "";
        }
        else {
            string = TextUtils.join((CharSequence)",", (Iterable)c.c) + ',';
        }
        sharedPreferences.edit().putInt("short_url_len", c.a).putString("url_whitelist", string).putString("scribe_url", c.b).apply();
    }
}
