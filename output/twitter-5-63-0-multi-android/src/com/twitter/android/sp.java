// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.app.AlertDialog;
import android.view.KeyEvent;
import com.twitter.android.util.w;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.library.client.bj;
import android.text.method.MovementMethod;
import com.twitter.library.client.bh;
import com.twitter.library.util.a;
import com.twitter.library.client.App;
import android.text.method.LinkMovementMethod;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import android.widget.TextView;
import android.app.Dialog;
import com.twitter.android.client.bn;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Toast;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.ui.widget.TwitterEditText;
import android.widget.ScrollView;
import android.widget.EditText;
import android.widget.ListAdapter;
import java.util.Collection;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.ArrayAdapter;
import com.twitter.library.client.az;
import com.twitter.android.widget.ProgressDialogFragment;
import android.graphics.Bitmap;
import com.twitter.android.util.ao;
import com.twitter.android.util.k;
import android.widget.Button;
import com.twitter.ui.dialog.e;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.content.Intent;
import com.twitter.library.api.as;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;

class sp extends ax
{
    final /* synthetic */ SignUpActivity b;
    
    public sp(final SignUpActivity b, final Context context) {
        this.b = b;
        super(context);
    }
    
    void a(final c c, final long n, final Session session) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "signup:form:::success" });
        AppEventTrack.a(this.a, twitterScribeLog);
        if (this.b.x) {
            twitterScribeLog.g("sso_sdk");
            this.b.T().c(session);
        }
        c.a(twitterScribeLog);
        c.a(n, "signup:form:::success", false);
        c.a(n, "signup::::success");
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final as as) {
        final long g = session.g();
        final c d = this.b.G();
        this.b.x();
        if (n == 2) {
            this.b.startActivity(new Intent((Context)this.b, (Class)LoginActivity.class).putExtra("screen_name", this.b.d.getText().toString()).putExtra("password", this.b.e.getText().toString()));
            this.b.finish();
            return;
        }
        if (as != null) {
            this.b.a(session, as);
            return;
        }
        d.a(g, "signup:form:::failure");
        this.b.u = null;
        this.b.m();
    }
    
    @Override
    public void a(final Session session, final as as) {
        this.b.G().a(session.g(), "signup:form:captcha::show");
        this.b.u = as.f;
        new so(this.b).execute((Object[])new String[] { as.g });
    }
    
    @Override
    public void a(final Session session, final String s) {
        super.a(session, s);
        this.a(this.b.G(), session.g(), session);
        this.b.x();
        this.b.setResult(-1, new Intent().putExtra("AbsFragmentActivity_account_name", session.e()));
        this.b.k();
    }
}
