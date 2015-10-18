import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

public class iy
{
    public long a;
    public long b;
    public long c;
    public long d;
    private final String e;
    private final Map f;
    
    public iy() {
        this("");
    }
    
    public iy(final String s) {
        this.f = new LinkedHashMap(5);
        this.e = s + "_";
        this.a();
    }
    
    public iy(final String e, final SharedPreferences sharedPreferences) {
        this.f = new LinkedHashMap(5);
        this.e = e;
        this.a = sharedPreferences.getLong(e + "_total", 0L);
        this.b = sharedPreferences.getLong(e + "_count", 0L);
        this.c = sharedPreferences.getLong(e + "_max", Long.MIN_VALUE);
        this.d = sharedPreferences.getLong(e + "_min", Long.MAX_VALUE);
    }
    
    public Map a(final int n) {
        this.f.clear();
        if ((n & 0x1) != 0x0) {
            this.f.put(this.e + "_total", this.a);
        }
        if ((n & 0x2) != 0x0) {
            this.f.put(this.e + "_count", this.b);
        }
        if ((n & 0x4) != 0x0) {
            this.f.put(this.e + "_max", this.c);
        }
        if ((n & 0x8) != 0x0) {
            this.f.put(this.e + "_min", this.d);
        }
        if ((n & 0x10) != 0x0) {
            this.f.put(this.e + "_avg", this.b());
        }
        return this.f;
    }
    
    public void a() {
        this.a = 0L;
        this.b = 0L;
        this.c = Long.MIN_VALUE;
        this.d = Long.MAX_VALUE;
    }
    
    public void a(final long n) {
        synchronized (this) {
            this.a += n;
            ++this.b;
            if (n > this.c) {
                this.c = n;
            }
            if (n < this.d) {
                this.d = n;
            }
        }
    }
    
    public void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.putLong(this.e + "_total", this.a);
        sharedPreferences$Editor.putLong(this.e + "_count", this.b);
        sharedPreferences$Editor.putLong(this.e + "_max", this.c);
        sharedPreferences$Editor.putLong(this.e + "_min", this.d);
    }
    
    public float b() {
        if (this.b != 0L) {
            return this.a / this.b;
        }
        return 0.0f;
    }
    
    public void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.remove(this.e + "_total");
        sharedPreferences$Editor.remove(this.e + "_count");
        sharedPreferences$Editor.remove(this.e + "_max");
        sharedPreferences$Editor.remove(this.e + "_min");
    }
}
