// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Map;
import java.util.HashMap;
import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class aj implements aa
{
    private static final String[] z;
    private int a;
    private final aa[] b;
    private final PriorityQueue c;
    private int d;
    private long[] e;
    private int[] f;
    
    static {
        final String[] z2 = new String[2];
        String s = "#q\b\u000fjj";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "jp\u0019\u001e2%yL\u0018s$x\tJ\u007f+gL\u0003aj";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aj(final aa[] array, final int n) {
        final int v = MediaGalleryBase.v;
        this.b = array.clone();
        Label_0145: {
            if (n != 1) {
                break Label_0145;
            }
            Comparator comparator = new bs(null);
        Label_0094_Outer:
            while (true) {
                this.c = new PriorityQueue(4, comparator);
                this.e = new long[16];
                this.a = 0;
                this.f = new int[this.b.length];
                this.d = -1;
                this.c.clear();
                final int length = this.b.length;
                int n2 = 0;
                while (true) {
                    if (n2 >= length) {
                        return;
                    }
                    final a1 a1 = new a1(this.b[n2], n2);
                    try {
                        if (a1.a()) {
                            this.c.add(a1);
                        }
                        ++n2;
                        if (v != 0) {
                            return;
                        }
                        continue;
                        comparator = new r(null);
                        continue Label_0094_Outer;
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw ex;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private a1 a() {
        a1 a1 = this.c.poll();
        if (a1 == null) {
            a1 = null;
        }
        else {
            Label_0062: {
                if (a1.b != this.d) {
                    break Label_0062;
                }
                final int n = -1 + this.a;
                try {
                    final long[] e = this.e;
                    ++e[n];
                    if (MediaGalleryBase.v != 0) {
                        this.d = a1.b;
                        if (this.e.length == this.a) {
                            final long[] e2 = new long[2 * this.a];
                            System.arraycopy(this.e, 0, e2, 0, this.a);
                            this.e = e2;
                        }
                        this.e[this.a++] = (0x1L | this.d << 32);
                        return a1;
                    }
                }
                catch (IndexOutOfBoundsException ex) {
                    throw ex;
                }
            }
        }
        return a1;
    }
    
    @Override
    public bj a(final int n) {
        int n2 = 0;
        final int v = MediaGalleryBase.v;
        while (true) {
            if (n >= 0) {
                try {
                    if (n > this.e()) {
                        throw new IndexOutOfBoundsException(aj.z[0] + n + aj.z[1] + this.e());
                    }
                }
                catch (IndexOutOfBoundsException ex) {
                    throw ex;
                }
                Arrays.fill(this.f, 0);
                final int a = this.a;
                int i = 0;
                while (i < a) {
                    final long n3 = this.e[i];
                    final int n4 = (int)(-1L & n3);
                    final int n5 = (int)(n3 >> 32);
                    if (n2 + n4 > n) {
                        return this.b[n5].a(this.f[n5] + (n - n2));
                    }
                    n2 += n4;
                    final int[] f = this.f;
                    f[n5] += n4;
                    ++i;
                    if (v != 0) {
                        break;
                    }
                }
                while (true) {
                    final a1 a2 = this.a();
                    if (a2 == null) {
                        break;
                    }
                    if (n2 == n) {
                        final bj bj = a2.c;
                        try {
                            if (a2.a()) {
                                this.c.add(a2);
                                return bj;
                            }
                            return bj;
                        }
                        catch (IndexOutOfBoundsException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (a2.a()) {
                            this.c.add(a2);
                        }
                        ++n2;
                    }
                    catch (IndexOutOfBoundsException ex3) {
                        throw ex3;
                    }
                }
                return null;
            }
            continue;
        }
    }
    
    @Override
    public void a() {
        final int v = MediaGalleryBase.v;
        int i = 0;
        while (i < this.b.length) {
            this.b[i].a();
            ++i;
            if (v != 0) {
                break;
            }
        }
    }
    
    @Override
    public void a(final ContentObserver contentObserver) {
        final int v = MediaGalleryBase.v;
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            b[i].a(contentObserver);
            ++i;
            if (v != 0) {
                break;
            }
        }
    }
    
    @Override
    public HashMap b() {
        final int v = MediaGalleryBase.v;
        final HashMap hashMap = new HashMap();
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            hashMap.putAll(b[i].b());
            ++i;
            if (v != 0) {
                break;
            }
        }
        return hashMap;
    }
    
    @Override
    public void b(final ContentObserver contentObserver) {
        final int v = MediaGalleryBase.v;
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            b[i].b(contentObserver);
            ++i;
            if (v != 0) {
                break;
            }
        }
    }
    
    @Override
    public void c() {
        final int v = MediaGalleryBase.v;
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            b[i].c();
            ++i;
            if (v != 0) {
                break;
            }
        }
    }
    
    @Override
    public boolean d() {
        final int v = MediaGalleryBase.v;
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            final aa aa = b[i];
            try {
                if (!aa.d()) {
                    return false;
                }
            }
            catch (IndexOutOfBoundsException ex) {
                throw ex;
            }
            ++i;
            if (v != 0) {
                break;
            }
        }
        return true;
    }
    
    @Override
    public int e() {
        int n = 0;
        final int v = MediaGalleryBase.v;
        final aa[] b = this.b;
        final int length = b.length;
        int i = 0;
        while (i < length) {
            n += b[i].e();
            ++i;
            if (v != 0) {
                break;
            }
        }
        return n;
    }
}
