// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.w;
import com.whatsapp.fieldstats.r;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.bi;

public class Voip$DefaultSignalingCallback implements Voip$SignalingCallback
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "<IkP";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000b';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = ')';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1LmZ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "1LmZ";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void sendAccept(final String s, final String s2, final String s3, final int n, final byte[][] array, final int[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final int n2) {
        App.a(bi.a(s2, true).c, s2, s, s3, n, array, array2, array3, array4, array5, n2);
    }
    
    @Override
    public void sendOffer(final String s, final String s2, final boolean b, final byte[][] array, final int[] array2, final byte[] array3, final byte[] array4) {
        App.a(bi.a(s2, true).c, s2, s, new String[] { Voip$DefaultSignalingCallback.z[1], Voip$DefaultSignalingCallback.z[2] }, new int[] { 8000, 16000 }, array, array2, array3, array4);
    }
    
    @Override
    public void sendPreAccept(final String s, final String s2, final String s3, final int n, final byte[] array) {
        App.a(bi.a(s2, true).c, s2, s, s3, n, array);
    }
    
    @Override
    public void sendReject(final String s, final String s2, final String s3) {
        App.b(bi.a(s2, true).c, s2, s, s3);
        if (Voip$DefaultSignalingCallback.z[0].equals(s3)) {
            final bi a = App.ak.a(new c6(s2, false, Voip.a(s)));
            if (a != null) {
                App.aq.a5().post((Runnable)new atu(this, a));
                VoiceService.a(r.BUSY, s2, null, null, null, null, false);
            }
        }
    }
    
    @Override
    public void sendRelayElection(final String s, final String s2, final byte[] array, final int n) {
        App.a(bi.a(s2, true).c, s2, s, array, n);
    }
    
    @Override
    public void sendRelayLatencies(final String s, final String s2, final byte[][] array, final int[] array2) {
        App.b(bi.a(s2, true).c, s2, s, array, array2);
    }
    
    @Override
    public void sendTerminate(final String s, final String s2, final String s3) {
        final c6 a = bi.a(s2, true);
        final Voip$CallInfo callInfo = Voip.getCallInfo();
        long callDuration;
        if (callInfo != null) {
            callDuration = callInfo.getCallDuration();
        }
        else {
            callDuration = 0L;
        }
        App.a(a.c, s2, s, s3, callDuration);
    }
    
    @Override
    public void sendTransport(final String s, final String s2, final byte[][] array, final int[] array2) {
        App.a(bi.a(s2, true).c, s2, s, array, array2);
    }
}
