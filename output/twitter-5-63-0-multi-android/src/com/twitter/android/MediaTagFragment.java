// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import android.widget.AbsListView$OnScrollListener;
import com.twitter.android.widget.DraggableHeaderLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.bz;
import android.os.Bundle;
import android.content.Context;
import com.twitter.util.t;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import com.twitter.library.util.bq;
import com.twitter.library.api.z;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.Editable;
import java.util.ArrayList;
import android.view.inputmethod.InputMethodManager;
import java.util.Iterator;
import android.content.res.Resources;
import java.util.Set;
import com.twitter.library.api.MediaTag;
import java.util.HashSet;
import android.text.SpannableStringBuilder;
import java.util.List;
import android.widget.ListView;
import android.widget.TextView;
import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import android.view.View;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.autocomplete.e;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;

public class MediaTagFragment extends Fragment implements TextWatcher, e
{
    private final dr a;
    private c b;
    private az c;
    private boolean d;
    private View e;
    private ListViewSuggestionEditText f;
    private TextView g;
    private TextView h;
    private View i;
    private ListView j;
    private da k;
    private cn l;
    private boolean m;
    private List n;
    private int o;
    
    public MediaTagFragment() {
        this.a = new mj();
        this.o = -1;
    }
    
    private void a(final CharSequence text, final int selection) {
        final ListViewSuggestionEditText f = this.f;
        f.removeTextChangedListener((TextWatcher)this);
        f.setText(text);
        f.setSelection(selection);
        f.addTextChangedListener((TextWatcher)this);
        this.i();
    }
    
