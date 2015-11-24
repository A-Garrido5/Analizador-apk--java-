// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.util.l;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.os.Parcelable;
import com.twitter.android.client.bz;
import com.twitter.ui.widget.ag;
import android.view.View$OnFocusChangeListener;
import com.twitter.android.autocomplete.b;
import android.view.View$OnTouchListener;
import com.twitter.android.autocomplete.PopupSuggestionEditText;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import android.widget.EditText;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.RepliedUser;
import android.view.MotionEvent;
import java.util.regex.Matcher;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import com.twitter.library.util.bn;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.twitter.library.scribe.ScribeLog;
import android.database.Cursor;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.twitter.util.t;
import android.preference.PreferenceManager;
import com.twitter.android.client.cd;
import android.text.InputFilter;
import com.twitter.library.client.az;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.provider.Tweet;
import com.twitter.android.autocomplete.SuggestionEditText;
import com.twitter.android.autocomplete.f;
import com.twitter.android.autocomplete.e;
import com.twitter.android.autocomplete.d;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import android.widget.FrameLayout;

public class TweetBox extends FrameLayout implements TextWatcher, TextView$OnEditorActionListener, d, e, f
{
    SuggestionEditText a;
    bo b;
    Tweet c;
    boolean d;
    private final Session e;
    private final c f;
    private final du g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private QuotedTweetData o;
    private boolean p;
    private TextWatcher q;
    private int r;
    
    public TweetBox(final Context context) {
        this(context, null);
    }
    
    public TweetBox(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new du();
        this.k = true;
        this.n = -1;
        this.r = 140;
        this.e = az.a(context).b();
        this.f = com.twitter.android.client.c.a(context);
    }
    
    private void l() {
        this.a.setFilters(new InputFilter[] { new bl(this) });
    }
    
    private int m() {
        final int codePointCount = this.a.getText().toString().codePointCount(0, this.a.length());
        final int n = codePointCount + this.j;
        final cd a = cd.a(this.getContext());
        int n2;
        if (this.l) {
            n2 = 1 + a.a(this.m);
        }
        else {
            n2 = 0;
        }
        final QuotedTweetData o = this.o;
        int n3 = 0;
        if (o != null) {
            n3 = 1 + a.a(true);
        }
        final int n4 = n2 + n3;
        if (codePointCount > 0 || n4 == 0) {
            return n4 + n;
        }
        return n4 - 1;
    }
    
    private void n() {
        if (this.k) {
            this.k = false;
            final Context context = this.getContext();
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            final int int1 = defaultSharedPreferences.getInt("url_hints", 0);
            if (int1 < 3) {
                t.a(context, 2131297458);
                final SharedPreferences$Editor edit = defaultSharedPreferences.edit();
                edit.putInt("url_hints", int1 + 1);
                edit.apply();
            }
        }
    }
    
    public void D_() {
    }
    
    public String a(final dt dt, final Cursor cursor) {
        return cj.a(dt.b, cursor);
    }
    
    public void a(final int n, final int n2) {
        if (this.p) {
            final int n3 = this.a.length() - " #alert".length();
            if (n3 >= 0) {
                if (n > n3) {
                    this.a.setSelection(n3, n3);
                }
                else if (n2 > n3) {
                    this.a.setSelection(n, n3);
                }
            }
        }
    }
    
    public void a(final dt dt, final ln ln) {
        String s;
        if (dt.b == 1) {
            s = "user";
        }
        else {
            s = "hashtag";
        }
        this.f.a(this.e.g(), ScribeLog.a(":composition:autocomplete_dropdown", s, "results"));
    }
    
    public void a(final String s) {
        final Editable text = this.a.getText();
        final ds d = this.g.d((CharSequence)text, this.a.getSelectionEnd());
        if (d != null) {
            text.replace(d.a, d.b, (CharSequence)(s + " "));
        }
        ((InputMethodManager)this.getContext().getSystemService("input_method")).restartInput((View)this.a);
    }
    
    public void a(final String text, final int[] array) {
        final boolean a = this.a.a(false);
        try {
            this.a.setText((CharSequence)text);
            if (array == null || !this.b(array[0], array[1])) {
                this.setCursorPosition(this.getTextLength());
            }
            this.i = false;
        }
        finally {
            this.a.a(a);
        }
    }
    
