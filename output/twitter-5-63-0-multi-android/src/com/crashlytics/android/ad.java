// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.cl;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.io.File;

class ad
{
    private final File a;
    private final Map b;
    
    public ad(final File file) {
        this(file, Collections.emptyMap());
    }
    
    public ad(final File a, final Map map) {
        this.a = a;
        this.b = new HashMap(map);
        if (this.a.length() == 0L) {
            this.b.putAll(af.a);
        }
    }
    
    public boolean a() {
        cl.a().b().a("Crashlytics", "Removing report at " + this.a.getPath());
        return this.a.delete();
    }
    
    public String b() {
        return this.d().getName();
    }
    
    public String c() {
        final String b = this.b();
        return b.substring(0, b.lastIndexOf(46));
    }
    
    public File d() {
        return this.a;
    }
    
    public Map e() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
}
