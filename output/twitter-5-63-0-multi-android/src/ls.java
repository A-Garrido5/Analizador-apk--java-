import android.database.DataSetObserver;
import android.database.Cursor;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class ls extends lv
{
    static final /* synthetic */ boolean a;
    private final lu b;
    private Object c;
    private int d;
    private WeakReference e;
    
    static {
        a = !ls.class.desiredAssertionStatus();
    }
    
    public ls() {
        this.b = new lu(this, null);
    }
    
    void a() {
        this.c = null;
        this.d = 0;
        this.d(null);
    }
    
    public abstract Object b(final Cursor p0);
    
    public final Object c(final Cursor cursor) {
        boolean b;
        if (this.e != null && this.e.get() == cursor) {
            b = true;
        }
        else {
            b = false;
        }
        final int position = cursor.getPosition();
        Object c;
        if (b && this.d == position) {
            c = this.c;
        }
        else {
            final Object b2 = this.b(cursor);
            this.c = b2;
            this.d = position;
            if (!b) {
                this.d(cursor);
            }
            c = b2;
        }
        if (!ls.a && c == null) {
            throw new AssertionError();
        }
        return c;
    }
    
    void d(final Cursor cursor) {
        if (this.e != null) {
            final Cursor cursor2 = (Cursor)this.e.get();
            if (cursor2 != null) {
                cursor2.unregisterDataSetObserver((DataSetObserver)this.b);
            }
        }
        if (cursor != null) {
            this.e = new WeakReference((T)cursor);
            cursor.registerDataSetObserver((DataSetObserver)this.b);
            return;
        }
        this.e = null;
    }
}
