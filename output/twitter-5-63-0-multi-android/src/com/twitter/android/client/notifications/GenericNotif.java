// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.MainActivity;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import android.net.Uri;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Collections;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.util.a;
import com.twitter.library.platform.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class GenericNotif extends StatusBarNotif
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    GenericNotif(final Parcel parcel) {
        super(parcel);
    }
    
    public GenericNotif(final d d, final long n, final String s) {
        super(d, n, s);
    }
    
    static String a(final String s, final int n) {
        if (n > 1) {
            return s;
        }
        return null;
    }
    
    @Override
    public String al_() {
        return a(this.c, com.twitter.library.util.a.a(this.e).length);
    }
    
    @Override
    protected List am_() {
        if (this.a.g != 0L || this.a.f != 0L) {
            final ArrayList<TwitterScribeItem> list = new ArrayList<TwitterScribeItem>(3);
            if (this.a.g != 0L) {
                final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                twitterScribeItem.a = this.a.g;
                twitterScribeItem.b = "sender_id";
                twitterScribeItem.c = 3;
                list.add(twitterScribeItem);
            }
            if (this.a.f != 0L) {
                final TwitterScribeItem twitterScribeItem2 = new TwitterScribeItem();
                twitterScribeItem2.a = this.a.f;
                twitterScribeItem2.b = "status_id";
                twitterScribeItem2.c = 0;
                list.add(twitterScribeItem2);
            }
            final TwitterScribeItem twitterScribeItem3 = new TwitterScribeItem();
            twitterScribeItem3.b = this.a.e;
            twitterScribeItem3.c = 6;
            list.add(twitterScribeItem3);
            return list;
        }
        return Collections.EMPTY_LIST;
    }
    
    public String c() {
        if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
            return this.a.d;
        }
        return this.e.getString(2131296321);
    }
    
    public int i() {
        return 2130839309;
    }
    
    @Override
    protected Intent j() {
        Intent setData = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.a.k));
        if (setData.resolveActivity(this.e.getPackageManager()) == null) {
            ErrorReporter.a(new InvalidDataException("Invalid uri: " + this.a.k));
            setData = new Intent(this.e, (Class)MainActivity.class);
        }
        setData.putExtra("reason", this.a.e).putExtra("notification_setting_key", this.a.o);
        return setData;
    }
    
    @Override
    protected String k() {
        return "generic";
    }
}
