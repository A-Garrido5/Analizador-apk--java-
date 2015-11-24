// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract$Profile;
import android.text.TextUtils;
import java.util.ArrayList;
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
import java.lang.ref.WeakReference;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import java.util.List;

public class aq implements al
{
    public static final List a;
    private static boolean b;
    private static boolean c;
    private static Phonenumber$PhoneNumber d;
    private static String e;
    private static Phonenumber$PhoneNumber f;
    private static WeakReference g;
    private final Context h;
    private final ar i;
    
    static {
        a = new PhoneNumberHelperImpl$1();
        aq.b = false;
        aq.c = false;
        aq.d = null;
        aq.e = null;
        aq.f = null;
    }
    
    aq(final Context context) {
        this.h = context.getApplicationContext();
        this.i = ar.a(this.h);
    }
    
    @Override
    public Phonenumber$PhoneNumber a(final String s) {
        try {
            final PhoneNumberUtil a = PhoneNumberUtil.a();
            final String a2 = bh.a(this.h);
            String s2;
            if (a2 != null) {
                s2 = a2.toUpperCase();
            }
            else {
                s2 = this.h.getResources().getConfiguration().locale.getCountry();
            }
            final Phonenumber$PhoneNumber a3 = a.a(s, s2);
            if (a.b(a3)) {
                return a3;
            }
            return null;
        }
        catch (NumberParseException ex) {
            return null;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            ErrorReporter.a(noSuchMethodError);
            return null;
        }
    }
    
    @Override
    public String a(final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat) {
        return k.a(this.a(aq.f, phoneNumberUtil$PhoneNumberFormat));
    }
    
    @Override
    public String a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        return this.a(phonenumber$PhoneNumber, PhoneNumberUtil$PhoneNumberFormat.a);
    }
    
    @Override
    public String a(final Phonenumber$PhoneNumber phonenumber$PhoneNumber, final PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat) {
        final PhoneNumberUtil a = PhoneNumberUtil.a();
        if (phonenumber$PhoneNumber != null && a.b(phonenumber$PhoneNumber)) {
            return a.a(phonenumber$PhoneNumber, phoneNumberUtil$PhoneNumberFormat);
        }
        return null;
    }
    
    @Override
    public void a(final am am) {
        as.a(this.h).a(new m(this.h, az.a(this.h).b()), new com.twitter.android.util.ar(am));
    }
    
    @Override
    public void a(final ao ao) {
        if (ao != null) {
            aq.g = new WeakReference((T)ao);
        }
    }
    
    @Override
    public void a(final String s, final an an) {
        as.a(this.h).a(new mo(this.h, mo.class.getName(), az.a(this.h).b(), s), new com.twitter.android.util.as(an));
    }
    
    @Override
    public boolean a() {
        return com.twitter.library.featureswitch.d.f("sms_notifications_opt_in_enabled") && be.a(this.h);
    }
    
    @Override
    public void b(final Phonenumber$PhoneNumber f) {
        aq.f = f;
    }
    
    @Override
    public boolean b() {
        return this.j() && !this.d();
    }
    
    @Override
    public boolean c() {
        return !this.j() && !this.d() && !this.l();
    }
    
    @Override
    public boolean d() {
        boolean b = true;
        final TelephonyManager telephonyManager = (TelephonyManager)this.h.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            final String simOperator = telephonyManager.getSimOperator();
            if (simOperator != null && simOperator.length() >= 3) {
                return Integer.parseInt(simOperator.substring(0, 3)) == 440 && b;
            }
        }
        if (this.h.getResources().getConfiguration().locale != Locale.JAPAN) {
            b = false;
        }
        return b;
    }
    
    @Override
    public boolean e() {
        return this.b() && !this.l();
    }
    
    @Override
    public Phonenumber$PhoneNumber f() {
        return aq.d;
    }
    
    @Override
    public String g() {
        return k.a(this.a(aq.d));
    }
    
    @Override
    public String h() {
        return k.a(aq.e);
    }
    
    @Override
    public void i() {
        if (!aq.b && aq.d == null) {
            aq.b = true;
            new au(this, new PhoneNumberHelperImpl$2(this)).execute((Object[])new Long[] { az.a(this.h).b().g() });
        }
    }
    
    @Override
    public boolean j() {
        return !TextUtils.isEmpty((CharSequence)this.g());
    }
    
    @Override
    public boolean k() {
        return aq.c;
    }
    
    @Override
    public boolean l() {
        if (this.m()) {
            this.a((am)null);
        }
        return this.i.b();
    }
    
    @Override
    public boolean m() {
        return this.i.c();
    }
    
    @Override
    public String n() {
        return this.a(PhoneNumberUtil$PhoneNumberFormat.a);
    }
    
    public Phonenumber$PhoneNumber o() {
        try {
            return this.a(((TelephonyManager)this.h.getSystemService("phone")).getLine1Number());
        }
        catch (SecurityException ex) {
            return null;
        }
    }
    
    public Phonenumber$PhoneNumber p() {
        while (true) {
            while (true) {
                try {
                    final Cursor query = this.h.getContentResolver().query(Uri.withAppendedPath(ContactsContract$Profile.CONTENT_URI, "data"), at.a, "mimetype=?", new String[] { "vnd.android.cursor.item/phone_v2" }, "is_primary");
                    if (query == null) {
                        break;
                    }
                    if (query.getCount() > 0) {
                        query.moveToFirst();
                        final Phonenumber$PhoneNumber a = this.a(query.getString(0));
                        query.close();
                        return a;
                    }
                }
                catch (SecurityException ex) {}
                catch (NullPointerException ex2) {
                    goto Label_0080;
                }
                catch (IllegalArgumentException ex2) {
                    goto Label_0080;
                }
                final Phonenumber$PhoneNumber a = null;
                continue;
            }
        }
        return null;
    }
}
