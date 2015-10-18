// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import com.whatsapp.fieldstats.b9;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.ba;
import android.os.PowerManager;
import android.os.Handler;
import android.os.PowerManager$WakeLock;
import java.util.ArrayList;

public class ao1
{
    private static ao1 d;
    private static final String[] z;
    private ek a;
    private ArrayList b;
    private PowerManager$WakeLock c;
    private Handler e;
    
    static {
        final String[] z2 = new String[4];
        String s = "W\u0004\u0014K2";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '\'';
                        break;
                    }
                    case 1: {
                        c2 = 'k';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '.';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Q\u0002\u0007K/S\u0019\u0002@3D\u0004\u0007K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "q\u0002\u0007K/s\u0019\u0002@3D\u0004\u0007G.@.\u0011\\/U";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Q\u0002\u0007K/S\u0019\u0002@3D\u0004\u0007K1R\u000e\u0016KoV\u001e\u0006[%\u0007";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private ao1() {
        this.b = new ArrayList();
        this.e = new Handler();
        final PowerManager powerManager = (PowerManager)App.aq.getSystemService(ao1.z[0]);
        if (powerManager != null) {
            this.c = powerManager.newWakeLock(1, ao1.z[1]);
        }
    }
    
    static PowerManager$WakeLock a(final ao1 ao1) {
        return ao1.c;
    }
    
    public static ao1 a() {
        synchronized (ao1.class) {
            if (ao1.d == null) {
                ao1.d = new ao1();
            }
            return ao1.d;
        }
    }
    
    private static void a(final Exception ex) {
        final ba ba = new ba();
        ba.a = ao1.z[2];
        ba.b = ex.toString();
        a5.a((Context)App.aq, ba);
    }
    
    static Handler b(final ao1 ao1) {
        return ao1.e;
    }
    
    static void b(final Exception ex) {
        a(ex);
    }
    
    static ArrayList c(final ao1 ao1) {
        return ao1.b;
    }
    
    public void a(final bi bi) {
        bi.c = 1;
        final MediaData mediaData = (MediaData)bi.N;
        mediaData.transferring = true;
        mediaData.progress = 0L;
        App.ak.a(bi, false, -1);
        synchronized (this.b) {
            Log.i(ao1.z[3] + bi.a.c + " " + mediaData.file.getAbsolutePath());
            this.b.add(bi);
            this.b.notifyAll();
            // monitorexit(this.b)
            if (this.a == null) {
                (this.a = new ek(this)).setPriority(1);
                this.a.start();
            }
        }
    }
}
