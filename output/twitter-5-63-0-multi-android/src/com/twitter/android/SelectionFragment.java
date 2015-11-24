// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.util.t;
import android.support.v4.app.FragmentActivity;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.HashSet;
import com.twitter.util.i;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.text.Editable;
import com.twitter.library.util.bq;
import android.text.SpannableStringBuilder;
import com.twitter.library.util.bj;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.AbsListView$OnScrollListener;
import java.util.Set;
import android.widget.ListView;
import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.view.View$OnLongClickListener;
import com.twitter.android.autocomplete.e;
import com.twitter.android.autocomplete.a;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;

public abstract class SelectionFragment extends Fragment implements TextWatcher, a, e
{
    private static final View$OnLongClickListener k;
    protected final dq a;
    protected c b;
    protected az c;
    protected ListViewSuggestionEditText d;
    protected ListView e;
    protected db f;
    protected cp g;
    protected Set h;
    protected Set i;
    protected AbsListView$OnScrollListener j;
    
    static {
        k = (View$OnLongClickListener)new sb();
    }
    
    protected SelectionFragment(final si a) {
        this.a = a;
    }
    
    private void a(final EditText editText, final int n) {
        editText.setGravity(n | (0x70 & editText.getGravity()));
    }
    
    private void a(final Set h) {
        this.h = h;
        this.g.notifyDataSetChanged();
    }
    
    public void D_() {
    }
    
    public int a() {
        return Integer.MAX_VALUE;
    }
    
