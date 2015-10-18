import com.twitter.util.l;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;

// 
// Decompiled by Procyon v0.5.30
// 

public class wm
{
    public final PromotedEvent a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    
    private wm(final wo wo) {
        this.a = wo.a;
        this.c = wo.b;
        this.d = wo.c;
        this.b = wo.d;
        this.e = wo.e;
        this.f = wo.f;
        this.g = wo.g;
        this.h = wo.h;
        this.i = wo.i;
        this.j = wo.j;
        this.k = wo.k;
        this.l = wo.l;
    }
    
    public static wo a(final PromotedEvent promotedEvent, final PromotedContent promotedContent) {
        if (promotedEvent == null || promotedContent == null) {
            throw new NullPointerException("event and pc must not be null");
        }
        return new wo(null).a(promotedEvent).a(promotedContent);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final wm wm = (wm)o;
            if (this.e != wm.e) {
                return false;
            }
            if (this.c != wm.c) {
                return false;
            }
            if (!com.twitter.util.l.a(this.l, wm.l)) {
                return false;
            }
            if (this.a != wm.a) {
                return false;
            }
            if (!com.twitter.util.l.a(this.b, wm.b)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.f, wm.f)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.d, wm.d)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.j, wm.j)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.k, wm.k)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.i, wm.i)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.h, wm.h)) {
                return false;
            }
            if (!com.twitter.util.l.a(this.g, wm.g)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return com.twitter.util.l.a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }
}
