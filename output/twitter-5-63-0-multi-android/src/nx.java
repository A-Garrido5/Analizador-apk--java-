import java.util.Iterator;
import com.twitter.util.n;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.5.30
// 

public class nx extends nw
{
    private final BitSet f;
    
    public nx(final int n) {
        super(1, null, n, false);
        this.f = new BitSet(5);
    }
    
    @Override
    public void a() {
        super.a();
        for (int i = this.f.nextSetBit(0); i >= 0; i = this.f.nextSetBit(i + 1)) {
            ny.a().b(this, i);
        }
    }
    
    @Override
    public void a(final nz nz) {
        while (true) {
            while (true) {
                Label_0126: {
                    synchronized (this) {
                        if (!this.c.containsKey(nz.a)) {
                            this.c.put(nz.a, 0);
                            this.a(this.c.size());
                        }
                        super.a(nz);
                        final Iterator<Integer> iterator = this.c.values().iterator();
                        Block_5: {
                            while (iterator.hasNext()) {
                                if (iterator.next() < 10000) {
                                    break Block_5;
                                }
                            }
                            break Label_0126;
                        }
                        final int n = 0;
                        if (n != 0) {
                            this.c.clear();
                            this.e = 1;
                        }
                        return;
                    }
                }
                final int n = 1;
                continue;
            }
        }
    }
    
    public void b(final int n) {
        if (!this.f.get(n)) {
            this.f.set(n);
            ny.a().a(this, n);
        }
    }
}
