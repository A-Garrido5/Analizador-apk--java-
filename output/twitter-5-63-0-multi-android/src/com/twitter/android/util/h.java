// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import java.util.HashMap;

public class h
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    boolean g;
    
    public h(final String a, final String b, final String e, final String c, final String d, String f, final boolean g) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.g = g;
        if (g) {
            f = null;
        }
        this.f = f;
    }
    
    public h(final HashMap hashMap) {
        this.g = false;
        final Iterator<String> iterator = AppEventTrack.a.keySet().iterator();
        while (iterator.hasNext()) {
            if (hashMap.containsKey(iterator.next())) {
                this.g = true;
            }
        }
        String s;
        if (this.g) {
            s = "twsrc";
        }
        else {
            s = "utm_source";
        }
        this.c = hashMap.get(s);
        String s2;
        if (this.g) {
            s2 = "twgr";
        }
        else {
            s2 = "utm_medium";
        }
        this.d = hashMap.get(s2);
        String s3;
        if (this.g) {
            s3 = "twcamp";
        }
        else {
            s3 = "utm_campaign";
        }
        this.a = hashMap.get(s3);
        String s4;
        if (this.g) {
            s4 = "twterm";
        }
        else {
            s4 = "utm_term";
        }
        this.e = hashMap.get(s4);
        String s5;
        if (this.g) {
            s5 = "twcon";
        }
        else {
            s5 = "utm_content";
        }
        this.b = hashMap.get(s5);
        Object o;
        if (this.g) {
            o = null;
        }
        else {
            o = "gclid";
        }
        this.f = hashMap.get(o);
    }
    
    private void a(final HashMap hashMap, final String s, String s2) {
        if (s != null) {
            if (!this.g) {
                s2 = AppEventTrack.a.get(s2);
            }
            hashMap.put(s2, s);
        }
    }
    
    public HashMap a() {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        this.a(hashMap, this.a, "twcamp");
        this.a(hashMap, this.b, "twcon");
        this.a(hashMap, this.e, "twterm");
        this.a(hashMap, this.c, "twsrc");
        this.a(hashMap, this.d, "twgr");
        if (!this.g) {
            hashMap.put("gclid", this.f);
        }
        return hashMap;
    }
    
    public void a(final TwitterScribeLog twitterScribeLog, final String s) {
        twitterScribeLog.a(this.c, this.d, this.a, this.e, this.b, this.f, s);
    }
}
