// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.bj;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.util.x;
import com.twitter.android.util.al;
import com.twitter.android.util.w;
import com.twitter.android.util.ap;
import android.preference.PreferenceManager;
import com.twitter.library.client.az;
import android.app.Activity;
import com.twitter.android.client.bg;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.library.api.as;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.content.Context;

public class SignUpFlowController
{
    private static SignUpFlowController a;
    private Context b;
    private ArrayList c;
    private WeakReference d;
    private SignUpFlowController$PhoneState e;
    private SignUpFlowController$SignUpStatus f;
    private as g;
    private Session h;
    private int i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private boolean t;
    private boolean u;
    private Intent v;
    
    private SignUpFlowController(final Context context, final ArrayList c) {
        this.c = new ArrayList();
        this.e = SignUpFlowController$PhoneState.a;
        this.f = SignUpFlowController$SignUpStatus.a;
        this.t = false;
        this.u = false;
        this.b = context.getApplicationContext();
        this.c = c;
    }
    
    private boolean B() {
        return !TextUtils.isEmpty((CharSequence)this.j) && !TextUtils.isEmpty((CharSequence)this.m) && !TextUtils.isEmpty((CharSequence)this.k) && !TextUtils.isEmpty((CharSequence)this.l);
    }
    
    public static SignUpFlowController a(final Context context) {
        synchronized (SignUpFlowController.class) {
            if (SignUpFlowController.a == null) {
                final ArrayList<String> list = new ArrayList<String>();
                list.add("default");
                SignUpFlowController.a = new SignUpFlowController(context, list);
            }
            return SignUpFlowController.a;
        }
    }
    
    private void a(final Session session, final boolean b, final int n, final as as) {
        if (!b) {
            this.a(SignUpFlowController$SignUpStatus.a);
            if (n == 2) {
                this.j(this.a());
                this.k(this.b());
            }
            else if (as != null) {
                this.a(session);
                this.a(as);
            }
            else {
                this.a(2131297818);
            }
        }
        else {
            this.a(session);
            this.a(SignUpFlowController$SignUpStatus.c);
        }
        if (this.d != null && this.d.get() != null) {
            ((sr)this.d.get()).b(b);
        }
    }
    
    private void a(final boolean b, final String s, final int[] array) {
        String s2;
        if (b) {
            s2 = "success";
        }
        else if (array != null) {
            if (CollectionUtils.a(array, 285)) {
                s2 = "registered";
            }
            else if (CollectionUtils.a(array, 287)) {
                s2 = "verified";
            }
            else if (CollectionUtils.a(array, 295)) {
                s2 = "rate_limit";
            }
            else if (CollectionUtils.a(array, 294)) {
                s2 = "pin_invalid";
            }
            else {
                s2 = "failure";
            }
        }
        else {
            s2 = "error";
        }
        this.a("phone_verification", s, s2);
    }
    
    private void a(final boolean b, final int[] array) {
        if (this.d != null && this.d.get() != null) {
            ((sr)this.d.get()).a(b, array);
        }
    }
    
    private void b(final Session session) {
        final long g = session.g();
        final c a = com.twitter.android.client.c.a(this.b);
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(g).b(this.i(), this.h(), "create", "", "success");
        AppEventTrack.a(this.b, twitterScribeLog);
        if (this.t) {
            twitterScribeLog.g("sso_sdk");
        }
        a.a(twitterScribeLog);
        a.a(g, "signup::::success", false);
        a.a(g, "signup::::success");
    }
    
    private void b(final boolean b, final int[] array) {
        if (this.d != null && this.d.get() != null) {
            ((sr)this.d.get()).b(b, array);
        }
        else if (b) {
            this.z();
        }
    }
    
    public void A() {
        if (this.t()) {
            this.y();
        }
    }
    
    public SignUpFlowController a(final int i) {
        this.i = i;
        return this;
    }
    
    public SignUpFlowController a(final Intent v) {
        this.v = v;
        return this;
    }
    
    public SignUpFlowController a(final SignUpFlowController$PhoneState e) {
        this.e = e;
        return this;
    }
    
    public SignUpFlowController a(final SignUpFlowController$SignUpStatus f) {
        this.f = f;
        return this;
    }
    
    public SignUpFlowController a(final c c) {
        c.a(new sq(this));
        return this;
    }
    
    public SignUpFlowController a(final sr sr) {
        this.d = new WeakReference((T)sr);
        return this;
    }
    
    public SignUpFlowController a(final as g) {
        this.g = g;
        return this;
    }
    
    public SignUpFlowController a(final Session h) {
        this.h = h;
        return this;
    }
    
    public SignUpFlowController a(final String j) {
        this.j = j;
        return this;
    }
    
    public SignUpFlowController a(final ArrayList c) {
        this.c = c;
        return this;
    }
    
