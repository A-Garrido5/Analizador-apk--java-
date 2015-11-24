// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.twitter.library.featureswitch.SettingVersionDetails;
import com.twitter.library.network.ae;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.telephony.d;
import com.twitter.library.telephony.a;
import android.text.TextUtils;
import org.apache.http.conn.ConnectTimeoutException;
import java.net.SocketTimeoutException;
import com.twitter.library.av.AVTweetDataProvider;
import com.twitter.library.av.p;
import com.twitter.library.provider.Tweet;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.internal.network.l;
import android.content.Context;
import com.twitter.util.k;
import android.os.BadParcelableException;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;

public class TwitterScribeLog extends ScribeLog
{
    public static final Parcelable$Creator CREATOR;
    protected String e;
    protected int f;
    protected String g;
    private ArrayList h;
    private String i;
    private String j;
    private String k;
    private long l;
    private String m;
    private long n;
    private long o;
    private WebsiteAssetsLog p;
    
    static {
        CREATOR = (Parcelable$Creator)new x();
    }
    
    public TwitterScribeLog(final long n) {
        super(n);
        this.h = new ArrayList();
        this.l = -1L;
        this.n = -1L;
        this.o = -1L;
    }
    
    public TwitterScribeLog(final Parcel parcel) {
        super(parcel);
        this.h = new ArrayList();
        this.l = -1L;
        this.n = -1L;
        this.o = -1L;
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readLong();
        this.m = parcel.readString();
        this.n = parcel.readLong();
        this.o = parcel.readLong();
        try {
            this.p = (WebsiteAssetsLog)parcel.readParcelable(WebsiteAssetsLog.class.getClassLoader());
        }
        catch (BadParcelableException ex) {}
    }
    
    public static String a(final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3) {
        String s5;
        String s6;
        if (twitterScribeAssociation != null) {
            final String s4 = (String)k.a(twitterScribeAssociation.a(), "tweet");
            final String a = k.a(twitterScribeAssociation.b());
            s5 = s4;
            s6 = a;
        }
        else {
            s5 = "tweet";
            s6 = null;
        }
        return ScribeLog.a(s5, s6, s, s2, s3);
    }
    
    public static void a(final Context context, final TwitterScribeLog twitterScribeLog, final l l) {
        if (l.c != null) {
            twitterScribeLog.c(l.c.getClass().getName());
        }
        twitterScribeLog.a(l.a);
        twitterScribeLog.a(l);
        String s;
        if (TelephonyUtil.c(context)) {
            s = "connected";
        }
        else {
            s = "disconnected";
        }
        twitterScribeLog.d(s);
        twitterScribeLog.g();
    }
    
    public static void a(final Tweet tweet, final TwitterScribeItem twitterScribeItem) {
        a(tweet, twitterScribeItem, p.a());
    }
    
    static void a(final Tweet tweet, final TwitterScribeItem twitterScribeItem, final p p3) {
        final AVTweetDataProvider a = p3.a(tweet);
        twitterScribeItem.M = a.b();
        twitterScribeItem.N = a.a();
    }
    
    public static int b(final l l) {
        if (l == null || l.a == 200) {
            return -1;
        }
        if (l.a != 0) {
            return 1;
        }
        if (!l.d) {
            return 0;
        }
        if (l.c instanceof SocketTimeoutException || l.c instanceof ConnectTimeoutException) {
            return 2;
        }
        return 4;
    }
    
    public static String c(final Context context) {
        final StringBuilder sb = new StringBuilder();
        try {
            TelephonyUtil.d(context);
            int n = 0;
            String a;
            if (!TelephonyUtil.c(context)) {
                a = "offline";
            }
            else if (TelephonyUtil.g()) {
                a = "unstable";
                n = TelephonyUtil.b();
            }
            else if (TelephonyUtil.c()) {
                a = "wifi";
                n = 0;
            }
            else {
                a = TelephonyUtil.a();
                n = TelephonyUtil.b();
                final d e = TelephonyUtil.e();
                if (!TextUtils.isEmpty((CharSequence)e.c)) {
                    sb.append("net_carrier").append('=').append(e.c).append(',');
                }
                if (!TextUtils.isEmpty((CharSequence)e.b)) {
                    sb.append("net_subType").append('=').append(e.b).append(',');
                }
            }
            sb.append("net_state").append('=').append(a).append(',');
            sb.append("net_type").append('=').append(n).append(',');
            sb.append("net_signalStrength").append('=').append(com.twitter.library.telephony.a.a().b());
            return sb.toString();
        }
        catch (Exception ex) {
            final int length = sb.length();
            if (length > 0 && sb.charAt(length - 1) == ',') {
                sb.setLength(length - 1);
                return sb.toString();
            }
            return sb.toString();
        }
    }
    
    public TwitterScribeLog a(final long n, final long o) {
        this.n = n;
        this.o = o;
        return this;
    }
    
