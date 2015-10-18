// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnLongClickListener;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.aj;
import com.twitter.library.util.t;
import com.twitter.library.view.e;
import com.twitter.library.provider.j;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.api.UserSettings;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import com.twitter.android.client.bh;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.library.featureswitch.d;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.util.bl;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.view.u;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.annotation.SuppressLint;
import com.twitter.library.media.util.l;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.util.bi;
import android.text.TextUtils;
import com.twitter.library.util.bq;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import com.twitter.library.api.CardUser;
import com.twitter.library.experiments.b;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.android.client.c;
import com.twitter.ui.widget.ag;
import com.twitter.android.ta;
import com.twitter.library.view.k;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.ActivitySummary;
import com.twitter.library.view.BadgeView;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.TwitterUser;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.twitter.library.widget.ActionButton;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.view.QuoteView;
import com.twitter.library.api.Translation;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.View;
import android.view.ViewGroup;
import java.text.SimpleDateFormat;
import com.twitter.library.media.widget.s;
import com.twitter.library.media.util.r;
import android.widget.LinearLayout;

public class TweetDetailView extends LinearLayout implements r, s, wt
{
    private static final SimpleDateFormat k;
    private ViewGroup A;
    private ViewGroup B;
    private View C;
    private CharSequence D;
    private CharSequence E;
    private View F;
    private TypefacesTextView G;
    private TypefacesTextView H;
    private Translation I;
    private QuoteView J;
    private fz K;
    private TweetClassicCard L;
    private ActionButton M;
    private int N;
    private ViewGroup O;
    private RelativeLayout P;
    private TextView Q;
    private TwitterUser R;
    private ws S;
    public UserImageView a;
    public BadgeView b;
    public EngagementActionBar c;
    public TextView d;
    public View e;
    ActivitySummary f;
    ft g;
    Tweet h;
    k i;
    ta j;
    private final ag l;
    private final c m;
    private final com.twitter.library.media.util.s n;
    private final boolean o;
    private TextView p;
    private RelativeLayout q;
    private TextView r;
    private SocialBylineView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private ImageView w;
    private View x;
    private ViewGroup y;
    private ViewGroup z;
    
    static {
        k = new SimpleDateFormat();
    }
    
    public TweetDetailView(final Context context) {
        this(context, null);
    }
    
