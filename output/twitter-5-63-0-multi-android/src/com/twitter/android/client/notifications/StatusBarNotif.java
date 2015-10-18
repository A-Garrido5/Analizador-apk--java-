// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.support.v4.app.NotificationCompat$BigTextStyle;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.UserSettings;
import com.twitter.library.client.az;
import java.util.Collections;
import java.util.List;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigPictureStyle;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.content.ComponentName;
import com.twitter.android.MainActivity;
import android.support.v4.app.TaskStackBuilder;
import android.content.res.Resources;
import com.twitter.android.client.ab;
import com.twitter.library.media.manager.UserImageRequest;
import android.app.Notification;
import android.graphics.Bitmap;
import com.twitter.android.client.x;
import android.annotation.TargetApi;
import com.twitter.android.dialog.NotifyRetweetDialogFragmentActivity;
import com.twitter.android.composer.au;
import com.twitter.android.composer.ComposerActivity;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeItem;
import android.os.Build$VERSION;
import java.util.ArrayList;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.util.a;
import android.accounts.AccountManager;
import com.twitter.android.NotificationSettingsActivity;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.telephony.TelephonyManager;
import com.twitter.library.util.bo;
import com.twitter.library.api.ax;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.Tweet;
import com.twitter.library.platform.notifications.e;
import java.util.Iterator;
import android.support.v4.app.NotificationCompat$Action;
import android.support.v4.app.NotificationCompat$Builder;
import android.net.Uri;
import com.twitter.library.provider.as;
import android.content.Intent;
import com.twitter.android.client.NotificationService;
import android.app.PendingIntent;
import android.os.Bundle;
import com.twitter.library.platform.DataSyncResult;
import android.os.Parcel;
import com.twitter.android.client.ae;
import android.content.Context;
import com.twitter.library.platform.d;
import android.os.Parcelable;

public abstract class StatusBarNotif implements Parcelable
{
    protected final d a;
    protected final long b;
    protected final String c;
    protected final long d;
    protected Context e;
    private final aa f;
    private boolean g;
    private ae h;
    
    protected StatusBarNotif(final Parcel parcel) {
        this.a = DataSyncResult.a(parcel);
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.f = this.l();
    }
    
    public StatusBarNotif(final d a, final long b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = System.currentTimeMillis();
        this.f = this.l();
        this.g = false;
    }
    
    private PendingIntent a(final Bundle bundle, final String action) {
        this.a(bundle);
        return PendingIntent.getService(this.e, 0, new Intent(this.e, (Class)NotificationService.class).setAction(action).setData(Uri.withAppendedPath(as.a, String.valueOf(this.a.p))).putExtras(bundle), 268435456);
    }
    
    private static NotificationCompat$Builder a(final Context context, final StatusBarNotif statusBarNotif) {
        statusBarNotif.c(context);
        final NotificationCompat$Builder setNumber = new NotificationCompat$Builder(context).setWhen(statusBarNotif.x()).setContentIntent(statusBarNotif.I()).setDeleteIntent(statusBarNotif.M()).setPriority(statusBarNotif.D()).setSmallIcon(statusBarNotif.F()).setTicker(statusBarNotif.C()).setContentTitle(statusBarNotif.B()).setContentText(statusBarNotif.A()).setSubText(statusBarNotif.al_()).setStyle(statusBarNotif.z()).setNumber(statusBarNotif.E());
        for (final NotificationCompat$Action notificationCompat$Action : statusBarNotif.N()) {
            setNumber.addAction(notificationCompat$Action.icon, notificationCompat$Action.title, notificationCompat$Action.actionIntent);
        }
        return setNumber;
    }
    
    private static Tweet a(final com.twitter.library.platform.notifications.d d, final e e, final e e2) {
        return new ad().d(e.a).b(e.b).b(e2.a).f(e2.b).e(d.a).f(d.a).c(d.b).a(d.a != d.b).a(d.d).a((TweetEntities)new ax().a(d.g).f()).a();
    }
    
