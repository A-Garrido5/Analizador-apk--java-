// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import com.twitter.library.av.playback.au;
import java.util.Collections;
import java.util.HashMap;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class AudioPlaylist implements Parcelable, b
{
    public static final Parcelable$Creator CREATOR;
    static final List a;
    private final String b;
    private final String c;
    private final Audio[] d;
    private final int e;
    private final String f;
    private Map g;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
        a = Arrays.asList("audio");
    }
    
    public AudioPlaylist(final int e, final String f) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = e;
        this.f = f;
    }
    
    protected AudioPlaylist(final Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        final int int1 = parcel.readInt();
        Audio[] d;
        if (int1 >= 0) {
            d = new Audio[int1];
        }
        else {
            d = null;
        }
        this.d = d;
        if (this.d != null) {
            parcel.readTypedArray((Object[])this.d, Audio.CREATOR);
        }
        int n;
        if (parcel.readByte() == 1) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            parcel.readMap((Map)hashMap, AudioPlaylist.class.getClassLoader());
            this.g = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        }
    }
    
    public AudioPlaylist(final String b, final String c, final Audio[] d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = 0;
        this.f = null;
    }
    
    public static String a(final Map map) {
        if (map != null) {
            return map.get("integration_partner");
        }
        return null;
    }
    
    public int a(final a a) {
        if (this.d != null && a != null) {
            for (int i = 0; i < this.d.length; ++i) {
                if (a.equals(this.d[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void a(final au au, final Map map) {
        if (au == null) {
            return;
        }
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(6);
        hashMap.putAll(au.d());
        if (map != null) {
            hashMap.put("Network-Type", map.get("Network-Type"));
        }
        this.g = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public boolean a() {
        return this.e == 0 && this.c() > 0;
    }
    
    public int b() {
        return this.e;
    }
    
    public Audio b(final int n) {
        Audio audio;
        if (n < this.c() && n > -1) {
            audio = this.d[n];
        }
        else {
            audio = null;
        }
        if (n >= 1) {
            return null;
        }
        return audio;
    }
    
    public int c() {
        final Audio[] d = this.d;
        int length = 0;
        if (d != null) {
            length = this.d.length;
        }
        if (length > 1) {
            return 1;
        }
        return length;
    }
    
    public Map d() {
        return new HashMap();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final AudioPlaylist audioPlaylist = (AudioPlaylist)o;
            if (this.e != audioPlaylist.e) {
                return false;
            }
            Label_0072: {
                if (this.f != null) {
                    if (this.f.equals(audioPlaylist.f)) {
                        break Label_0072;
                    }
                }
                else if (audioPlaylist.f == null) {
                    break Label_0072;
                }
                return false;
            }
            Label_0102: {
                if (this.c != null) {
                    if (this.c.equals(audioPlaylist.c)) {
                        break Label_0102;
                    }
                }
                else if (audioPlaylist.c == null) {
                    break Label_0102;
                }
                return false;
            }
            if (!Arrays.equals(this.d, audioPlaylist.d)) {
                return false;
            }
            Label_0148: {
                if (this.b != null) {
                    if (this.b.equals(audioPlaylist.b)) {
                        break Label_0148;
                    }
                }
                else if (audioPlaylist.b == null) {
                    break Label_0148;
                }
                return false;
            }
            if (this.g != null) {
                if (this.g.equals(audioPlaylist.g)) {
                    return true;
                }
            }
            else if (audioPlaylist.g == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        if (this.g != null) {
            return this.g.get("Network-Type");
        }
        return null;
    }
    
    public boolean g() {
        return false;
    }
    
    public String h() {
        return a(this.g);
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.c != null) {
            hashCode2 = this.c.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.d != null) {
            hashCode3 = Arrays.hashCode(this.d);
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (31 * (hashCode3 + n2) + this.e);
        int hashCode4;
        if (this.f != null) {
            hashCode4 = this.f.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        final Map g = this.g;
        int hashCode5 = 0;
        if (g != null) {
            hashCode5 = this.g.hashCode();
        }
        return n4 + hashCode5;
    }
    
    public mc i() {
        return null;
    }
    
    public String j() {
        return this.b;
    }
    
    public Map k() {
        return this.g;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        int length;
        if (this.d != null) {
            length = this.d.length;
        }
        else {
            length = -1;
        }
        parcel.writeInt(length);
        parcel.writeTypedArray((Parcelable[])this.d, n);
        byte b;
        if (this.g != null) {
            b = 1;
        }
        else {
            b = 0;
        }
        parcel.writeByte(b);
        parcel.writeMap(this.g);
    }
}
