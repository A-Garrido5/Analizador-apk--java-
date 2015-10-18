// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.Notification;
import android.telephony.ServiceState;
import android.net.NetworkInfo;
import com.google.c_;
import com.google.f9;
import com.google.e6;
import android.content.SharedPreferences$Editor;
import java.util.Random;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import android.content.Context;
import android.telephony.PhoneStateListener;

public class VerifyNumber extends UserFeedbackActivity
{
    protected static String m;
    private static final String[] z;
    boolean k;
    boolean l;
    private String n;
    int o;
    private int p;
    boolean q;
    PhoneStateListener r;
    
    static {
        final String[] z2 = new String[17];
        String s = "C{\u0013b_Lp\u0014f[PlNl\\An\tdWPp\u000f~TW{\u0013$\\Gl\u000ey\u0019";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0457:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '9';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "C{\u0013b_Lp\u0014f[PlN{QZp\u0004TMLn\u0004+";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Vq\f%N]\u007f\u0015xXEn>{KPx\u0004y\\[}\u0004x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "C{\u0013b_Lp\u0014f[PlNxXC{Le\\B3\u000bb]\u001a";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "[{\u0016TS\\z";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u001a}\u000efT\\jAmX\\r\u0004o";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "C{\u0013b_Lp\u0014f[PlNeVAw\u0007r\u0016@p\u0017nK\\x\bn]";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Vq\f%N]\u007f\u0015xXEnO}\\Gw\u0007rW@s\u0003nK\u001bz\bjUZy";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "C{\u0013b_Lp\u0014f[PlNe\\Ai\u000eyR\u001ap\u0000f\\\b";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "C{\u0013b_Lp\u0014f[PlNhV[x\bl\u0019";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "C{\u0013b_Lp\u0014f[PlNxPXq\u0011+";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    s = "\u001a}\u000eo\\\b";
                    n = 10;
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    array = z2;
                    s = "C{\u0013b_Lp\u0014f[PlNe\\Ai\u000eyR\u001a";
                    n = 11;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "C{\u0013b_Lp\u0014f[PlNeVAw\u0007r\u0016C{\u0013b_\\{\u0005";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "C{\u0013b_Lp\u0014f[PlNmVGs\u0000\u007fMPlLnAV{\u0011\u007fPZp";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "C{\u0013b_Lp\u0014f[PlNmVGs\u0000\u007fMPlLbW\\jLnAV{\u0011\u007fPZp";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "C{\u0013b_Lp\u0014f[PlN{KPj\u0015rIGw\u000f\u007f\u0016V}LdK\u0018n\teLX3\bx\u0014[k\rg";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    break Label_0457;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        VerifyNumber.m = "";
    }
    
    public VerifyNumber() {
        this.k = false;
        this.q = false;
        this.l = false;
        this.n = null;
        this.p = -1;
        this.r = new d8(this);
    }
    
    static ct a(final Context context, final String s, final String s2, final String s3, final String s4) {
        return nu.a(s, s + s2, s2, x.a(App.h.getNetworkOperator()), x.a(App.h.getSimOperator()), s3, s4, vk.a(context, s2).toString());
    }
    
    static String a() {
        try {
            return App.h.getLine1Number();
        }
        catch (Exception ex) {
            Log.w(VerifyNumber.z[0] + ex.toString());
            return null;
        }
    }
    
    static String a(final String s) {
        final boolean i = App.I;
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < s.length()) {
            sb.append((char)('\u0012' ^ s.charAt(j)));
            int k = 1;
            while (k < 6) {
                sb.append((char)(0x12 ^ 48 + new Random().nextInt(10)));
                ++k;
                if (i) {
                    break;
                }
            }
            ++j;
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    static boolean a(final boolean b) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(VerifyNumber.z[2], 0).edit();
        edit.putBoolean(VerifyNumber.z[4], b);
        if (!edit.commit()) {
            Log.w(VerifyNumber.z[3] + b + VerifyNumber.z[5]);
            return false;
        }
        return true;
    }
    
