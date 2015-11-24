// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Button;
import com.twitter.errorreporter.ErrorReporter;
import android.view.View;
import com.twitter.library.client.ap;
import com.twitter.library.api.TwitterUser;
import com.twitter.ui.widget.TwitterButton;
import android.text.TextWatcher;
import com.twitter.ui.widget.PromptView;
import com.twitter.android.client.ca;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.ScrollView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View$OnClickListener;

public class EditProfileOnboardingActivity extends BaseEditProfileActivity implements View$OnClickListener
{
    private TextView l;
    private EditText m;
    private int n;
    private String o;
    private FollowFlowController p;
    private boolean q;
    private ViewTreeObserver$OnGlobalLayoutListener r;
    private ScrollView s;
    
    private static boolean a(final EditText editText, final String s) {
        String string;
        if (editText != null) {
            string = editText.getText().toString();
        }
        else {
            string = null;
        }
        return !TextUtils.equals((CharSequence)s, (CharSequence)string);
    }
    
    private void y() {
        final long g = this.U().g();
        final String f = this.p.f();
        if (!this.q) {
            this.G().a(g, f + ":edit_profile::avatar:egg");
        }
        else {
            this.G().a(g, f + ":edit_profile::avatar:add");
        }
        if (this.o()) {
            this.h();
            return;
        }
        this.p.a(this);
    }
    
    private void z() {
        this.r = (ViewTreeObserver$OnGlobalLayoutListener)new gv(this);
        if (this.s != null) {
            this.s.getViewTreeObserver().addOnGlobalLayoutListener(this.r);
        }
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        Parcelable parcelable;
        if (bundle == null) {
            parcelable = intent.getParcelableExtra("flow_controller");
        }
        else {
            parcelable = bundle.getParcelable("flow_controller");
        }
        this.p = (FollowFlowController)parcelable;
        if (this.p == null) {
            this.p = new FollowFlowController((String)null);
        }
        bn.c(2130968773);
        bn.b(10);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n) {
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        super.a(dialogInterface, n, n2);
        final long g = this.U().g();
        final String f = this.p.f();
        switch (n) {
            case 5: {
                if (n2 == -1) {
                    this.setResult(0);
                    this.p.a(this);
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == 1 || n2 == 0) {
                    this.G().a(g, f + ":edit_profile::avatar:edit");
                    this.q = true;
                }
                this.w();
            }
            case 4: {
                if (n2 == -1) {
                    this.n_();
                    this.G().a(g, TwitterScribeLog.a(this.b(), "add_avatar_dialog", "add_photo", "click"));
                    return;
                }
                if (n2 == -2) {
                    this.G().a(g, TwitterScribeLog.a(this.b(), "add_avatar_dialog", "skip", "click"));
                    this.y();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void a(final Intent intent) {
        this.p.a(this);
    }
    
    @Override
    protected TwitterScribeAssociation b() {
        return (TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().b(this.p.f())).c("edit_profile");
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        ((RelativeLayout)this.findViewById(2131886241)).addView(this.getLayoutInflater().inflate(2130968745, (ViewGroup)null));
        super.b(bundle, bn);
        this.m = (EditText)this.findViewById(2131886307);
        this.l = (TextView)this.findViewById(2131886578);
        this.n = this.l.getCurrentTextColor();
        TwitterUser twitterUser = this.U().f();
        final ap a = ca.a(this.U());
        if (a != null && twitterUser != null) {
            twitterUser = a.a(twitterUser);
        }
        if (twitterUser != null) {
            this.k = twitterUser.profileDescription;
            this.o = twitterUser.name;
        }
        if (bundle == null) {
            this.j.setText((CharSequence)this.k);
            this.m.setText((CharSequence)this.o);
        }
        else {
            this.q = bundle.getBoolean("avatar_added");
        }
        if (!this.q && twitterUser != null && (twitterUser.f() || twitterUser.profileImageUrl == null)) {
            this.i.a((String)null);
            this.i.setDefaultDrawable(this.getResources().getDrawable(2130839483));
        }
        this.l.setText((CharSequence)Integer.toString(160 - this.j.getText().length()));
        final PromptView promptView = (PromptView)this.findViewById(2131886123);
        if (this.p.e()) {
            this.setTitle(this.getString(2131298199));
            promptView.setTitle(2131298198);
        }
        else {
            this.setTitle(this.getString(2131296908));
            promptView.setTitle(2131296915);
        }
        this.M().c();
        this.j.addTextChangedListener((TextWatcher)new gt(this));
        this.m.setSelection(this.m.length());
        this.m.addTextChangedListener((TextWatcher)new gu(this));
        this.s = (ScrollView)this.findViewById(2131886662);
        this.z();
        final TwitterButton twitterButton = (TwitterButton)this.findViewById(2131886705);
        this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
        twitterButton.setOnClickListener((View$OnClickListener)this);
        twitterButton.setEnabled(false);
        twitterButton.setText(2131296914);
    }
    
    @Override
    protected String i() {
        return this.m.getText().toString();
    }
    
    @Override
    protected String j() {
        final TwitterUser f = this.U().f();
        if (f != null) {
            return f.profileUrl;
        }
        return "";
    }
    
    @Override
    protected String k() {
        final TwitterUser f = this.U().f();
        if (f != null) {
            return f.location;
        }
        return "";
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131886704) {
            this.G().a(this.U().g(), new String[] { this.p.f(), "edit_profile:::skip" });
            if (!this.o()) {
                this.p.a(this);
                return;
            }
            this.x();
        }
        else if (id == 2131886705) {
            this.G().a(this.U().g(), new String[] { this.p.f(), "edit_profile:::next" });
            this.y();
        }
    }
    
    @Override
    protected void onDestroy() {
        if (this.s != null) {
            this.s.getViewTreeObserver().removeGlobalOnLayoutListener(this.r);
        }
        else {
            ErrorReporter.a(new NullPointerException("Edit profile scroll view is null."));
        }
        super.onDestroy();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.p);
        bundle.putBoolean("avatar_added", this.q);
    }
    
    protected void onStart() {
        super.onStart();
        FollowFlowController.d(this);
    }
    
    @Override
    protected void onStop() {
        if (this.isFinishing()) {
            FollowFlowController.d(this);
        }
        else if (this.p != null) {
            this.p.c(this);
        }
        super.onStop();
    }
    
    @Override
    protected boolean q() {
        return false;
    }
    
    @Override
    protected boolean r() {
        return this.p() || a(this.m, this.o);
    }
    
    @Override
    void s() {
        if (this.c == null && this.g != null && !this.g.f() && this.g.profileImageUrl != null) {
            this.i.a(this.g);
        }
    }
    
    void w() {
        final int n = 160 - this.j.getText().length();
        final Button button = (Button)this.findViewById(2131886705);
        final TextView l = this.l;
        int textColor;
        if (n < 10) {
            textColor = this.getResources().getColor(2131689610);
        }
        else {
            textColor = this.n;
        }
        l.setTextColor(textColor);
        this.l.setText((CharSequence)Integer.toString(n));
        if (n < 0) {
            button.setEnabled(false);
            return;
        }
        button.setEnabled(this.q || this.r());
    }
    
    protected void x() {
        PromptDialogFragment.b(5).c(2131296908).d(2131296284).h(2131296810).j(2131296445).a(this.getSupportFragmentManager());
    }
}
