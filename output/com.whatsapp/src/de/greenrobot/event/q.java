// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

class q implements Runnable
{
    private static final String z;
    private final m a;
    private final h b;
    
    static {
        final char[] charArray = "I\u0019\u0007\u0013:i\u0012N\r8'\u0006H\u0010+'\u0017Q\u00026k\u0017E\u000f:".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '_';
                    break;
                }
                case 0: {
                    c2 = '\u0007';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = 'c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    q(final m a) {
        this.a = a;
        this.b = new h();
    }
    
    public void a(final c c, final Object o) {
        this.b.a(d.a(c, o));
        this.a.a().execute(this);
    }
    
    @Override
    public void run() {
        final d a = this.b.a();
        if (a == null) {
            try {
                throw new IllegalStateException(q.z);
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
        }
        this.a.a(a);
    }
}
