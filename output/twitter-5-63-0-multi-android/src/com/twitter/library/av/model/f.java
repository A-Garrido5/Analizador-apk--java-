// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import java.util.Map;
import com.twitter.library.api.MediaEntity;
import java.util.Arrays;
import com.twitter.library.telephony.d;
import java.util.List;

public class f implements b
{
    private static final List a;
    private final d b;
    private final MediaEntityVideo c;
    
    static {
        a = Arrays.asList("video");
    }
    
    public f(final MediaEntity mediaEntity, final d b) {
        this.b = b;
        this.c = new MediaEntityVideo(mediaEntity, b);
    }
    
    @Override
    public int a(final a a) {
        if (this.c.equals(a)) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public a a(final int n) {
        return this.c;
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    @Override
    public int b() {
        return 0;
    }
    
    @Override
    public int c() {
        return 1;
    }
    
    @Override
    public Map d() {
        return null;
    }
    
    @Override
    public String e() {
        return null;
    }
    
    @Override
    public String f() {
        return this.b.b;
    }
    
    @Override
    public boolean g() {
        return true;
    }
    
    @Override
    public String h() {
        return null;
    }
    
    @Override
    public mc i() {
        return null;
    }
}
