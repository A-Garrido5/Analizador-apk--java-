// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.ArrayList;
import java.util.List;

public class h
{
    private final List a;
    
    public h() {
        this.a = new ArrayList(20);
    }
    
    private h c(final String s, final String s2) {
        this.a.add(s);
        this.a.add(s2.trim());
        return this;
    }
    
    public f a() {
        return new f(this, null);
    }
    
    public h a(final String s) {
        final int index = s.indexOf(":", 1);
        if (index != -1) {
            return this.c(s.substring(0, index), s.substring(index + 1));
        }
        if (s.startsWith(":")) {
            return this.c("", s.substring(1));
        }
        return this.c("", s);
    }
    
    public h a(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("fieldname == null");
        }
        if (s2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        if (s.length() == 0 || s.indexOf(0) != -1 || s2.indexOf(0) != -1) {
            throw new IllegalArgumentException("Unexpected header: " + s + ": " + s2);
        }
        return this.c(s, s2);
    }
    
    public h b(final String s) {
        for (int i = 0; i < this.a.size(); i += 2) {
            if (s.equalsIgnoreCase((String)this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
            }
        }
        return this;
    }
    
    public h b(final String s, final String s2) {
        this.b(s);
        this.a(s, s2);
        return this;
    }
    
    public String c(final String s) {
        for (int i = -2 + this.a.size(); i >= 0; i -= 2) {
            if (s.equalsIgnoreCase((String)this.a.get(i))) {
                return (String)this.a.get(i + 1);
            }
        }
        return null;
    }
}
