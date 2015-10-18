// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.api.account.a;
import com.twitter.library.api.account.v;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import com.twitter.library.api.account.h;
import android.content.Intent;
import com.twitter.library.api.account.p;
import android.widget.ListAdapter;
import android.widget.Toast;
import com.twitter.android.client.c;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;
import android.view.View$OnClickListener;
import android.text.format.DateUtils;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.ImageButton;
import java.util.Date;
import com.twitter.library.api.account.LoginVerificationRequest;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;

class kw extends ArrayAdapter
{
    final /* synthetic */ LoginVerificationFragment a;
    
    public kw(final LoginVerificationFragment a, final Context context, final int n, final int n2, final ArrayList list) {
        this.a = a;
        super(context, n, n2, (List)list);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (n == 0) {
            return this.a.a(viewGroup);
        }
        final View view2 = super.getView(n, (View)null, viewGroup);
        final LoginVerificationRequest loginVerificationRequest = (LoginVerificationRequest)this.getItem(n);
        final long time = new Date().getTime();
        final ImageButton imageButton = (ImageButton)view2.findViewById(2131886081);
        final ImageButton imageButton2 = (ImageButton)view2.findViewById(2131886083);
        final TextView textView = (TextView)view2.findViewById(2131886911);
        String s;
        if (TextUtils.isEmpty((CharSequence)loginVerificationRequest.d)) {
            s = this.a.getString(2131297233);
        }
        else {
            s = loginVerificationRequest.d;
        }
        String s2;
        if (TextUtils.isEmpty((CharSequence)loginVerificationRequest.e)) {
            s2 = this.a.getString(2131297232);
        }
        else {
            s2 = loginVerificationRequest.e;
        }
        if (Math.abs(loginVerificationRequest.f - time) < 20000L || loginVerificationRequest.f > time) {
            textView.setText((CharSequence)bq.a(this.a.b, this.a.getString(2131297205, new Object[] { s, s2 }), '\"'));
        }
        else {
            textView.setText((CharSequence)bq.a(this.a.b, this.a.getString(2131297204, new Object[] { s, s2, DateUtils.getRelativeTimeSpanString(loginVerificationRequest.f, new Date().getTime(), 0L) }), '\"'));
        }
        final kx onClickListener = new kx(this, loginVerificationRequest);
        final ky onClickListener2 = new ky(this, loginVerificationRequest);
        imageButton.setOnClickListener((View$OnClickListener)onClickListener);
        imageButton2.setOnClickListener((View$OnClickListener)onClickListener2);
        return view2;
    }
}
