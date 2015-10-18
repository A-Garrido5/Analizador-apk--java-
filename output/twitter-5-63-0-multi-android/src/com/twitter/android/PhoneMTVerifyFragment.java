// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextWatcher;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.t;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.ab;
import com.twitter.library.api.aj;
import com.twitter.library.util.ar;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class PhoneMTVerifyFragment extends AbsFragment implements View$OnClickListener
{
    private EditText a;
    private Button b;
    private TextView c;
    private String d;
    private boolean e;
    private Context f;
    private c g;
    private Session h;
    private boolean i;
    private final Runnable j;
    
    public PhoneMTVerifyFragment() {
        this.d = null;
        this.e = false;
        this.i = true;
        this.j = new nn(this);
    }
    
    private void c() {
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            this.a(mp.a((Context)this.getActivity(), this.h, this.d), 1, 0);
            this.c.setText(2131297406);
        }
    }
    
    private void d() {
        String s = this.a.getText().toString();
        if (s.startsWith("/")) {
            s = s.substring("/".length());
        }
        this.a(mq.a((Context)this.getActivity(), this.h, this.d, s, this.e), 2, 0);
    }
    
    @Override
    public void a(final int n, final y y) {
        if (n == 1) {
            final aj t = ((mp)y).t();
            final int[] e = ((mp)y).e();
            if (!((aa)y.l().b()).a() || TextUtils.isEmpty((CharSequence)t.a)) {
                int n2;
                if (CollectionUtils.a(e, 285)) {
                    n2 = 2131297394;
                }
                else {
                    n2 = 2131297395;
                }
                Toast.makeText(this.f, n2, 1).show();
            }
            if (this.c != null) {
                this.c.setText(2131297405);
            }
        }
        else if (n == 2) {
            final ab p2 = y.P();
            long c;
            if (p2 != null) {
                c = p2.c;
            }
            else {
                c = 0L;
            }
            final FragmentActivity activity = this.getActivity();
            if (!((aa)y.l().b()).a()) {
                this.g.a(c, new String[] { "phone_loggedin_mt", "enter_code:verify_code::failure" });
                Toast.makeText(this.f, 2131297404, 1).show();
                return;
            }
            ar.a(this.an).a(true, true);
            this.g.a(c, new String[] { "phone_loggedin_mt", "enter_code:verify_code::success" });
            if (p2 != null) {
                this.a(new qd((Context)activity, p2, c, p2.e));
            }
            if (activity instanceof nm) {
                ((PhoneMTFlowActivity)activity).f();
            }
        }
    }
    
    void b() {
        int enabled = 1;
        if (this.i) {
            final c g = this.g;
            final long g2 = this.h.g();
            final String[] array = { "phone_loggedin_mt", null };
            array[enabled] = "enter_code::code:input";
            g.a(g2, array);
            this.i = false;
        }
        final Button b = this.b;
        if (TextUtils.isEmpty((CharSequence)this.d) || TextUtils.isEmpty((CharSequence)this.a.getText())) {
            enabled = 0;
        }
        b.setEnabled((boolean)(enabled != 0));
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887121) {
            this.g.a(this.h.g(), new String[] { "phone_loggedin_mt", "enter_code::continue:click" });
            t.a((Context)this.getActivity(), (View)this.a, false);
            this.d();
        }
        else if (view.getId() == 2131887122) {
            this.g.a(this.h.g(), new String[] { "phone_loggedin_mt", "enter_code::resend:click" });
            this.c();
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968963, viewGroup, false);
        this.f = this.getActivity().getApplicationContext();
        this.g = com.twitter.android.client.c.a((Context)this.getActivity());
        this.h = az.a((Context)this.getActivity()).b();
        this.getActivity().setTitle(2131297407);
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.d = arguments.getString("verify_phone_number");
            this.e = arguments.getBoolean("is_verizon");
        }
        (this.a = (EditText)inflate.findViewById(2131887120)).addTextChangedListener((TextWatcher)new no(this));
        (this.b = (Button)inflate.findViewById(2131887121)).setOnClickListener((View$OnClickListener)this);
        (this.c = (TextView)inflate.findViewById(2131887122)).setOnClickListener((View$OnClickListener)this);
        final TextView textView = (TextView)inflate.findViewById(2131887119);
        final Object[] array = { null };
        String substring;
        if (this.d == null) {
            substring = "";
        }
        else {
            substring = this.d.substring(-2 + this.d.length());
        }
        array[0] = substring;
        textView.setText((CharSequence)this.getString(2131297402, array));
        this.a.post(this.j);
        this.g.a(this.h.g(), new String[] { "phone_loggedin_mt", "enter_code:::impression" });
        return inflate;
    }
}