    protected static void a(final Context context, final NotificationCompat$Builder notificationCompat$Builder, final ae ae) {
        final boolean d = ae.d;
        int defaults = 0;
        if (d) {
            defaults = 2;
        }
        if (ae == ae.a) {
            notificationCompat$Builder.setTicker(null);
        }
        notificationCompat$Builder.setDefaults(defaults);
        if (ae.b) {
            notificationCompat$Builder.setLights(-16711936, 500, 2000);
        }
        if (bo.b && ((TelephonyManager)context.getSystemService("phone")).getCallState() == 0 && !TextUtils.isEmpty((CharSequence)ae.c)) {
            notificationCompat$Builder.setSound(Uri.parse(ae.c), 5);
        }
    }
    
    private void a(final Bundle bundle) {
        bundle.putString("sb_account_name", this.c);
        bundle.putParcelable("sb_notification", (Parcelable)this);
    }
    
    private Intent n() {
        if (this.f.a()) {
            return this.f.g();
        }
        final Intent j = this.j();
        String s = this.o();
        final String p = this.p();
        if (s != null && NotificationSettingsActivity.a(PreferenceManager.getDefaultSharedPreferences(this.e), p)) {
            if (com.twitter.library.util.a.a(AccountManager.get(this.e)).length > 1) {
                s = "@" + this.c + "\n" + s;
            }
            j.putExtra("NotificationSettingsActivity_text", s);
            j.putExtra("NotificationSettingsActivity_username", this.c);
            j.putExtra("NotificationSettingsActivity_user_id", this.b);
            j.putExtra("NotificationSettingsActivity_notif_type", p);
            j.putExtra("NotificationSettingsActivity_scribe_component", this.q());
            j.putExtra("NotificationSettingsActivity_notif_random_id", "" + System.currentTimeMillis());
        }
        return j;
    }
    
    private String r() {
        if (this.f.a()) {
            return this.f.n();
        }
        if (!TextUtils.isEmpty((CharSequence)this.a.j)) {
            return this.a.j;
        }
        return this.k();
    }
    
    public final String A() {
        if (this.f.a()) {
            return this.f.e();
        }
        return this.d();
    }
    
    public final String B() {
        if (this.f.a()) {
            return this.f.d();
        }
        return this.c();
    }
    
    public final String C() {
        if (this.f.a() && this.f.j().length == 0) {
            return this.f.d();
        }
        return this.b();
    }
    
    public final int D() {
        if (this.f.a()) {
            return this.f.i();
        }
        return this.a.q;
    }
    
    public final int E() {
        if (this.f.a()) {
            return this.f.l();
        }
        return 1;
    }
    
    public final int F() {
        if (this.f.a()) {
            return this.f.f();
        }
        return this.i();
    }
    
    public String G() {
        if (this.f.a()) {
            return null;
        }
        return this.a.l;
    }
    
    public boolean H() {
        return this.a.m;
    }
    
    public final PendingIntent I() {
        return this.a(0, this.K(), this.L());
    }
    
    protected int J() {
        if (this.f.a()) {
            return this.f.m();
        }
        return 335544320;
    }
    
    protected final TwitterScribeLog K() {
        return this.a("open");
    }
    
    protected final TwitterScribeLog L() {
        return this.a("background_open");
    }
    
    public final PendingIntent M() {
        final Bundle bundle = new Bundle(5);
        final TwitterScribeLog a = this.a("dismiss");
        if (a != null) {
            bundle.putParcelable("notif_scribe_log", (Parcelable)a);
        }
        final TwitterScribeLog a2 = this.a("background_dismiss");
        if (a2 != null) {
            bundle.putParcelable("notif_scribe_log_from_background", (Parcelable)a2);
        }
        if (this.g) {
            final TwitterScribeLog a3 = this.a("preview_dismiss_image_loaded");
            if (a3 != null) {
                bundle.putParcelable("notif_scribe_log_for_preview_experiment", (Parcelable)a3);
            }
        }
        else if (this.g() && fh.a()) {
            final TwitterScribeLog a4 = this.a("preview_dismiss");
            if (a4 != null) {
                bundle.putParcelable("notif_scribe_log_for_preview_experiment", (Parcelable)a4);
            }
        }
        return this.a(bundle, NotificationService.a);
    }
    
