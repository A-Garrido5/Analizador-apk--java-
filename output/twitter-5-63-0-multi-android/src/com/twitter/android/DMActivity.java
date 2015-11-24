// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.twitter.library.widget.SlidingUpPanelLayout;
import com.twitter.android.client.x;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.client.ay;
import android.widget.Toast;
import com.twitter.library.widget.aj;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.app.Activity;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.android.client.c;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.an;
import android.view.View;
import com.twitter.util.t;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import com.twitter.library.client.Session;
import com.twitter.library.api.conversations.s;
import android.text.TextUtils;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import java.util.Set;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.dm.a;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.client.TwitterFragmentActivity;

public class DMActivity extends TwitterFragmentActivity implements ye, yf
{
    private cr a;
    private String b;
    private QuotedTweetData c;
    private String d;
    private int e;
    private DMConversationFragment f;
    private DMComposeFragment g;
    private DMInboxFragment h;
    private ya i;
    private a j;
    
    private Bundle a(final Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return extras;
    }
    
    private void a(final String s, final Set set) {
        final Intent putExtra = new Intent((Context)this, (Class)DMActivity.class).putExtra("conversation_id", s).putExtra("user_ids", CollectionUtils.c(set)).putExtra("keyboard_open", true).putExtra("android.intent.extra.TEXT", this.d).putExtra("is_from_other_app", this.j.a()).putExtra("media_uri", (Parcelable)this.j.b()).putExtra("quoted_tweet", (Serializable)this.c);
        if (this.c != null) {
            this.startActivityForResult(putExtra, 100);
            return;
        }
        this.startActivity(putExtra);
    }
    
    private void a(final String b, final long[] array) {
        if (b == null || b.equals(this.b)) {
            return;
        }
        this.b = b;
        this.c(array);
    }
    
    private boolean a(final Bundle bundle) {
        return !TextUtils.isEmpty((CharSequence)this.d) || this.c != null || this.j.a() || (bundle.getBoolean("start_compose") && !this.j());
    }
    
    private Bundle b(Bundle a) {
        final Intent intent = this.getIntent();
        if (a == null) {
            a = this.a(intent);
        }
        return a;
    }
    
    private void b(final String s) {
        this.a(s, (long[])null);
    }
    
    private void b(final long[] array) {
        this.a(com.twitter.library.api.conversations.s.a(this.U().g(), array), array);
    }
    
    private void c(final long[] array) {
        if (this.f == null) {
            final Intent intent = this.getIntent();
            this.f = new DMConversationFragment();
            intent.putExtra("conversation_id", this.b);
            intent.putExtra("user_ids", array);
            intent.putExtra("keyboard_open", true);
            this.f.a(intent);
        }
        else {
            this.f.a(this.b);
        }
        this.f.a(this);
        if (this.e != 3) {
            final FragmentTransaction beginTransaction = this.getSupportFragmentManager().beginTransaction();
            if (this.e == 2) {
                beginTransaction.replace(2131886241, this.f, "mthread");
            }
            else {
                beginTransaction.add(2131886241, this.f, "mthread");
            }
            beginTransaction.commit();
            this.e = 3;
        }
    }
    
    private void h() {
        if (this.e == 2) {
            this.i();
            super.onBackPressed();
            return;
        }
        if (this.e != 3) {
            this.R();
            return;
        }
        this.l();
        if (this.c != null) {
            this.G().a(this.U().g(), "messages:share_tweet_conversation::back_button:click");
        }
        if (this.f.E_()) {
            this.i();
            this.R();
            return;
        }
        super.onBackPressed();
    }
    
    private void i() {
        final View currentFocus = this.getCurrentFocus();
        if (currentFocus != null) {
            t.a((Context)this, currentFocus, false);
        }
    }
    
    private boolean j() {
        return this.b != null;
    }
    
    private boolean k() {
        return (this.e == 2 && this.g.b()) || (this.e == 3 && this.f.r());
    }
    
    private void l() {
        if (this.e == 3 && this.f.s()) {
            this.a(new an((Context)this, this.U(), this.b, true, false), 0);
        }
    }
    
    @Override
    public void C_() {
        this.G().a(this.U().g(), "messages:view_participants:user_list:user:click");
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        final boolean b = this.e == 2 && this.g.c();
        final jx a = toolBar.a(2131887420);
        if (a != null) {
            a.b(b);
        }
        return super.a(toolBar);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        boolean b = true;
        bn.c(2130968714);
        bn.a(false);
        bn.a(0);
        if (this.e == (b ? 1 : 0)) {
            bn.e(b);
        }
        bn.c(false);
        if (this.b(bundle).containsKey("quoted_tweet")) {
            b = false;
        }
        bn.b(b);
        return bn;
    }
    
