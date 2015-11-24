// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.l7;
import org.whispersystems.jobqueue.p;
import com.whatsapp.App;
import java.util.concurrent.Future;
import android.os.Message;
import com.whatsapp.jobqueue.b;

class a extends org.whispersystems.jobqueue.a implements b
{
    private static final String g;
    private static final long serialVersionUID = 1L;
    private static final String z;
    private final transient Message f;
    private final transient String h;
    private final transient Future i;
    final SendWebForwardJob j;
    private final transient String k;
    private transient App l;
    
    static {
        String s = "[u!\u001c3G";
        int n = -1;
        String intern = null;
    Label_0069:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n2 = 0; i > n2; ++n2) {
                final char c = charArray[n2];
                char c2 = '\0';
                switch (n2 % 5) {
                    default: {
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = ']';
                        break;
                    }
                }
                charArray[n2] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    z = intern;
                    s = "[u!\u001c3G";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0069;
                }
            }
        }
        g = intern;
    }
    
    public a(final SendWebForwardJob j, final String h, final String k, final Message f, final Future i) {
        this.j = j;
        super(p.h().a(a.z).a());
        this.h = h;
        this.f = f;
        this.k = k;
        this.i = i;
    }
    
    @Override
    public void a() {
        if (l7.o(this.k)) {
            this.l.aG.a(new SendWebForwardJob(this.h, this.f));
        }
    }
    
    @Override
    public void a(final App l) {
        this.l = l;
    }
    
    @Override
    public boolean a(final Exception ex) {
        return false;
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void l() {
        this.i.get();
    }
}