    @TargetApi(16)
    protected ArrayList N() {
        final ArrayList<NotificationCompat$Action> list = new ArrayList<NotificationCompat$Action>();
        final d a = this.a;
        if (Build$VERSION.SDK_INT < 16 || a == null || a.w == null || a.v == null || this.f.a()) {
            return list;
        }
        final String r = this.r();
        final Context e = this.e;
        for (final com.twitter.library.platform.notifications.a a2 : a.w) {
            final TwitterScribeLog a3 = this.a(a2.f);
            switch (a2.e) {
                default: {
                    continue;
                }
                case 0: {
                    final com.twitter.library.platform.notifications.d u = a.u;
                    final e b = a.v.b;
                    if (u != null && b != null) {
                        final Tweet a4 = a(u, b, a.v.c);
                        if (a3 != null) {
                            a3.a(TwitterScribeItem.a(e, a4, null, null));
                        }
                        list.add(new NotificationCompat$Action(2130839305, e.getString(2131296397), new w(this.e, this, NotificationService.c).a(a3, a3).a(true).a(this.a(e, ComposerActivity.class, au.a(e).a(a4).a(this.c).p(), a3)).b()));
                        continue;
                    }
                    continue;
                }
                case 1: {
                    final com.twitter.library.platform.notifications.d u2 = a.u;
                    final e b2 = a.v.b;
                    if (u2 != null && b2 != null && !b2.g) {
                        final Tweet a5 = a(u2, b2, a.v.c);
                        TwitterScribeLog twitterScribeLog;
                        TwitterScribeLog twitterScribeLog2;
                        if (r != null) {
                            final TwitterScribeItem a6 = TwitterScribeItem.a(e, a5, null, null);
                            twitterScribeLog = (TwitterScribeLog)this.a("retweet").a(a6);
                            twitterScribeLog2 = (TwitterScribeLog)this.a("quote").a(a6);
                        }
                        else {
                            twitterScribeLog = null;
                            twitterScribeLog2 = null;
                        }
                        final Bundle bundle = new Bundle();
                        bundle.putLong("ref_status_id", u2.a);
                        bundle.putLong("status_id", u2.b);
                        final w a7 = new w(this.e, this, NotificationService.d).a(twitterScribeLog, twitterScribeLog).a(2130839306, e.getString(2131297356)).a(bundle);
                        list.add(new NotificationCompat$Action(2130839306, e.getString(2131296398), a7.a(this.a(e, null, new Intent(e, (Class)NotifyRetweetDialogFragmentActivity.class).putExtra("tweet", (Parcelable)a5).putExtra("retweet_service_intent", (Parcelable)a7.a()), twitterScribeLog2)).a(true).b()));
                        continue;
                    }
                    continue;
                }
                case 2: {
                    final com.twitter.library.platform.notifications.d u3 = a.u;
                    final e b3 = a.v.b;
                    if (u3 != null && b3 != null) {
                        final Bundle bundle2 = new Bundle();
                        bundle2.putLong("status_id", u3.b);
                        bundle2.putLong("rt_status_id", u3.a);
                        if (a3 != null) {
                            a3.a(TwitterScribeItem.a(e, a(u3, b3, a.v.c), null, null));
                        }
                        list.add(new NotificationCompat$Action(2130839302, e.getString(2131296393), new w(this.e, this, NotificationService.e).a(a3, a3).a(true).a(2130839302, e.getString(2131297346)).b()));
                        continue;
                    }
                    continue;
                }
                case 4: {
                    final e b4 = a.v.b;
                    if (b4 != null && !b4.h) {
                        final Bundle bundle3 = new Bundle();
                        bundle3.putLong("user_id", b4.a);
                        bundle3.putLong("owner_id", this.b);
                        int n;
                        if (b4.g) {
                            n = 2131297355;
                        }
                        else {
                            n = 2131297352;
                        }
                        list.add(new NotificationCompat$Action(2130839303, e.getString(2131297007), new w(this.e, this, NotificationService.f).a(a3, a3).a(true).a(2130839304, e.getString(n)).b()));
                        continue;
                    }
                    continue;
                }
                case 5: {
                    final e b5 = a.v.b;
                    if (b5 != null) {
                        list.add(new NotificationCompat$Action(2130839300, e.getString(2131297358), new w(this.e, this, NotificationService.i).a(a3, a3).a(true).a(this.a(e, ComposerActivity.class, au.a(e).a("@" + b5.b + " ", null).p(), a3)).b()));
                        continue;
                    }
                    continue;
                }
                case 6: {
                    final e b6 = a.v.b;
                    if (b6 != null) {
                        new Bundle().putLong("user_id", b6.a);
                        list.add(new NotificationCompat$Action(2130839299, e.getString(2131297495), new w(this.e, this, NotificationService.g).a(a3, a3).a(true).a(2130839299, e.getString(2131297353)).b()));
                        continue;
                    }
                    continue;
                }
                case 7: {
                    final e b7 = a.v.b;
                    if (b7 != null) {
                        new Bundle().putLong("user_id", b7.a);
                        list.add(new NotificationCompat$Action(2130839301, e.getString(2131297496), new w(this.e, this, NotificationService.h).a(a3, a3).a(true).a(2130839301, e.getString(2131297354)).b()));
                        continue;
                    }
                    continue;
                }
            }
        }
        return list;
    }
    