    public void a(final boolean b) {
        if (!b) {
            t.a(this.getContext(), (View)this.a, false);
            this.a.clearFocus();
            this.h = false;
            return;
        }
        if (this.hasWindowFocus()) {
            this.a.requestFocus();
            t.a(this.getContext(), (View)this.a, true);
            this.h = false;
            return;
        }
        this.h = true;
    }
    
    public boolean a(final dt dt, final long n, final Cursor cursor) {
        String s;
        if (dt.b == 1) {
            s = "user";
        }
        else {
            s = "hashtag";
        }
        this.f.a(this.e.g(), ScribeLog.a(":composition:autocomplete_dropdown", s, "select"));
        return false;
    }
    
    public void afterTextChanged(final Editable editable) {
        int n = 5;
        this.i = true;
        final Matcher matcher = ch.h.matcher(editable.toString());
        this.j = 0;
        while (matcher.find()) {
            final String lowerCase = matcher.group(3).trim().toLowerCase();
            this.j += cd.a(this.getContext()).a(bn.f(lowerCase)) - lowerCase.length();
        }
        if (this.j > 0) {
            this.n();
        }
        this.i();
        if (editable.length() > 0) {
            final SuggestionEditText a = this.a;
            if (!com.twitter.util.i.a(editable.charAt(0))) {
                n = 3;
            }
            a.setGravity(n);
        }
        else if (bj.e) {
            this.a.setGravity(n);
        }
        if (this.q != null) {
            this.q.afterTextChanged(editable);
        }
    }
    
    public void b() {
        this.a.bringPointIntoView(this.a.getSelectionStart());
    }
    
    public boolean b(final int n, final int n2) {
        if (n >= 0 && n2 <= this.a.length()) {
            this.a.setSelection(n, n2);
            return true;
        }
        return false;
    }
    
    public boolean b(final boolean b) {
        return !this.j() && this.n <= this.r && (!this.getText().trim().isEmpty() || this.o == null || b);
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (this.q != null) {
            this.q.beforeTextChanged(charSequence, n, n2, n3);
        }
    }
    
    public boolean c() {
        return this.i && this.a != null && this.a.length() > 0;
    }
    
