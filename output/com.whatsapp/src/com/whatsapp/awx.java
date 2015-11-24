// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.HashMap;
import android.database.ContentObserver;
import com.whatsapp.protocol.bi;
import com.whatsapp.gallerypicker.ag;
import com.whatsapp.gallerypicker.aq;
import com.whatsapp.gallerypicker.e;
import android.database.Cursor;
import com.whatsapp.gallerypicker.bj;
import android.support.v4.util.LruCache;
import android.content.ContentResolver;
import com.whatsapp.gallerypicker.aa;

class awx implements aa
{
    private static final String[] z;
    private ContentResolver a;
    private String b;
    private final LruCache c;
    private final LruCache d;
    private a8a e;
    
    static {
        final String[] z2 = new String[3];
        String s = "]fr,\u000f";
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
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = '+';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = 'I';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Bbw.\u0005";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Jzr \u000f";
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
    
    public awx(final ContentResolver a, final String b) {
        this.d = new LruCache(512);
        this.c = new LruCache(512);
        this.b = b;
        this.a = a;
        this.e = new a8a(b, App.ak.z(b));
    }
    
    @Override
    public bj a(final int n) {
        final bj bj = (bj)this.d.get(n);
        if (bj == null) {
            while (true) {
                while (true) {
                    Label_0073: {
                        synchronized (this) {
                            if (this.e.moveToPosition(n)) {
                                final bj a = this.a((Cursor)this.e);
                                if (a != null) {
                                    this.d.put(n, a);
                                }
                                return a;
                            }
                            break Label_0073;
                        }
                        break;
                    }
                    final bj a = null;
                    continue;
                }
            }
        }
        return bj;
    }
    
    protected bj a(final Cursor cursor) {
        final String string = cursor.getString(1);
        final String string2 = cursor.getString(4);
        final long long1 = cursor.getLong(2);
        final long long2 = cursor.getLong(5);
        if (string2.startsWith(awx.z[1])) {
            return new e(this, this.a, string, long1);
        }
        if (string2.startsWith(awx.z[0])) {
            return new aq(this, this.a, string, long1, long2);
        }
        if (string2.startsWith(awx.z[2])) {
            return new ag(this, this.a, string, long1, long2);
        }
        return null;
    }
    
    public bi a(final int n) {
        final bi bi = (bi)this.c.get(n);
        if (bi == null) {
            while (true) {
                while (true) {
                    Label_0072: {
                        synchronized (this) {
                            if (this.e.moveToPosition(n)) {
                                final bi b = this.e.b();
                                if (b != null) {
                                    this.c.put(n, b);
                                }
                                return b;
                            }
                            break Label_0072;
                        }
                        break;
                    }
                    final bi b = null;
                    continue;
                }
            }
        }
        return bi;
    }
    
    @Override
    public void a() {
        this.e.close();
    }
    
    @Override
    public void a(final ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.unregisterContentObserver(contentObserver);
        }
    }
    
    @Override
    public HashMap b() {
        return null;
    }
    
    @Override
    public void b(final ContentObserver contentObserver) {
        if (this.e != null) {
            this.e.registerContentObserver(contentObserver);
        }
    }
    
    @Override
    public void c() {
        this.e.requery();
    }
    
    @Override
    public boolean d() {
        return this.e() == 0;
    }
    
    @Override
    public int e() {
        return this.e.getCount();
    }
}