    public int[] O() {
        if (this.f.a()) {
            return this.f.j();
        }
        return new int[] { this.a.p };
    }
    
    public boolean P() {
        return this.g;
    }
    
    public ae Q() {
        return this.h;
    }
    
    public Notification a(final Context context, final x x, final ae ae, Bitmap a) {
        final NotificationCompat$Builder a2 = a(context, this);
        final Resources resources = context.getResources();
        final String f = this.f();
        if (f != null) {
            final Bitmap a3 = x.a(UserImageRequest.a(f, resources.getDimensionPixelSize(17104902)).a(true).a(), new ab(this.w(), false));
            if (a3 != null) {
                a2.setLargeIcon(a3);
            }
        }
        if (this.g()) {
            boolean b = false;
            Label_0105: {
                if (!fh.b()) {
                    final boolean h = this.h();
                    b = false;
                    if (!h) {
                        break Label_0105;
                    }
                }
                b = true;
            }
            if (b) {
                final String g = this.G();
                if (a == null) {
                    a = x.a(this.a(context, g).a(), new ab(this.w(), true));
                }
                if (a != null) {
                    this.a(a2, a);
                }
            }
        }
        a(context, a2, ae);
        a2.setColor(resources.getColor(2131689615));
        return a2.build();
    }
    
    protected PendingIntent a(final int n, final ScribeLog scribeLog, final ScribeLog scribeLog2) {
        final Bundle bundle = new Bundle(6);
        if (scribeLog != null) {
            bundle.putParcelable("notif_scribe_log", (Parcelable)scribeLog);
        }
        if (scribeLog2 != null) {
            bundle.putParcelable("notif_scribe_log_from_background", (Parcelable)scribeLog2);
        }
        if (this.g) {
            final TwitterScribeLog a = this.a("preview_open_image_loaded");
            if (a != null) {
                bundle.putParcelable("notif_scribe_log_for_preview_experiment", (Parcelable)a);
            }
        }
        else if (this.g() && fh.a()) {
            final TwitterScribeLog a2 = this.a("preview_open");
            if (a2 != null) {
                bundle.putParcelable("notif_scribe_log_for_preview_experiment", (Parcelable)a2);
            }
        }
        this.a(bundle);
        return this.a(this.n().putExtras(bundle), n, 268435456);
    }
    
    PendingIntent a(final Context context, final Class clazz, final Intent intent, final TwitterScribeLog twitterScribeLog) {
        final Bundle bundle = new Bundle(5);
        this.a(bundle);
        bundle.putParcelable("notif_scribe_log", (Parcelable)twitterScribeLog);
        bundle.putParcelable("notif_scribe_log_from_background", (Parcelable)twitterScribeLog);
        intent.setData(Uri.withAppendedPath(as.a, String.valueOf(this.a.p))).putExtras(bundle);
        if (clazz != null) {
            final TaskStackBuilder addNextIntent = TaskStackBuilder.create(context).addParentStack(clazz).addNextIntent(intent);
            addNextIntent.editIntentAt(0).putExtra("AbsFragmentActivity_account_name", this.c);
            return addNextIntent.getPendingIntent(0, 268435456);
        }
        return PendingIntent.getActivity(context, 0, intent, 268435456);
    }
    
