// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketAddress;
import com.whatsapp.util.Log;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

class h
{
    private static final InetSocketAddress a;
    private static final InetSocketAddress b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[27];
        String s = "h5Z\u0015qu-\u001f\u0006l&(\u001f\u0017zo,\u001f\u0010?q2\u0013\u0018z&.\b\rvh=Z\u0000p&(\u001f\u0007pj,\u001fT";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0016:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
            Label_0840_Outer:
                while (true) {
                    Label_0794: {
                        if (length > n3) {
                            break Label_0794;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "s4\u001f\foc9\u000e\u0011{&.\u0003\u0004z&(\u001f\u0000jt4\u001f\u0010?q2\u0013\u0018z&.\b\rvh=Z\u0000p&(\u001f\u0007pj,\u001fT";
                                n2 = 1;
                                array = z2;
                                n = 0;
                                continue Label_0016;
                            }
                            case 0: {
                                array[n2] = intern;
                                s = "w/\u001f\u0006fo4\u001dT";
                                n2 = 2;
                                array = z2;
                                n = 1;
                                continue Label_0016;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                array = z2;
                                s = "c(\b\u001bm&9\u0015\u0010z&-\u001b\u0007?u?\u000eTvhz\b\u0011lv5\u0014\u0007z&-\u0012\u001dscz\u000e\u0006fo4\u001dTkiz\b\u0011li6\f\u0011?";
                                n = 2;
                                continue Label_0016;
                            }
                            case 2: {
                                array[n2] = intern;
                                s = "&<\u0015\u0006?";
                                n = 3;
                                n2 = 4;
                                array = z2;
                                continue Label_0016;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                array = z2;
                                s = "&-\u0013\u0000w&";
                                n = 4;
                                continue Label_0016;
                            }
                            case 4: {
                                array[n2] = intern;
                                s = "&<\u0015\u0006?";
                                n = 5;
                                n2 = 6;
                                array = z2;
                                continue Label_0016;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                array = z2;
                                s = "t?\u0019\u0011vp?\u001eTmc)\n\u001bqu?Z\u0003vr2Z\u0001qc\"\n\u0011|r?\u001eTvbz\r\u001cvj?Z\u0000m\u007f3\u0014\u0013?r5Z\u0006zu5\u0016\u0002z&";
                                n = 6;
                                continue Label_0016;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "w/\u001f\u0006fo4\u001dT";
                                n = 7;
                                array = z2;
                                continue Label_0016;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "&<\u0015\u0006?";
                                n = 8;
                                array = z2;
                                continue Label_0016;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "&7\tTko7\u001f\u001bjr";
                                n = 9;
                                array = z2;
                                continue Label_0016;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "t?\t\u001bsp?\u001eT";
                                n = 10;
                                array = z2;
                                continue Label_0016;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "&<\u0015\u0006?";
                                n = 11;
                                array = z2;
                                continue Label_0016;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "r3\u0017\u0011{&5\u000f\u0000?q2\u0013\u0018z&+\u000f\u0011m\u007f3\u0014\u0013?";
                                n = 12;
                                array = z2;
                                continue Label_0016;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "s4\u001f\foc9\u000e\u0011{&9\u0016\u0015luz\b\u0011ks(\u0014\u0011{&-\u0012\u001dscz\u000e\u0006fo4\u001dTkiz\b\u0011li6\f\u0011?";
                                n = 13;
                                array = z2;
                                continue Label_0016;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "r3\u0017\u0011{&5\u000f\u0000?q2\u0013\u0018z&+\u000f\u0011m\u007f3\u0014\u0013?";
                                n = 14;
                                array = z2;
                                continue Label_0016;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = "&;\u001e\u0010mc)\t\u0011l&/\t\u001dqaz\u0018\u0015|m/\nT[H\tZ\u0012ptz";
                                n = 15;
                                array = z2;
                                continue Label_0016;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = "r3\u0017\u0011ps.Z\u0003wo6\u001fTkt#\u0013\u001ax&.\u0015Tmc)\u0015\u0018icz";
                                n = 16;
                                array = z2;
                                continue Label_0016;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "s4\u001f\foc9\u000e\u0011{&(\u001f\u0017pt>Z\u0018zh=\u000e\u001c?t?\u000e\u0001mh?\u001eThn3\u0016\u0011?r(\u0003\u001dqaz\u000e\u001b?t?\t\u001bsp?Z";
                                n = 17;
                                array = z2;
                                continue Label_0016;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "&-\u0013\u0000w&";
                                n = 18;
                                array = z2;
                                continue Label_0016;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "t?\u0019\u0011vp?\u001eTkt/\u0014\u0017~r?\u001eTmc)\n\u001bqu?Z\u0003wo6\u001fTkt#\u0013\u001ax&.\u0015Tmc)\u0015\u0018icz";
                                n = 19;
                                array = z2;
                                continue Label_0016;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = "&7\tTko7\u001f\u001bjr";
                                n = 20;
                                array = z2;
                                continue Label_0016;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "b3\u001eTqi.Z\u0006ze?\u0013\u0002z&(\u001f\u0007oi4\t\u0011?`(\u0015\u0019?u?\b\u0002ztz\r\u001cvj?Z\u0000m\u007f3\u0014\u0013?r5Z\u0006zu5\u0016\u0002z&";
                                n = 21;
                                array = z2;
                                continue Label_0016;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "s4\u001f\foc9\u000e\u0011{&\u001351ge?\n\u0000vi4Z";
                                n = 22;
                                array = z2;
                                continue Label_0016;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "o5\u001f\f|c*\u000e\u001dphz\r\u001cvj?Z\u0000m\u007f3\u0014\u0013?r5Z\u0006zu5\u0016\u0002z&";
                                n = 23;
                                array = z2;
                                continue Label_0016;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "c(\b\u001bm&*\u001b\u0006lo4\u001dTmc)\n\u001bqu?Z\u0003wo6\u001fTkt#\u0013\u001ax&.\u0015Tmc)\u0015\u0018icz";
                                n = 24;
                                array = z2;
                                continue Label_0016;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "&-\u0012\u001dscz\u000e\u0006fo4\u001dTkiz\b\u0011li6\f\u0011?";
                                n = 25;
                                array = z2;
                                continue Label_0016;
                            }
                            case 25: {
                                break;
                            }
                        }
                        array[n2] = intern;
                        z = z2;
                        try {
                            b = new InetSocketAddress(InetAddress.getByAddress(new byte[] { 8, 8, 8, 8 }), 53);
                            a = new InetSocketAddress(InetAddress.getByAddress(new byte[] { 8, 8, 4, 4 }), 53);
                            return;
                            while (true) {
                                char c = '\0';
                                final char c2;
                                charArray[n3] = (char)(c ^ c2);
                                ++n3;
                                continue Label_0840_Outer;
                                Label_0857: {
                                    c = '\u0006';
                                }
                                continue;
                                Label_0864:
                                c = 'Z';
                                continue;
                                Label_0878:
                                c = 't';
                                continue;
                                c2 = charArray[n3];
                                Label_0836:
                                c = '\u001f';
                                continue;
                                Label_0871:
                                c = 'z';
                                continue;
                            }
                        }
                        // switch([Lcom.strobel.decompiler.ast.Label;@7c91a270, n3 % 5)
                        catch (UnknownHostException ex) {
                            throw new Error(ex);
                        }
                    }
                }
            }
            break;
        }
    }
    
    static g[] a(final String s, final int n) {
        final boolean a = com.whatsapp.util.dns.b.a;
        final d a2 = d.a(s);
        final byte[] b = a2.b();
        final byte[] array = new byte[512];
        final DatagramPacket datagramPacket = new DatagramPacket(array, array.length);
        d a3 = null;
        Label_0494: {
            try {
                final DatagramSocket datagramSocket = new DatagramSocket();
                try {
                    Log.i(h.z[8] + h.b + h.z[12] + s + h.z[5] + n + h.z[21]);
                    datagramSocket.connect(h.b);
                    datagramSocket.setSoTimeout(n / 2);
                    datagramSocket.send(new DatagramPacket(b, b.length));
                    datagramSocket.receive(datagramPacket);
                    a3 = d.a(array);
                    if (a3 != null) {
                        break Label_0494;
                    }
                    try {
                        throw new UnknownHostException(h.z[25] + s);
                    }
                    catch (InterruptedIOException ex) {
                        throw ex;
                    }
                }
                catch (InterruptedIOException ex11) {
                    Log.i(h.z[13] + h.b + h.z[4] + s);
                    datagramSocket.disconnect();
                    try {
                        Log.i(h.z[2] + h.a + h.z[9] + s + h.z[19] + n + h.z[10]);
                        datagramSocket.connect(h.a);
                        datagramSocket.setSoTimeout(n / 2);
                        datagramSocket.send(new DatagramPacket(b, b.length));
                        datagramSocket.receive(datagramPacket);
                    }
                    catch (InterruptedIOException ex12) {
                        Log.i(h.z[15] + h.a + h.z[6] + s);
                        throw new UnknownHostException(h.z[17] + s);
                    }
                }
            }
            catch (IOException ex2) {
                Log.w(h.z[23] + ex2 + h.z[26] + s);
                throw new UnknownHostException(h.z[24] + s);
            }
            try {
                if (a3.c().g() != a2.c().g()) {
                    throw new UnknownHostException(h.z[7] + s);
                }
            }
            catch (InterruptedIOException ex3) {
                throw ex3;
            }
        }
        try {
            if (!a3.c().e()) {
                throw new UnknownHostException(h.z[22] + s);
            }
        }
        catch (InterruptedIOException ex4) {
            throw ex4;
        }
        try {
            if (a3.c().d()) {
                throw new UnknownHostException(h.z[20] + s);
            }
        }
        catch (InterruptedIOException ex5) {
            throw ex5;
        }
        try {
            if (a3.c().h() != 0) {
                throw new UnknownHostException(h.z[3] + s);
            }
        }
        catch (InterruptedIOException ex6) {
            throw ex6;
        }
        try {
            if (a3.a().length == 0) {
                throw new UnknownHostException(h.z[0] + s);
            }
        }
        catch (InterruptedIOException ex7) {
            throw ex7;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final g[] array2 = new g[a3.a().length];
        int i = 0;
        while (i < a3.a().length) {
            final e e = a3.a()[i];
            try {
                if (e.a() != 1) {
                    throw new UnknownHostException(h.z[14] + s);
                }
            }
            catch (InterruptedIOException ex8) {
                throw ex8;
            }
            try {
                if (e.d() != 1) {
                    throw new UnknownHostException(h.z[1] + s);
                }
            }
            catch (InterruptedIOException ex9) {
                throw ex9;
            }
            try {
                if (e.g() != 4) {
                    throw new UnknownHostException(h.z[18] + s);
                }
            }
            catch (InterruptedIOException ex10) {
                throw ex10;
            }
            array2[i] = new g(InetAddress.getByAddress(a3.a(e.e()), e.b()), currentTimeMillis + 1000L * e.f());
            ++i;
            if (a) {
                break;
            }
        }
        Log.i(h.z[11] + array2.length + h.z[16] + s);
        return array2;
    }
}
