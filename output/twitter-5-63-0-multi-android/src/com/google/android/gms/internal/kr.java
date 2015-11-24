// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class kr
{
    private void a(final StringBuilder sb, final kr$a kr$a, final Object o) {
        if (kr$a.b() == 11) {
            sb.append(kr$a.h().cast(o).toString());
            return;
        }
        if (kr$a.b() == 7) {
            sb.append("\"");
            sb.append(bh.a((String)o));
            sb.append("\"");
            return;
        }
        sb.append(o);
    }
    
    private void a(final StringBuilder sb, final kr$a kr$a, final ArrayList list) {
        sb.append("[");
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append(",");
            }
            final Object value = list.get(i);
            if (value != null) {
                this.a(sb, kr$a, value);
            }
        }
        sb.append("]");
    }
    
    protected Object a(final kr$a kr$a, Object a) {
        if (kr$a.k != null) {
            a = kr$a.a(a);
        }
        return a;
    }
    
    protected abstract Object a(final String p0);
    
    public abstract HashMap a();
    
    protected boolean a(final kr$a kr$a) {
        if (kr$a.d() != 11) {
            return this.b(kr$a.f());
        }
        if (kr$a.e()) {
            return this.d(kr$a.f());
        }
        return this.c(kr$a.f());
    }
    
    protected Object b(final kr$a kr$a) {
        final String f = kr$a.f();
        if (kr$a.h() != null) {
            ap.a(this.a(kr$a.f()) == null, "Concrete field shouldn't be value object: %s", kr$a.f());
            HashMap hashMap;
            if (kr$a.e()) {
                hashMap = this.c();
            }
            else {
                hashMap = this.b();
            }
            if (hashMap != null) {
                return hashMap.get(f);
            }
            try {
                return this.getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), (Class<?>[])new Class[0]).invoke(this, new Object[0]);
            }
            catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return this.a(kr$a.f());
    }
    
    public HashMap b() {
        return null;
    }
    
    protected abstract boolean b(final String p0);
    
    public HashMap c() {
        return null;
    }
    
    protected boolean c(final String s) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }
    
    protected boolean d(final String s) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }
    
    @Override
    public String toString() {
        final HashMap a = this.a();
        final StringBuilder sb = new StringBuilder(100);
        for (final String s : a.keySet()) {
            final kr$a kr$a = (kr$a)a.get(s);
            if (this.a(kr$a)) {
                final Object a2 = this.a(kr$a, this.b(kr$a));
                if (sb.length() == 0) {
                    sb.append("{");
                }
                else {
                    sb.append(",");
                }
                sb.append("\"").append(s).append("\":");
                if (a2 == null) {
                    sb.append("null");
                }
                else {
                    switch (kr$a.d()) {
                        default: {
                            if (kr$a.c()) {
                                this.a(sb, kr$a, (ArrayList)a2);
                                continue;
                            }
                            this.a(sb, kr$a, a2);
                            continue;
                        }
                        case 8: {
                            sb.append("\"").append(bd.a((byte[])a2)).append("\"");
                            continue;
                        }
                        case 9: {
                            sb.append("\"").append(bd.b((byte[])a2)).append("\"");
                            continue;
                        }
                        case 10: {
                            bi.a(sb, (HashMap)a2);
                            continue;
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        }
        else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
