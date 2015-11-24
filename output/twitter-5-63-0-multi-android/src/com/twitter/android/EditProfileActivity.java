// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.widget.Filter;
import com.twitter.library.api.TwitterUser;
import android.view.ViewTreeObserver;
import com.twitter.library.media.model.MediaFile;
import com.twitter.internal.util.Optional;
import android.text.TextWatcher;
import com.twitter.android.client.bz;
import android.widget.ListAdapter;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.Toast;
import android.content.Intent;
import com.twitter.android.client.c;
import com.twitter.library.api.geo.e;
import java.util.Collections;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.featureswitch.d;
import android.graphics.Rect;
import com.twitter.library.service.y;
import com.twitter.library.api.geo.b;
import java.util.List;
import java.util.Iterator;
import com.twitter.library.api.UrlEntity;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import com.twitter.library.api.TweetEntities;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import android.content.res.Resources;
import com.twitter.library.api.geo.TwitterPlace;
import android.widget.ScrollView;
import android.support.v4.util.LruCache;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.twitter.internal.android.widget.PopupEditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.twitter.internal.android.widget.ad;
import android.widget.Filterable;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;

public class EditProfileActivity extends BaseEditProfileActivity implements View$OnClickListener, View$OnFocusChangeListener, ViewTreeObserver$OnGlobalLayoutListener, ViewTreeObserver$OnScrollChangedListener, Filterable, ad
{
    private RelativeLayout A;
    private TextView B;
    private TextView F;
    private TextView G;
    private TextView H;
    protected EditText l;
    protected EditText m;
    protected PopupEditText n;
    protected ImageView o;
    protected boolean p;
    protected boolean q;
    private ArrayAdapter r;
    private LruCache s;
    private ScrollView t;
    private TwitterPlace u;
    private TwitterPlace v;
    private String w;
    private String x;
    private String y;
    private boolean z;
    
    public EditProfileActivity() {
        this.q = true;
    }
    
