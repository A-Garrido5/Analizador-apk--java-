// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import com.twitter.library.util.an;
import android.net.Uri;
import android.content.Context;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoCta implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final String a;
    private final String b;
    private final Map c;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
        a = VideoCta.class.getName() + ".APP_NAME";
    }
    
    public VideoCta(final Parcel parcel) {
        this.b = parcel.readString();
        this.c = wv.a(parcel);
    }
    
    public VideoCta(final String b, final Map c) {
        this.b = b;
        this.c = c;
    }
    
    public Uri a(final Context context) {
        final String b = this.b;
        switch (b) {
            default: {
                return null;
            }
            case "cta_download_app": {
                return Uri.parse(an.a(context, this.b()));
            }
            case "cta_open_url":
            case "cta_watch_now": {
                return Uri.parse(this.a());
            }
        }
    }
    
    public String a() {
        if (this.c != null) {
            return this.c.get("url");
        }
        return null;
    }
    
    public String a(final boolean b) {
        final String b2 = this.b;
        switch (b2) {
            default: {
                return "";
            }
            case "cta_download_app": {
                if (b) {
                    return "cta_app_open_impression";
                }
                return "cta_app_install_impression";
            }
            case "cta_open_url": {
                return "cta_url_impression";
            }
            case "cta_watch_now": {
                return "cta_watch_impression";
            }
        }
    }
    
    public String b() {
        if (this.c != null) {
            return this.c.get("id");
        }
        return null;
    }
    
    public String b(final Context context) {
        final String b = this.b;
        switch (b) {
            default: {
                return context.getString(lg.video_cta_default_text);
            }
            case "cta_download_app": {
                return context.getString(lg.video_cta_download_app, new Object[] { this.c() });
            }
            case "cta_open_url": {
                return context.getString(lg.video_cta_open_url, new Object[] { this.e() });
            }
            case "cta_watch_now": {
                return context.getString(lg.video_cta_watch_now, new Object[] { this.e() });
            }
        }
    }
    
    public String b(final boolean b) {
        final String b2 = this.b;
        switch (b2) {
            default: {
                return "";
            }
            case "cta_download_app": {
                if (b) {
                    return "cta_app_open_click";
                }
                return "cta_app_install_click";
            }
            case "cta_open_url": {
                return "cta_url_click";
            }
            case "cta_watch_now": {
                return "cta_watch_click";
            }
        }
    }
    
    public String c() {
        if (this.c != null) {
            return this.c.get(VideoCta.a);
        }
        return null;
    }
    
    public String c(final Context context) {
        final String b = this.b;
        switch (b) {
            default: {
                return this.b(context);
            }
            case "cta_download_app": {
                return context.getString(lg.video_cta_download_app_already_installed, new Object[] { this.c() });
            }
        }
    }
    
    public Uri d() {
        final String a = this.a();
        Uri parse = null;
        if (a != null) {
            parse = Uri.parse(a);
        }
        return parse;
    }
    
    public int describeContents() {
        return 0;
    }
    
    String e() {
        final String a = this.a();
        String host = "";
        if (a != null) {
            host = Uri.parse(a).getHost();
        }
        return host;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final VideoCta videoCta = (VideoCta)o;
            Label_0061: {
                if (this.c != null) {
                    if (this.c.equals(videoCta.c)) {
                        break Label_0061;
                    }
                }
                else if (videoCta.c == null) {
                    break Label_0061;
                }
                return false;
            }
            if (this.b != null) {
                if (this.b.equals(videoCta.b)) {
                    return true;
                }
            }
            else if (videoCta.b == null) {
                return true;
            }
            return false;
        }
        return true;
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
        final Map c = this.c;
        int hashCode2 = 0;
        if (c != null) {
            hashCode2 = this.c.hashCode();
        }
        return n + hashCode2;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        wv.a(this.c, parcel);
    }
}
