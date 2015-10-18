// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoPlaylist implements Parcelable, b
{
    public static final Parcelable$Creator CREATOR;
    static final List a;
    private final Video[] b;
    private final int c;
    private final Map d;
    private final String e;
    private final mc f;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
        a = Arrays.asList("ad", "video");
    }
    
    public VideoPlaylist(final Video[] b, final int c, final Map d, final String e, final mc f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int a(final a a) {
        if (this.b != null && a != null) {
            for (int i = 0; i < this.b.length; ++i) {
                if (a.equals(this.b[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public boolean a() {
        return this.c == 0 && this.j();
    }
    
    public int b() {
        if (!this.j() && this.c == 0) {
            return lg.av_playlist_download_failed;
        }
        return this.c;
    }
    
    public Video b(final int n) {
        final int c = this.c();
        Video video = null;
        if (n < c) {
            video = null;
            if (n > -1) {
                video = this.b[n];
            }
        }
        return video;
    }
    
    public int c() {
        final Video[] b = this.b;
        int length = 0;
        if (b != null) {
            length = this.b.length;
        }
        return length;
    }
    
    public Map d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final VideoPlaylist videoPlaylist = (VideoPlaylist)o;
            if (this.c != videoPlaylist.c) {
                return false;
            }
            if (!Arrays.equals(this.b, videoPlaylist.b)) {
                return false;
            }
            Label_0088: {
                if (this.e != null) {
                    if (this.e.equals(videoPlaylist.e)) {
                        break Label_0088;
                    }
                }
                else if (videoPlaylist.e == null) {
                    break Label_0088;
                }
                return false;
            }
            if (this.d != null) {
                if (this.d.equals(videoPlaylist.d)) {
                    return true;
                }
            }
            else if (videoPlaylist.d == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        final Map d = this.d;
        String s = null;
        if (d != null) {
            s = this.d.get("Network-Type");
        }
        return s;
    }
    
    public boolean g() {
        return true;
    }
    
    public String h() {
        return null;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b != null) {
            hashCode = Arrays.hashCode(this.b);
        }
        else {
            hashCode = 0;
        }
        final int n = 31 * (hashCode * 31 + this.c);
        int hashCode2;
        if (this.d != null) {
            hashCode2 = this.d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        final String e = this.e;
        int hashCode3 = 0;
        if (e != null) {
            hashCode3 = this.e.hashCode();
        }
        return n2 + hashCode3;
    }
    
    public mc i() {
        return this.f;
    }
    
    protected boolean j() {
        return this.b != null && this.b.length > 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int length;
        if (this.b != null) {
            length = this.b.length;
        }
        else {
            length = 0;
        }
        parcel.writeInt(length);
        parcel.writeTypedArray((Parcelable[])this.b, n);
        parcel.writeInt(this.c);
        wv.a(this.d, parcel);
        parcel.writeString(this.e);
    }
}
