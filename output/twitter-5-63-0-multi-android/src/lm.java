import com.twitter.util.l;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class lm implements ln
{
    private final Cursor b;
    
    public lm(final Cursor b) {
        this.b = b;
    }
    
    @Override
    public int a() {
        if (this.b != null) {
            return this.b.getCount();
        }
        return 0;
    }
    
    public Cursor a(final int n) {
        if (n >= this.a() || this.b == null) {
            return null;
        }
        this.b.moveToPosition(n);
        return this.b;
    }
    
    @Override
    public void b() {
        yp.a(this.b);
    }
    
    public Cursor c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof lm && l.a(((lm)o).c(), this.c()));
    }
    
    @Override
    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
}
