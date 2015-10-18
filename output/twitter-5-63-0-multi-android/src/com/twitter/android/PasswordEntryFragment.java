// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import com.twitter.library.service.ab;
import android.text.Editable;
import com.twitter.library.api.account.x;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.client.Session;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.android.widget.ProgressDialogFragment;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;

public class PasswordEntryFragment extends AbsFragment implements TextWatcher, View$OnClickListener, View$OnTouchListener, TextView$OnEditorActionListener
{
    private int a;
    private int b;
    private int c;
    private int d;
    private TextView e;
    private EditText f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private Drawable l;
    private Drawable m;
    private ProgressDialogFragment n;
    private ne o;
    private mo p;
    
    public PasswordEntryFragment() {
        this.d = 129;
    }
    
    private int a(final EditText editText, final TextView textView, final int n) {
        this.a(editText, false);
        this.a(editText, textView, null);
        final int length = editText.length();
        int n2;
        if (length >= n) {
            n2 = 2;
        }
        else {
            n2 = 0;
            if (n > 1) {
                n2 = 0;
                if (length < n) {
                    return 3;
                }
            }
        }
        return n2;
    }
    
    private void a(final int n) {
        if (this.n == null) {
            (this.n = ProgressDialogFragment.a(n)).setRetainInstance(true);
            this.n.a(this.getFragmentManager(), null);
        }
    }
    
    private void a(final EditText editText, final TextView textView, final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            editText.setTextColor(this.b);
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
            return;
        }
        editText.setTextColor(this.c);
        textView.setVisibility(8);
    }
    
    private void a(final EditText editText, final boolean b) {
        final Drawable drawable = editText.getCompoundDrawables()[0];
        Drawable drawable2;
        if (b) {
            drawable2 = this.j;
        }
        else {
            drawable2 = this.m;
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, drawable2, (Drawable)null);
    }
    
    private void c() {
        if (this.n != null) {
            this.n.dismissAllowingStateLoss();
            this.n = null;
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        switch (n) {
            default: {}
            case 1: {
                final boolean b = !y.X() || ((pt)y).e().a();
                this.a(this.f, b);
                if (b) {
                    this.a = 1;
                    this.a(this.f, this.e, null);
                    return;
                }
                this.a = 0;
                this.a(this.f, this.e, this.getString(2131297816));
            }
            case 2: {
                this.c();
                if (y.X()) {
                    this.p.d();
                    return;
                }
                final int[] a = ae.a(((aa)y.l().b()).c);
                int n2 = 0;
                if (a != null) {
                    final int length = a.length;
                    n2 = 0;
                    if (length != 0) {
                        n2 = a[0];
                    }
                }
                int n3 = 0;
                switch (n2) {
                    default: {
                        n3 = 2131297369;
                        break;
                    }
                    case 114: {
                        sv.b(this.an);
                        n3 = 2131297369;
                        break;
                    }
                    case 62: {
                        n3 = 2131297815;
                        break;
                    }
                    case 238: {
                        n3 = 2131297370;
                        break;
                    }
                }
                this.a(this.f, this.e, this.getString(n3));
            }
        }
    }
    
    protected void a(final x x) {
        this.a(x, 2, 0);
    }
    
    protected void a(final pt pt) {
        this.a(pt, 1, 0);
    }
    
    public void afterTextChanged(final Editable editable) {
        if (editable == this.f.getText()) {
            this.a = this.a(this.f, this.e, 1);
            if (this.a != 2) {
                this.o.removeMessages(1);
                return;
            }
            this.o.a(1);
        }
    }
    
    public void b() {
        if (this.f.getText().toString().length() >= 6) {
            final x x = new x(this.getActivity().getApplicationContext(), new ab(this.aF()), sv.a(this.an), this.f.getText().toString(), null);
            x.g(1);
            this.a(2131298139);
            this.a(x);
            return;
        }
        this.a(this.f, this.e, this.getResources().getString(2131297815));
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.p = (mo)activity;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887105) {
            this.p.b();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Resources resources = this.getResources();
        this.o = new ne(this);
        this.g = resources.getDrawable(2130838976);
        this.h = resources.getDrawable(2130839278);
        this.i = resources.getDrawable(2130839279);
        this.k = resources.getDrawable(2130839280);
        this.l = resources.getDrawable(2130839281);
        this.j = this.h;
        this.m = this.k;
        this.c = resources.getColor(2131689483);
        this.b = resources.getColor(2131689575);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968957, viewGroup, false);
        this.f = (EditText)inflate.findViewById(2131887103);
        this.e = (TextView)inflate.findViewById(2131887104);
        this.f.setInputType(this.d);
        this.f.addTextChangedListener((TextWatcher)this);
        this.f.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        this.f.setTypeface(Typeface.DEFAULT);
        this.f.setOnTouchListener((View$OnTouchListener)this);
        this.f.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, this.k, (Drawable)null);
        this.f.requestFocus();
        inflate.findViewById(2131887105).setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() == 2131887103 && n == 5) {
            this.p.b();
            return true;
        }
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (view.getId() == 2131887103 && motionEvent.getAction() == 0) {
            final Drawable drawable = this.f.getCompoundDrawables()[2];
            int n;
            if (drawable != null && drawable != this.g && motionEvent.getX() > this.f.getWidth() - this.f.getCompoundPaddingRight()) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                this.f.removeTextChangedListener((TextWatcher)this);
                final int selectionStart = this.f.getSelectionStart();
                final int selectionEnd = this.f.getSelectionEnd();
                if (this.d != 145) {
                    this.d = 145;
                    this.m = this.l;
                    this.j = this.i;
                }
                else {
                    this.d = 129;
                    this.m = this.k;
                    this.j = this.h;
                }
                this.f.setInputType(this.d);
                final EditText f = this.f;
                final int a = this.a;
                boolean b = false;
                if (a == 1) {
                    b = true;
                }
                this.a(f, b);
                this.f.setSelection(selectionStart, selectionEnd);
                this.f.addTextChangedListener((TextWatcher)this);
                return true;
            }
        }
        return false;
    }
}
