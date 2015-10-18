// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.proto.E2E$Message$Builder;
import com.google.hv;
import org.whispersystems.aq;
import com.whatsapp.ha;
import com.whatsapp.App;
import org.whispersystems.d;
import org.whispersystems.p;
import com.whatsapp.proto.E2E$Message;
import com.whatsapp.protocol.bi;
import java.util.concurrent.Callable;

class b implements Callable
{
    private static final String z;
    final bi a;
    final SendSenderKeyJob b;
    final boolean c;
    
    static {
        final char[] charArray = "dJ\u0006l>EM[z&T\u0017F~\"".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'V';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = '(';
                    break;
                }
                case 3: {
                    c2 = '\u001b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    b(final SendSenderKeyJob b, final boolean c, final bi a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public E2E$Message a() {
        final byte[] a = new p(SendSenderKeyJob.b(this.b).a2.h()).a(new aq(SendSenderKeyJob.a(this.b), ha.g(App.aX.jabber_id + com.whatsapp.jobqueue.job.b.z))).a();
        final E2E$Message$Builder builder = E2E$Message.newBuilder();
        builder.getSenderKeyDistributionMessageBuilder().setGroupId(SendSenderKeyJob.a(this.b));
        builder.getSenderKeyDistributionMessageBuilder().setAxolotlSenderKeyDistributionMessage(hv.a(a));
        if (this.c) {
            builder.setConversation(this.a.c());
        }
        return builder.build();
    }
    
    @Override
    public Object call() {
        return this.a();
    }
}