    public SignUpFlowController a(final boolean t) {
        this.t = t;
        return this;
    }
    
    public String a() {
        return this.k;
    }
    
    public void a(final Activity activity) {
        final String g = this.g();
        if (g != null) {
            if ("signup_screen".equals(g)) {
                if (!this.B()) {
                    this.h("signup_screen");
                    return;
                }
                activity.startActivity(new Intent((Context)activity, (Class)SignUpActivity.class).putExtra("signup_layout_type", 0).putExtra("signup_identifier", this.m).putExtra("signup_identifier_type", 2).putExtra("signup_username", this.k).putExtra("signup_password", this.l));
            }
            else if ("waiting_screen".equals(g)) {
                if (this.B()) {
                    activity.startActivity(new Intent((Context)activity, (Class)PhoneVerifySignupActivity.class).putExtra("liveFragment", 0));
                    return;
                }
                this.h("waiting_screen");
                this.a(activity);
            }
            else if ("manual_pin_entry".equals(g)) {
                if (this.B()) {
                    activity.startActivity(new Intent((Context)activity, (Class)PhoneVerifySignupActivity.class).putExtra("liveFragment", 1));
                    return;
                }
                this.h("manual_pin_entry");
                this.a(activity);
            }
            else if ("email_entry".equals(g)) {
                if (this.B()) {
                    activity.startActivity(new Intent((Context)activity, (Class)EmailEntryActivity.class));
                    return;
                }
                this.h("email_entry");
                this.a(activity);
            }
            else if ("default".equals(g)) {
                this.v();
                this.w();
                this.u();
                DispatchActivity.a(activity, this.v);
            }
        }
    }
    
    public void a(final String s, final String s2, final String s3) {
        this.a(s, s2, s3, az.a(this.b).b().g());
    }
    
    public void a(final String s, final String s2, final String s3, final long n) {
        com.twitter.android.client.c.a(this.b).a(n, this.i(), this.h(), s, s2, s3);
    }
    
    public SignUpFlowController b(final sr sr) {
        if (this.d != null && this.d.get() != null && ((sr)this.d.get()).equals(sr)) {
            this.d = null;
        }
        return this;
    }
    
    public SignUpFlowController b(final String k) {
        this.k = k;
        return this;
    }
    
    public SignUpFlowController b(final boolean u) {
        this.u = u;
        return this;
    }
    
    public String b() {
        return this.l;
    }
    
    public void b(final Activity activity) {
        final c a = com.twitter.android.client.c.a(this.b);
        final long g = this.h.g();
        final boolean e = this.e();
        String s;
        if (e) {
            s = "opt_in";
        }
        else {
            s = "opt_out";
        }
        a.a(g, "signup", "form", "checkbox", null, s);
        a.a(g, this.i(), this.h(), "checkbox", null, s);
        final FollowFlowController c = new FollowFlowController("welcome").a(e).c(true);
        final String string = PreferenceManager.getDefaultSharedPreferences((Context)activity).getString("pref_referral_campaign", (String)null);
        if (lj.a(string) != null) {
            c.a(string).g(false);
        }
        else {
            c.a(new String[] { "follow_friends", "edit_profile", "InstantTimelineWaitingActivity" });
        }
        c.c(activity);
        if (this.t) {
            az.a(this.b).c(this.h);
            this.a(false);
        }
        this.g("email_entry").a(activity);
    }
    
    public void b(final Intent intent) {
        final al a = ap.a(this.b);
        final x a2 = w.a(this.b);
        a2.j();
        final boolean a3 = a2.a();
        final boolean j = a.j();
        if (a3 && j) {
            intent.putExtra("signup_layout_type", 1);
            intent.putExtra("signup_identifier", a2.e());
            intent.putExtra("signup_phone", a.g());
        }
        else {
            this.g("signup_screen");
            intent.putExtra("signup_layout_type", 0);
            if (a3) {
                intent.putExtra("signup_identifier", a2.e());
                return;
            }
            if (j) {
                intent.putExtra("signup_identifier", a.g());
                intent.putExtra("signup_identifier_type", 2);
            }
        }
    }
    
    public SignUpFlowController c(final String l) {
        this.l = l;
        return this;
    }
    
    public SignUpFlowController c(final boolean s) {
        this.s = s;
        return this;
    }
    
    public String c() {
        return this.m;
    }
    
    public void c(final Activity activity) {
        this.u();
        this.v();
        DispatchActivity.a(activity, this.v);
    }
    
    public SignUpFlowController d(final String m) {
        this.m = m;
        return this;
    }
    
    public String d() {
        return this.n;
    }
    
    public void d(final Activity activity) {
        final Intent setFlags = new Intent((Context)activity, (Class)SignUpActivity.class).setFlags(67108864);
        this.i("signup_screen");
        activity.startActivity(setFlags);
        activity.finish();
    }
    
