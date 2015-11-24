// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.l7;
import com.whatsapp.aol;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import org.whispersystems.jobqueue.p;
import android.os.Message;
import com.whatsapp.App;
import org.whispersystems.jobqueue.e;
import com.whatsapp.jobqueue.b;
import org.whispersystems.jobqueue.a;

public final class SendWebForwardJob extends a implements b, e
{
    private static final String GROUP_ID;
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App f;
    private final transient String g;
    private transient com.whatsapp.jobqueue.a h;
    private final transient String i;
    private final transient Message j;
    
    static {
        final String[] z2 = new String[5];
        int n = 0;
        String[] array = z2;
        String s = "f\u001f_x~\u007f\u001e";
        int n2 = 4;
        String intern = null;
    Label_0174:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001b';
                        break;
                    }
                    case 0: {
                        c2 = '\u0011';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '+';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    s = "t\u0002^Nke\u0013RE;f\u0012TG~1\tXE\u007fx\u0014Z\u000blt\u0018\u001dMtc\r\\Y\u007f1\u0010RI 1\u0013Y\u0016";
                    n = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 4: {
                    GROUP_ID = intern;
                    s = "*ZON},";
                    n2 = -1;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    s = "b\u000e\\Yox\u0014Z\u000bht\u0014Y\u000blt\u0018\u001dMtc\r\\Y\u007f1\u0010RI 1\u0013Y\u0016";
                    n = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    s = "*ZON},";
                    n = 3;
                    array = z2;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    s = "f\u001f_x~\u007f\u001e";
                    n = 4;
                    array = z2;
                    n2 = 3;
                    continue;
                }
                case 3: {
                    break Label_0174;
                }
            }
        }
        array[n] = intern;
        z = z2;
    }
    
    public SendWebForwardJob(final String s, final Message message) {
        super(p.h().a(SendWebForwardJob.z[4]).a(new ChatConnectionRequirement()).a());
        this.g = (String)aol.a((Object)s);
        this.j = (Message)aol.a(message);
        this.i = l7.c;
    }
    
    @Override
    public void a() {
        this.h.b();
    }
    
    @Override
    public void a(final Context context) {
        if (this.h == null) {
            this.h = new com.whatsapp.jobqueue.a(context);
        }
        this.h.c();
    }
    
    @Override
    public void a(final App f) {
        this.f = f;
    }
    
    @Override
    public boolean a(final Exception ex) {
        Log.c(SendWebForwardJob.z[1] + this.g + SendWebForwardJob.z[0] + this.i, ex);
        return l7.o(this.i);
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void l() {
        Log.i(SendWebForwardJob.z[2] + this.g + SendWebForwardJob.z[3] + this.i);
        this.f.aG.a(new com.whatsapp.jobqueue.job.a(this, this.g, this.i, this.j, this.h.a().a(this.g, this.j)));
        this.h.b();
    }
}