    public TweetDetailView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TweetDetailView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = new com.twitter.library.media.util.s();
        TweetDetailView.k.applyPattern(this.getResources().getString(2131298164));
        this.l = ag.a(context);
        this.m = com.twitter.android.client.c.a(context);
        this.o = com.twitter.library.experiments.b.a();
    }
    
    private ViewGroup a(final int n) {
        final TweetClassicCard l = this.L;
        return this.a(n, l.siteUser, l.authorUser, l.title, l.description);
    }
    
    private ViewGroup a(final int n, final CardUser cardUser, final CardUser cardUser2, final String text, final String text2) {
        final Context context = this.getContext();
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(n, (ViewGroup)this, false);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
        layoutParams.addRule(3, 2131886826);
        viewGroup.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        viewGroup.setId(2131886156);
        final TextView textView = (TextView)viewGroup.findViewById(2131886364);
        if (textView != null) {
            if (cardUser != null) {
                textView.setText((CharSequence)bq.a(new TypefacesSpan[] { new TypefacesSpan(context, 1) }, this.getResources().getString(2131297981, new Object[] { cardUser.fullName, cardUser.screenName }), '\"'));
                textView.setVisibility(0);
            }
            else {
                textView.setVisibility(8);
            }
        }
        final View viewById = viewGroup.findViewById(2131886366);
        if (viewById != null) {
            if (cardUser2 != null) {
                ((TextView)viewById.findViewById(2131887280)).setText((CharSequence)cardUser2.fullName);
                if (cardUser2.screenName != null) {
                    ((TextView)viewById.findViewById(2131887281)).setText((CharSequence)('@' + cardUser2.screenName));
                }
                viewById.setVisibility(0);
            }
            else {
                viewById.setVisibility(8);
            }
        }
        this.e = viewById;
        final TextView textView2 = (TextView)viewGroup.findViewById(2131886291);
        if (TextUtils.isEmpty((CharSequence)text)) {
            textView2.setVisibility(8);
        }
        else {
            textView2.setText((CharSequence)text);
            textView2.setVisibility(0);
        }
        final TextView textView3 = (TextView)viewGroup.findViewById(2131886365);
        if (TextUtils.isEmpty((CharSequence)text2)) {
            textView3.setVisibility(8);
            return viewGroup;
        }
        textView3.setText((CharSequence)text2);
        textView3.setVisibility(0);
        return viewGroup;
    }
    
    private void a(final int n, final String s) {
        this.a(n, s, null, 0, 0, 0, 0L);
    }
    
    private void a(final int n, final String s, final String s2, final int n2, final int n3, final int n4, final long n5) {
        if (n != 14 && n != 15 && n != 17 && n != 19) {
            final Resources resources = this.getResources();
            this.s.setLabel(bi.a(resources, n, s, s2, n2, n3, n4, n5));
            final String b = bi.b(resources, n, s, s2, n2, n3, n4, n5);
            if (b != null) {
                this.s.setContentDescription((CharSequence)b);
            }
            if (this.j != null) {
                this.s.setOnClickListener((View$OnClickListener)this.j);
            }
            int icon = 0;
            switch (n) {
                default: {
                    return;
                }
                case 1:
                case 2:
                case 3:
                case 4:
                case 25:
                case 26:
                case 29:
                case 35: {
                    icon = 2130838677;
                    break;
                }
                case 5:
                case 6:
                case 13:
                case 15:
                case 18:
                case 19: {
                    icon = 2130838682;
                    break;
                }
                case 7:
                case 8:
                case 11:
                case 12: {
                    icon = 2130838677;
                    break;
                }
                case 9:
                case 10:
                case 14:
                case 16:
                case 17:
                case 33:
                case 36: {
                    icon = 2130838675;
                    break;
                }
                case 20:
                case 22: {
                    icon = 2130838683;
                    break;
                }
                case 30:
                case 32:
                case 37: {
                    icon = 2130839286;
                    break;
                }
                case 28: {
                    icon = 2130839020;
                    break;
                }
            }
            this.s.setIcon(icon);
            this.s.setVisibility(0);
        }
    }
    
    private void a(final Context context) {
        (this.x = LayoutInflater.from(context).inflate(2130968629, (ViewGroup)this, false)).setId(2131886156);
        this.a(this.x);
    }
    
    private void a(final Context context, final View$OnClickListener view$OnClickListener, final ViewGroup viewGroup) {
        final RelativeLayout x = new RelativeLayout(context);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
        layoutParams.addRule(3, 2131886826);
        ((ViewGroup)x).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        ((ViewGroup)x).setId(2131886156);
        viewGroup.findViewById(2131886927).setOnClickListener(view$OnClickListener);
        viewGroup.findViewById(2131886929).setOnClickListener(view$OnClickListener);
        ((ViewGroup)x).addView((View)viewGroup);
        this.a(this.x = (View)x);
    }
    
    private void a(final View view) {
        this.y.removeAllViews();
        this.y.addView(view);
        this.y.setVisibility(0);
    }
    
    private void a(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams, final View view2) {
        this.addView(view, 1 + this.indexOfChild(view2), viewGroup$LayoutParams);
    }
    
    private void a(final PromotedContent promotedContent) {
        if (promotedContent != null) {
            final String socialContext = promotedContent.socialContext;
            if (socialContext == null) {
                this.s.setVisibility(8);
                return;
            }
            this.a(3, socialContext);
        }
    }
    
    @SuppressLint({ "WrongViewCast" })
    private void a(final TweetClassicCard tweetClassicCard) {
        if (tweetClassicCard != null) {
            final fq fq = new fq(this, tweetClassicCard);
            switch (tweetClassicCard.type) {
                default: {
                    return;
                }
                case 1: {
                    if (tweetClassicCard.imageUrl != null && this.x == null) {
                        final ViewGroup a = this.a(2130968630);
                        final MediaImageView tag = (MediaImageView)a.findViewById(2131886363);
                        tag.setAspectRatio(tweetClassicCard.imageSize.e());
                        tag.setOnClickListener((View$OnClickListener)fq);
                        a.setTag((Object)tag);
                        this.a((View)a);
                        this.x = (View)a;
                        break;
                    }
                    break;
                }
                case 2: {
                    if (this.x == null) {
                        final ViewGroup a2 = this.a(2130968977);
                        final MediaImageView tag2 = (MediaImageView)a2.findViewById(2131886363);
                        tag2.setAspectRatio(tweetClassicCard.imageSize.e());
                        tag2.setOnClickListener((View$OnClickListener)fq);
                        a2.setTag((Object)tag2);
                        this.a((View)a2);
                        this.x = (View)a2;
                        break;
                    }
                    break;
                }
            }
            if (this.x != null && this.x.getTag() != null) {
                final MediaImageView mediaImageView = (MediaImageView)this.x.getTag();
                mediaImageView.a(com.twitter.library.media.util.l.a(tweetClassicCard));
                this.n.a(mediaImageView, true);
            }
            if (tweetClassicCard.siteUser != null) {
                final UserImageView userImageView = (UserImageView)this.x.findViewById(2131887279);
                userImageView.a(tweetClassicCard.siteUser.profileImageUrl);
                this.n.a(userImageView, true);
            }
        }
    }
    
    private void a(final String s, final String s2) {
        final Resources resources = this.getResources();
        final String a = com.twitter.library.util.text.c.a(s, s2);
        final String string = resources.getString(2131297950, new Object[] { a });
        final int index = string.indexOf("$b");
        final ImageSpan imageSpan = new ImageSpan(this.getContext(), 2130838726);
        final SpannableString e = new SpannableString((CharSequence)string);
        e.setSpan((Object)imageSpan, index, index + 2, 33);
        e.setSpan((Object)new fp(this), index, index + 2, 33);
        this.E = (CharSequence)e;
        this.D = resources.getString(2131297952, new Object[] { a });
    }
    
    private void b(final Tweet tweet) {
        final TwitterPlace w = tweet.W;
        if (w == null) {
            return;
        }
        final TwitterPlace$PlaceInfo placeInfo = w.placeInfo;
        String s;
        if (TextUtils.isEmpty((CharSequence)w.fullName)) {
            s = placeInfo.name;
        }
        else {
            s = w.fullName;
        }
        if (!tweet.ae || TextUtils.isEmpty((CharSequence)s)) {
            this.u.setText((CharSequence)null);
            this.u.setVisibility(8);
            return;
        }
        final String string = this.getResources().getString(2131297976, new Object[] { s });
        if (!this.m()) {
            this.u.setText((CharSequence)string);
            this.u.setVisibility(0);
            return;
        }
        final int index = string.indexOf(s);
        final SpannableString text = new SpannableString((CharSequence)string);
        long userId;
        if (this.R != null) {
            userId = this.R.userId;
        }
        else {
            userId = 0L;
        }
        text.setSpan((Object)new fy(this.getContext(), tweet, userId), index, text.length(), 17);
        this.u.setText((CharSequence)text);
        com.twitter.library.view.u.a(this.u);
        this.u.setVisibility(0);
    }
    
    private void i() {
        if (this.h != null && this.R != null && this.h.C == this.R.userId && bl.a(this.R)) {
            this.z.setVisibility(0);
            return;
        }
        this.z.setVisibility(8);
    }
    
    private void j() {
        final Tweet h = this.h;
        if (h.P()) {
            final Resources resources = this.getResources();
            this.v.setText(com.twitter.library.media.util.ag.a(this.getContext(), com.twitter.library.media.util.ag.a((Iterable)com.twitter.library.media.util.q.a(h, Size.a)), 2130839198), TextView$BufferType.SPANNABLE);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.v.getLayoutParams();
            int dimensionPixelOffset;
            if (this.d.getVisibility() == 0) {
                dimensionPixelOffset = resources.getDimensionPixelOffset(2131558966);
            }
            else {
                dimensionPixelOffset = 0;
            }
            linearLayout$LayoutParams.setMargins(0, dimensionPixelOffset, 0, resources.getDimensionPixelOffset(2131558965));
            this.v.requestLayout();
            this.v.setVisibility(0);
            return;
        }
        this.v.setVisibility(8);
    }
    
    private void k() {
        if (this.O.getParent() == null) {
            this.a((View)this.O, (ViewGroup$LayoutParams)this.generateDefaultLayoutParams(), (View)this.c);
        }
    }
    
    private void l() {
        if (this.K == null) {
            this.K = new fz(LayoutInflater.from(this.getContext()).inflate(2130969169, (ViewGroup)this, false), (View$OnClickListener)new fs(this));
        }
    }
    
    private boolean m() {
        return com.twitter.library.featureswitch.d.f("poi_place_pivot_tweet_detail");
    }
    
    public void a(final int n, final String s, final boolean b) {
        if (this.b != null) {
            this.b.a(n, s);
        }
    }
    
    public void a(final Bundle bundle) {
        if (this.I != null) {
            bundle.putParcelable("translated_tweet", (Parcelable)this.I);
            bundle.putBoolean("show_translation", this.H.getVisibility() == 0);
        }
    }
    
    public void a(final View$OnClickListener view$OnClickListener) {
        final Context context = this.getContext();
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2130968873, (ViewGroup)this, false);
        final String f = bh.a(context).f();
        if (!TextUtils.isEmpty((CharSequence)f)) {
            final TextView textView = (TextView)viewGroup.findViewById(2131886926);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText((CharSequence)Html.fromHtml(f));
        }
        this.a(context, view$OnClickListener, viewGroup);
    }
    
    public void a(final View$OnClickListener onClickListener, final boolean checked) {
        final ActionButton m = this.M;
        m.setBackgroundResource(2130837601);
        m.a(2130837599);
        m.setChecked(checked);
        m.setOnClickListener(onClickListener);
    }
    
    public void a(final View$OnClickListener view$OnClickListener, final boolean b, final boolean b2) {
        final Context context = this.getContext();
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2130968986, (ViewGroup)this, false);
        this.a(context, view$OnClickListener, viewGroup);
        final TextView textView = (TextView)viewGroup.findViewById(2131886929);
        if (b) {
            if (!b2) {
                this.h();
                return;
            }
            textView.setText(2131297452);
        }
    }
    
    public void a(final ActivitySummary activitySummary) {
        if (this.K != null) {
            this.K.a(this.getResources(), activitySummary, this.N);
            final View a = this.K.a;
            if (a.getParent() == null) {
                this.A.addView(a, 0, (ViewGroup$LayoutParams)this.generateDefaultLayoutParams());
                this.A.setVisibility(0);
            }
        }
        if (this.c.getParent() == null) {
            this.a((View)this.c, (ViewGroup$LayoutParams)this.generateDefaultLayoutParams(), this.findViewById(2131887324));
        }
        this.k();
    }
    
    public void a(final ActivitySummary f, final ft g) {
        this.f = f;
        this.g = g;
        this.l();
        this.a(f);
    }
    
    public void a(final TwitterUser r, final UserSettings userSettings) {
        this.R = r;
        this.J.setDisplaySensitiveMedia(userSettings != null && userSettings.k);
        this.i();
    }
    
    public void a(final TweetMediaView tweetMediaView, final MediaEntity mediaEntity) {
        this.i.a(mediaEntity);
    }
    
    public void a(final TweetMediaView tweetMediaView, final TweetClassicCard tweetClassicCard) {
        this.i.a(tweetClassicCard);
    }
    
    public void a(final TweetMediaView tweetMediaView, final EditableMedia editableMedia) {
    }
    
    public void a(final Tweet tweet) {
        final Context context = this.getContext();
        final TwitterStatusCard l = tweet.l;
        if (l != null && l.cardInstanceData != null) {
            this.a(context);
            return;
        }
        this.a(this.L = tweet.S());
        this.c();
    }
    
    public void a(final Tweet h, final k i, final String label, final int icon, final int n, final int n2, final String s, final ta j, final boolean b) {
        this.h = h;
        this.i = i;
        this.j = j;
        final Resources resources = this.getResources();
        final com.twitter.library.provider.i a = new j(h).b(true).c(h.X()).d(h.O()).a();
        CharSequence charSequence = null;
        if (a.a.trim().isEmpty()) {
            this.d.setVisibility(8);
        }
        else {
            charSequence = com.twitter.library.view.l.a(a.a, a.b, i, resources.getColor(2131689621), resources.getColor(2131689601));
            if (com.twitter.library.view.e.a() && this.h.j()) {
                charSequence = com.twitter.library.view.e.a(this.getContext(), this.h, charSequence, true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.setVisibility(0);
            this.d.setText(com.twitter.library.util.t.a(this.getContext()).a((View)this.d, charSequence, this.d.getPaint().getFontMetrics()));
        }
        else {
            this.d.setVisibility(8);
        }
        this.r.setText((CharSequence)('@' + h.F));
        this.M.setUsername(h.F);
        this.p.setText((CharSequence)h.M);
        final TextView d = this.d;
        int gravity;
        if (aj.a && h.k()) {
            gravity = 5;
        }
        else {
            gravity = 3;
        }
        d.setGravity(gravity);
        this.S.a(h, resources);
        final boolean h2 = h.h;
        if (h.p()) {
            if (h.g && !h2) {
                this.a(13, h.b());
            }
        }
        else if (h.U && h.m != 23) {
            this.a(22, null);
        }
        else if (h.am && h.m != 23) {
            this.a(20, null);
        }
        else if ((h.o() || h.m()) && !h2) {
            this.a(h.j);
        }
        else if (h.g && !h2) {
            this.a(13, h.b());
        }
        else if (h.m != -1) {
            this.a(h.m, h.n, h.ak, h.ah, h.aj, h.ai, h.A);
        }
        else if (n != -1) {
            this.a(n, s, null, 0, 0, n2, 0L);
        }
        else if (!TextUtils.isEmpty((CharSequence)label) && !b && icon != 0) {
            this.s.setLabel(label);
            this.s.setIcon(icon);
            this.s.setVisibility(0);
        }
        else {
            this.b.setVisibility(8);
            this.s.setVisibility(8);
        }
        this.a.a(h.B);
        if (h.V) {
            this.w.setImageResource(2130839392);
            this.w.setVisibility(0);
        }
        else if (h.P) {
            this.w.setImageResource(2130839080);
            this.w.setVisibility(0);
        }
        else {
            this.w.setVisibility(8);
        }
        final String format = TweetDetailView.k.format(h.A);
        this.b(h);
        this.t.setText((CharSequence)format);
        this.c();
        if (this.I == null) {
            if (com.twitter.library.util.text.c.a(this.getContext(), this.h)) {
                this.a(h.ac, i.b((Locale)com.twitter.util.k.a(resources.getConfiguration().locale, Locale.getDefault())));
                this.G.setText(this.D);
                this.F.setVisibility(0);
            }
        }
        else if (!this.I.b.equals(this.I.c)) {
            this.a(this.I);
            this.F.setVisibility(0);
        }
        else {
            this.F.setVisibility(8);
        }
        this.setContentDescription((CharSequence)resources.getString(2131297937, new Object[] { h.M + " @" + h.F, (CharSequence)com.twitter.util.k.a(this.d.getText(), ""), format, (CharSequence)com.twitter.util.k.a(this.s.getContentDescription(), "") }));
        this.Q.setVisibility(0);
        this.P.setVisibility(0);
        this.j();
        if (b.b(h)) {
            this.y.setPadding(0, 0, 0, 0);
            this.detachViewFromParent((View)this.y);
            this.a((View)this.y, this.y.getLayoutParams(), this.findViewById(2131887311));
        }
        if (h.L()) {
            ((LinearLayout$LayoutParams)this.y.getLayoutParams()).bottomMargin = resources.getDimensionPixelSize(2131558964);
            this.y.requestLayout();
        }
        if (h.O()) {
            this.J.setQuoteData(this.h.I);
            this.J.setVisibility(0);
        }
        else {
            this.J.setVisibility(8);
        }
        this.i();
    }
    
    public boolean a() {
        return this.I != null;
    }
    
    public boolean a(final Translation i) {
        if (i == null || i.b.equals(i.c)) {
            this.F.setVisibility(8);
            return false;
        }
        if (!i.b.equals(this.h.ac)) {
            this.a(i.b, i.c);
        }
        final Resources resources = this.getResources();
        this.H.setText(com.twitter.library.util.t.a(this.getContext()).a((View)this.H, com.twitter.library.view.l.a(i.d, i.e, this.i, resources.getColor(2131689621), resources.getColor(2131689601)), this.H.getPaint().getFontMetrics()));
        this.I = i;
        return true;
    }
    
    public void b() {
        if (this.H.getVisibility() == 0) {
            this.G.setText(this.D);
            this.H.setVisibility(8);
            return;
        }
        this.G.setText(this.E);
        this.H.setVisibility(0);
    }
    
    public void b(final Bundle bundle) {
        final Translation i = (Translation)bundle.getParcelable("translated_tweet");
        final boolean boolean1 = bundle.getBoolean("show_translation", false);
        if (i != null) {
            this.a(i.b, i.c);
            this.I = i;
            final TypefacesTextView h = this.H;
            int visibility;
            if (boolean1) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            h.setVisibility(visibility);
            final TypefacesTextView g = this.G;
            CharSequence text;
            if (boolean1) {
                text = this.E;
            }
            else {
                text = this.D;
            }
            g.setText(text);
        }
    }
    
    public void c() {
        this.a((ActivitySummary)null);
    }
    
    public void d() {
        (this.x = this.C).setId(2131886154);
        this.x.requestLayout();
        this.x.invalidate();
        this.a(this.x);
    }
    
    public void d(final boolean b) {
        if (this.b != null) {
            final BadgeView b2 = this.b;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            b2.setVisibility(visibility);
        }
    }
    
    public void e() {
        this.n.e();
    }
    
    public void f() {
        this.n.f();
    }
    
    public void g() {
        this.y.setVisibility(8);
        this.y.removeView(this.x);
        this.x = null;
        this.c();
    }
    
    public ActionButton getActionButton() {
        return this.M;
    }
    
    public RelativeLayout getNamePanel() {
        return this.q;
    }
    
    public void h() {
        final TextView textView = (TextView)this.x.findViewById(2131886929);
        ((ImageView)this.x.findViewById(2131886928)).setVisibility(8);
        textView.setVisibility(8);
    }
    
    @SuppressLint({ "WrongViewCast" })
    protected void onFinishInflate() {
        final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131887311);
        this.w = (ImageView)relativeLayout.findViewById(2131886198);
        this.r = (TextView)relativeLayout.findViewById(2131886858);
        this.p = (TextView)relativeLayout.findViewById(2131886307);
        this.q = (RelativeLayout)relativeLayout.findViewById(2131887315);
        if (this.o) {
            this.p.setTextSize(0, (float)this.getResources().getDimensionPixelSize(2131558416));
            this.r.setTextSize(0, (float)this.getResources().getDimensionPixelSize(2131558418));
        }
        this.a = (UserImageView)relativeLayout.findViewById(2131886644);
        this.n.a(this.a);
        (this.d = (TextView)this.findViewById(2131886102)).setTypeface(this.l.e);
        (this.s = (SocialBylineView)this.findViewById(2131886151)).setRenderRTL(bj.e);
        this.t = (TextView)this.findViewById(2131887321);
        this.u = (TextView)this.findViewById(2131887322);
        this.v = (TextView)this.findViewById(2131887126);
        this.M = (ActionButton)this.findViewById(2131886080);
        this.y = (ViewGroup)this.findViewById(2131887319);
        this.z = (ViewGroup)this.findViewById(2131887323);
        this.A = (ViewGroup)this.findViewById(2131886925);
        this.O = (ViewGroup)this.findViewById(2131887325);
        this.P = (RelativeLayout)this.findViewById(2131887326);
        this.Q = (TextView)this.findViewById(2131886291);
        this.B = (ViewGroup)this.findViewById(2131886826);
        this.v.setOnClickListener((View$OnClickListener)new fn(this));
        this.b = (BadgeView)this.findViewById(2131887320);
        this.S = new ws(this, wr.a(), 2130838723, 2130838724, 2130838725, 2130838722, false);
        (this.c = (EngagementActionBar)LayoutInflater.from(this.getContext()).inflate(2130968580, (ViewGroup)this, false)).setId(2131886144);
        this.O.setOnClickListener((View$OnClickListener)new fo(this));
        com.twitter.library.view.u.a(this.d);
        com.twitter.library.view.u.a(this.G = (TypefacesTextView)this.findViewById(2131887317));
        this.H = (TypefacesTextView)this.findViewById(2131887318);
        this.F = this.findViewById(2131887316);
        com.twitter.library.view.u.a(this.H);
        (this.J = (QuoteView)this.findViewById(2131886562)).setRenderRtl(bj.e);
        this.n.a(this.J);
        this.s.setMinIconWidth(com.twitter.library.experiments.b.d());
        this.a.setSize(com.twitter.library.experiments.b.c());
    }
    
    public void setBadgeLocation(final int n) {
    }
    
    public void setNumRelatedTweets(final int n) {
        this.N = n;
        switch (fr.a[RelatedTweetsExperimentHelper.f().ordinal()]) {
            case 1: {
                int visibility;
                int text;
                if (this.N > 0) {
                    visibility = 0;
                    text = 2131298018;
                }
                else {
                    final boolean d = RelatedTweetsExperimentHelper.d();
                    int n2 = 0;
                    if (!d) {
                        n2 = 8;
                    }
                    visibility = n2;
                    text = 2131298283;
                }
                this.O.setVisibility(visibility);
                this.Q.setText(text);
            }
            case 2: {
                if (n > 0) {
                    this.l();
                    this.a(this.f);
                    return;
                }
                break;
            }
        }
    }
    
    public void setOnTweetAnalyticsClickListener(final View$OnClickListener onClickListener) {
        this.z.setOnClickListener(onClickListener);
    }
    
    public void setQuoteTweetClickListener(final View$OnClickListener onClickListener) {
        this.J.setOnClickListener(onClickListener);
    }
    
    public void setQuoteTweetLongClickListener(final View$OnLongClickListener onLongClickListener) {
        this.J.setOnLongClickListener(onLongClickListener);
    }
    
    public void setTranslationButtonClickListener(final View$OnClickListener onClickListener) {
        this.G.setOnClickListener(onClickListener);
    }
    
    public void setTweetContentView(final View c) {
        this.C = c;
    }
}