    private UserImageView a(final Resources resources) {
        final UserImageView userImageView = new UserImageView((Context)this);
        userImageView.setId(2131886250);
        userImageView.setBackgroundResource(2130837546);
        userImageView.setSize(resources.getDimensionPixelSize(2131558876));
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558879);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558877);
        final int n = this.b(resources) + resources.getDimensionPixelSize(2131558867);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131558875);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
        layoutParams.setMargins(dimensionPixelSize, n, dimensionPixelSize2, 0);
        layoutParams.addRule(9);
        userImageView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, 0);
        userImageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        final ImageView imageView = new ImageView((Context)this);
        imageView.setImageDrawable((Drawable)new ColorDrawable(resources.getColor(2131689545)));
        imageView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        userImageView.addView((View)imageView);
        (this.o = new ImageView((Context)this)).setImageDrawable(resources.getDrawable(2130839207));
        final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(resources.getDimensionPixelOffset(2131558871), resources.getDimensionPixelOffset(2131558871));
        layoutParams2.gravity = 17;
        this.o.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        userImageView.addView((View)this.o);
        return userImageView;
    }
    
    public static String a(String replaceFirst, final TweetEntities tweetEntities) {
        if (TextUtils.isEmpty((CharSequence)replaceFirst)) {
            replaceFirst = null;
        }
        else if (tweetEntities != null && !CollectionUtils.c(tweetEntities.urls)) {
            final Iterator iterator = tweetEntities.urls.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final UrlEntity urlEntity = iterator.next();
                replaceFirst = replaceFirst.replaceFirst(replaceFirst.substring(n + urlEntity.start, n + urlEntity.end), urlEntity.displayUrl);
                n += urlEntity.displayUrl.length() - (urlEntity.end - urlEntity.start);
            }
        }
        return replaceFirst;
    }
    
    private void a(final EditText editText, final TextView textView, final boolean b, final Resources resources) {
        int n = 2131689520;
        int n2;
        if (b) {
            n2 = 2131689483;
        }
        else {
            n2 = n;
        }
        editText.setTextColor(resources.getColor(n2));
        if (editText.isFocused()) {
            n = 2131689634;
        }
        textView.setTextColor(resources.getColor(n));
    }
    
    private void a(final String s, final String s2, String expandedUrl, final String s3, final TwitterPlace twitterPlace, final TweetEntities tweetEntities, final TweetEntities tweetEntities2) {
        this.y = s;
        this.l.setText((CharSequence)s);
        this.k = a(s2, tweetEntities);
        this.j.setText((CharSequence)this.k);
        if (tweetEntities2 != null && !tweetEntities2.urls.c()) {
            expandedUrl = ((UrlEntity)tweetEntities2.urls.a(0)).expandedUrl;
        }
        this.m.setText((CharSequence)expandedUrl);
        this.w = expandedUrl;
        this.x = s3;
        this.u = twitterPlace;
        this.v = twitterPlace;
        this.n.setText((CharSequence)s3);
        this.setTitle(2131296445);
    }
    
    private void a(final List list) {
        final ArrayAdapter r = this.r;
        r.setNotifyOnChange(false);
        r.clear();
        final Iterator<TwitterPlace> iterator = list.iterator();
        while (iterator.hasNext()) {
            r.add((Object)iterator.next());
        }
        if (!r.isEmpty() && !this.n.c()) {
            this.n.a();
        }
        r.notifyDataSetChanged();
        this.y();
    }
    
    private static boolean a(final EditText editText, final String s) {
        String string;
        if (editText != null) {
            string = editText.getText().toString();
        }
        else {
            string = null;
        }
        return (s == null && !TextUtils.isEmpty((CharSequence)string)) || (s != null && !s.equals(string));
    }
    
    private int b(final Resources resources) {
        return (int)(resources.getDisplayMetrics().widthPixels / 3.0f);
    }
    
    private void b(final String s) {
        final List list = (List)this.s.get(s);
        if (list != null) {
            this.a(list);
            return;
        }
        this.a(new com.twitter.library.api.geo.b((Context)this, this.U()).b(s).a("profile_location"), 1);
    }
    
    private void w() {
        if (!this.r.isEmpty()) {
            final int[] array = new int[2];
            this.t.getLocationOnScreen(array);
            final int n = array[1];
            this.n.getLocationOnScreen(array);
            this.t.scrollTo(0, this.t.getScrollY() + array[1] - n);
        }
    }
    
    private boolean x() {
        final Rect rect = new Rect();
        this.n.getWindowVisibleDisplayFrame(rect);
        return rect.height() > this.M().getHeight() + this.n.getHeight() + 1.5 * this.getResources().getDimension(2131558741);
    }
    
    private void y() {
        if (this.n.d()) {
            if (!this.x()) {
                this.n.b();
                return;
            }
            this.w();
        }
    }
    
    private void z() {
        if (com.twitter.library.featureswitch.d.f("profile_structured_location_enabled")) {
            final String string = this.n.getText().toString();
            if (!TextUtils.equals((CharSequence)this.x, (CharSequence)string)) {
                this.G().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.g.a()).b(new String[] { "me:profile:structured_location:location_picker:input" })).g("typeahead")).c(new String[] { string }));
            }
        }
    }
    
    public void I_() {
        this.y();
    }
    
    public int a(final ToolBar toolBar) {
        toolBar.a(2131887428).c(!TextUtils.isEmpty((CharSequence)this.l.getText().toString().trim()));
        return 1;
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        this.p = com.twitter.android.avatars.b.c();
        if (this.p) {
            bn.c(2130968747);
        }
        else {
            bn.c(2130968742);
        }
        bn.a(true);
        bn.b(12);
        return bn;
    }
    
    public void a(final int n) {
        final TwitterPlace v = (TwitterPlace)this.r.getItem(n);
        if (!v.equals(this.u)) {
            final String string = this.n.getText().toString();
            String s;
            if (string.isEmpty()) {
                s = "default";
            }
            else {
                s = "typeahead";
            }
            this.G().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.g.a()).b(new String[] { "me:profile:structured_location:location_picker:select" })).g(s)).c(new String[] { string })).c(v.placeId));
        }
        this.n.setText((CharSequence)v.fullName);
        this.v = v;
        final View focusSearch = this.n.focusSearch(130);
        if (focusSearch != null) {
            focusSearch.requestFocus();
        }
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        switch (n) {
            default: {}
            case 1: {
                final com.twitter.library.api.geo.b b = (com.twitter.library.api.geo.b)y;
                final com.twitter.library.api.geo.e f = b.f();
                if (f != null) {
                    final List a = f.a();
                    this.s.put(b.e(), a);
                    this.a(a);
                    return;
                }
                this.a(Collections.emptyList());
            }
        }
    }
    
    @Override
    protected void a(final long n) {
        super.a(n);
        final c g = this.G();
        if (a(this.l, this.y)) {
            g.a(n, TwitterScribeLog.a(this.a, "", "name", "change"));
        }
        if (a(this.n, this.x)) {
            g.a(n, TwitterScribeLog.a(this.a, "", "location", "change"));
        }
        if (this.q()) {
            g.a(n, TwitterScribeLog.a(this.a, "", "url", "change"));
        }
    }
    
    @Override
    protected void a(final Intent intent) {
        this.setResult(-1, intent);
        this.finish();
    }
    
    public void a(final CharSequence charSequence) {
        if (this.n.hasFocus()) {
            this.b(this.n.getText().toString());
        }
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951657, toolBar);
        return true;
    }
    
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887428) {
            if (!this.o()) {
                this.finish();
                return true;
            }
            final String string = this.m.getText().toString();
            if (!TextUtils.isEmpty((CharSequence)string)) {
                final int index = string.indexOf("://");
                String text;
                if (index != -1) {
                    text = string.substring(0, index).toLowerCase() + string.substring(index);
                }
                else {
                    text = "http://" + string;
                }
                if (!ch.h.matcher(text).matches()) {
                    Toast.makeText((Context)this, 2131297116, 0).show();
                    return true;
                }
                this.m.setText((CharSequence)text);
            }
            if (this.v == null && this.n.length() > 30) {
                Toast.makeText((Context)this, 2131297114, 0).show();
                return true;
            }
            this.h();
            return true;
        }
        else if (a == 2131886126) {
            if (this.o()) {
                this.p_();
                return true;
            }
            this.G().a(this.U().g(), TwitterScribeLog.a(this.a, null, null, "cancel"));
            this.setResult(0);
            this.finish();
            return true;
        }
        return true;
    }
    
    @Override
    protected TwitterScribeAssociation b() {
        return (TwitterScribeAssociation)new TwitterScribeAssociation().b("edit_profile");
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.t = (ScrollView)this.findViewById(2131886662);
        this.l = (EditText)this.findViewById(2131886691);
        this.m = (EditText)this.findViewById(2131886693);
        this.n = (PopupEditText)this.findViewById(2131886692);
        this.B = (TextView)this.findViewById(2131886699);
        this.F = (TextView)this.findViewById(2131886701);
        this.G = (TextView)this.findViewById(2131886700);
        this.H = (TextView)this.findViewById(2131886702);
        final Resources resources = this.getResources();
        if (bundle != null) {
            this.p = bundle.getBoolean("show_new_design");
        }
        if (this.p) {
            this.A = (RelativeLayout)this.findViewById(2131886698);
            this.i = this.a(resources);
            this.A.addView((View)this.i);
            super.b(bundle, bn);
            this.n.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.l.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.m.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.j.setOnFocusChangeListener((View$OnFocusChangeListener)this);
        }
        else {
            super.b(bundle, bn);
        }
        if (com.twitter.library.featureswitch.d.f("profile_structured_location_enabled")) {
            final gs gs = new gs((Context)this, 2130969131);
            this.r = gs;
            this.n.setAdapter((ListAdapter)gs);
            this.n.setPopupEditTextListener(this);
            this.n.a(PopupEditText.a, (Filterable)this, bz.h());
            this.n.setOnClickListener((View$OnClickListener)this);
            final ViewTreeObserver viewTreeObserver = this.n.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            viewTreeObserver.addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
            this.n.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.s = new LruCache(30);
        }
        this.n.addTextChangedListener((TextWatcher)new gp(this));
        final TwitterUser f = this.U().f();
        final Intent intent = this.getIntent();
        this.z = intent.getBooleanExtra("failure", false);
        if (this.z) {
            String s;
            String s2;
            String s3;
            String s4;
            TwitterPlace twitterPlace;
            if (intent.getBooleanExtra("update_profile", false)) {
                s = intent.getStringExtra("name");
                s2 = intent.getStringExtra("description");
                s3 = intent.getStringExtra("url");
                s4 = intent.getStringExtra("location");
                twitterPlace = (TwitterPlace)intent.getParcelableExtra("structured_location");
            }
            else {
                s = f.name;
                s2 = f.profileDescription;
                s3 = f.profileUrl;
                s4 = f.location;
                twitterPlace = (TwitterPlace)Optional.a(f.structuredLocation);
            }
            this.a(s, s2, s3, s4, twitterPlace, null, null);
            if (intent.getParcelableExtra("header_media") != null) {
                this.b = (MediaFile)intent.getParcelableExtra("header_media");
                this.m_();
            }
            if (intent.getParcelableExtra("avatar_media") != null) {
                this.c = (MediaFile)intent.getParcelableExtra("avatar_media");
                this.i.a(this.c.toString());
            }
        }
        else {
            this.a(f.name, f.profileDescription, f.profileUrl, f.location, (TwitterPlace)Optional.a(f.structuredLocation), f.descriptionEntities, f.urlEntities);
        }
        this.l.setSelection(this.l.length());
        this.l.addTextChangedListener((TextWatcher)new gq(this));
        int n;
        if (this.g != null && this.g.profileLinkColor != 0) {
            n = this.g.profileLinkColor;
        }
        else {
            n = this.getResources().getColor(2131689634);
        }
        this.h.setDefaultDrawable((Drawable)new ColorDrawable(n));
        this.i.setOnClickListener((View$OnClickListener)this);
        this.h.setOnClickListener((View$OnClickListener)this);
        if (bundle != null && !(this.q = bundle.getBoolean("show_camera"))) {
            this.o.setVisibility(8);
        }
    }
    
    @Override
    void d(final MediaFile mediaFile) {
        super.d(mediaFile);
        if (mediaFile != null && this.q) {
            this.q = false;
            this.o.setVisibility(8);
        }
    }
    
    public Filter getFilter() {
        return new gr(this);
    }
    
    @Override
    protected String i() {
        return this.l.getText().toString();
    }
    
    @Override
    protected String j() {
        return this.m.getText().toString();
    }
    
    @Override
    protected String k() {
        final String string = this.n.getText().toString();
        if (this.v != null) {
            com.twitter.util.e.b(string.equals(this.v.fullName));
        }
        return string;
    }
    
    @Override
    protected TwitterPlace l() {
        return this.v;
    }
    
    public void onClick(final View view) {
        if (view == this.n) {
            this.b(this.n.getText().toString());
            return;
        }
        super.onClickHandler(view);
    }
    
    public void onFocusChange(final View view, final boolean b) {
        if (view == this.n) {
            final String string = this.n.getText().toString();
            if (b) {
                this.b(string);
                this.G().a(this.g.a(), "me:profile:structured_location:location_picker:open");
            }
            else if (this.v == null) {
                this.z();
            }
        }
        if (this.p) {
            final Resources resources = this.getResources();
            if (view == this.n) {
                this.a(this.n, this.G, b, resources);
            }
            else {
                if (view == this.l) {
                    this.a(this.l, this.B, b, resources);
                    return;
                }
                if (view == this.m) {
                    this.a(this.m, this.F, b, resources);
                    return;
                }
                if (view == this.j) {
                    this.a(this.j, this.H, b, resources);
                }
            }
        }
    }
    
    public void onGlobalLayout() {
        this.y();
    }
    
    protected void onPause() {
        if (this.isFinishing() && this.n.hasFocus()) {
            this.z();
        }
        super.onPause();
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.u = (TwitterPlace)bundle.getParcelable("original_structured_location");
        this.v = (TwitterPlace)bundle.getParcelable("selected_structured_location");
        this.p = bundle.getBoolean("show_new_design");
        this.q = bundle.getBoolean("show_camera");
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        bundle.putParcelable("original_structured_location", (Parcelable)this.u);
        bundle.putParcelable("selected_structured_location", (Parcelable)this.v);
        bundle.putBoolean("show_new_design", this.p);
        bundle.putBoolean("show_camera", this.q);
        super.onSaveInstanceState(bundle);
    }
    
    public void onScrollChanged() {
        this.y();
    }
    
    @Override
    protected boolean q() {
        return a(this.m, this.w);
    }
    
    @Override
    protected boolean r() {
        return this.p() || this.q() || this.z || a(this.l, this.y) || a(this.n, this.x) || (this.u == null && this.v != null) || (this.u != null && !this.u.equals(this.v));
    }
}