    protected final View a(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(n, viewGroup, false);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new sc(this, inflate));
        final ListView listView = (ListView)inflate.findViewById(2131886594);
        listView.setOnScrollListener((AbsListView$OnScrollListener)new sd(this));
        this.e = listView;
        final ListViewSuggestionEditText d = (ListViewSuggestionEditText)inflate.findViewById(2131886592);
        d.addTextChangedListener((TextWatcher)this);
        d.setSuggestionListener(this);
        d.setOnLongClickListener(SelectionFragment.k);
        if (bj.e) {
            this.a(d, 5);
        }
        d.setListView(listView);
        d.setSuggestionProvider(this.f);
        d.setAdapter(this.g);
        d.setTokenizer(this.a);
        this.d = d;
        return inflate;
    }
    
    protected abstract View a(final LayoutInflater p0, final ViewGroup p1);
    
    protected void a(final long n, final String s, final Object o) {
        if (this.b(n)) {
            final String trim = s.trim();
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.d.getText());
            final sh[] array = (sh[])spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), (Class)sh.class);
            sh sh = null;
            sh sh2;
            for (int length = array.length, i = 0; i < length; ++i, sh = sh2) {
                sh2 = array[i];
                if (sh2.a().a != n) {
                    sh2 = sh;
                }
            }
            if (sh != null) {
                bq.a((Editable)spannableStringBuilder, sh, "", false);
                this.a((CharSequence)spannableStringBuilder, spannableStringBuilder.length());
            }
            else {
                if (array.length >= this.a()) {
                    return;
                }
                final sh sh3 = new sh(new SelectionFragment$SelectedItem(n, trim), this.getResources());
                final ds d = this.a.d((CharSequence)spannableStringBuilder, this.d.getSelectionEnd());
                spannableStringBuilder.replace(d.a, d.b, (CharSequence)(trim + " "));
                final int n2 = 1 + (d.a + trim.length());
                spannableStringBuilder.setSpan((Object)sh3, d.a, n2, 33);
                this.a((CharSequence)spannableStringBuilder, n2);
                ((InputMethodManager)this.getActivity().getSystemService("input_method")).restartInput((View)this.d);
            }
            this.a(this.e());
        }
    }
    
    protected void a(final CharSequence text, final int selection) {
        final ListViewSuggestionEditText d = this.d;
        d.removeTextChangedListener((TextWatcher)this);
        d.setText(text);
        d.setSelection(selection);
        d.addTextChangedListener((TextWatcher)this);
        this.g();
    }
    
    public void a(final Object o, final ln ln) {
        final ListView e = this.e;
        e.post((Runnable)new se(this, e));
    }
    
    public void afterTextChanged(final Editable editable) {
        int n;
        if ((!TextUtils.isEmpty((CharSequence)editable) && com.twitter.util.i.a(editable.charAt(0))) || (TextUtils.isEmpty((CharSequence)editable) && bj.e)) {
            n = 1;
        }
        else {
            n = 0;
        }
        final ListViewSuggestionEditText d = this.d;
        int n2;
        if (n != 0) {
            n2 = 5;
        }
        else {
            n2 = 3;
        }
        this.a(d, n2);
        final sh[] array = (sh[])editable.getSpans(0, editable.length(), (Class)sh.class);
        if (array.length > 0) {
            this.d.removeTextChangedListener((TextWatcher)this);
            final int length = array.length;
            int i = 0;
            boolean b = false;
            while (i < length) {
                final sh sh = array[i];
                final int spanStart = editable.getSpanStart((Object)sh);
                final int spanEnd = editable.getSpanEnd((Object)sh);
                if (spanStart > -1 && spanEnd >= spanStart && !TextUtils.equals((CharSequence)(sh.a().b + ' '), editable.subSequence(spanStart, spanEnd))) {
                    bq.a(editable, sh, "", false);
                    b = true;
                }
                ++i;
            }
            if (b) {
                this.a(this.e());
            }
            this.d.addTextChangedListener((TextWatcher)this);
        }
        this.g();
    }
    
    public boolean b(final long n) {
        return this.f == null || !this.i.contains(n);
    }
    
    public boolean b_(final long n) {
        return this.f != null && (this.i.contains(n) || this.h.contains(n));
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    protected boolean d() {
        return true;
    }
    
    public Set e() {
        int i = 0;
        final Editable text = this.d.getText();
        final HashSet<Long> set = new HashSet<Long>();
        for (sh[] array = (sh[])text.getSpans(0, text.length(), (Class)sh.class); i < array.length; ++i) {
            set.add(array[i].a().a);
        }
        return set;
    }
    
    protected String f() {
        return this.a.c((CharSequence)this.d.getText(), this.d.getSelectionEnd());
    }
    
    protected void g() {
        this.d.post((Runnable)new sf(this, this.d.getResources().getDimensionPixelSize(2131558769), (ViewGroup$MarginLayoutParams)this.d.getLayoutParams()));
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            final Resources resources = this.getResources();
            final HashSet<Long> set = new HashSet<Long>();
            final ArrayList parcelableArrayList = bundle.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                for (final SelectionFragment$SelectedItem selectionFragment$SelectedItem : parcelableArrayList) {
                    final int length = spannableStringBuilder.length();
                    final sh sh = new sh(selectionFragment$SelectedItem, resources);
                    spannableStringBuilder.append((CharSequence)selectionFragment$SelectedItem.b).append(' ');
                    spannableStringBuilder.setSpan((Object)sh, length, spannableStringBuilder.length(), 33);
                    set.add(selectionFragment$SelectedItem.a);
                }
            }
            this.a(set);
            final String string = bundle.getString("partial_item");
            if (string != null) {
                spannableStringBuilder.append((CharSequence)string);
            }
            this.a((CharSequence)spannableStringBuilder, spannableStringBuilder.length());
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.c = az.a((Context)activity);
        this.b = com.twitter.android.client.c.a((Context)activity);
        final Bundle arguments = this.getArguments();
        this.h = new HashSet();
        if (arguments != null) {
            this.i = new HashSet(CollectionUtils.a(arguments.getLongArray("preselected_items")));
            return;
        }
        this.i = new HashSet();
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.a(layoutInflater, viewGroup);
    }
    
    @Override
    public void onDestroy() {
        if (this.d != null) {
            this.d.c();
        }
        super.onDestroy();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        int i = 0;
        super.onSaveInstanceState(bundle);
        final Editable text = this.d.getText();
        final ArrayList<SelectionFragment$SelectedItem> list = new ArrayList<SelectionFragment$SelectedItem>();
        for (sh[] array = (sh[])text.getSpans(0, text.length(), (Class)sh.class); i < array.length; ++i) {
            list.add(array[i].a());
        }
        bundle.putParcelableArrayList("items", (ArrayList)list);
        bundle.putString("partial_item", this.f());
    }
    
    @Override
    public void onStart() {
        super.onStart();
        if (this.d()) {
            this.d.requestFocus();
            t.a((Context)this.getActivity(), (View)this.d, true);
        }
        this.d.b();
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