    protected PendingIntent a(final Intent intent, final int n, final int n2) {
        intent.putExtra("ref_event", "notification::::open").putExtra("AbsFragmentActivity_account_name", this.c).setFlags(this.J());
        final TaskStackBuilder create = TaskStackBuilder.create(this.e);
        final ComponentName component = intent.getComponent();
        if (component != null) {
            create.addParentStack(component);
        }
        else if (!MainActivity.class.getName().equals(intent.resolveActivity(this.e.getPackageManager()).getClassName())) {
            create.addNextIntent(new Intent(this.e, (Class)MainActivity.class));
        }
        if (create.getIntentCount() > 0) {
            create.editIntentAt(0).putExtra("AbsFragmentActivity_account_name", this.c);
        }
        create.addNextIntent(intent);
        return create.getPendingIntent(n, n2);
    }
    
    protected k a(final Context context, final String s) {
        return j.a(s);
    }
    
    public TwitterScribeLog a(final String s) {
        final String r = this.r();
        TwitterScribeLog twitterScribeLog;
        if (r != null) {
            twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.b).b(new String[] { ScribeLog.a("notification:status_bar", "", r, s) })).c(2);
            final Iterator<ScribeItem> iterator = this.am_().iterator();
            while (iterator.hasNext()) {
                twitterScribeLog.a(iterator.next());
            }
        }
        else {
            twitterScribeLog = null;
        }
        return twitterScribeLog;
    }
    
    public void a(final NotificationCompat$Builder notificationCompat$Builder, final Bitmap bitmap) {
        notificationCompat$Builder.setStyle(new NotificationCompat$BigPictureStyle().bigPicture(bitmap).setBigContentTitle(this.B()).setSummaryText(this.e()));
    }
    
    public void a(final ae h) {
        this.h = h;
    }
    
    public void a(final boolean g) {
        this.g = g;
    }
    
    public boolean a(final j j, final Bitmap bitmap) {
        return true;
    }
    
    public String al_() {
        return null;
    }
    
    protected List am_() {
        return Collections.EMPTY_LIST;
    }
    
    protected String b() {
        return this.a.e;
    }
    
    protected String c() {
        return this.a.d;
    }
    
    void c(final Context context) {
        this.e = context.getApplicationContext();
        this.f.a(context);
    }
    
    protected String d() {
        return this.a.e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.A();
    }
    
    public String f() {
        if (!this.f.a() && this.a.v != null) {
            return this.a.v.a();
        }
        return null;
    }
    
    public boolean g() {
        boolean b = true;
        if (Build$VERSION.SDK_INT < 16) {
            return false;
        }
        final String g = this.G();
        final UserSettings j = az.a(this.e).b(this.v()).j();
        final boolean b2 = j != null && j.k && b;
        final boolean b3 = (!this.H() || b2) && b;
        if (g == null || !b3) {
            b = false;
        }
        return b;
    }
    
    public boolean h() {
        return false;
    }
    
    protected abstract int i();
    
    protected abstract Intent j();
    
    protected abstract String k();
    
    protected aa l() {
        return new z(this.a, this.c, this.b);
    }
    
    protected String o() {
        return null;
    }
    
    protected String p() {
        return null;
    }
    
    protected String q() {
        return this.p();
    }
    
    public boolean s() {
        return false;
    }
    
    public boolean t() {
        return false;
    }
    
    public void u() {
    }
    
    public long v() {
        return this.b;
    }
    
    public int w() {
        return this.a.p;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        DataSyncResult.a(parcel, this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
    }
    
    public long x() {
        return this.d;
    }
    
    public boolean y() {
        for (int i = 0; i < this.a.t.length; ++i) {
            if (this.a.t[i].b == this.a.p) {
                return true;
            }
        }
        final com.twitter.android.client.notifications.ab ab = new com.twitter.android.client.notifications.ab(this.b, this.a);
        ab.a(new IllegalStateException("Notification id: " + this.a.p + " missing from inbox"));
        ErrorReporter.a(ab);
        return false;
    }
    
    public final NotificationCompat$Style z() {
        if (this.f.a()) {
            return this.f.k();
        }
        return new NotificationCompat$BigTextStyle().bigText(this.A());
    }
}
