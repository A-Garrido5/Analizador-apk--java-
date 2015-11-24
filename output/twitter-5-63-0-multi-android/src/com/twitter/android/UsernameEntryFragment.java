// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import com.twitter.library.service.aa;
import android.content.Context;
import com.twitter.library.util.text.d;
import com.twitter.library.service.y;
import android.text.TextUtils;
import android.text.Editable;
import android.graphics.drawable.Drawable;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;

public class UsernameEntryFragment extends AbsFragment implements TextWatcher, View$OnClickListener, TextView$OnEditorActionListener, ad
{
    private PopupEditText a;
    private TypefacesTextView b;
    private TwitterButton c;
    private yl d;
    private Drawable e;
    private int f;
    private int g;
    private mo h;
    private int i;
    
    private void a(final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            this.a.setTextColor(this.g);
            this.b.setText((CharSequence)text);
            this.b.setVisibility(0);
            return;
        }
        this.a.setTextColor(this.f);
        this.b.setVisibility(8);
    }
    
    private int b() {
        this.a(false);
        this.a((String)null);
        final int length = this.a.length();
        int n;
        if (length >= 6) {
            n = 2;
        }
        else {
            n = 0;
            if (length < 6) {
                return 3;
            }
        }
        return n;
    }
    
    private static int b(final Editable editable) {
        if (d.d.matcher((CharSequence)editable).matches()) {
            return 2131297823;
        }
        return 2131297822;
    }
    
    private void b(final int n) {
        this.a(this.getResources().getString(n));
    }
    
    public void I_() {
    }
    
    public void a(final int n) {
    }
    
    public void a(final int n, final int n2) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            default: {}
            case 1: {
                if (aa.a()) {
                    this.a(true);
                    this.i = 1;
                    this.a((String)null);
                    return;
                }
                this.a(false);
                this.i = 0;
                this.a(aa.d());
            }
        }
    }
    
    public void a(final CharSequence charSequence) {
    }
    
    void a(final boolean b) {
        final Drawable drawable = this.a.getCompoundDrawables()[0];
        final PopupEditText a = this.a;
        Drawable e;
        if (b) {
            e = this.e;
        }
        else {
            e = null;
        }
        a.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, e, (Drawable)null);
    }
    
    public void afterTextChanged(final Editable editable) {
        this.i = this.b();
        if (this.i == 2) {
            this.d.a(3);
            return;
        }
        this.d.removeMessages(3);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.h = (mo)activity;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887337) {
            this.h.b();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Resources resources = this.getResources();
        this.f = resources.getColor(2131689483);
        this.g = resources.getColor(2131689575);
        this.e = resources.getDrawable(2130838976);
        this.d = new yl(this);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130969188, viewGroup, false);
        this.a = (PopupEditText)inflate.findViewById(2131886308);
        this.b = (TypefacesTextView)inflate.findViewById(2131887336);
        this.c = (TwitterButton)inflate.findViewById(2131887337);
        this.a.setPopupEditTextListener(this);
        this.a.addTextChangedListener((TextWatcher)this);
        this.a.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        this.c.setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() == 2131886308 && n == 5) {
            this.h.b();
            return true;
        }
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