    protected void a(final String s) {
        this.a(s, (Set)null);
    }
    
    protected void a(final Set set) {
        this.a(this.b, set);
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public void a(final boolean b, final long n, final String s, final PromotedContent promotedContent) {
        if (!b) {
            this.G().a(this.U().g(), "messages:view_participants:user_list:user:follow");
        }
    }
    
    @Override
    public void a(final long[] array) {
        this.i.a(this.getSupportLoaderManager(), array);
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (this.e == 2) {
            jv.a(2131951632, toolBar);
        }
        return super.a(jv, toolBar);
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887420) {
            final c g = this.G();
            final long g2 = this.U().g();
            if (this.c != null) {
                g.a(g2, "messages:share_tweet_user_select:::next");
            }
            else {
                g.a(g2, "messages:compose:::next");
            }
            this.a(this.g.e());
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b() {
        this.i.a(true);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        final Bundle b = this.b(bundle);
        final SlidingPanel slidingPanel = (SlidingPanel)this.findViewById(2131886629);
        (this.i = new ya(this, this.U(), null, slidingPanel)).a(this);
        this.j = new a(this.getIntent());
        slidingPanel.a(1);
        slidingPanel.setPanelSlideListener(this.i);
        slidingPanel.setClipChildren(false);
        slidingPanel.setFadeMode(1);
        slidingPanel.setCoveredFadeColor(-16777216);
        this.e = 0;
        final String string = b.getString("conversation_id");
        final long[] longArray = b.getLongArray("user_ids");
        this.c = (QuotedTweetData)b.get("quoted_tweet");
        if (this.c != null) {
            intent.removeExtra("android.intent.extra.TEXT");
            b.remove("android.intent.extra.TEXT");
        }
        this.d = b.getString("android.intent.extra.TEXT");
        if (bundle == null) {
            if (string != null) {
                if (b.getBoolean("is_from_notification")) {
                    ix.a("dm:conversation_load", ir.b(), ih.m).i();
                }
                this.b(string);
            }
            else if (longArray != null) {
                this.b(longArray);
            }
            else if (this.a(b)) {
                this.g = new DMComposeFragment();
                intent.putExtra("is_from_other_app", this.j.a());
                this.g.a(intent);
                this.getSupportFragmentManager().beginTransaction().add(2131886241, this.g, "mthread").commit();
                this.e = 2;
            }
            else {
                this.h = new DMInboxFragment();
                this.getSupportFragmentManager().beginTransaction().add(2131886241, this.h, "mthread").commit();
                this.e = 1;
                if (b.getBoolean("from_ext_url")) {
                    Toast.makeText((Context)this, 2131296827, 0).show();
                }
            }
        }
        else {
            switch (this.e = b.getInt("current_fragment", 1)) {
                default: {
                    this.h = (DMInboxFragment)this.getSupportFragmentManager().findFragmentByTag("mthread");
                    break;
                }
                case 3: {
                    this.f = (DMConversationFragment)this.getSupportFragmentManager().findFragmentByTag("mthread");
                    this.b = string;
                    this.f.a(this);
                    break;
                }
                case 2: {
                    this.g = (DMComposeFragment)this.getSupportFragmentManager().findFragmentByTag("mthread");
                    break;
                }
            }
        }
        this.a = new cr(this);
        this.T().a(this.a);
    }
    
    @Override
    protected void g_() {
        if (this.k()) {
            this.showDialog(2);
            return;
        }
        this.h();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 100 && n2 == -1) {
            this.finish();
            return;
        }
        if (this.e == 3) {
            this.f.onActivityResult(n, n2, intent);
        }
        if (this.i != null) {
            this.i.a(n, n2, intent);
        }
        super.onActivityResult(n, n2, intent);
    }
    
    @Override
    public void onBackPressed() {
        if (this.k()) {
            this.showDialog(1);
            return;
        }
        this.h();
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2: {
                return (Dialog)new AlertDialog$Builder((Context)this).setTitle(2131297293).setMessage(2131296284).setPositiveButton(2131296810, (DialogInterface$OnClickListener)new cq(this)).setNegativeButton(2131296445, (DialogInterface$OnClickListener)null).create();
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        this.l();
        this.T().b(this.a);
        super.onDestroy();
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.i != null) {
            this.i.b(bundle);
        }
    }
    
    public void onResume() {
        super.onResume();
        x.a((Context)this).a(this.U().e(), this.b);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("conversation_id", this.b);
        bundle.putInt("current_fragment", this.e);
        bundle.putSerializable("quoted_tweet", (Serializable)this.c);
        bundle.putSerializable("android.intent.extra.TEXT", (Serializable)this.d);
        if (this.i != null) {
            this.i.a(bundle);
        }
    }
}
