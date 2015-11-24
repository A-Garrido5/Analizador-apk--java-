// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import org.apache.thrift.TException;
import android.util.Log;
import org.apache.thrift.TBase;
import org.apache.thrift.e;
import java.util.Iterator;
import android.database.Cursor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import com.twitter.rufous.thriftandroid.b;
import com.twitter.rufous.thriftandroid.RufousScribeLogCollection;
import com.twitter.library.network.OAuthToken;
import android.content.Context;

public class t extends s
{
    public t(final Context context, final long n, final OAuthToken oAuthToken, final ic ic, final String s, final c c, final q q, final boolean b) {
        super(context, n, oAuthToken, ic, s, c, q, b, ScribeDatabaseHelper$LogType.b);
    }
    
    public t(final Context context, final long n, final OAuthToken oAuthToken, final String s, final ic ic) {
        this(context, n, oAuthToken, ic, s, ScribeDatabaseHelper.a(context, n), ScribeService.a, ScribeService.d);
    }
    
    protected RufousScribeLogCollection a(final String s, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Log record limit must greater than 0.");
        }
        this.g.a("0", s, ScribeDatabaseHelper$LogType.b.toString(), n);
        final b b = new b();
        final Cursor c = this.g.c(s);
        if (c == null) {
            return null;
        }
        HashMap<Object, ArrayList<ByteBuffer>> hashMap;
        try {
            hashMap = new HashMap<Object, ArrayList<ByteBuffer>>();
            while (c.moveToNext()) {
                final String string = c.getString(0);
                final byte[] blob = c.getBlob(1);
                ArrayList<ByteBuffer> list = hashMap.get(string);
                if (list == null) {
                    list = new ArrayList<ByteBuffer>();
                    hashMap.put(string, list);
                }
                list.add(ByteBuffer.wrap(blob));
            }
        }
        finally {
            c.close();
        }
        if (hashMap.size() == 0) {
            c.close();
            return null;
        }
        for (final String s2 : hashMap.keySet()) {
            b.a(RufousScribeLogCollection.b, s2, hashMap.get(s2));
        }
        final RufousScribeLogCollection a = b.a();
        c.close();
        return a;
    }
    
    protected boolean a(final RufousScribeLogCollection collection) {
        final HashMap hashMap = (HashMap)collection.b(RufousScribeLogCollection.b);
        return hashMap != null && hashMap.size() > 0;
    }
    
    protected int b(final RufousScribeLogCollection collection) {
        try {
            final byte[] a = new e().a(collection);
            if (this.i) {
                Log.d("ScribeService", "Payload size = " + a.length);
            }
            this.h.a(this.d).a(a).a(this.f).b(this.b);
            return a.length;
        }
        catch (TException ex) {
            throw new IllegalArgumentException("Failed to serialize logs", ex);
        }
    }
}