    static String b(final String s) {
        final boolean i = App.I;
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < s.length()) {
            sb.append((char)('\u0012' ^ s.charAt(j)));
            j += 6;
            if (i) {
                break;
            }
        }
        return sb.toString();
    }
    
    static String b(final String s, final String s2) {
        Label_0024: {
            if (s != null) {
                if (s2 != null) {
                    break Label_0024;
                }
            }
            try {
                Log.e(VerifyNumber.z[16]);
                return null;
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        final String string = "+" + s + " " + s2;
        final e6 a = e6.a();
        try {
            final c_ b = a.b(s2, vi.d(s));
            if (b != null) {
                return a.a(b, f9.INTERNATIONAL);
            }
            return string;
        }
        catch (Exception ex2) {
            Log.b(VerifyNumber.z[14], ex2);
            return string;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            Log.b(VerifyNumber.z[15], exceptionInInitializerError);
            return string;
        }
    }
    
    String a(final String s, final String s2) {
        Log.i(VerifyNumber.z[12] + App.h.getNetworkType());
        final String networkOperator = App.h.getNetworkOperator();
        final String networkOperatorName = App.h.getNetworkOperatorName();
        final NetworkInfo activeNetworkInfo = App.Q.getActiveNetworkInfo();
        Log.i(VerifyNumber.z[8] + networkOperatorName + VerifyNumber.z[11] + networkOperator);
        Log.i(VerifyNumber.z[9] + this.getResources().getConfiguration().mcc + " " + this.getResources().getConfiguration().mnc);
        Log.i(VerifyNumber.z[10] + App.h.getSimOperator());
        if (vi.b(s, networkOperator) || vi.a(s, networkOperatorName) || vi.a(s, activeNetworkInfo)) {
            return s2;
        }
        return "+" + s + s2;
    }
    
    protected void a(final ServiceState serviceState) {
    }
    
    protected void c(final String m) {
        App.c((Context)this, VerifyNumber.m = m);
    }
    
    protected boolean c() {
        return App.h.getNetworkType() != 11;
    }
    
    public void d(final int p) {
        if (!this.q && !this.isFinishing()) {
            this.showDialog(p);
            if (!App.I) {
                return;
            }
        }
        this.p = p;
    }
    
    public void d(final String n) {
        if (!this.q && !this.isFinishing()) {
            super.f(n);
            if (!App.I) {
                return;
            }
        }
        this.n = n;
    }
    
    protected void e(final int n) {
        if (this.q || this.isFinishing()) {
            this.g(n);
            if (!App.I) {
                return;
            }
        }
        this.showDialog(n);
    }
    
    protected boolean e() {
        return false;
    }
    
    protected void f() {
        Log.i(VerifyNumber.z[13]);
        final long currentTimeMillis = System.currentTimeMillis();
        final String string = this.getString(2131231745);
        final String string2 = this.getString(2131231749);
        final String string3 = this.getString(2131231747);
        final Notification notification = new Notification(2130838963, (CharSequence)string, currentTimeMillis);
        notification.defaults = 3;
        notification.flags = 16;
        final Context applicationContext = this.getApplicationContext();
        Intent intent = null;
        Label_0118: {
            if (this.l) {
                intent = new Intent(applicationContext, (Class)Main.class);
                if (!App.I) {
                    break Label_0118;
                }
            }
            intent = new Intent(applicationContext, (Class)RegisterName.class);
            App.b((Context)this, 2);
        }
        notification.setLatestEventInfo(applicationContext, (CharSequence)string2, (CharSequence)string3, PendingIntent.getActivity(applicationContext, 0, intent, 268435456));
        NotificationManagerCompat.from((Context)this).notify(1, notification);
    }
    
    public void f(final int n) {
        if (!this.q && !this.isFinishing()) {
            this.a(n);
            if (!App.I) {
                return;
            }
        }
        this.n = this.getString(n);
    }
    
    protected void g() {
        this.g(-1);
    }
    
    protected void g(final int n) {
        Log.i(VerifyNumber.z[6]);
        final long currentTimeMillis = System.currentTimeMillis();
        final String string = this.getString(2131231744);
        final String string2 = this.getString(2131231748);
        final String string3 = this.getString(2131231746);
        final Notification notification = new Notification(2130838963, (CharSequence)string, currentTimeMillis);
        notification.defaults = 3;
        notification.flags = 16;
        final Context applicationContext = this.getApplicationContext();
        final Intent intent = new Intent(applicationContext, (Class)this.getClass());
        if (n != -1) {
            intent.putExtra(VerifyNumber.z[7], n);
        }
        intent.addFlags(536870912);
        notification.setLatestEventInfo(applicationContext, (CharSequence)string2, (CharSequence)string3, PendingIntent.getActivity(applicationContext, 0, intent, 268435456));
        NotificationManagerCompat.from((Context)this).notify(1, notification);
    }
    
    protected void g(final String s) {
        this.e(s);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.o = App.h.getPhoneType();
        Log.i(VerifyNumber.z[1] + this.o);
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 109: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231569).setPositiveButton(2131230894, (DialogInterface$OnClickListener)new ma(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new w5(this)).create();
            }
            case 114: {
                return yt.f(this);
            }
        }
    }
    
    public void onPause() {
        this.q = true;
        super.onPause();
        App.c((Context)this, VerifyNumber.m);
    }
    
    public void onResume() {
        this.q = false;
        super.onResume();
        VerifyNumber.m = App.z((Context)this);
        if (this.n != null) {
            this.f(this.n);
        }
        if (this.p != -1) {
            this.showDialog(this.p);
        }
        this.n = null;
        this.p = -1;
    }
}
