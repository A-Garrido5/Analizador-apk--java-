// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class p
{
    private final d a;
    
    public p(final d a) {
        this.a = a;
    }
    
    public aV a(final aq aq) {
        final Object b = bH.b;
        // monitorenter(b)
        while (true) {
            try {
                final aT a = this.a.a(aq);
                try {
                    if (a.a()) {
                        a.a(a6.b(), 0, a6.d(), a6.c());
                        this.a.a(aq, a);
                    }
                    final X b2 = a.b();
                    return new aV(b2.b(), b2.d().a(), b2.d().c(), b2.e());
                }
                catch (aW aw) {
                    throw aw;
                }
            }
            catch (aW aw2) {
                try {
                    final aA aa;
                    throw new AssertionError((Object)aa);
                }
                finally {
                }
                // monitorexit(b)
            }
            catch (aA aa) {
                continue;
            }
            break;
        }
    }
    
    public void a(final aq aq, final aV av) {
        synchronized (bH.b) {
            final aT a = this.a.a(aq);
            a.a(av.e(), av.c(), av.b(), av.d());
            this.a.a(aq, a);
        }
    }
}