    public boolean d() {
        final MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, (float)(-1 + this.a.getMeasuredWidth()), (float)(-1 + this.a.getMeasuredHeight()), 0);
        this.a.onTouchEvent(obtain);
        obtain.setAction(3);
        this.a.onTouchEvent(obtain);
        obtain.recycle();
        return this.a.performLongClick();
    }
    
    public void e() {
        this.l = true;
        this.i();
    }
    
    public void f() {
        this.l = false;
        this.i();
    }
    
    public boolean g() {
        return this.a.requestFocus();
    }
    
    public int getCount() {
        return this.n;
    }
    
    public int[] getSelection() {
        return new int[] { this.a.getSelectionStart(), this.a.getSelectionEnd() };
    }
    
    public String getText() {
        return this.a.getText().toString();
    }
    
    public int getTextLength() {
        return this.a.length();
    }
    
    public dt getTokenAtCursor() {
        return this.g.a((CharSequence)this.a.getText(), this.a.getSelectionEnd());
    }
    
    void h() {
        if (this.c != null && this.getTextLength() == 0 && !this.l && !this.d) {
            final List b = this.c.b(this.e.g());
            final StringBuilder sb = new StringBuilder();
            final Iterator<RepliedUser> iterator = b.iterator();
            while (iterator.hasNext()) {
                sb.append('@').append(iterator.next().screenName).append(' ');
            }
            this.a(sb.toString(), null);
            final int size = b.size();
            final int min = Math.min(size, 5);
            int i = 0;
            int n = 0;
            while (i < min) {
                n += 2 + b.get(i).screenName.length();
                ++i;
            }
            if (size > 5) {
                ScribeService.a(this.getContext(), ((TwitterScribeLog)new TwitterScribeLog(this.e.g()).b(new String[] { ":composition::mentions_highlight:impression" })).a((long)(size - 5)));
            }
            this.post((Runnable)new bm(this, this.a, n));
        }
    }
    
    public boolean hasFocus() {
        return this.a.hasFocus();
    }
    
    public void i() {
        final int m = this.m();
        if (this.n != m) {
            this.n = m;
            if (this.b != null) {
                this.b.c(this.n);
            }
        }
    }
    
    public boolean j() {
        return this.getText().trim().isEmpty() && !this.l && this.o == null;
    }
    
    public boolean k() {
        return this.b(true);
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (this.b != null && n == 101 && this.k()) {
            this.b.w();
        }
        return false;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        final Context context = this.getContext();
        final PopupSuggestionEditText a = (PopupSuggestionEditText)this.findViewById(2131886561);
        if (a == null) {
            throw new IllegalStateException("No edit text found in layout");
        }
        a.addTextChangedListener((TextWatcher)this);
        a.setOnEditorActionListener((TextView$OnEditorActionListener)this);
        a.setSuggestionListener(this);
        a.setSuggestionStringConverter(this);
        a.setSelectionChangeListener(this);
        a.setOnTouchListener((View$OnTouchListener)new bi(this));
        a.setKeyPreImeListener(new com.twitter.android.composer.bj(this));
        if (bj.e) {
            a.setGravity(5);
        }
        a.setImeActionLabel((CharSequence)this.getResources().getString(2131297464), 101);
        if (!a.hasFocus()) {
            this.d = true;
        }
        a.setOnFocusChangeListener((View$OnFocusChangeListener)new bk(this));
        a.setTypeface(ag.a(context).a);
        a.setAdapter(new cj(context));
        a.setSuggestionProvider(new cu(context, new dj(context, this.e, bz.h(), "compose")));
        a.setTokenizer(this.g);
        this.a = a;
        this.h();
        if (this.p) {
            this.l();
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState(((TweetBox$SavedState)parcelable).getSuperState());
        this.k = ((TweetBox$SavedState)parcelable).a;
    }
    
    protected Parcelable onSaveInstanceState() {
        return (Parcelable)new TweetBox$SavedState(super.onSaveInstanceState(), this.k);
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (this.q != null) {
            this.q.onTextChanged(charSequence, n, n2, n3);
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b && this.h) {
            this.a(true);
        }
    }
    
    public void setAlertHashtag(final boolean p) {
        this.p = p;
        final SuggestionEditText a = this.a;
        final int selectionStart = a.getSelectionStart();
        final int selectionEnd = a.getSelectionEnd();
        final String string = a.getText().toString();
        if (p) {
            final String string2 = string + " #alert";
            final int length = string2.length();
            final SpannableString text = new SpannableString((CharSequence)string2);
            text.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131689480)), length - " #alert".length(), length, 33);
            a.setText((CharSequence)text);
            a.setSelection(selectionStart, selectionEnd);
            this.l();
        }
        else {
            final int length2 = string.length();
            final int n = length2 - " #alert".length();
            a.setFilters(new InputFilter[0]);
            if (n >= 0 && " #alert".equals(string.subSequence(n, length2))) {
                a.setText(string.subSequence(0, n));
                if (selectionStart > n) {
                    a.setSelection(n, n);
                    return;
                }
                if (selectionEnd > n) {
                    a.setSelection(selectionStart, n);
                    return;
                }
                a.setSelection(selectionStart, selectionEnd);
            }
        }
    }
    
    public void setAttachmentsUseSecureUrls(final boolean m) {
        this.m = m;
    }
    
    public void setCursorPosition(final int selection) {
        this.a.setSelection(selection);
    }
    
    public void setHintText(final String hint) {
        this.d = (!this.a.isFocused() && hint != null);
        this.a.setHint((CharSequence)hint);
    }
    
    public void setImeActionLabel(final CharSequence charSequence) {
        this.a.setImeActionLabel(charSequence, 101);
    }
    
    public void setInputType(final int inputType) {
        this.a.setInputType(inputType);
    }
    
    public void setMaxChars(final int r) {
        this.r = r;
    }
    
    public void setQuote(final QuotedTweetData o) {
        this.o = o;
        this.i();
    }
    
    public void setRepliedTweet(final Tweet c) {
        if (!com.twitter.util.l.a(c, this.c)) {
            if ((this.c = c) == null) {
                this.c = null;
                this.setHintText(null);
                return;
            }
            this.setHintText(this.getResources().getString(2131296705, new Object[] { this.c.a() }));
            this.h();
        }
    }
    
    public void setSuggestionsEnabled(final boolean b) {
        this.a.a(b);
    }
    
    public void setTextWatcher(final TextWatcher q) {
        this.q = q;
    }
    
    public void setTweetBoxListener(final bo b) {
        this.b = b;
    }
}