    public TwitterScribeLog a(final long n, final PromotedContent promotedContent, final String s) {
        this.b(TwitterScribeItem.a(n, promotedContent, s, null));
        return this;
    }
    
    public TwitterScribeLog a(final long n, final PromotedContent promotedContent, final String s, final int n2) {
        this.a(TwitterScribeItem.a(n, promotedContent, s, null, n2));
        return this;
    }
    
    public TwitterScribeLog a(final Context context, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final String s) {
        if (tweet != null) {
            this.a(TwitterScribeItem.a(context, tweet, twitterScribeAssociation, s));
            if (tweet.E() && tweet.O()) {
                this.a(TwitterScribeItem.a(context, tweet.I));
            }
        }
        return this;
    }
    
    public TwitterScribeLog a(final Context context, final String s, final vc vc) {
        if (vc != null) {
            this.a(TwitterScribeItem.a(context, s, vc));
        }
        return this;
    }
    
    public TwitterScribeLog a(final HttpOperation httpOperation, final boolean b) {
        final l l = httpOperation.l();
        if ("cdn::::request".equals(this.a())) {
            this.a = httpOperation.b("x-cache");
        }
        else if (ae.d(httpOperation)) {
            this.a = "polling";
        }
        else if (b) {
            this.a = "non-polling-foreground";
        }
        else {
            this.a = "non-polling-background";
        }
        return (TwitterScribeLog)this.a(httpOperation.i().toString(), l);
    }
    
    public TwitterScribeLog a(final SettingVersionDetails settingVersionDetails) {
        if (settingVersionDetails != null) {
            this.i = settingVersionDetails.featureSwitchesVersion;
            this.j = settingVersionDetails.experimentsVersion;
        }
        return this;
    }
    
    public TwitterScribeLog a(final WebsiteAssetsLog p) {
        this.p = p;
        return this;
    }
    
    public TwitterScribeLog a(final String e, final int f, final String g) {
        this.e = e;
        this.f = f;
        this.g = g;
        return this;
    }
    
    public TwitterScribeLog a(final String k, final long l, final String m) {
        this.k = k;
        this.l = l;
        this.m = m;
        return this;
    }
    
    public TwitterScribeLog a(final String s, final NativeCardUserAction nativeCardUserAction, final String s2) {
        if (s != null) {
            final NativeCardEvent am = new NativeCardEvent(s);
            am.a(s2);
            if (nativeCardUserAction != null) {
                am.a(nativeCardUserAction);
            }
            final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)this.c();
            if (twitterScribeItem != null) {
                if (twitterScribeItem.m != -1) {
                    am.a(twitterScribeItem.m);
                }
                twitterScribeItem.am = am;
                return this;
            }
        }
        return this;
    }
    
    public TwitterScribeLog a(final boolean b, final boolean b2) {
        final TwitterScribeItem twitterScribeItem = (TwitterScribeItem)this.c();
        if (twitterScribeItem != null && twitterScribeItem.am != null) {
            twitterScribeItem.am.a(b, b2);
        }
        return this;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        if (this.i != null && this.j != null) {
            jsonGenerator.e("settings_version_details");
            jsonGenerator.a("feature_switches", this.i);
            jsonGenerator.a("experiments", this.j);
            jsonGenerator.d();
        }
        if (this.e != null) {
            jsonGenerator.a("experiment_key", this.e);
            jsonGenerator.a("version", this.f);
            jsonGenerator.a("bucket", this.g);
        }
        if (this.k != null) {
            jsonGenerator.a("conversation_id", this.k);
        }
        if (this.l != -1L) {
            jsonGenerator.a("status_id", this.l);
        }
        if (this.m != null) {
            jsonGenerator.a("impression_id", this.m);
        }
        if (this.n != -1L) {
            jsonGenerator.a("dm_id", this.n);
        }
        if (this.o != -1L) {
            jsonGenerator.a("dm_create_time", this.o);
        }
        if (this.p != null) {
            this.p.a(jsonGenerator);
        }
    }
    
    public TwitterScribeLog b(final long n, final PromotedContent promotedContent, final String s) {
        this.a(TwitterScribeItem.a(n, promotedContent, s, null));
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    protected int e() {
        return com.twitter.library.telephony.a.a().b();
    }
    
    protected String f() {
        return TelephonyUtil.a();
    }
    
    public ScribeLog g(final int n) {
        final Iterator<TwitterScribeItem> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n);
        }
        return this;
    }
    
    public TwitterScribeLog g() {
        final String f = this.f();
        switch (f) {
            default: {
                this.b = 0;
                return this;
            }
            case "2g":
            case "cellular": {
                this.d = this.e();
                this.b = 2;
                return this;
            }
            case "wifi": {
                this.b = 1;
                return this;
            }
        }
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.k);
        parcel.writeLong(this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        parcel.writeParcelable((Parcelable)this.p, n);
    }
}
