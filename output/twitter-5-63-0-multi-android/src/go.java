import android.os.Bundle;
import android.net.Uri;

// 
// Decompiled by Procyon v0.5.30
// 

public class go
{
    private final Uri a;
    private final Class b;
    private Bundle c;
    private CharSequence d;
    private int e;
    private boolean f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    
    public go(final Uri a, final Class b) {
        this.j = true;
        this.a = a;
        this.b = b;
    }
    
    public gm a() {
        return new gm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
    }
    
    public go a(final int h) {
        this.h = h;
        return this;
    }
    
    public go a(final Bundle c) {
        this.c = c;
        return this;
    }
    
    public go a(final CharSequence d) {
        this.d = d;
        return this;
    }
    
    public go a(final String g) {
        this.g = g;
        return this;
    }
    
    public go a(final boolean j) {
        this.j = j;
        return this;
    }
}
