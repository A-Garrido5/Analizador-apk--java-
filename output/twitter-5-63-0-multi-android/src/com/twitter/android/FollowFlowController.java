// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.featureswitch.d;
import android.content.SharedPreferences$Editor;
import com.twitter.library.api.ReferralCampaign;
import java.util.Collection;
import java.util.Arrays;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.preference.PreferenceManager;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import android.content.Context;
import com.twitter.library.client.az;
import android.app.Activity;
import java.util.List;
import android.os.Parcel;
import android.content.Intent;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class FollowFlowController implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final String[] a;
    private boolean b;
    private String c;
    private ArrayList d;
    private String e;
    private int f;
    private Intent g;
    private boolean h;
    private String[] i;
    private int j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new hy();
        a = new String[] { "follow_referral_campaign", "follow_friends" };
    }
    
    private FollowFlowController(final Parcel parcel) {
        boolean n = true;
        this.b = false;
        this.c = null;
        this.d = new ArrayList();
        this.e = null;
        this.f = 0;
        this.i = new String[0];
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = null;
        parcel.readStringList((List)(this.d = new ArrayList()));
        this.f = parcel.readInt();
        this.b = (parcel.readInt() == (n ? 1 : 0) && n);
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.g = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.h = (parcel.readInt() == (n ? 1 : 0) && n);
        final int int1 = parcel.readInt();
        this.i = new String[int1];
        for (int i = 0; i < int1; ++i) {
            this.i[i] = parcel.readString();
        }
        this.j = parcel.readInt();
        this.k = (parcel.readInt() == (n ? 1 : 0) && n);
        this.l = (parcel.readInt() == (n ? 1 : 0) && n);
        this.m = parcel.readString();
        if (parcel.readInt() != (n ? 1 : 0)) {
            n = false;
        }
        this.n = n;
    }
    
    public FollowFlowController(final String e) {
        this.b = false;
        this.c = null;
        this.d = new ArrayList();
        this.e = null;
        this.f = 0;
        this.i = new String[0];
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = null;
        this.e = e;
    }
    
    private ArrayList a(final String[] array, final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final String s : array) {
            switch (s) {
                case "edit_profile": {
                    list.add("edit_profile");
                    break;
                }
                case "follow_people": {
                    list.add("follow_friends");
                    break;
                }
                case "interest_picker": {
                    list.add("interest_picker");
                    break;
                }
                case "wtf": {
                    list.add("follow_recommendations");
                    break;
                }
                case "phone_entry": {
                    if (b) {
                        list.add("phone_entry");
                        break;
                    }
                    break;
                }
                case "value_of_twitter": {
                    list.add("value_of_twitter");
                    break;
                }
            }
        }
        return list;
    }
    
    private void a(final Activity activity, final int n) {
        if (n < this.d.size()) {
            final String s = this.d.get(n);
            final FollowFlowController a = this.g().a(n);
            final Session b = az.a((Context)activity).b();
            int n2 = -1;
            switch (s.hashCode()) {
                case -1190270201: {
                    if (s.equals("follow_friends")) {
                        n2 = 0;
                        break;
                    }
                    break;
                }
                case -1905080500: {
                    if (s.equals("follow_recommendations")) {
                        n2 = 1;
                        break;
                    }
                    break;
                }
                case -1898352028: {
                    if (s.equals("follow_referral_campaign")) {
                        n2 = 2;
                        break;
                    }
                    break;
                }
                case -721002911: {
                    if (s.equals("phone_entry")) {
                        n2 = 3;
                        break;
                    }
                    break;
                }
                case 229373044: {
                    if (s.equals("edit_profile")) {
                        n2 = 4;
                        break;
                    }
                    break;
                }
                case -633455878: {
                    if (s.equals("InstantTimelineWaitingActivity")) {
                        n2 = 5;
                        break;
                    }
                    break;
                }
                case -958604477: {
                    if (s.equals("interest_picker")) {
                        n2 = 6;
                        break;
                    }
                    break;
                }
                case 1329386792: {
                    if (s.equals("follow_interest_suggestions")) {
                        n2 = 7;
                        break;
                    }
                    break;
                }
                case -397938582: {
                    if (s.equals("phone_verify")) {
                        n2 = 8;
                        break;
                    }
                    break;
                }
                case -271271015: {
                    if (s.equals("value_of_twitter")) {
                        n2 = 9;
                        break;
                    }
                    break;
                }
            }
            while (true) {
                Label_0808: {
                    Intent intent = null;
                    switch (n2) {
                        default: {
                            com.twitter.android.client.c.a((Context)activity).a(((TwitterScribeLog)new TwitterScribeLog(b.g()).b(new String[] { this.f() + "::::error" })).d(s));
                            intent = null;
                            break;
                        }
                        case 0: {
                            intent = new Intent((Context)activity, (Class)FollowActivity.class).putExtra("may_upload_contacts", this.b);
                            break;
                        }
                        case 1: {
                            intent = new Intent((Context)activity, (Class)FollowActivity.class);
                            break;
                        }
                        case 2: {
                            if (this.c != null) {
                                intent = new Intent((Context)activity, (Class)FollowActivity.class);
                                break;
                            }
                            break Label_0808;
                        }
                        case 3: {
                            intent = new Intent((Context)activity, (Class)PhoneEntryNuxActivity.class).putExtra("show_nux_copy", this.n);
                            break;
                        }
                        case 4: {
                            intent = new Intent((Context)activity, (Class)EditProfileOnboardingActivity.class);
                            break;
                        }
                        case 5: {
                            if (fj.a((Context)activity).a()) {
                                intent = new Intent((Context)activity, (Class)InstantTimelineWaitingActivity.class);
                                break;
                            }
                            break Label_0808;
                        }
                        case 6: {
                            intent = new Intent((Context)activity, (Class)InterestPickerActivity.class).putExtra("allow_continue", this.h);
                            break;
                        }
                        case 7: {
                            intent = new Intent((Context)activity, (Class)FollowActivity.class);
                            break;
                        }
                        case 8: {
                            intent = new Intent((Context)activity, (Class)PhoneVerifyNuxActivity.class).putExtra("liveFragment", 1).putExtra("account_name", b.e());
                            break;
                        }
                        case 9: {
                            intent = new Intent((Context)activity, (Class)ValueOfTwitterActivity.class);
                            break;
                        }
                    }
                    if (intent == null) {
                        this.a(activity, n + 1);
                        return;
                    }
                    intent.putExtra("flow_controller", (Parcelable)a);
                    activity.startActivity(intent);
                    return;
                }
                Intent intent = null;
                continue;
            }
        }
        final long g = az.a((Context)activity).b().g();
        if (this.k) {
            com.twitter.android.client.c.a((Context)activity).a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.f() + "::::complete" })).a((long)this.j));
        }
        d(activity);
        PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().remove("pref_referral_campaign").apply();
        this.a(activity, this.g);
    }
    
    private void a(final Activity activity, final Intent intent) {
        final Intent setFlags = new Intent((Context)activity, (Class)DispatchActivity.class).setFlags(67108864);
        if (this.l) {
            setFlags.setFlags(268468224);
        }
        if (intent != null) {
            setFlags.putExtra("android.intent.extra.INTENT", (Parcelable)intent);
        }
        activity.startActivity(setFlags);
        activity.finish();
    }
    
    public static void d(final Activity activity) {
        PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().remove("flow_referral_campaign_id").remove("flow_may_upload_contacts").remove("flow_flowsteps").remove("flow_scribe_page_term").remove("flow_step").remove("flow_follow_count").remove("flow_is_onboarding").remove("flow_clear_stack").remove("flow_normalized_phone").remove("flow_selected_interests").remove("flow_landing_intent_uri").remove("flow_ip_allow_continue").apply();
    }
    
    public static boolean e(final Activity activity) {
        return PreferenceManager.getDefaultSharedPreferences((Context)activity).contains("flow_flowsteps");
    }
    
    private static Intent f(final String s) {
        try {
            return Intent.parseUri(s, 0);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static void f(final Activity activity) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)activity);
        final String string = defaultSharedPreferences.getString("flow_flowsteps", (String)null);
        if (string != null) {
            final String[] split = string.split(",");
            final String string2 = defaultSharedPreferences.getString("flow_selected_interests", (String)null);
            String[] split2;
            if (TextUtils.isEmpty((CharSequence)string2)) {
                split2 = null;
            }
            else {
                split2 = string2.split(",");
            }
            new FollowFlowController(defaultSharedPreferences.getString("flow_scribe_page_term", (String)null)).a(defaultSharedPreferences.getString("flow_referral_campaign_id", (String)null)).a(defaultSharedPreferences.getBoolean("flow_may_upload_contacts", false)).a(split).a(defaultSharedPreferences.getInt("flow_step", 0)).c(defaultSharedPreferences.getInt("flow_follow_count", 0)).c(defaultSharedPreferences.getBoolean("flow_is_onboarding", false)).d(defaultSharedPreferences.getBoolean("flow_clear_stack", false)).b(defaultSharedPreferences.getString("flow_normalized_phone", (String)null)).b(split2).a(f(defaultSharedPreferences.getString("flow_landing_intent_uri", (String)null))).b(defaultSharedPreferences.getBoolean("flow_ip_allow_continue", false)).b(activity);
            d(activity);
            return;
        }
        MainActivity.a(activity, null);
    }
    
    private FollowFlowController g() {
        return new FollowFlowController(this.e).a(this.d).a(this.f).a(this.c).a(this.b).a(this.g).b(this.h).b(this.i).c(this.j).c(this.k).d(this.l).b(this.m).h(this.n);
    }
    
    private FollowFlowController h(final boolean n) {
        this.n = n;
        return this;
    }
    
    public FollowFlowController a(final int f) {
        this.f = f;
        return this;
    }
    
    public FollowFlowController a(final Intent g) {
        this.g = g;
        return this;
    }
    
    public FollowFlowController a(final String c) {
        this.c = c;
        return this;
    }
    
    public FollowFlowController a(final String s, final boolean b) {
        return this.a(this.a(s.split(","), b));
    }
    
    public FollowFlowController a(final ArrayList d) {
        this.d = d;
        return this;
    }
    
    public FollowFlowController a(final boolean b) {
        this.b = b;
        return this;
    }
    
    public FollowFlowController a(final String[] array) {
        return this.a(new ArrayList((Collection<? extends E>)Arrays.asList(array)));
    }
    
    public String a() {
        return this.m;
    }
    
    public void a(final Activity activity) {
        this.a(activity, 1 + this.f);
    }
    
    public FollowFlowController b(final String m) {
        this.m = m;
        return this;
    }
    
    public FollowFlowController b(final boolean h) {
        this.h = h;
        return this;
    }
    
    public FollowFlowController b(final String[] i) {
        this.i = i;
        return this;
    }
    
    public void b(final int n) {
        this.j += n;
    }
    
    public void b(final Activity activity) {
        final c a = com.twitter.android.client.c.a((Context)activity);
        this.n = a.e();
        this.a(activity, this.f);
        if (this.b && !a.d() && !a.c()) {
            cj.a(this.e, (Context)activity).a();
            a.b(true);
        }
    }
    
    public boolean b() {
        return this.k;
    }
    
    public FollowFlowController c(final int j) {
        this.j = j;
        return this;
    }
    
    public FollowFlowController c(final boolean k) {
        this.k = k;
        return this;
    }
    
    public ReferralCampaign c() {
        return lj.a(this.c);
    }
    
    public void c(final Activity activity) {
        if (this.d.size() == 0) {
            return;
        }
        final SharedPreferences$Editor putString = PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().putString("flow_referral_campaign_id", this.c).putBoolean("flow_may_upload_contacts", this.b).putString("flow_flowsteps", TextUtils.join((CharSequence)",", (Iterable)this.d)).putString("flow_scribe_page_term", this.e).putInt("flow_step", this.f).putInt("flow_follow_count", this.j).putBoolean("flow_is_onboarding", this.k).putBoolean("flow_clear_stack", this.l).putString("flow_normalized_phone", this.m).putString("flow_selected_interests", TextUtils.join((CharSequence)",", (Object[])this.i));
        String uri;
        if (this.g != null) {
            uri = this.g.toUri(0);
        }
        else {
            uri = null;
        }
        putString.putString("flow_landing_intent_uri", uri).putBoolean("flow_ip_allow_continue", this.h).apply();
    }
    
    public void c(final String s) {
        if (this.f < this.d.size()) {
            this.d.add(1 + this.f, s);
        }
    }
    
    public FollowFlowController d(final boolean l) {
        this.l = l;
        return this;
    }
    
    public void d(final String s) {
        this.d.remove(s);
    }
    
    public String[] d() {
        return this.i;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public FollowFlowController e(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        if (b) {
            list.add("phone_entry");
        }
        list.add("follow_friends");
        return this.a(list);
    }
    
    public boolean e() {
        return this.n;
    }
    
    public boolean e(final String s) {
        return this.f < this.d.size() && this.d.get(this.f).equals(s);
    }
    
    public FollowFlowController f(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        if ("value_of_twitter".equals(com.twitter.library.featureswitch.d.b("nux_value_of_twitter_3291"))) {
            list.add("value_of_twitter");
        }
        if (b) {
            list.add("phone_entry");
        }
        if (!"control".equals(com.twitter.library.featureswitch.d.b("interest_picker_holdback_3212"))) {
            list.add("interest_picker");
        }
        list.add("edit_profile");
        list.add("follow_friends");
        list.add("InstantTimelineWaitingActivity");
        return this.a(list);
    }
    
    public String f() {
        if (this.e != null) {
            return this.e;
        }
        return "error";
    }
    
    public FollowFlowController g(final boolean b) {
        final ArrayList<String> list = new ArrayList<String>();
        if (b) {
            list.add("phone_entry");
        }
        final String[] a = FollowFlowController.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            list.add(a[i]);
        }
        return this.a(list);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeStringList((List)this.d);
        parcel.writeInt(this.f);
        int n3;
        if (this.b) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeParcelable((Parcelable)this.g, n);
        int n4;
        if (this.h) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        if (this.i == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(this.i.length);
            for (int i = 0; i < this.i.length; ++i) {
                parcel.writeString(this.i[i]);
            }
        }
        parcel.writeInt(this.j);
        int n5;
        if (this.k) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        parcel.writeInt(n5);
        int n6;
        if (this.l) {
            n6 = n2;
        }
        else {
            n6 = 0;
        }
        parcel.writeInt(n6);
        parcel.writeString(this.m);
        if (!this.n) {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
