// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.util.w;
import android.content.res.Resources;
import android.view.View;
import android.app.Activity;
import android.text.Editable;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.os.Bundle;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;

public class NameEntryFragment extends AbsFragment implements LoaderManager$LoaderCallbacks, TextWatcher, View$OnClickListener, TextView$OnEditorActionListener
{
    private TextView a;
    private int b;
    private Drawable c;
    private mm d;
    private int e;
    private int f;
    private EditText g;
    private mo h;
    private ml i;
    
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
    
    private void a(final Bundle bundle, final EditText editText) {
        if (bundle == null || !bundle.containsKey("extra_flow_data")) {
            this.getLoaderManager().initLoader(0, null, this);
            return;
        }
        final String a = ((FlowData)bundle.getParcelable("extra_flow_data")).a();
        if (!TextUtils.isEmpty((CharSequence)a) && editText != null) {
            editText.setText((CharSequence)a);
            return;
        }
        this.getLoaderManager().initLoader(0, null, this);
    }
    
    private void a(final EditText editText) {
        if (editText != null) {
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
        }
    }
    
    private void a(final EditText editText, final TextView textView, final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            editText.setTextColor(this.e);
            textView.setText((CharSequence)text);
            textView.setVisibility(0);
            return;
        }
        editText.setTextColor(this.f);
        textView.setVisibility(8);
    }
    
    private void a(final EditText editText, final boolean b) {
        final Drawable drawable = editText.getCompoundDrawables()[0];
        Drawable c;
        if (b) {
            c = this.c;
        }
        else {
            c = null;
        }
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, c, (Drawable)null);
    }
    
    private boolean c() {
        return this.b == 1;
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (TextUtils.isEmpty((CharSequence)this.g.getText()) && cursor != null && cursor.moveToFirst()) {
            final String string = cursor.getString(cursor.getColumnIndex("display_name"));
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.g.setText((CharSequence)string);
                this.b = 2;
                this.d.a(1);
                this.a(this.g);
            }
        }
    }
    
    public void afterTextChanged(final Editable editable) {
        int n = 1;
        int a;
        if (editable == this.g.getText()) {
            a = this.a(this.g, this.a, n);
            this.b = a;
        }
        else {
            n = 0;
            a = 0;
        }
        if (a == 2) {
            this.d.a(n);
        }
        else {
            this.d.removeMessages(n);
        }
        this.h.a(this.c());
    }
    
    public void b() {
        this.i.b(this.g.getText().toString());
        this.h.d();
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.h = (mo)activity;
        this.i = (ml)activity;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886970) {
            this.h.b();
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Resources resources = this.getResources();
        this.d = new mm(this);
        this.c = resources.getDrawable(2130838976);
        this.f = resources.getColor(2131689483);
        this.e = resources.getColor(2131689575);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return w.a(this.an).c();
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968905, viewGroup, false);
        this.g = (EditText)inflate.findViewById(2131886968);
        this.a = (TextView)inflate.findViewById(2131886969);
        this.g.addTextChangedListener((TextWatcher)this);
        this.g.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        if (bundle == null) {
            this.a(this.getArguments(), this.g);
        }
        this.a(this.g);
        inflate.findViewById(2131886970).setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView.getId() == 2131886968 && n == 5 && this.c()) {
            this.h.b();
            return true;
        }
        return false;
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