    private void a(final List list, final String s) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final Resources resources = this.getResources();
        final HashSet<Long> set = new HashSet<Long>();
        if (list != null) {
            for (final MediaTag mediaTag : list) {
                final int length = spannableStringBuilder.length();
                final mi mi = new mi(mediaTag, resources);
                spannableStringBuilder.append((CharSequence)(mediaTag.name + " "));
                spannableStringBuilder.setSpan((Object)mi, length, spannableStringBuilder.length(), 33);
                set.add(mediaTag.userId);
            }
        }
        this.l.a(set);
        if (s != null) {
            spannableStringBuilder.append((CharSequence)s);
        }
        this.f.post((Runnable)new mg(this, spannableStringBuilder));
    }
    
    private void f() {
        ((InputMethodManager)this.getActivity().getSystemService("input_method")).restartInput((View)this.f);
    }
    
    private void g() {
        final ArrayList b = this.b();
        if (b.size() >= 6) {
            final int n = 10 - b.size();
            String text;
            if (n == 0) {
                text = this.getResources().getString(2131297261, new Object[] { 10 });
            }
            else {
                text = this.getResources().getQuantityString(2131427336, n, new Object[] { n });
            }
            this.g.setText((CharSequence)text);
            this.g.setVisibility(0);
            return;
        }
        this.g.setVisibility(8);
    }
    
    private void h() {
        final Editable text = this.f.getText();
        int n;
        if (((mi[])text.getSpans(0, text.length(), (Class)mi.class)).length == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final View e = this.e;
        int visibility = 0;
        if (n == 0) {
            visibility = 8;
        }
        e.setVisibility(visibility);
    }
    
    private void i() {
        this.f.post((Runnable)new mh(this, this.getResources().getDimensionPixelSize(2131558769), (ViewGroup$MarginLayoutParams)this.f.getLayoutParams()));
    }
    
    public void D_() {
        final TextView h = this.h;
        int visibility;
        if (this.d) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        h.setVisibility(visibility);
        final View i = this.i;
        final boolean d = this.d;
        int visibility2 = 0;
        if (!d) {
            visibility2 = 8;
        }
        i.setVisibility(visibility2);
    }
    
    public void a(final String s, final ln ln) {
        this.m = TextUtils.isEmpty((CharSequence)s.trim());
        boolean b;
        if (this.d || this.m) {
            b = true;
        }
        else {
            b = false;
        }
        final TextView h = this.h;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        h.setVisibility(visibility);
        final View i = this.i;
        int visibility2 = 0;
        if (!b) {
            visibility2 = 8;
        }
        i.setVisibility(visibility2);
        final ListView j = this.j;
        j.post((Runnable)new mf(this, j));
    }
    
    public void a(final List n) {
        this.n = n;
        if (this.k != null) {
            this.k.a(n);
        }
    }
    
    public boolean a(final String s, final long n, final Cursor cursor) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.f.getText());
        final mi[] array = (mi[])spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), (Class)mi.class);
        final int int1 = cursor.getInt(6);
        final long g = this.c.b().g();
        String s2;
        if (z.m(int1)) {
            s2 = "taggable_user";
        }
        else {
            s2 = "nontaggable_user";
        }
        this.b.a(g, "composition", "", "media_tag", s2, "click");
        if (!z.m(int1)) {
            return true;
        }
        mi mi = null;
        mi mi2;
        for (int length = array.length, i = 0; i < length; ++i, mi = mi2) {
            mi2 = array[i];
            if (mi2.a().userId != n) {
                mi2 = mi;
            }
        }
        if (mi != null) {
            bq.a((Editable)spannableStringBuilder, mi, "", false);
            this.a((CharSequence)spannableStringBuilder, spannableStringBuilder.length());
        }
        else {
            if (array.length >= 10) {
                return true;
            }
            final String trim = cursor.getString(3).trim();
            final mi mi3 = new mi(new MediaTag(n, trim, cursor.getString(2).trim()), this.getResources());
            final ds d = this.a.d((CharSequence)spannableStringBuilder, this.f.getSelectionEnd());
            if (d != null) {
                spannableStringBuilder.replace(d.a, d.b, (CharSequence)(trim + " "));
                final int n2 = 1 + (d.a + trim.length());
                spannableStringBuilder.setSpan((Object)mi3, d.a, n2, 33);
                this.a((CharSequence)spannableStringBuilder, n2);
                if (!this.m) {
                    this.f.b();
                }
                this.f();
            }
        }
        this.l.a(this.c());
        this.g();
        this.h();
        return true;
    }
    
    public void afterTextChanged(final Editable editable) {
        int n;
        if ((!TextUtils.isEmpty((CharSequence)editable) && com.twitter.util.i.a(editable.charAt(0))) || (TextUtils.isEmpty((CharSequence)editable) && bj.e)) {
            n = 1;
        }
        else {
            n = 0;
        }
        final ListViewSuggestionEditText f = this.f;
        int gravity;
        if (n != 0) {
            gravity = 5;
        }
        else {
            gravity = 3;
        }
        f.setGravity(gravity);
        final mi[] array = (mi[])editable.getSpans(0, editable.length(), (Class)mi.class);
        if (array.length > 0) {
            this.f.removeTextChangedListener((TextWatcher)this);
            final int length = array.length;
            int i = 0;
            boolean b = false;
            while (i < length) {
                final mi mi = array[i];
                final int spanStart = editable.getSpanStart((Object)mi);
                final int spanEnd = editable.getSpanEnd((Object)mi);
                if (spanStart > -1 && spanEnd >= spanStart && !TextUtils.equals((CharSequence)(mi.a().name + " "), editable.subSequence(spanStart, spanEnd))) {
                    bq.a(editable, mi, "", false);
                    b = true;
                }
                ++i;
            }
            if (b) {
                this.g();
                this.l.a(this.c());
            }
            this.f.addTextChangedListener((TextWatcher)this);
        }
        this.h();
        this.i();
        if (this.d() != null || !this.m) {
            this.f.b();
        }
    }
    
    public ArrayList b() {
        int i = 0;
        final Editable text = this.f.getText();
        final ArrayList<MediaTag> list = new ArrayList<MediaTag>();
        for (mi[] array = (mi[])text.getSpans(0, text.length(), (Class)mi.class); i < array.length; ++i) {
            list.add(array[i].a());
        }
        return list;
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public Set c() {
        int i = 0;
        final Editable text = this.f.getText();
        final HashSet<Long> set = new HashSet<Long>();
        for (mi[] array = (mi[])text.getSpans(0, text.length(), (Class)mi.class); i < array.length; ++i) {
            set.add(array[i].a().userId);
        }
        return set;
    }
    
    public String d() {
        return (String)this.a.b((CharSequence)this.f.getText(), this.f.getSelectionEnd());
    }
    
    public void e() {
        t.a((Context)this.getActivity(), (View)this.f, false);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.c = az.a((Context)activity);
        this.b = com.twitter.android.client.c.a((Context)activity);
        final Session b = this.c.b();
        final TwitterUser f = b.f();
        this.d = (f != null && f.isProtected);
        dj dj;
        if (this.d) {
            dj = null;
        }
        else {
            dj = new dj((Context)activity, b, bz.h(), "compose_media_tagging");
        }
        (this.k = new da((Context)activity, this.d, dj)).a(this.n);
        this.l = new cn((Context)activity);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968876, viewGroup, false);
        final DraggableHeaderLayout draggableHeaderLayout = (DraggableHeaderLayout)inflate;
        this.e = inflate.findViewById(2131886939);
        this.g = (TextView)inflate.findViewById(2131886941);
        final ListView listView = (ListView)inflate.findViewById(2131886594);
        final View inflate2 = layoutInflater.inflate(2130969123, (ViewGroup)listView, false);
        listView.addHeaderView(inflate2);
        this.h = (TextView)inflate2.findViewById(2131887298);
        final TextView h = this.h;
        int text;
        if (this.d) {
            text = 2131297263;
        }
        else {
            text = 2131297262;
        }
        h.setText(text);
        this.i = inflate.findViewById(2131886109);
        listView.setOnScrollListener((AbsListView$OnScrollListener)new mb(this, listView, inflate.findViewById(2131886942)));
        this.j = listView;
        final ListViewSuggestionEditText f = (ListViewSuggestionEditText)inflate.findViewById(2131886940);
        f.a(false);
        f.addTextChangedListener((TextWatcher)this);
        f.setSuggestionListener(this);
        f.setOnLongClickListener((View$OnLongClickListener)new mc(this));
        f.setOnTouchListener((View$OnTouchListener)new md(this));
        if (bj.e) {
            f.setGravity(5);
        }
        f.setListView(listView);
        f.setSuggestionProvider(this.k);
        f.setAdapter(this.l);
        f.setTokenizer(this.a);
        this.f = f;
        final MediaImageView mediaImageView = (MediaImageView)inflate.findViewById(2131886938);
        final EditableImage editableImage = (EditableImage)this.getArguments().getParcelable("editable_image");
        if (editableImage != null) {
            mediaImageView.setAspectRatio(((ImageFile)editableImage.mediaFile).size.e());
            mediaImageView.a(editableImage.b((Context)this.getActivity()));
            draggableHeaderLayout.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new me(this, draggableHeaderLayout, mediaImageView, f));
        }
        else {
            mediaImageView.setVisibility(8);
        }
        List tags;
        String s;
        if (bundle != null) {
            final List list = (List)bundle.getSerializable("tags");
            final String string = bundle.getString("partial_tag");
            tags = list;
            s = string;
        }
        else {
            tags = editableImage.tags;
            s = null;
        }
        if (tags != null || s != null) {
            this.a(tags, s);
        }
        return inflate;
    }
    
    @Override
    public void onDestroy() {
        this.f.c();
        super.onDestroy();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("tags", (Serializable)this.b());
        bundle.putString("partial_tag", this.d());
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.f.requestFocus();
        t.a((Context)this.getActivity(), (View)this.f, true);
        this.f.b();
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
