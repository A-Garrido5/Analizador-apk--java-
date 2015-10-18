// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import org.whispersystems.ai;
import org.whispersystems.a5;
import org.whispersystems.a4;
import org.whispersystems.M;
import org.whispersystems.i;
import org.whispersystems.aK;
import android.text.TextUtils;
import org.whispersystems.d;
import org.whispersystems.bH;
import org.whispersystems.aq;
import com.whatsapp.ha;
import com.whatsapp.App;
import android.util.Pair;
import java.util.concurrent.Callable;

class c implements Callable
{
    private static final String z;
    final SendE2EMessageJob a;
    final byte[] b;
    
    static {
        final char[] charArray = "\u001f\u000fds1>\b9e)/R$a-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Y';
                    break;
                }
                case 0: {
                    c2 = '_';
                    break;
                }
                case 1: {
                    c2 = '|';
                    break;
                }
                case 2: {
                    c2 = 'J';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c(final SendE2EMessageJob a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    public Pair a() {
        if (SendE2EMessageJob.c(this.a)) {
            return new Pair((Object)2, (Object)new bH(SendE2EMessageJob.d(this.a).a2.h(), new aq(SendE2EMessageJob.a(this.a), ha.g(App.aX.jabber_id + c.z))).a(this.b));
        }
        String s;
        if (TextUtils.isEmpty((CharSequence)SendE2EMessageJob.b(this.a))) {
            s = SendE2EMessageJob.a(this.a);
        }
        else {
            s = SendE2EMessageJob.b(this.a);
        }
        final ai a = new aK(SendE2EMessageJob.d(this.a).a2, SendE2EMessageJob.d(this.a).a2, SendE2EMessageJob.d(this.a).a2.g(), SendE2EMessageJob.d(this.a).a2, ha.g(s)).a(this.b);
        return new Pair((Object)SendE2EMessageJob.b(a.b()), (Object)a.a());
    }
    
    @Override
    public Object call() {
        return this.a();
    }
}
