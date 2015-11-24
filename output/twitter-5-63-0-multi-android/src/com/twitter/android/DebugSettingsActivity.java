// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.al;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog$Builder;
import android.os.Parcelable;
import com.twitter.library.util.a;
import com.twitter.library.platform.TwitterDataSyncService;
import android.os.Bundle;
import com.twitter.android.widget.m;
import java.io.Serializable;
import com.twitter.android.commerce.view.ProductPageActivity;
import java.math.BigDecimal;
import java.util.List;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.property.ImageSpec;
import java.util.ArrayList;
import com.twitter.library.commerce.model.Product;
import android.preference.EditTextPreference;
import com.twitter.android.moments.ui.guide.GuideActivity;
import com.twitter.android.highlights.StoriesActivity;
import android.app.Activity;
import android.content.Intent;
import com.twitter.android.util.ap;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import com.twitter.library.card.Card;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.library.platform.f;
import android.preference.PreferenceScreen;
import android.preference.PreferenceCategory;
import android.preference.Preference;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import com.twitter.library.provider.bg;
import com.twitter.library.network.ae;
import android.content.Context;
import android.widget.Toast;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.android.util.am;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public abstract class DebugSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener, am
{
    private void c(final boolean b) {
        final DebugSettingsActivity$CrashlyticsTestException ex = new DebugSettingsActivity$CrashlyticsTestException("Crash Test exception");
        if (b) {
            throw ex;
        }
        ErrorReporter.a(ex);
        Toast.makeText((Context)this, (CharSequence)"Exception logged", 0).show();
    }
    
    private void d() {
        this.findPreference((CharSequence)"debug_start_card_previewer").setSummary((CharSequence)("Platform Version: " + ae.a((Context)this).a()));
    }
    
    private void e() {
        final az l = this.l();
        final Session b = l.b();
        final Context applicationContext = this.getApplicationContext();
        cm.a();
        bg.a(applicationContext, b.g()).a();
        l.d(b.e());
        Toast.makeText((Context)this, (CharSequence)"Cached tweets deleted", 0).show();
    }
    
    public void a(final boolean b) {
        String s;
        if (b) {
            s = "current user has a verified phone";
        }
        else {
            s = "current user does not have a phone";
        }
        Toast.makeText((Context)this, (CharSequence)s, 0).show();
    }
    
    protected void b() {
        final Preference preference = new Preference((Context)this);
        preference.setKey("pref_feature_switches");
        preference.setTitle(2131298267);
        preference.setSummary(2131298266);
        preference.setOrder(1003);
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new em(this));
        this.getPreferenceScreen().addPreference(preference);
    }
    
    protected void c() {
        this.addPreferencesFromResource(2131165193);
        this.findPreference((CharSequence)"pref_debug").setOrder(1002);
        final Preference preference = new Preference((Context)this);
        preference.setKey("ptr_debug");
        preference.setTitle((CharSequence)"Debug PTR");
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new en(this));
        final PreferenceCategory preferenceCategory = (PreferenceCategory)this.findPreference((CharSequence)"pref_debug_main");
        preferenceCategory.addPreference(preference);
        this.findPreference((CharSequence)"check_phone").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"logcat_viewer").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"logged_in_mt").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"phone_ownership").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"bouncer").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"start_nux").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"start_highlights").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"start_highlights_nux").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"start_highlights_empty").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"pref_signup_phone100").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        final PreferenceCategory preferenceCategory2 = (PreferenceCategory)this.findPreference((CharSequence)"pref_debug_push");
        preferenceCategory2.findPreference((CharSequence)"simulate_logged_in_push").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        preferenceCategory2.findPreference((CharSequence)"simulate_logged_out_push").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        ((PreferenceScreen)this.findPreference((CharSequence)"pref_debug")).addPreference(preference);
        if (f.b((Context)this)) {
            this.findPreference((CharSequence)"geo_debug").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        }
        else {
            preferenceCategory.removePreference(this.findPreference((CharSequence)"geo_debug"));
        }
        this.findPreference((CharSequence)"moments_debug").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_delete_cached_tweets").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        final Preference preference2 = this.findPreference((CharSequence)"debug_show_catfood_cards");
        preference2.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        preference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.findPreference((CharSequence)"debug_show_card_overlay").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.findPreference((CharSequence)"extra_dtab").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        final Preference preference3 = this.findPreference((CharSequence)"debug_card_previewer_host");
        preference3.setSummary((CharSequence)defaultSharedPreferences.getString("debug_card_previewer_host", (String)null));
        preference3.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final Preference preference4 = this.findPreference((CharSequence)"debug_card_commerce_host_v2");
        preference4.setSummary((CharSequence)defaultSharedPreferences.getString("debug_card_commerce_host_v2", (String)null));
        preference4.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final Preference preference5 = this.findPreference((CharSequence)"debug_card_tpay_host_v2");
        preference5.setSummary((CharSequence)defaultSharedPreferences.getString("debug_card_tpay_host_v2", (String)null));
        preference5.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.findPreference((CharSequence)"debug_start_product_previewer").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_start_card_previewer").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_show_hashflags").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_crash_fatal").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_crash_nonfatal").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"debug_home_timeline_sync").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"show_dock").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.findPreference((CharSequence)"dock_show_touch_targets").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.findPreference((CharSequence)"pref_signup_phone100_password").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.d();
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if ("debug_card_previewer_host".equals(preference.getKey())) {
            preference.setSummary((CharSequence)o);
        }
        else if ("debug_show_catfood_cards".equals(preference.getKey())) {
            this.e();
        }
        else if ("debug_show_card_overlay".equals(preference.getKey())) {
            Card.a((boolean)o);
        }
        else if (preference instanceof ListPreference) {
            bq.a((ListPreference)preference, (String)o);
        }
        else if ("dock_show_touch_targets".equals(preference.getKey())) {
            com.twitter.android.widget.bg.a().c((boolean)o);
        }
        return true;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final String key = preference.getKey();
        if ("check_phone".equals(key)) {
            ap.a((Context)this).a(this);
        }
        else {
            if ("logcat_viewer".equals(key)) {
                this.startActivity(new Intent((Context)this, (Class)LogViewerActivity.class));
                return false;
            }
            if ("logged_in_mt".equals(key)) {
                this.startActivity(new Intent((Context)this, (Class)PhoneMTFlowActivity.class));
                return false;
            }
            if ("phone_ownership".equals(key)) {
                this.startActivity(new Intent((Context)this, (Class)PhoneOwnershipActivity.class));
                return false;
            }
            if ("bouncer".equals(key)) {
                BouncerWebViewActivity.a((Context)this, null, true);
                return false;
            }
            if ("start_nux".equals(key)) {
                final al a = ap.a((Context)this);
                final FollowFlowController b = new FollowFlowController("debug").a(true).f(a.c()).b(false);
                b.b((Activity)this);
                if (a.j()) {
                    er.a(b.f(), this.getApplicationContext()).a();
                    return false;
                }
            }
            else {
                if ("start_highlights".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)StoriesActivity.class));
                    return true;
                }
                if ("start_highlights_nux".equals(key)) {
                    StoriesActivity.a((Activity)this, 1);
                    return false;
                }
                if ("start_highlights_empty".equals(key)) {
                    StoriesActivity.a((Activity)this, 3);
                    return false;
                }
                if ("geo_debug".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)GeoDebugActivity.class));
                    return true;
                }
                if ("moments_debug".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)GuideActivity.class));
                    return true;
                }
                if ("debug_delete_cached_tweets".equals(preference.getKey())) {
                    this.e();
                    return true;
                }
                if ("debug_show_catfood_cards".equals(preference.getKey())) {
                    this.d();
                    return false;
                }
                if ("debug_start_card_previewer".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)CardPreviewerActivity.class).putExtra("host", ((EditTextPreference)this.findPreference((CharSequence)"debug_card_previewer_host")).getText()));
                    return true;
                }
                if ("debug_start_product_previewer".equals(key)) {
                    final Product product = new Product();
                    product.b("iPhone 6");
                    product.c("The iPhone 6 and iPhone 6 Plus are smartphones running iOS developed by Apple Inc. The devices are part of the iPhone series and were unveiled on 9 September 2014 and released on September 19, 2014. The iPhone 6 and iPhone 6 Plus jointly serve as successors to the iPhone 5C and iPhone 5S. The iPhone 6 and iPhone 6 Plus include a number of changes over its predecessor, including models with larger 4.7 and 5.5 inches (120 and 140 mm) displays, a faster processor, upgraded cameras, improved LTE and Wi-Fi connectivity, and support for a near-field communications-based mobile payments offering");
                    product.d("@myIphoneStore");
                    final ArrayList<ImageSpec> list = new ArrayList<ImageSpec>();
                    final ImageSpec imageSpec = new ImageSpec();
                    imageSpec.url = "https://pbs.twimg.com/media/CA4C3JGUYAAhKVL.jpg";
                    imageSpec.size = new Vector2F(583.0f, 424.0f);
                    final ImageSpec imageSpec2 = new ImageSpec();
                    imageSpec2.url = "https://pbs.twimg.com/media/CA3tHwgWcAA8qNG.jpg";
                    imageSpec2.size = new Vector2F(599.0f, 367.0f);
                    list.add(imageSpec);
                    list.add(imageSpec2);
                    product.a(list);
                    product.a(new BigDecimal(1.2699E8));
                    product.e("#iphone6");
                    product.f("#iphone");
                    final ArrayList<Long> list2 = new ArrayList<Long>();
                    list2.add(588494323815026690L);
                    product.b(list2);
                    final Intent intent = new Intent((Context)this, (Class)ProductPageActivity.class);
                    intent.putExtra("commerce_product_values", (Serializable)product);
                    this.startActivity(intent);
                    return true;
                }
                if ("pref_developer_start_card_previewer".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)CardPreviewerActivity.class));
                    return true;
                }
                if ("debug_show_hashflags".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)HashflagsViewerActivity.class));
                    return false;
                }
                if ("debug_crash_fatal".equals(key)) {
                    this.c(true);
                    return true;
                }
                if ("debug_crash_nonfatal".equals(key)) {
                    this.c(false);
                    return true;
                }
                if ("simulate_logged_in_push".equals(key)) {
                    this.startActivity(new Intent(this.getApplicationContext(), (Class)PushDebugSettingsActivity.class));
                    return true;
                }
                if ("simulate_logged_out_push".equals(key)) {
                    PushDebugSettingsActivity.a((Context)this);
                    return true;
                }
                if ("show_dock".equals(key)) {
                    final m m = new m((Context)this);
                    m.d().e().setBackgroundColor(-16776961);
                    com.twitter.android.widget.bg.a().c(m);
                    return false;
                }
                if ("debug_home_timeline_sync".equals(key)) {
                    final Bundle bundle = new Bundle();
                    bundle.putBoolean("home", true);
                    this.startService(new Intent((Context)this, (Class)TwitterDataSyncService.class).setAction("sync_account").putExtra("account", (Parcelable)com.twitter.library.util.a.a((Context)this, this.m().e())).putExtra("_data", bundle));
                    return true;
                }
                if ("pref_signup_phone100".equals(key)) {
                    this.startActivity(new Intent((Context)this, (Class)FlowActivity.class));
                    return false;
                }
                if ("pref_signup_phone100_password".equals(key) && this.m().d()) {
                    final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                    alertDialog$Builder.setTitle((CharSequence)"Enter your password");
                    final EditText view = new EditText((Context)this);
                    view.setInputType(129);
                    alertDialog$Builder.setView((View)view);
                    alertDialog$Builder.setPositiveButton(2131297362, (DialogInterface$OnClickListener)new eo(this, view));
                    alertDialog$Builder.show();
                    return true;
                }
            }
        }
        return false;
    }
}
