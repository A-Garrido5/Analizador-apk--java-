// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import android.view.View;
import android.net.Uri;
import java.util.concurrent.Future;
import com.twitter.util.concurrent.d;
import com.twitter.util.concurrent.h;
import com.twitter.library.media.model.MediaType;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.profiles.g;
import com.twitter.library.api.geo.TwitterPlace;
import android.os.Parcelable;
import android.annotation.SuppressLint;
import com.twitter.android.util.l;
import java.util.Set;
import java.util.HashSet;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Bitmap;
import android.content.Intent;
import android.content.res.Resources;
import com.twitter.library.media.manager.k;
import android.app.Activity;
import com.twitter.library.media.util.t;
import com.twitter.android.media.camera.CameraActivity;
import android.text.TextUtils;
import android.content.DialogInterface;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.Session;
import com.twitter.library.media.util.ak;
import android.content.Context;
import com.twitter.android.client.ca;
import com.twitter.library.client.ap;
import com.twitter.internal.util.Optional;
import android.app.ProgressDialog;
import com.twitter.android.profiles.j;
import com.twitter.android.profiles.ad;
import java.util.ArrayList;
import android.widget.EditText;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.android.profiles.HeaderImageView;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.android.profiles.m;
import com.twitter.android.profiles.i;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class BaseEditProfileActivity extends TwitterFragmentActivity implements i, m, b, e
{
    protected TwitterScribeAssociation a;
    MediaFile b;
    MediaFile c;
    boolean d;
    boolean e;
    boolean f;
    TwitterUser g;
    HeaderImageView h;
    UserImageView i;
    EditText j;
    String k;
    private final ArrayList l;
    private boolean m;
    private boolean n;
    private ad o;
    private j p;
    private ProgressDialog q;
    
    public BaseEditProfileActivity() {
        this.l = new ArrayList(3);
        this.n = false;
    }
    
    private void e(final MediaFile b) {
        this.b = b;
        final Session b2 = this.T().b(this.g.a());
        final String m = this.m();
        if (this.b != null) {
            this.p.a(this.g.username);
            this.getIntent().putExtra("update_header", true);
        }
        if (this.r()) {
            ca.a((Context)this, b2, new ap(this.c, this.b, this.d, this.i(), m, this.j(), this.k(), Optional.b(this.l()), this.p(), this.q()));
        }
        else if (this.n()) {
            ca.a((Context)this, b2, new ap(this.c, this.b, this.d));
        }
        this.a(this.g.a());
        if (this.d && this.e) {
            this.p.b(this.g.username);
            this.getIntent().putExtra("remove_header", true);
            this.d = false;
            this.e = false;
        }
        if (this.c != null) {
            ak.a().a(this.g.userId, this.c);
        }
        this.c = null;
        this.b = null;
        this.a(this.getIntent());
    }
    
    private void w() {
        final String string = this.getResources().getString(2131296921);
        if (this.m) {
            if (!this.l.contains(string)) {
                this.l.add(string);
            }
            return;
        }
        this.l.remove(string);
    }
    
    protected void a(final long n) {
        final c g = this.G();
        if (this.b != null) {
            g.a(n, TwitterScribeLog.a(this.a, "", "header_image", "change"));
        }
        if (this.p()) {
            g.a(n, TwitterScribeLog.a(this.a, "", "bio", "change"));
        }
        if (this.c != null) {
            g.a(n, TwitterScribeLog.a(this.a, "", "avatar", "change"));
        }
        if (this.d && this.e) {
            g.a(n, TwitterScribeLog.a(this.a, "", "header_image", "remove"));
        }
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n) {
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        final c g = this.G();
        switch (n) {
            case 3: {
                if (n2 == -1) {
                    if (this.b != null) {
                        this.b.c();
                    }
                    this.setResult(0);
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "", "", "cancel"));
                    this.finish();
                    return;
                }
                break;
            }
            case 1: {
                final Resources resources = this.getResources();
                final CharSequence charSequence = this.l.get(n2);
                if (TextUtils.equals(charSequence, (CharSequence)resources.getString(2131296922))) {
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "change_header_dialog", "take_photo", "click"));
                    this.d = false;
                    this.startActivityForResult(CameraActivity.a((Context)this, 1, false), 1);
                    return;
                }
                if (TextUtils.equals(charSequence, (CharSequence)resources.getString(2131296913))) {
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "change_header_dialog", "choose_photo", "click"));
                    this.d = false;
                    t.a(this, 2);
                    return;
                }
                if (TextUtils.equals(charSequence, (CharSequence)resources.getString(2131296921))) {
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "change_header_dialog", "remove", "click"));
                    this.b = null;
                    this.d = true;
                    this.m = false;
                    this.h.a((k)null);
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == 0) {
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "change_avatar_dialog", "take_photo", "click"));
                    this.startActivityForResult(CameraActivity.a((Context)this, 1, false), 4);
                    return;
                }
                if (n2 == 1) {
                    g.a(this.U().g(), TwitterScribeLog.a(this.a, "change_avatar_dialog", "choose_photo", "click"));
                    t.a(this, 5);
                    return;
                }
                break;
            }
        }
    }
    
    protected abstract void a(final Intent p0);
    
    @Override
    public void a(final MediaFile b) {
        this.b = b;
        this.e = true;
        this.m_();
        this.s();
    }
    
    void a(final String s) {
        this.m = !TextUtils.isEmpty((CharSequence)s);
        if (this.h != null) {
            this.h.a((k)com.twitter.library.media.manager.j.a(s).d(true));
        }
    }
    
    @Override
    public void a(final String s, final Bitmap bitmap) {
        if (bitmap == null && this.h != null) {
            this.h.setDefaultDrawable((Drawable)new ColorDrawable(this.d()));
        }
    }
    
    protected abstract TwitterScribeAssociation b();
    
    @SuppressLint({ "WrongViewCast" })
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final c g = this.G();
        this.a = this.b();
        this.i = (UserImageView)this.findViewById(2131886250);
        this.j = (EditText)this.findViewById(2131886694);
        this.g = this.U().f();
        this.h = (HeaderImageView)this.findViewById(2131886695);
        this.p = new j(this.getApplicationContext());
        this.o = new ad((Context)this, this.g, true);
        if (this.h != null) {
            this.h.a(this, (Set)this.getLastCustomNonConfigurationInstance(), this.d());
            this.h.setProfileUser(this.o);
        }
        this.f = com.twitter.android.util.l.a((Context)this);
        final Resources resources = this.getResources();
        final String string = resources.getString(2131296922);
        if (this.f) {
            this.l.add(string);
        }
        this.l.add(resources.getString(2131296913));
        if (bundle != null) {
            this.c = (MediaFile)bundle.getParcelable("pending_avatar_media");
            this.e = bundle.getBoolean("initial_header");
            if (this.c != null && this.i != null) {
                this.i.a(this.c.b().toString());
            }
            this.b = (MediaFile)bundle.getParcelable("pending_header_media");
            this.n = bundle.getBoolean("has_updated_header");
            this.d = bundle.getBoolean("remove_header");
            this.m = bundle.getBoolean("remove_header_enabled");
            if (this.d && this.h != null) {
                this.h.a((k)null);
            }
            this.w();
            this.s();
            return;
        }
        g.a(this.g.userId, TwitterScribeLog.a(this.a, "", "", "impression"));
        this.p.a(this, this.g, this);
    }
    
    @Override
    public void b(final MediaFile mediaFile) {
        if (this.q != null && this.q.isShowing() && !super.isDestroyed()) {
            this.q.dismiss();
        }
        this.e(mediaFile);
    }
    
    void c(final MediaFile b) {
        this.b = b;
        if (b != null) {
            this.startActivityForResult(new Intent((Context)this, (Class)EditProfileCropActivity.class).putExtra("uri", (Parcelable)b.b()), 3);
            return;
        }
        this.u();
    }
    
    protected int d() {
        if (this.g != null && this.g.profileLinkColor != 0) {
            return this.g.profileLinkColor;
        }
        return this.getResources().getColor(2131689634);
    }
    
    void d(final MediaFile c) {
        this.c = c;
        if (c != null) {
            this.i.a(c.b().toString());
            return;
        }
        this.t();
    }
    
    @Override
    protected void g_() {
        if (this.o()) {
            this.p_();
            return;
        }
        this.setResult(0);
        super.g_();
    }
    
    void h() {
        (this.q = new ProgressDialog((Context)this)).setProgressStyle(0);
        this.q.setMessage((CharSequence)this.getString(2131297490));
        this.p.a(this, this.g, this.b, this);
        this.q.show();
    }
    
    protected abstract String i();
    
    protected abstract String j();
    
    protected abstract String k();
    
    protected TwitterPlace l() {
        return null;
    }
    
    protected String m() {
        if (this.j != null) {
            return this.j.getText().toString();
        }
        return null;
    }
    
    void m_() {
        if (this.h != null) {
            this.h.a(com.twitter.android.profiles.g.a(this.o));
        }
        this.m = (this.o.f() != null);
    }
    
    boolean n() {
        return (this.d && this.e) || this.c != null || ((!this.e || this.n) && this.b != null);
    }
    
    protected void n_() {
        if (this.f) {
            PromptDialogFragment.b(2).e(2131361797).a((b)this).a(this.getSupportFragmentManager());
            return;
        }
        this.G().a(this.U().g(), TwitterScribeLog.a(this.a, "change_avatar_dialog", "choose_photo", "click"));
        t.a(this, 5);
    }
    
    protected boolean o() {
        return this.n() || this.r();
    }
    
    protected void o_() {
        if (!this.m && !this.f) {
            this.d = false;
            t.a(this, 2);
            return;
        }
        this.w();
        PromptDialogFragment.b(1).a(this.l.toArray(new CharSequence[this.l.size()])).a((b)this).a(this.getSupportFragmentManager());
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        switch (n) {
            case 2: {
                if (n2 == -1) {
                    final com.twitter.util.concurrent.i b = MediaFile.b((Context)this, intent.getData(), MediaType.b);
                    b.a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.a).a(new at(this)));
                    this.a(b);
                    return;
                }
                break;
            }
            case 1: {
                if (n2 == -1) {
                    this.c((MediaFile)intent.getParcelableExtra("media_file"));
                    return;
                }
                break;
            }
            case 3: {
                if (n2 != -1 || intent == null) {
                    this.b = null;
                    return;
                }
                final Uri uri = (Uri)intent.getParcelableExtra("uri");
                if (uri != null) {
                    this.a(uri.toString());
                    final com.twitter.util.concurrent.i b2 = MediaFile.b((Context)this, uri, MediaType.b);
                    b2.a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.a).a(new com.twitter.android.au(this)));
                    this.a(b2);
                    this.n = true;
                    return;
                }
                break;
            }
            case 5: {
                if (n2 == -1) {
                    final com.twitter.util.concurrent.i b3 = MediaFile.b((Context)this, intent.getData(), MediaType.b);
                    b3.a(new com.twitter.util.concurrent.e().a(com.twitter.util.concurrent.h.a).a(new av(this)));
                    this.a(b3);
                    return;
                }
                break;
            }
            case 4: {
                if (n2 == -1) {
                    this.d((MediaFile)intent.getParcelableExtra("media_file"));
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.o()) {
            this.p_();
            return;
        }
        super.onBackPressed();
    }
    
    public void onClickHandler(final View view) {
        if (this.h_()) {
            final int id = view.getId();
            if (id == 2131886695 || id == 2131886252) {
                this.G().a(this.U().g(), TwitterScribeLog.a(this.a, "", "header_image", "click"));
                this.o_();
            }
            else if (id == 2131886250 || id == 2131886688) {
                this.n_();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        if (!this.isChangingConfigurations() && !this.n) {
            if (this.b != null) {
                this.b.c();
            }
            if (this.c != null) {
                this.c.c();
            }
        }
        super.onDestroy();
    }
    
    protected void onRestart() {
        super.onRestart();
        if (this.h != null) {
            this.h.e();
        }
    }
    
    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        if (this.h != null && this.isChangingConfigurations()) {
            return this.h.getSavedBitmaps();
        }
        return super.onRetainCustomNonConfigurationInstance();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pending_avatar_media", (Parcelable)this.c);
        bundle.putParcelable("pending_header_media", (Parcelable)this.b);
        bundle.putBoolean("initial_header", this.e);
        bundle.putBoolean("remove_header", this.d);
        bundle.putBoolean("remove_header_enabled", this.m);
        bundle.putBoolean("has_updated_header", this.n);
    }
    
    @Override
    protected void onStop() {
        if (this.h != null) {
            this.h.f();
        }
        super.onStop();
    }
    
    protected boolean p() {
        final String m = this.m();
        return (this.k == null && !TextUtils.isEmpty((CharSequence)m)) || (this.k != null && !this.k.equals(m));
    }
    
    protected void p_() {
        PromptDialogFragment.b(3).c(2131296908).d(2131296284).h(2131296810).j(2131296445).a(this.getSupportFragmentManager());
    }
    
    protected abstract boolean q();
    
    protected abstract boolean r();
    
    void s() {
        if (!this.e && !this.d && this.o.f() != null) {
            this.e = true;
            this.m_();
        }
        if (this.c == null) {
            this.i.a(this.g);
        }
    }
    
    void t() {
        Toast.makeText((Context)this, 2131297472, 0).show();
    }
    
    void u() {
        Toast.makeText((Context)this, 2131297477, 0).show();
    }
}
