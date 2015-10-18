// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract$Profile;
import java.util.Locale;
import android.telephony.TelephonyManager;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.m;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import com.twitter.util.k;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import com.twitter.errorreporter.ErrorReporter;
import com.google.i18n.phonenumbers.NumberParseException;
import com.twitter.library.util.bh;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.twitter.library.util.ar;
import android.content.Context;
import java.util.List;
import java.lang.ref.WeakReference;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import java.util.Iterator;
import android.util.Pair;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import java.util.ArrayList;
import android.os.AsyncTask;

class au extends AsyncTask
{
    final ArrayList a;
    final /* synthetic */ aq b;
    
    au(final aq b, final ArrayList a) {
        this.b = b;
        this.a = a;
    }
    
    private void a(final long n, final String s) {
        String s2;
        if (s == null) {
            s2 = "unavailable";
        }
        else {
            s2 = "available";
        }
        c.a(this.b.h).a(((TwitterScribeLog)new TwitterScribeLog(n).c(2)).b("app", "", "phone_number", s, s2));
    }
    
    protected Pair a(final Long... array) {
        if (array.length == 1) {
            final long longValue = array[0];
            final Iterator<Integer> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                switch (iterator.next()) {
                    default: {
                        continue;
                    }
                    case 0: {
                        final Phonenumber$PhoneNumber o = this.b.o();
                        if (o != null) {
                            this.a(longValue, "source_telephonymanager");
                            return new Pair((Object)"source_telephonymanager", (Object)o);
                        }
                        continue;
                    }
                    case 1: {
                        final Phonenumber$PhoneNumber p = this.b.p();
                        if (p != null) {
                            this.a(longValue, "source_google_contact");
                            return new Pair((Object)"source_google_contact", (Object)p);
                        }
                        continue;
                    }
                }
            }
            this.a(longValue, null);
        }
        return new Pair((Object)null, (Object)null);
    }
    
    protected void a(final Pair pair) {
        if (!TextUtils.isEmpty((CharSequence)pair.first)) {
            aq.e = (String)pair.first;
        }
        if (pair.second != null) {
            aq.d = (Phonenumber$PhoneNumber)pair.second;
        }
        aq.c = true;
        if (aq.g != null && aq.g.get() != null) {
            ((ao)aq.g.get()).a();
            aq.g = null;
        }
    }
}
