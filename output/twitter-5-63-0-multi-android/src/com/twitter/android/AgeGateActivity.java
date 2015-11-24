// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.c;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import android.widget.Toast;
import android.content.Context;
import com.twitter.android.client.ce;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.api.TwitterUser;
import android.content.DialogInterface;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.TimeZone;
import java.util.Calendar;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.DatePicker;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.ui.dialog.e;
import android.content.DialogInterface$OnCancelListener;

public class AgeGateActivity extends UserQueryActivity implements DialogInterface$OnCancelListener, e
{
    protected TwitterScribeAssociation a;
    private PromotedContent e;
    private long f;
    private UserImageView g;
    private DatePicker h;
    private TypefacesTextView i;
    
    private static long a(final Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
    
    public static boolean a(final long timeInMillis, final long timeInMillis2) {
        final Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.setTimeInMillis(timeInMillis);
        final long a = a(instance);
        instance.setTimeInMillis(timeInMillis2);
        return a(instance) <= a;
    }
    
    private boolean j() {
        final Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.set(this.h.getYear(), this.h.getMonth(), this.h.getDayOfMonth());
        return a(this.f, instance.getTimeInMillis());
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968594);
        bn.a(true);
        bn.b(12);
        return bn;
    }
    
    protected jy a(final Intent intent, final bn bn) {
        return null;
    }
    
    protected CharSequence a(final Intent intent) {
        return null;
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 3 && n2 == -1) {
            this.setResult(0);
            this.g_();
        }
    }
    
    @Override
    protected void a(final TwitterUser twitterUser) {
        super.a(twitterUser);
        this.g.a(twitterUser);
        this.i.setText((CharSequence)this.getString(2131296312));
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951616, toolBar);
        return true;
    }
    
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887399) {
            if (!this.j()) {
                ce.a((Context)this).a();
                Toast.makeText((Context)this, (CharSequence)this.getString(2131296309), 1).show();
                this.g_();
                return true;
            }
            this.a(new pb((Context)this.getApplication(), this.U(), this.b, this.e).d(true).c(true));
            this.g_();
        }
        else if (a == 2131886126) {
            this.g_();
            return true;
        }
        return true;
    }
    
    protected TwitterScribeAssociation b() {
        return (TwitterScribeAssociation)new TwitterScribeAssociation().b("age_gate");
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final c g = this.G();
        if (!this.U().d()) {
            return;
        }
        final Intent intent = this.getIntent();
        this.a = this.b();
        this.H().a(this.a);
        this.g = (UserImageView)this.findViewById(2131886250);
        this.i = (TypefacesTextView)this.findViewById(2131886251);
        this.h = (DatePicker)this.findViewById(2131886254);
        g.a(this.U().g(), TwitterScribeLog.a(this.a, "", "", "impression"));
        final TypefacesTextView typefacesTextView = (TypefacesTextView)this.findViewById(2131886255);
        typefacesTextView.setOnClickListener((View$OnClickListener)new ah(this));
        typefacesTextView.setPaintFlags(0x8 | typefacesTextView.getPaintFlags());
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            this.b = extras.getLong("user_id");
            this.c = extras.getString("user_name");
            this.f = extras.getLong("age_gate_timestamp");
            final String string = extras.getString("impression_id");
            final boolean boolean1 = extras.getBoolean("is_earned");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.e = new PromotedContent();
                this.e.impressionId = string;
                if (boolean1) {
                    this.e.disclosureType = "earned";
                }
            }
        }
        this.setTitle(2131296313);
        this.h();
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
}