    public SignUpFlowController e(final String s) {
        String replace;
        if (s != null) {
            replace = s.replace(" ", " ");
        }
        else {
            replace = null;
        }
        this.n = replace;
        return this;
    }
    
    public boolean e() {
        return this.s;
    }
    
    public SignUpFlowController f(final String o) {
        this.o = o;
        return this;
    }
    
    public boolean f() {
        return this.u;
    }
    
    public SignUpFlowController g(final String s) {
        this.c.add(s);
        return this;
    }
    
    public String g() {
        if (!this.c.isEmpty()) {
            return this.c.get(-1 + this.c.size());
        }
        return null;
    }
    
    public SignUpFlowController h(final String s) {
        if (!this.c.isEmpty() && this.c.get(-1 + this.c.size()).equals(s)) {
            this.c.remove(-1 + this.c.size());
        }
        return this;
    }
    
    public String h() {
        final String g = this.g();
        if (g == null) {
            return "error";
        }
        if (g.equals("default")) {
            return "form";
        }
        if (g.equals("signup_screen")) {
            return "form";
        }
        if (g.equals("waiting_screen")) {
            return "waiting_screen";
        }
        if (g.equals("manual_pin_entry")) {
            return "pin_entry";
        }
        if (g.equals("email_entry")) {
            return "add_email";
        }
        return "error";
    }
    
    public SignUpFlowController i(final String s) {
        if (!this.c.isEmpty() && s != null) {
            for (int n = -1 + this.c.size(); n >= 0 && !((String)this.c.get(n)).equals(s); --n) {
                this.c.remove(n);
            }
        }
        return this;
    }
    
    public String i() {
        if (this.r != null) {
            return this.r;
        }
        return "error";
    }
    
    public SignUpFlowController j(final String p) {
        this.p = p;
        return this;
    }
    
    public boolean j() {
        return this.e.equals(SignUpFlowController$PhoneState.d);
    }
    
    public SignUpFlowController k(final String q) {
        this.q = q;
        return this;
    }
    
    public boolean k() {
        return this.B() && this.f.equals(SignUpFlowController$SignUpStatus.a) && !this.e.equals(SignUpFlowController$PhoneState.c);
    }
    
    public SignUpFlowController l(final String r) {
        this.r = r;
        return this;
    }
    
    public Session l() {
        return this.h;
    }
    
    public as m() {
        return this.g;
    }
    
    public int n() {
        return this.i;
    }
    
    public String o() {
        return this.p;
    }
    
    public String p() {
        return this.q;
    }
    
    public boolean q() {
        return this.h != null && this.g != null;
    }
    
    public boolean r() {
        return this.p != null && this.q != null;
    }
    
    public boolean s() {
        return this.q() || this.r() || this.n() != 0;
    }
    
    public boolean t() {
        return this.m != null && this.e.equals(SignUpFlowController$PhoneState.b) && !this.f.equals(SignUpFlowController$SignUpStatus.b);
    }
    
    public SignUpFlowController u() {
        this.a(new SignUpFlowController$1(this));
        return this;
    }
    
    public SignUpFlowController v() {
        this.a(SignUpFlowController$PhoneState.a);
        this.d((String)null);
        this.e(null);
        this.a(SignUpFlowController$SignUpStatus.a);
        this.a((String)null);
        this.b((String)null);
        this.c((String)null);
        this.f(null);
        this.c(false);
        com.twitter.android.client.c.a(this.b).g();
        return this;
    }
    
    public SignUpFlowController w() {
        this.a((as)null);
        this.a((Session)null);
        this.a(0);
        this.j(null);
        this.k(null);
        return this;
    }
    
    public void x() {
        final Session b = az.a(this.b).b();
        final com.twitter.library.client.as a = com.twitter.library.client.as.a(this.b);
        final oj oj = new oj(this.b, b, this.m);
        this.a("phone_verification", "begin", "attempt");
        a.a(oj, new st(this.b));
    }
    
    public void y() {
        this.a(SignUpFlowController$PhoneState.c);
        if (this.d != null && this.d.get() != null) {
            ((sr)this.d.get()).q();
        }
        final Session b = az.a(this.b).b();
        final com.twitter.library.client.as a = com.twitter.library.client.as.a(this.b);
        this.a("phone_verification", "complete", "attempt");
        a.a(new ok(this.b, b, this.m, this.o), new su(this.b, null));
    }
    
    public void z() {
        if (this.k()) {
            this.a(SignUpFlowController$SignUpStatus.b);
            final az a = az.a(this.b);
            this.a("create", "", "attempt");
            a.a(this.j, this.k, null, this.l, "", "", new ss(this, this.b), this.m);
        }
    }
}
