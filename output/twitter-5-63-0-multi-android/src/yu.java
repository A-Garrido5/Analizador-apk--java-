import com.twitter.util.collection.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class yu extends b
{
    public yu() {
        this(100);
    }
    
    public yu(final int n) {
        super(n);
    }
    
    public yu(final int n, final Number n2) {
        this(n);
        for (int i = 0; i < n; ++i) {
            this.add(n2);
        }
    }
    
    public yu(final Number n) {
        this(100, n);
    }
}
