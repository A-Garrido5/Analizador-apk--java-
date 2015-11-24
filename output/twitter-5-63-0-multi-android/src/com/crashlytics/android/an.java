// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.util.Locale;
import com.crashlytics.android.internal.bd;
import android.os.Process;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Date;
import com.crashlytics.android.internal.bo;
import java.util.concurrent.atomic.AtomicLong;

final class an
{
    private static final AtomicLong a;
    private static String b;
    
    static {
        a = new AtomicLong(0L);
    }
    
    public an(final bo bo) {
        final byte[] array = new byte[10];
        final long time = new Date().getTime();
        final long n = time / 1000L;
        final long n2 = time % 1000L;
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        final byte[] array2 = allocate.array();
        array[0] = array2[0];
        array[1] = array2[1];
        array[2] = array2[2];
        array[3] = array2[3];
        final byte[] a = a(n2);
        array[4] = a[0];
        array[5] = a[1];
        final byte[] a2 = a(an.a.incrementAndGet());
        array[6] = a2[0];
        array[7] = a2[1];
        final byte[] a3 = a((short)(Object)Integer.valueOf(Process.myPid()));
        array[8] = a3[0];
        array[9] = a3[1];
        final String a4 = bd.a(bo.b());
        final String a5 = bd.a(array);
        an.b = String.format(Locale.US, "%s-%s-%s-%s", a5.substring(0, 12), a5.substring(12, 16), a5.subSequence(16, 20), a4.substring(0, 12)).toUpperCase(Locale.US);
    }
    
    private static byte[] a(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    @Override
    public final String toString() {
        return an.b;
    }
}
