// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.text.Layout;
import android.text.Spanned;
import android.widget.ImageView;
import com.twitter.util.collection.CollectionUtils;
import android.view.MotionEvent;
import com.twitter.library.api.Entity;
import com.twitter.library.view.aa;
import com.twitter.library.view.e;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.text.SpannableString;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.client.az;
import com.twitter.library.util.aj;
import com.twitter.library.api.MediaEntityList;
import android.text.TextUtils$TruncateAt;
import com.twitter.library.provider.j;
import com.twitter.library.provider.i;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.util.bl;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.card.Card;
import com.twitter.library.card.instance.CardInstanceData;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.twitter.library.experiments.b;
import com.twitter.library.media.util.q;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.api.TweetClassicCard;
import android.text.TextUtils;
import android.graphics.Bitmap$Config;
import android.graphics.Path;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import java.util.Iterator;
import java.util.List;
import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.text.Layout$Alignment;
import android.util.TypedValue;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.twitter.util.a;
import android.view.ViewConfiguration;
import com.twitter.library.util.bo;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View$OnLongClickListener;
import com.twitter.library.featureswitch.d;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.widget.UserImageView;
import java.util.LinkedHashMap;
import android.view.View$OnClickListener;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import com.twitter.ui.widget.TwitterButton;
import android.content.SharedPreferences;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.view.u;
import com.twitter.library.view.z;
import android.graphics.RectF;
import android.text.StaticLayout;
import com.twitter.library.api.Prompt;
import android.graphics.Rect;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.BadgeView;
import com.twitter.library.view.TweetHeaderView;
import com.twitter.library.view.SocialProofView;
import com.twitter.library.view.QuoteView;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import com.twitter.library.view.TweetActionType;
import android.text.TextPaint;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.util.r;
import com.twitter.internal.android.widget.n;

public class TweetView extends TouchableView implements n, r, ag, wt
{
    public static final Size b;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    private static final int[] o;
    private static final TextPaint p;
    private static final TweetActionType[] q;
    private static final TweetActionType[] r;
    private static Animator$AnimatorListener s;
    private final float A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final int aA;
    private final int aB;
    private final float aC;
    private final int aD;
    private final int aE;
    private final int aF;
    private final ArrayList aG;
    private final int aH;
    private final float aI;
    private final float aJ;
    private final Drawable aK;
    private final Drawable aL;
    private final Drawable aM;
    private final boolean aN;
    private final ColorStateList aO;
    private final com.twitter.ui.widget.ag aP;
    private final int aQ;
    private final int aR;
    private final int aS;
    private final Drawable aT;
    private final QuoteView aU;
    private final SocialProofView aV;
    private final TweetHeaderView aW;
    private final BadgeView aX;
    private Tweet aY;
    private FriendshipCache aZ;
    private final int aa;
    private final int ab;
    private final int ac;
    private final int ad;
    private final int ae;
    private final int af;
    private final int ag;
    private final int ah;
    private final int ai;
    private final int aj;
    private final int ak;
    private final int al;
    private final int am;
    private final int an;
    private final int ao;
    private final int ap;
    private final int aq;
    private final int ar;
    private final int as;
    private final int at;
    private final int au;
    private final int av;
    private final int aw;
    private final int ax;
    private final int ay;
    private final int az;
    private int bA;
    private int bB;
    private Rect bC;
    private long bD;
    private boolean bE;
    private boolean bF;
    private boolean bG;
    private boolean bH;
    private String bI;
    private Prompt bJ;
    private int bK;
    private TweetActionType bL;
    private String bM;
    private String bN;
    private String bO;
    private int bP;
    private int bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private int bZ;
    private StaticLayout ba;
    private StaticLayout bb;
    private int bc;
    private int bd;
    private StaticLayout be;
    private StaticLayout bf;
    private RectF bg;
    private StaticLayout bh;
    private float bi;
    private RectF bj;
    private ap bk;
    private ap bl;
    private float bm;
    private float bn;
    private float bo;
    private int bp;
    private int bq;
    private int br;
    private int bs;
    private int bt;
    private float bu;
    private CharSequence bv;
    private CharSequence bw;
    private float bx;
    private float by;
    private int bz;
    protected z c;
    private int cA;
    private boolean cB;
    private int cC;
    private u cD;
    private TwitterScribeItem cE;
    private boolean cF;
    private int cG;
    private boolean cH;
    private f cI;
    private boolean cJ;
    private boolean cK;
    private int cL;
    private Rect cM;
    private SharedPreferences cN;
    private int cO;
    private TwitterButton cP;
    private Bitmap cQ;
    private Canvas cR;
    private boolean cS;
    private boolean cT;
    private int cU;
    private int cV;
    private View$OnClickListener cW;
    private boolean cX;
    private boolean cY;
    private final ws cZ;
    private int ca;
    private boolean cb;
    private boolean cc;
    private boolean cd;
    private boolean ce;
    private boolean cf;
    private boolean cg;
    private boolean ch;
    private int ci;
    private boolean cj;
    private boolean ck;
    private Rect cl;
    private boolean cm;
    private boolean cn;
    private ap co;
    private boolean cp;
    private int cq;
    private boolean cr;
    private int cs;
    private int ct;
    private int cu;
    private boolean cv;
    private int cw;
    private String cx;
    private int cy;
    private String cz;
    final LinkedHashMap d;
    final Rect e;
    final UserImageView f;
    RectF g;
    final Rect h;
    private final View$OnClickListener t;
    private final ColorStateList u;
    private final ColorStateList v;
    private final ColorStateList w;
    private final ColorStateList x;
    private final ColorStateList y;
    private final ColorStateList z;
    
    static {
        b = Size.a(100, 100);
        i = new int[] { kv.state_card_pressed };
        j = new int[] { kv.state_media_tag_summary_pressed };
        k = new int[] { kv.state_promoted_action_pressed };
        l = new int[] { kv.state_attribution_pressed };
        m = new int[] { kv.state_dismiss_pressed };
        n = new int[] { kv.state_action_prompt_pressed };
        o = new int[] { kv.state_action_prompt_dismiss_pressed };
        p = new TextPaint(1);
        q = new TweetActionType[] { TweetActionType.d, TweetActionType.c, TweetActionType.b, TweetActionType.e, TweetActionType.i, TweetActionType.j, TweetActionType.k, TweetActionType.q };
        r = new TweetActionType[0];
    }
    
    public TweetView(final Context context) {
        this(context, null);
    }
    
    public TweetView(final Context context, final AttributeSet set) {
        this(context, set, kv.tweetViewStyle);
    }
    
    public TweetView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new LinkedHashMap();
        this.e = new Rect();
        this.h = new Rect();
        this.aG = new ArrayList();
        this.bC = new Rect();
        this.cf = true;
        this.ci = 0;
        this.cj = true;
        this.cG = 0;
        this.cU = 0;
        this.setWillNotDraw(false);
        this.setClipToPadding(false);
        this.setClipChildren(false);
        final Resources resources = this.getResources();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TweetView, n, 0);
        if (com.twitter.library.featureswitch.d.f("tweet_inline_actions_counts_all_enabled")) {
            this.cG = 1;
        }
        this.cH = com.twitter.library.featureswitch.d.f("legacy_deciders_amplify_player_enabled");
        (this.aU = new QuoteView(context)).setBackgroundDrawable(obtainStyledAttributes.getDrawable(li.TweetView_quoteBackgroundDrawable));
        this.aU.setOnClickListener((View$OnClickListener)new as(this));
        this.aU.setOnLongClickListener((View$OnLongClickListener)new ax(this));
        this.aU.setVisibility(8);
        this.addView((View)this.aU);
        final int resourceId = obtainStyledAttributes.getResourceId(li.TweetView_socialProofStyle, 0);
        Object o;
        if (resourceId == 0) {
            o = context;
        }
        else {
            o = new ContextThemeWrapper(context, resourceId);
        }
        this.addView((View)(this.aV = new SocialProofView((Context)o)));
        this.addView((View)(this.aW = new TweetHeaderView(context, obtainStyledAttributes.getResourceId(li.TweetView_tweetHeaderStyle, 0))));
        this.addView((View)(this.aX = new BadgeView(context, obtainStyledAttributes.getResourceId(li.TweetView_badgeStyle, 0))));
        this.u = obtainStyledAttributes.getColorStateList(li.TweetView_contentColor);
        this.setContentSize(obtainStyledAttributes.getDimension(li.TweetView_contentSize, com.twitter.library.util.bo.a()));
        this.A = obtainStyledAttributes.getFloat(li.TweetView_lineSpacingMultiplier, 1.0f);
        this.C = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_lineSpacingExtra, 0);
        this.D = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_iconSpacing, 4);
        this.bu = obtainStyledAttributes.getDimension(li.TweetView_bylineSize, com.twitter.library.util.bo.b());
        this.v = obtainStyledAttributes.getColorStateList(li.TweetView_bylineColor);
        this.y = obtainStyledAttributes.getColorStateList(li.TweetView_attributionColor);
        this.aJ = obtainStyledAttributes.getDimension(li.TweetView_attributionTextSize, 12.0f);
        this.aI = obtainStyledAttributes.getDimension(li.TweetView_mediaTagSummarySize, 12.0f);
        this.z = obtainStyledAttributes.getColorStateList(li.TweetView_mediaTagSummaryColor);
        this.aT = obtainStyledAttributes.getDrawable(li.TweetView_dismissDrawable);
        this.V = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_verticalConnectorWidth, 0);
        this.W = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_verticalConnectorMargin, 2);
        this.aK = obtainStyledAttributes.getDrawable(li.TweetView_verticalConnector);
        this.aL = obtainStyledAttributes.getDrawable(li.TweetView_verticalConnector);
        this.aM = obtainStyledAttributes.getDrawable(li.TweetView_verticalConnector);
        this.Q = obtainStyledAttributes.getResourceId(li.TweetView_mediaIcon, 0);
        this.R = obtainStyledAttributes.getResourceId(li.TweetView_playerIcon, 0);
        this.S = obtainStyledAttributes.getResourceId(li.TweetView_summaryIcon, 0);
        this.T = obtainStyledAttributes.getResourceId(li.TweetView_translationIcon, 0);
        this.U = obtainStyledAttributes.getResourceId(li.TweetView_momentsInjectionIcon, 0);
        this.E = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionFavoriteOnDrawable, 0);
        this.F = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionFavoriteOffDrawable, 0);
        this.G = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionRetweetOnDrawable, 0);
        this.H = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionRetweetOffDrawable, 0);
        this.I = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionRetweetDisabledDrawable, 0);
        this.J = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionReplyOffDrawable, 0);
        this.M = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionFollowOnDrawable, 0);
        this.N = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionFollowOffDrawable, 0);
        this.O = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionPAcFollowOnDrawable, 0);
        this.P = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionPAcFollowOffDrawable, 0);
        this.bX = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionBadFeedbackOnDrawable, 0);
        this.bY = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionBadFeedbackOffDrawable, 0);
        this.bZ = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionGoodFeedbackOnDrawable, 0);
        this.ca = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionGoodFeedbackOffDrawable, 0);
        this.K = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionGotoRelatedOffDrawable, 0);
        this.L = obtainStyledAttributes.getResourceId(li.TweetView_inlineActionViewTweetAnalyticsOffDrawable, 0);
        this.aa = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_badgeSpacing, 0);
        this.ab = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_pacHeight, 0);
        this.ac = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_pacMargin, 0);
        this.aH = obtainStyledAttributes.getInt(li.TweetView_previewFlags, 5);
        this.aN = (this.aH != 0);
        this.w = obtainStyledAttributes.getColorStateList(li.TweetView_mediaColor);
        this.ad = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaTopMargin, 0);
        this.ae = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaBottomMargin, 0);
        this.af = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaTagTopMargin, 0);
        this.ag = Math.max(obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaTagBottomMargin, 0) - this.ad, 0);
        this.ai = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_summaryPadding, 0);
        this.x = obtainStyledAttributes.getColorStateList(li.TweetView_promoDividerColor);
        this.aj = obtainStyledAttributes.getColor(li.TweetView_linkSelectedColor, 0);
        this.B = resources.getColor(kx.placeholder_bg);
        this.ah = obtainStyledAttributes.getResourceId(li.TweetView_mediaTagIcon, 0);
        this.aE = obtainStyledAttributes.getResourceId(li.TweetView_mediaPlaceholderDrawable, 0);
        this.cX = obtainStyledAttributes.getBoolean(li.TweetView_autoLink, false);
        this.aO = obtainStyledAttributes.getColorStateList(li.TweetView_linkColor);
        this.ak = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionMarginTop, 0);
        this.al = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionMarginBottom, 0);
        this.am = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionMarginMediaOffset, 0);
        this.an = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionMarginRight, 0);
        this.ao = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionLabelMarginLeft, 0);
        this.ap = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionLabelMarginRight, 0);
        if (this.cG == 1) {
            this.bU = this.ap;
        }
        else {
            this.bU = this.an;
        }
        this.aq = obtainStyledAttributes.getColor(li.TweetView_inlineActionLabelFavoriteColor, 0);
        this.ar = obtainStyledAttributes.getColor(li.TweetView_inlineActionLabelRetweetColor, 0);
        this.az = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_actionPromptMarginTop, 0);
        this.aA = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_actionPromptContentTopPadding, 0);
        this.aB = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_actionPromptContentBottomPadding, 0);
        this.aC = obtainStyledAttributes.getFraction(li.TweetView_actionPromptContentHorizontalPaddingFraction, 1, 1, 0.0f);
        this.aD = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_actionPromptPointerHeight, 0);
        this.av = obtainStyledAttributes.getColor(li.TweetView_actionPromptBodyColorWhite, 0);
        this.au = obtainStyledAttributes.getColor(li.TweetView_actionPromptBackgroundColorBlue, 0);
        this.aw = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_actionPromptBodyFontSize, 0);
        this.ax = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_actionPromptBodyBottomMargin, 0);
        this.ay = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_actionPromptPointerRadius, 0);
        this.aF = ViewConfiguration.get(context).getScaledTouchSlop();
        this.as = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionTouchPaddingRight, 0);
        this.at = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_inlineActionTouchPaddingBottom, 0);
        this.aP = com.twitter.ui.widget.ag.a(context);
        this.aQ = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_stackedUsernameBottomMargin, 0);
        this.aR = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaFirstExtraTopMargin, 0);
        this.aS = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaFirstBottomMargin, 0);
        this.v();
        final UserImageView f = new UserImageView(context);
        f.setOverlayDrawableId(obtainStyledAttributes.getResourceId(li.TweetView_profileImageOverlayDrawable, 0));
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_profileImagePaddingTopBottom, 0);
        f.setPadding(obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_profileImagePaddingLeft, 0), dimensionPixelOffset, obtainStyledAttributes.getDimensionPixelOffset(li.TweetView_profileImagePaddingRight, 0), dimensionPixelOffset);
        f.setDefaultDrawable(obtainStyledAttributes.getDrawable(li.TweetView_placeholderDrawable));
        f.setImageType("profile");
        this.t = (View$OnClickListener)new ay(this);
        a.a((View)f, 2);
        this.addView((View)(this.f = f));
        this.cV = obtainStyledAttributes.getDimensionPixelSize(li.TweetView_mediaDivider, 0);
        this.cN = context.getSharedPreferences("related_tweets", 0);
        this.cZ = new ws(this, wr.a(), obtainStyledAttributes.getResourceId(li.TweetView_politicalDrawable, 0), obtainStyledAttributes.getResourceId(li.TweetView_promotedDrawable, 0), obtainStyledAttributes.getResourceId(li.TweetView_altPromotedDrawable, 0), obtainStyledAttributes.getResourceId(li.TweetView_alertDrawable, 0));
        obtainStyledAttributes.recycle();
    }
    
    private boolean A() {
        return (this.bd != 1 || this.aX.getVisibility() != 0) && this.bH;
    }
    
    private boolean B() {
        return this.cu != 0 && this.cu != 5;
    }
    
    private void C() {
        this.bH = false;
        this.bL = null;
        this.bh = null;
        this.cP = null;
        this.bg = null;
        this.bj = null;
        this.bk = null;
        this.g = null;
        this.bl = null;
        this.cQ = null;
        this.cR = null;
    }
    
    private boolean D() {
        if (this.aY != null && !this.d(this.aY)) {
            switch (this.ci) {
                case 1: {
                    return this.aY.d();
                }
                case 2: {
                    return this.aY.e();
                }
                case 3: {
                    if (this.aY.d() || this.aY.e()) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    private ValueAnimator E() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new at(this));
        return ofFloat;
    }
    
    private ValueAnimator F() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.setStartDelay(300L);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new au(this));
        ofFloat.addListener((Animator$AnimatorListener)new av(this));
        return ofFloat;
    }
    
    private void G() {
        if (this.cK && this.cI != null && this.cI.v()) {
            this.r();
            this.cK = false;
        }
    }
    
    private void H() {
        if (this.cI != null) {
            if (this.cK) {
                this.cI.w();
                this.r();
                this.cK = false;
            }
            this.cI.x();
        }
    }
    
    private void I() {
        if (this.cI != null) {
            final f ci = this.cI;
            this.cI = null;
            this.cJ = false;
            ci.y();
            final View z = ci.z();
            if (z != null) {
                this.removeView(z);
            }
        }
    }
    
    private int a(final TextPaint textPaint, final int n, final int n2, final int n3) {
        if (TweetActionType.a.equals(this.bL)) {
            this.bH = false;
            return 0;
        }
        if (this.bh == null || !this.bh.getText().equals(this.bI)) {
            final int n4 = (int)(n * (1.0f - this.aC));
            this.bi = (n - n4) / 2.0f;
            textPaint.setTextSize(TypedValue.applyDimension(0, (float)this.aw, this.getResources().getDisplayMetrics()));
            textPaint.setTypeface(this.aP.a);
            this.bh = new StaticLayout((CharSequence)this.bI, textPaint, n4, Layout$Alignment.ALIGN_CENTER, this.A, 0.0f, false);
            textPaint.setTextSize(this.bx);
        }
        if (this.cP == null) {
            (this.cP = new TwitterButton(this.getContext(), null, 0, this.bK)).setText(lg.action_prompt_cancel_button_text);
        }
        final int size = View$MeasureSpec.getSize(this.cP.getMeasuredWidth());
        final int size2 = View$MeasureSpec.getSize(this.cP.getMeasuredHeight());
        this.cP.layout(0, 0, size, size2);
        this.cP.measure(size, size2);
        if (this.bg == null) {
            this.bg = new RectF();
        }
        final int n5 = this.bh.getHeight() + this.ax + this.cP.getHeight() + (this.aA + this.aB + this.az);
        this.bg.set(0.0f, 0.0f, (float)n, (float)n5);
        if (this.g == null) {
            this.g = new RectF();
        }
        if (this.bl == null) {
            (this.bl = new ap(this, 8388608L, 16777216L, new bg(this), TweetView.o)).a(this.g);
        }
        this.a(this.bl);
        if (this.bj == null) {
            this.bj = new RectF();
        }
        if (this.bk == null) {
            (this.bk = new ap(this, 67108864L, 33554432L, new bi(), TweetView.n)).a(this.bj);
        }
        this.a(this.bk);
        this.bP = n2 + n3 + this.az;
        final float n6 = (n - this.cP.getWidth()) / 2.0f;
        final float n7 = this.bP + this.aA + this.bh.getHeight() + this.ax;
        this.g.set(n6, n7, n6 + this.cP.getWidth(), n7 + this.cP.getHeight());
        this.bj.set(0.0f, (float)this.bP, (float)n, this.bP + this.bg.bottom);
        return (int)(n5 * (1.0f - this.bo));
    }
    
    private int a(final TweetActionType tweetActionType, final TweetView$InlineAction$State tweetView$InlineAction$State) {
        if (tweetActionType == TweetActionType.b) {
            if (tweetView$InlineAction$State == TweetView$InlineAction$State.a) {
                return this.E;
            }
            return this.F;
        }
        else if (tweetActionType == TweetActionType.c) {
            if (tweetView$InlineAction$State == TweetView$InlineAction$State.c) {
                return this.I;
            }
            if (tweetView$InlineAction$State == TweetView$InlineAction$State.a) {
                return this.G;
            }
            return this.H;
        }
        else {
            if (tweetActionType == TweetActionType.d) {
                return this.J;
            }
            if (tweetActionType == TweetActionType.e) {
                if (tweetView$InlineAction$State == TweetView$InlineAction$State.a) {
                    return this.bV;
                }
                return this.bW;
            }
            else if (tweetActionType == TweetActionType.j) {
                if (tweetView$InlineAction$State == TweetView$InlineAction$State.a) {
                    return this.bX;
                }
                return this.bY;
            }
            else if (tweetActionType == TweetActionType.i) {
                if (tweetView$InlineAction$State == TweetView$InlineAction$State.a) {
                    return this.bZ;
                }
                return this.ca;
            }
            else {
                if (tweetActionType == TweetActionType.k) {
                    return this.K;
                }
                if (tweetActionType == TweetActionType.q) {
                    return this.L;
                }
                return 0;
            }
        }
    }
    
    private ValueAnimator a(final TweetView$InlineAction tweetView$InlineAction, final float n, final float n2, final long duration) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { n, n2 });
        ofFloat.setDuration(duration);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new bf(this, tweetView$InlineAction));
        return ofFloat;
    }
    
    private StaticLayout a(final String s, final TextPaint textPaint) {
        return new StaticLayout((CharSequence)s, textPaint, com.twitter.util.t.a(s, textPaint), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }
    
    private CharSequence a(final Context context, final List list) {
        if (list.isEmpty()) {
            return "";
        }
        final List a = com.twitter.library.media.util.ag.a((Iterable)list);
        if (a.isEmpty()) {
            return "";
        }
        return com.twitter.library.media.util.ag.a(context, a, this.ah);
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        final Iterator<TweetView$InlineAction> iterator = this.d.values().iterator();
        int n5 = n;
        while (iterator.hasNext()) {
            final TweetView$InlineAction tweetView$InlineAction = iterator.next();
            final int height = tweetView$InlineAction.a.getBounds().height();
            final int width = tweetView$InlineAction.a.getBounds().width();
            int n6;
            if (tweetView$InlineAction.f == TweetActionType.e || tweetView$InlineAction.f == TweetActionType.k || tweetView$InlineAction.f == TweetActionType.q) {
                if (this.cv) {
                    n6 = n - n2;
                }
                else {
                    n6 = n + n2 - width;
                }
            }
            else if (this.cv) {
                n6 = n5 - width;
            }
            else {
                n6 = n5;
            }
            final int n7 = n3 + n4 / 2 - height / 2;
            int n12;
            int n16;
            int n17;
            int n18;
            if (tweetView$InlineAction.g != null) {
                final int height2 = tweetView$InlineAction.g.getHeight();
                final int width2 = tweetView$InlineAction.g.getWidth();
                final int n8 = width + this.ao + Math.max(width2, this.bT);
                final int n9 = width + (width2 + this.ao);
                final int n10 = n3 + n4 / 2 - height2 / 2;
                int n11;
                int n13;
                if (this.cv) {
                    n11 = n6 - (width2 + this.ao);
                    n12 = n11 + width2 + this.ao;
                    n13 = n11;
                }
                else {
                    final int n14 = n6 + width + this.ao;
                    n13 = n6;
                    final int n15 = n6;
                    n11 = n14;
                    n12 = n15;
                }
                tweetView$InlineAction.h.set(n11, n10, width2 + n11, height2 + n10);
                n16 = n8;
                n17 = n13;
                n18 = n9;
            }
            else {
                final int n19 = width + this.ao + this.bT;
                n18 = width;
                n17 = n6;
                final int n20 = n6;
                n16 = n19;
                n12 = n20;
            }
            tweetView$InlineAction.b.set(n17 - this.aF, n3 - this.aF, n18 + n17 + this.aF + this.as, n3 + n4 + this.aF + this.at);
            tweetView$InlineAction.c.set(n12, n7, n12 + width, n7 + height);
            int n21;
            if (tweetView$InlineAction.f != TweetActionType.e && tweetView$InlineAction.f != TweetActionType.k && tweetView$InlineAction.f != TweetActionType.q) {
                if (this.cv) {
                    n21 = n5 - (n16 + this.bU);
                }
                else {
                    n21 = n5 + (n16 + this.bU);
                }
            }
            else {
                n21 = n5;
            }
            n5 = n21;
        }
    }
    
    private void a(final int n, final int n2, final TextPaint textPaint, final int n3, final int n4, final int n5, final int n6) {
        this.cL = 0;
        int ar;
        if (this.cU == 1) {
            ar = this.aR;
        }
        else {
            ar = 0;
        }
        this.b(n2, n, textPaint, n4, n5, n6 + ar, n3);
        if (this.cL > 0) {
            this.cL += ar;
            if (this.bb != null) {
                this.cL += this.aS;
            }
        }
    }
    
    private void a(final int n, final String s, final int n2, final int n3, final String s2, final int n4, final int n5, final long n6) {
        if (n5 != 1 || (n != 14 && n != 15 && n != 17 && n != 19)) {
            this.aV.a(n, s, n2, n3, s2, n4, n6);
        }
    }
    
    private void a(final Canvas canvas, final int color, final TextPaint textPaint) {
        if (!this.h.isEmpty()) {
            canvas.save();
            canvas.translate((float)this.h.left, (float)this.bS);
            textPaint.setTextSize(this.aJ);
            textPaint.setColor(color);
            this.be.draw(canvas);
            canvas.restore();
        }
    }
    
    private void a(final Canvas canvas, final Paint paint) {
        if (this.A() && this.bh != null) {
            canvas.save();
            canvas.translate(0.0f, (float)this.bP);
            paint.setColor(this.au);
            paint.setStyle(Paint$Style.FILL);
            paint.setStrokeWidth(0.0f);
            final Path path = new Path();
            if (this.bQ > 0) {
                path.lineTo((float)this.bQ, 0.0f);
                final float n = 1.0f - this.bn;
                final float n2 = n * this.aD;
                final float n3 = (float)(n * this.ay / Math.sqrt(2.0));
                final float n4 = n2 - n3;
                final int n5 = this.bR / 2;
                path.lineTo(n5 + this.bQ - n3, 0.0f - n4);
                path.quadTo((float)(n5 + this.bQ), 0.0f - n2, n3 + (n5 + this.bQ), 0.0f - n4);
                path.lineTo((float)(this.bQ + this.bR), 0.0f);
            }
            path.lineTo(this.bg.right, 0.0f);
            path.lineTo(this.bg.right, this.bg.bottom);
            path.lineTo(0.0f, this.bg.bottom);
            path.close();
            canvas.drawPath(path, paint);
            canvas.restore();
            if (this.bh != null && this.cP != null) {
                canvas.save();
                final int n6 = this.bP + this.aA;
                canvas.translate(this.bi, n6 + -50.0f * this.bm);
                paint.setStyle(Paint$Style.FILL);
                canvas.scale(1.0f - 0.19999999f * this.bm, 1.0f - 0.3f * this.bm, this.bh.getWidth() / 2.0f, this.bh.getHeight() / 2.0f);
                paint.setTextSize(TypedValue.applyDimension(0, (float)this.aw, this.getResources().getDisplayMetrics()));
                paint.setColor(this.av);
                paint.setTypeface(this.aP.a);
                paint.setAlpha((int)(255.0f * (1.0f - this.bm)));
                this.bh.draw(canvas);
                paint.setTextSize(this.bx);
                paint.setAlpha(255);
                canvas.restore();
                canvas.save();
                canvas.translate(this.bi + (this.bh.getWidth() - this.cP.getWidth()) / 2.0f, n6 + this.bh.getHeight() + this.ax + -20.0f * this.bm);
                canvas.scale(1.0f - 0.19999999f * this.bm, 1.0f - 0.3f * this.bm, this.cP.getWidth() / 2.0f, this.cP.getHeight() / 2.0f);
                if (this.bm > 0.0f) {
                    paint.setAlpha((int)(255.0f * (1.0f - this.bm)));
                    if (this.cQ == null) {
                        this.cQ = Bitmap.createBitmap(this.cP.getWidth(), this.cP.getHeight(), Bitmap$Config.ARGB_8888);
                    }
                    if (this.cR == null) {
                        this.cR = new Canvas(this.cQ);
                    }
                    this.cP.draw(this.cR);
                    canvas.drawBitmap(this.cQ, 0.0f, 0.0f, paint);
                    paint.setAlpha(255);
                }
                else {
                    this.cP.draw(canvas);
                }
                canvas.restore();
            }
        }
    }
    
    private void a(final TextPaint textPaint, final int n) {
        final int n2 = n - this.getContext().getResources().getDrawable(this.bW).getIntrinsicWidth();
        final Iterator<TweetView$InlineAction> iterator = this.d.values().iterator();
        int n3 = n2;
        int n4 = 0;
        while (iterator.hasNext()) {
            final TweetView$InlineAction tweetView$InlineAction = iterator.next();
            String s = null;
            switch (com.twitter.library.widget.aw.a[tweetView$InlineAction.f.ordinal()]) {
                default: {
                    s = null;
                    break;
                }
                case 2: {
                    s = this.bN;
                    break;
                }
                case 1: {
                    s = this.bM;
                    break;
                }
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                tweetView$InlineAction.g = this.a(s, textPaint);
            }
            else {
                tweetView$InlineAction.g = null;
            }
            int n8;
            int n9;
            if (com.twitter.library.featureswitch.d.f("tweet_inline_actions_counts_all_enabled") && tweetView$InlineAction.f != TweetActionType.e && tweetView$InlineAction.f != TweetActionType.k && tweetView$InlineAction.f != TweetActionType.q) {
                final int n5 = n3 - tweetView$InlineAction.a.getBounds().width();
                final int n6 = n4 + 1;
                final int n7 = n5 - (this.ao + this.bU);
                n8 = n6;
                n9 = n7;
            }
            else {
                n8 = n4;
                n9 = n3;
            }
            n3 = n9;
            n4 = n8;
        }
        if (n4 > 0) {
            this.bT = n3 / n4;
        }
    }
    
    private void a(final Tweet tweet, final boolean b, final TweetClassicCard tweetClassicCard, final boolean b2, final boolean b3, final boolean b4) {
        int cu = 3;
        if (b) {
            final List ag = tweet.ag;
            if (ag != null && !ag.isEmpty()) {
                if (com.twitter.library.media.util.q.a(ag, MediaType.d, MediaType.e) == null) {
                    cu = 1;
                }
                this.cu = cu;
            }
        }
        else {
            if (!this.d(tweet) && b4) {
                this.cu = 5;
                return;
            }
            if ((b3 || b2) && tweetClassicCard == null && tweet.H()) {
                if ((this.ch || this.cg || tweet.n()) && com.twitter.library.media.util.q.c(tweet.G.media) != null) {
                    this.cu = cu;
                }
            }
            else if (b3 && tweetClassicCard != null) {
                if (tweetClassicCard.type == 1 && (0x1 & this.aH) != 0x0) {
                    boolean b5;
                    if (tweetClassicCard != null && tweetClassicCard.type == 1 && tweetClassicCard.siteUser == null) {
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    if ((b2 || (this.ch && b5)) && tweetClassicCard.imageSize.b(TweetView.b)) {
                        this.cu = 1;
                        if (b2 && tweetClassicCard.siteUser != null) {
                            this.bO = tweetClassicCard.siteUser.fullName;
                        }
                    }
                }
                else if (tweetClassicCard.type == 2 && (0x4 & this.aH) != 0x0 && ((b2 && tweetClassicCard.playerType == 1) || (this.ch && (this.aY.F() || (this.aY.H() && this.cH) || this.e(tweet) || this.aY.G())))) {
                    this.cu = cu;
                    if (b2 && tweetClassicCard.siteUser != null) {
                        this.bO = tweetClassicCard.siteUser.fullName;
                    }
                }
            }
            else if (b3 && (0x1 & this.aH) != 0x0 && (b2 || this.ch) && com.twitter.library.media.util.q.b(tweet, b.h())) {
                this.cu = 1;
            }
        }
    }
    
    private void a(final TweetView$InlineAction tweetView$InlineAction) {
        final Tweet ay = this.aY;
        final TweetActionType f = tweetView$InlineAction.f;
        final TweetView$InlineAction$State b = this.b(f, ay);
        if (tweetView$InlineAction.d == null && b == tweetView$InlineAction.e && b != TweetView$InlineAction$State.c) {
            this.b(f);
            if (f == TweetActionType.b && tweetView$InlineAction.e == TweetView$InlineAction$State.b) {
                this.a(tweetView$InlineAction, true);
            }
            else if (f == TweetActionType.c) {
                this.a(tweetView$InlineAction, false);
                this.a(f);
            }
            else {
                this.a(f);
            }
            if (this.A() && tweetView$InlineAction.f.equals(this.bL)) {
                this.b(1);
            }
            this.invalidate();
        }
    }
    
    private void a(final TweetView$InlineAction tweetView$InlineAction, final boolean b) {
        if (tweetView$InlineAction.d == null) {
            final ValueAnimator a = this.a(tweetView$InlineAction, 1.0f, 1.55f, 35L);
            final ValueAnimator a2 = this.a(tweetView$InlineAction, 1.55f, 1.6f, 50L);
            final ValueAnimator a3 = this.a(tweetView$InlineAction, 1.6f, 1.0f, 165L);
            ((Animator)a).addListener((Animator$AnimatorListener)new bd(this));
            ((Animator)a3).addListener((Animator$AnimatorListener)new be(this, b, tweetView$InlineAction));
            final AnimatorSet set = new AnimatorSet();
            set.playSequentially(new Animator[] { a, a2, a3 });
            set.start();
        }
    }
    
    private boolean a(final CardInstanceData cardInstanceData) {
        if (cardInstanceData != null) {
            boolean b;
            if (Card.a(cardInstanceData.name) && this.x()) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if (Card.b(cardInstanceData.name) && this.y()) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b || b2) {
                return true;
            }
        }
        return false;
    }
    
    private boolean a(final Tweet tweet) {
        return tweet != null && tweet.ad();
    }
    
    private boolean a(final Tweet tweet, final long n) {
        if (this.aZ != null && tweet.C != n) {
            int intValue;
            if (this.aZ.a(tweet.C)) {
                intValue = this.aZ.j(tweet.C);
            }
            else {
                intValue = 0;
            }
            boolean b;
            if ((intValue & 0x1) != 0x0) {
                b = true;
            }
            else {
                b = false;
            }
            boolean b2;
            if ((intValue & 0x40) != 0x0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (this.u() || this.b(tweet) || ((tweet.t() || !tweet.r()) && (!b || b2 || this.a(tweet)))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean a(final Tweet tweet, final TwitterUser twitterUser) {
        return tweet != null && twitterUser != null && tweet.C == twitterUser.userId && !this.b(tweet, twitterUser.userId) && com.twitter.library.featureswitch.d.f("tweet_analytics_inline_action_enabled") && com.twitter.library.util.bl.a(twitterUser);
    }
    
    private boolean a(final Tweet tweet, final boolean b) {
        return (this.cu == 5 && !this.a(tweet, this.aY)) || (this.B() && b && !b(tweet, this.aY)) || (this.cu != 5 && !this.h());
    }
    
    private boolean a(final TweetActionType tweetActionType, final Tweet tweet) {
        boolean b = true;
        final TwitterUser owner = this.getOwner();
        if (tweet.K != null || owner == null) {
            b = false;
        }
        else {
            final long userId = owner.userId;
            if (this.c(tweet) && this.a(tweet, userId)) {
                if (tweetActionType != TweetActionType.e) {
                    return false;
                }
            }
            else {
                if (tweetActionType == TweetActionType.e) {
                    return this.a(tweet, userId);
                }
                if (tweetActionType == TweetActionType.j || tweetActionType == TweetActionType.i) {
                    if (!this.cp || !RelatedTweetsExperimentHelper.d()) {
                        return false;
                    }
                }
                else {
                    if (tweetActionType == TweetActionType.k) {
                        return this.b(tweet, userId);
                    }
                    if (tweetActionType == TweetActionType.q) {
                        return this.a(tweet, owner);
                    }
                }
            }
        }
        return b;
    }
    
    private i b(final Tweet tweet, final boolean b) {
        final j a = new j(tweet).a(true);
        if (this.h()) {
            final j b2 = a.b(this.cj);
            if (!tweet.Y() && !tweet.Z()) {
                final boolean b3 = false;
                if (!b) {
                    return b2.c(b3).a();
                }
            }
            final boolean b3 = true;
            return b2.c(b3).a();
        }
        if (this.cu == 5) {
            return a.c(this.ck).a();
        }
        if (this.aU.getVisibility() == 0) {
            return a.d(true).a();
        }
        if (this.cY) {
            final j b4 = a.a(true).b(true);
            if (!tweet.Y() && !tweet.Z()) {
                final boolean b5 = false;
                if (!b) {
                    return b4.c(b5).a();
                }
            }
            final boolean b5 = true;
            return b4.c(b5).a();
        }
        return new i(tweet.c(), tweet.G);
    }
    
    private TweetView$InlineAction$State b(final TweetActionType tweetActionType, final Tweet tweet) {
        if (tweetActionType == TweetActionType.b && tweet.e) {
            return TweetView$InlineAction$State.a;
        }
        if (tweetActionType == TweetActionType.c) {
            if (tweet.C == this.getOwnerId() || tweet.P) {
                return TweetView$InlineAction$State.c;
            }
            if (tweet.h) {
                return TweetView$InlineAction$State.a;
            }
        }
        else {
            if (tweetActionType == TweetActionType.e && this.aZ.k(tweet.C)) {
                return TweetView$InlineAction$State.a;
            }
            if (tweetActionType == TweetActionType.j) {
                if (this.cN.getBoolean(String.format("bad_feedback_%d_%d", tweet.v, tweet.E), false)) {
                    return TweetView$InlineAction$State.a;
                }
                return TweetView$InlineAction$State.b;
            }
            else if (tweetActionType == TweetActionType.i) {
                if (this.cN.getBoolean(String.format("good_feedback_%d_%d", tweet.v, tweet.E), false)) {
                    return TweetView$InlineAction$State.a;
                }
                return TweetView$InlineAction$State.b;
            }
        }
        return TweetView$InlineAction$State.b;
    }
    
    private void b(final int n, final int n2, final TextPaint textPaint, final int n3, int n4, final int n5, final int n6) {
        int c = this.c(n, n6);
        int n9;
        int n10;
        if (this.cv) {
            int n7;
            if (this.cU == 1) {
                n7 = n - this.getPaddingRight();
            }
            else {
                n7 = n4;
            }
            final int n8 = n7 - c;
            n9 = n7;
            n10 = n8;
        }
        else {
            if (this.cU == 1) {
                n10 = this.getPaddingLeft();
            }
            else {
                n10 = n4;
            }
            n9 = n10 + c;
        }
        int n14;
        if (5 == this.cu) {
            final int n11 = this.cO + this.f.getMeasuredHeight();
            if (this.cT) {
                n4 = n9;
            }
            else if (this.cv) {
                n10 = this.getPaddingLeft();
                if (this.cr && n5 >= n11) {
                    n4 = this.getPaddingRight();
                }
            }
            else {
                if (this.cr && n5 >= n11) {
                    n4 = this.getPaddingLeft();
                }
                final int n12 = n2 - this.getPaddingRight();
                final int n13 = n4;
                n4 = n12;
                n10 = n13;
            }
            c = n4 - n10;
            n14 = n10;
        }
        else {
            n14 = n10;
        }
        switch (this.cu) {
            case 1:
            case 3:
            case 5: {
                if (this.cI != null) {
                    this.h.set(this.cI.a(this.getContext(), n14, n5 + this.ad, c, n5));
                    this.cL = this.h.height() + this.ae;
                }
                else {
                    this.h.setEmpty();
                    this.cL = 0;
                }
                if (this.bO != null) {
                    this.bS = n5 + this.cL + this.ae;
                    this.b(textPaint, n3);
                    final int n15 = this.ae + this.be.getHeight();
                    this.cL += n15;
                    this.bC = new Rect(n14, this.bS, n9, n15 + this.bS);
                    this.g();
                    return;
                }
                break;
            }
        }
    }
    
    private void b(final TextPaint textPaint, final int n) {
        this.be = new StaticLayout((CharSequence)this.bO, 0, this.bO.length(), textPaint, com.twitter.util.t.a(this.bO, textPaint), Layout$Alignment.ALIGN_NORMAL, this.A, (float)this.C, false, TextUtils$TruncateAt.END, n);
    }
    
    private void b(final TweetActionType f, final TweetView$InlineAction$State e) {
        final int a = this.a(f, e);
        if (a > 0) {
            TweetView$InlineAction tweetView$InlineAction2;
            if (!this.d.containsKey(f)) {
                final TweetView$InlineAction tweetView$InlineAction = new TweetView$InlineAction();
                final int n = 2 * this.d.size();
                final ap ap = new ap(this, 256L << n, 128L << n, new bk(this, tweetView$InlineAction), this.c(f));
                ap.a(tweetView$InlineAction.b);
                this.a(ap);
                this.d.put(f, tweetView$InlineAction);
                tweetView$InlineAction2 = tweetView$InlineAction;
            }
            else {
                tweetView$InlineAction2 = this.d.get(f);
            }
            if (tweetView$InlineAction2 != null) {
                final Drawable drawable = this.getContext().getResources().getDrawable(a);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                tweetView$InlineAction2.a = drawable;
                tweetView$InlineAction2.f = f;
                tweetView$InlineAction2.e = e;
            }
        }
    }
    
    private boolean b(final int n, final int n2) {
        return this.c(n, n2) > this.h.width();
    }
    
    private boolean b(final Tweet tweet) {
        return tweet != null && tweet.v();
    }
    
    private boolean b(final Tweet tweet, final long n) {
        return tweet != null && tweet.w && !this.a(tweet, n) && RelatedTweetsExperimentHelper.c();
    }
    
    private static boolean b(final Tweet tweet, final Tweet tweet2) {
        if (tweet != null && tweet.E == tweet2.E) {
            final boolean f = tweet.f();
            final boolean f2 = tweet2.f();
            if (!f && !f2) {
                final MediaEntityList media = tweet.G.media;
                final MediaEntityList media2 = tweet2.G.media;
                if (media.b() == media2.b() && com.twitter.util.collection.j.a().a(media).c().equals(com.twitter.util.collection.j.a().a(media2).c())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private int c(final int n, final int n2) {
        if (this.cU == 1) {
            return n2;
        }
        return n2 - this.f.getMeasuredWidth();
    }
    
    private int c(final TextPaint textPaint, final int n) {
        final int n2 = n - this.getContext().getResources().getDrawable(this.bW).getIntrinsicWidth();
        final Iterator<TweetView$InlineAction> iterator = this.d.values().iterator();
        int n3 = 0;
        int max = 0;
        while (iterator.hasNext()) {
            final TweetView$InlineAction tweetView$InlineAction = iterator.next();
            final Rect bounds = tweetView$InlineAction.a.getBounds();
            max = Math.max(max, bounds.height());
            int n5;
            if (tweetView$InlineAction.f != TweetActionType.e && tweetView$InlineAction.f != TweetActionType.k && tweetView$InlineAction.f != TweetActionType.q) {
                final int n4 = n3 + (bounds.width() + this.ao + this.bU);
                int width;
                if (tweetView$InlineAction.g != null) {
                    width = tweetView$InlineAction.g.getWidth();
                }
                else {
                    width = 0;
                }
                n5 = n4 + Math.max(width, this.bT);
            }
            else {
                n5 = n3;
            }
            n3 = n5;
        }
        if (n3 > n2) {
            final Iterator<TweetView$InlineAction> iterator2 = this.d.values().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().g = null;
            }
        }
        final int size = this.d.size();
        int max2 = 0;
        if (size > 0) {
            max2 = Math.max(max, this.a("", textPaint).getHeight());
        }
        return max2;
    }
    
    private void c(final TweetActionType tweetActionType, final Tweet tweet) {
        if (this.cG == 1) {
            final Resources resources = this.getContext().getResources();
            switch (com.twitter.library.widget.aw.a[tweetActionType.ordinal()]) {
                default: {}
                case 1: {
                    if (tweet.p > 0) {
                        this.bM = com.twitter.library.util.aj.b(resources, tweet.p);
                        return;
                    }
                    if (tweet.p == 0) {
                        this.bM = null;
                        return;
                    }
                    break;
                }
                case 2: {
                    if (tweet.t > 0) {
                        this.bN = com.twitter.library.util.aj.b(resources, tweet.t);
                        return;
                    }
                    if (tweet.t == 0) {
                        this.bN = null;
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    private boolean c(final Tweet tweet) {
        return this.a(tweet) || this.b(tweet);
    }
    
    private int[] c(final TweetActionType tweetActionType) {
        switch (com.twitter.library.widget.aw.a[tweetActionType.ordinal()]) {
            default: {
                return TweetView$InlineAction.p;
            }
            case 2: {
                return TweetView$InlineAction.i;
            }
            case 1: {
                return TweetView$InlineAction.j;
            }
            case 4: {
                return TweetView$InlineAction.k;
            }
            case 3: {
                return TweetView$InlineAction.n;
            }
            case 5: {
                return TweetView$InlineAction.l;
            }
            case 6: {
                return TweetView$InlineAction.m;
            }
            case 7: {
                return TweetView$InlineAction.o;
            }
        }
    }
    
    private boolean d(final Tweet tweet) {
        return tweet != null && tweet.ae();
    }
    
    private boolean e(final Tweet tweet) {
        return com.twitter.library.featureswitch.d.f("animated_content_media_forward_enabled") && tweet.L();
    }
    
    private static boolean f(final Tweet tweet) {
        return tweet != null && tweet.s() && (22 == tweet.m || 35 == tweet.m || 36 == tweet.m || 37 == tweet.m || 28 == tweet.m);
    }
    
    private void g(final Tweet tweet) {
        boolean b = false;
        for (final TweetActionType tweetActionType : this.getInlineActionTypes()) {
            if (this.a(tweetActionType, tweet) != this.d.containsKey(tweetActionType)) {
                this.d.clear();
                break;
            }
        }
        for (final TweetActionType tweetActionType2 : this.getInlineActionTypes()) {
            if (this.a(tweetActionType2, tweet)) {
                this.b(tweetActionType2, this.b(tweetActionType2, tweet));
                this.c(tweetActionType2, tweet);
                b = true;
            }
        }
        if (b) {
            this.refreshDrawableState();
            this.invalidate();
        }
    }
    
    private View getForwardMediaView() {
        if (this.cI != null) {
            return this.cI.z();
        }
        return null;
    }
    
    private TweetActionType[] getInlineActionTypes() {
        if (this.bF || a.a()) {
            return TweetView.r;
        }
        return TweetView.q;
    }
    
    private TwitterUser getOwner() {
        return com.twitter.library.client.az.a(this.getContext()).b().f();
    }
    
    private long getOwnerId() {
        final TwitterUser owner = this.getOwner();
        if (owner != null) {
            return owner.userId;
        }
        return 0L;
    }
    
    public static void setAnimationTestHooks(final Animator$AnimatorListener s) {
        TweetView.s = s;
    }
    
    private void setIsPreview(final boolean b) {
        if (b) {
            this.setAlpha(0.4f);
            this.setLayerType(2, (Paint)null);
            return;
        }
        this.setAlpha(1.0f);
        this.setLayerType(0, (Paint)null);
    }
    
    private boolean u() {
        return this.aY != null && this.aY.C();
    }
    
    private void v() {
        final int[] drawableState = this.getDrawableState();
        if (this.u != null) {
            this.bB = this.u.getColorForState(drawableState, 0);
        }
        if (this.v != null) {
            this.bq = this.v.getColorForState(drawableState, 0);
        }
        if (this.w != null) {
            this.bp = this.w.getColorForState(drawableState, 0);
        }
        if (this.aO != null) {
            this.cC = this.aO.getColorForState(drawableState, 0);
        }
        if (this.x != null) {
            this.br = this.x.getColorForState(drawableState, 0);
        }
        if (this.y != null) {
            this.bs = this.y.getColorForState(drawableState, 0);
        }
        if (this.z != null) {
            this.bt = this.z.getColorForState(drawableState, 0);
        }
    }
    
    private boolean w() {
        return !this.cn && !this.aY.t();
    }
    
    private boolean x() {
        return com.twitter.library.featureswitch.d.a("buy_now_android_fullbleed_card_2982", new String[] { "full_bleed_enabled" });
    }
    
    private boolean y() {
        return com.twitter.library.featureswitch.d.a("offers_android_fullbleed_card_2954", new String[] { "full_bleed_enabled" });
    }
    
    private boolean z() {
        return this.cu == 5 || this.h() || this.aU.getVisibility() == 0;
    }
    
    void a(final int n) {
        if (this.c != null) {
            this.c.a(this.aY, this, n);
        }
    }
    
    void a(final int bc, final int n) {
        this.aX.measure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), 0);
        this.bc = bc;
    }
    
    @Override
    public void a(final int n, final String s, final boolean alignEnd) {
        this.aX.a(n, s);
        this.aX.setAlignEnd(alignEnd);
    }
    
    protected void a(final Canvas canvas) {
        if (!this.h.isEmpty()) {
            final TextPaint p = TweetView.p;
            final int color = ((Paint)p).getColor();
            canvas.save();
            ((Paint)p).setColor(this.B);
            canvas.drawRect(this.h, (Paint)p);
            canvas.restore();
            ((Paint)p).setColor(color);
        }
    }
    
    void a(final MediaEntity mediaEntity) {
        if (this.c != null) {
            if (mediaEntity.type != MediaEntity$Type.d) {
                this.c.a(this.aY, mediaEntity, this);
                return;
            }
            this.c.b(this.aY, this);
        }
    }
    
    public void a(final Prompt bj, final int bk) {
        if (TextUtils.isEmpty((CharSequence)bj.a)) {
            this.setShowActionPrompt(false);
            return;
        }
        this.bJ = bj;
        this.bL = bj.i();
        this.bK = bk;
        this.bI = bj.a;
        this.setShowActionPrompt(true);
    }
    
    void a(final EditableMedia editableMedia) {
        if (this.c != null) {
            this.c.a(this.aY, editableMedia, this);
        }
    }
    
    void a(final Tweet tweet, final UrlEntity urlEntity) {
        if (this.c != null) {
            this.c.a(tweet, urlEntity);
        }
    }
    
    public void a(final Tweet tweet, final boolean b, final g g) {
        this.a(tweet, b, g, true);
    }
    
    public void a(final Tweet ay, final boolean b, final g g, final boolean b2) {
        final Context context = this.getContext();
        g.a(0, this.cV);
        g.a(1, this.aE);
        g.a(2, this);
        g.a(4, new com.twitter.library.widget.az(this));
        final boolean isPreview = ay.K != null;
        boolean b3 = false;
        Label_0218: {
            if (this.d != null && !isPreview) {
                while (true) {
                    for (final TweetView$InlineAction tweetView$InlineAction : this.d.values()) {
                        if (this.b(tweetView$InlineAction.f, ay) != tweetView$InlineAction.e) {
                            b3 = true;
                            final boolean a = this.a(TweetActionType.e, ay);
                            final boolean containsKey = this.d.containsKey(TweetActionType.e);
                            final boolean a2 = this.a(TweetActionType.j, ay);
                            final boolean containsKey2 = this.d.containsKey(TweetActionType.j);
                            final boolean a3 = this.a(TweetActionType.k, ay);
                            final boolean containsKey3 = this.d.containsKey(TweetActionType.k);
                            if (a != containsKey || a2 != containsKey2 || a3 != containsKey3) {
                                b3 = true;
                            }
                            break Label_0218;
                        }
                    }
                    b3 = isPreview;
                    continue;
                }
            }
            b3 = isPreview;
        }
        this.cF = b;
        if (!ay.a(this.aY) || b3) {
            final long bd = this.bD;
            final Tweet ay2 = this.aY;
            this.bv = null;
            this.bb = null;
            this.bw = null;
            this.bf = null;
            this.cD = null;
            this.aY = ay;
            this.bD = 0L;
            this.bh = null;
            this.cu = 0;
            this.ck = true;
            this.d.clear();
            this.bM = null;
            this.bN = null;
            this.bO = null;
            this.be = null;
            this.h.setEmpty();
            this.e.setEmpty();
            this.cO = 0;
            this.cL = 0;
            this.cs = 0;
            this.ct = 0;
            this.cb = false;
            this.cc = false;
            this.cd = false;
            this.aV.a(null, 0);
            this.d();
            final Resources resources = context.getResources();
            final long ownerId = this.getOwnerId();
            if (this.c(this.aY) || this.u()) {
                this.bV = this.O;
                this.bW = this.P;
            }
            else {
                this.bV = this.M;
                this.bW = this.N;
            }
            final TweetClassicCard s = ay.S();
            final boolean d = this.D();
            int n;
            if (this.getOwnerId() == ay.C) {
                n = 1;
            }
            else {
                n = 0;
            }
            final boolean b4 = this.aN && (d || this.ch || this.cg || ay.n()) && (!ay.x() || (this.cB && n == 0)) && !this.d(ay);
            final boolean a4 = b.a();
            final CardInstanceData w = ay.W();
            final boolean b5 = w != null && g.b() && !ay.F() && !ay.L() && !ay.I() && !ay.e();
            final f a5 = g.a();
            if (a5 != null) {
                this.a(ay, isPreview, s, d, b4, b5);
            }
            this.cS = b.f();
            this.cT = b.a(this.aY);
            this.cU = b.a(this.getContext());
            this.f.setSize(b.c());
            this.f.setFromMemoryOnly(b);
            this.f.a(ay.B, ay.C, false);
            if (b2) {
                this.setIsPreview(isPreview);
            }
            if (ay.O()) {
                this.aU.setDisplaySensitiveMedia(this.cB);
                this.aU.setAlwaysExpandMedia(this.ch);
                this.aU.a(ay.I, b);
                this.aU.setVisibility(0);
            }
            else {
                this.aU.a(true);
                this.aU.setVisibility(8);
            }
            final i b6 = this.b(ay, d);
            final String a6 = b6.a;
            final Entity[] af = ay.af;
            Object bv = null;
            if (af != null) {
                final int length = ay.af.length;
                bv = null;
                if (length > 0) {
                    bv = new SpannableString((CharSequence)a6);
                    final int length2 = ((SpannableString)bv).length();
                    for (final Entity entity : ay.af) {
                        if (entity.start >= 0 && entity.end <= length2) {
                            ((SpannableString)bv).setSpan((Object)new TypefacesSpan(context, 1), entity.start, entity.end, 33);
                        }
                    }
                }
            }
            if (this.cX && b6.b.b()) {
                SpannableString spannableString;
                if (bv == null) {
                    spannableString = new SpannableString((CharSequence)a6);
                }
                else {
                    spannableString = (SpannableString)bv;
                }
                final int length4 = spannableString.length();
                for (final UrlEntity urlEntity : b6.b.c()) {
                    final int displayStart = urlEntity.displayStart;
                    final int displayEnd = urlEntity.displayEnd;
                    if (displayStart >= 0 && displayEnd > displayStart && displayEnd <= length4) {
                        spannableString.setSpan((Object)new ba(this, this.aj, ay, urlEntity), displayStart, displayEnd, 33);
                    }
                }
                bv = spannableString;
            }
            if (com.twitter.library.view.e.a() && ay.j()) {
                final Tweet ay3 = this.aY;
                if (bv == null) {
                    bv = a6;
                }
                this.bv = com.twitter.library.view.e.a(context, ay3, (CharSequence)bv, this.cX);
            }
            else {
                if (bv == null) {
                    bv = a6;
                }
                this.bv = (CharSequence)bv;
            }
            if (this.bv != null) {
                final TextPaint p4 = TweetView.p;
                ((Paint)p4).setTextSize(this.bx);
                ((Paint)p4).setTypeface(this.aP.a);
                this.bv = com.twitter.library.util.t.a(this.getContext()).a((View)this, this.bv, ((Paint)p4).getFontMetrics());
            }
            final StringBuilder contentDescription = new StringBuilder();
            if (!TextUtils.isEmpty((CharSequence)ay.a())) {
                contentDescription.append(ay.a()).append(' ');
            }
            if (!TextUtils.isEmpty((CharSequence)ay.F)) {
                contentDescription.append("@").append(ay.F).append(' ');
            }
            contentDescription.append(a6);
            this.setContentDescription((CharSequence)contentDescription);
            this.cZ.a(ay, resources);
            final boolean h = ay.h;
            if (!TextUtils.isEmpty((CharSequence)this.cz) && this.cA != 0) {
                this.aV.a(this.cz, this.cA);
            }
            else if (ay.p()) {
                if ((ownerId != ay.f || this.ce) && ay.g) {
                    this.a(13, ay.b(), 0, 0, null, 0, this.cG, this.aY.A);
                }
            }
            else if (ay.m() || ay.o()) {
                if (ay.j != null) {
                    final String socialContext = ay.j.socialContext;
                    if (socialContext != null) {
                        int n2;
                        if (!ay.o() && ay.j.d()) {
                            n2 = 38;
                        }
                        else {
                            n2 = 3;
                        }
                        this.a(n2, socialContext, 0, 0, null, 0, this.cG, this.aY.A);
                    }
                }
            }
            else if (!ay.z() || h) {
                if (this.b(ay)) {
                    if (ay.n != null) {
                        this.a(ay.m, ay.n, 0, 0, ay.ak, ay.ai, this.cG, this.aY.A);
                    }
                    else {
                        this.a(29, null, 0, 0, null, 0, this.cG, this.aY.A);
                    }
                }
                else if (this.u()) {
                    if (ay.n != null) {
                        this.a(35, ay.n, 0, 0, null, 0, this.cG, this.aY.A);
                    }
                    else {
                        this.a(29, null, 0, 0, null, 0, this.cG, this.aY.A);
                    }
                }
                else if (f(ay)) {
                    this.a(ay.m, ay.n, 0, 0, null, 0, this.cG, this.aY.A);
                }
                else if (ay.U && ay.m != 23) {
                    this.a(22, null, 0, 0, null, 0, this.cG, this.aY.A);
                }
                else if (ay.am) {
                    this.a(20, null, 0, 0, null, 0, this.cG, this.aY.A);
                }
                else if ((ownerId != ay.f || this.ce) && ay.g) {
                    this.a(13, ay.b(), 0, 0, null, 0, this.cG, this.aY.A);
                }
                else if (ownerId == ay.f && ay.l() && ay.n != null) {
                    this.a(24, ay.n, 0, 0, null, 0, this.cG, this.aY.A);
                }
                else if (this.aV.a() && ay.m > 0) {
                    this.a(ay.m, ay.n, ay.ah, ay.aj, ay.ak, ay.ai, this.cG, this.aY.A);
                }
                else if (this.cy > 0) {
                    int n3 = 0;
                    switch (this.cy) {
                        default: {
                            n3 = -1;
                            break;
                        }
                        case 18: {
                            n3 = 30;
                            break;
                        }
                        case 19: {
                            n3 = 31;
                            break;
                        }
                        case 20: {
                            n3 = 32;
                            break;
                        }
                    }
                    if (n3 != -1) {
                        this.a(n3, this.cx, 0, 0, null, this.cw, this.cG, this.aY.A);
                    }
                }
            }
            this.g(ay);
            final boolean v = this.aY.V();
            int n4 = 0;
            if (v) {
                boolean b7;
                if (this.cu == 0) {
                    b7 = true;
                }
                else {
                    b7 = false;
                }
                if (b7 && ay.d()) {
                    n4 = this.Q;
                }
                else if (b7 && ay.e()) {
                    n4 = this.R;
                }
                else if (b7 && ay.g()) {
                    n4 = this.S;
                }
                else {
                    n4 = 0;
                    if (b7) {
                        final boolean h2 = ay.h();
                        n4 = 0;
                        if (h2) {
                            n4 = this.S;
                        }
                    }
                }
            }
            this.aW.a(ay.a(), ay.F, com.twitter.library.util.bk.a(resources, ay.A), n4, com.twitter.library.view.aa.a(ay, this, this.U, this.T));
            this.aW.setShowTimestamp(this.w());
            com.twitter.library.view.aa.a(ay, this, this.aW);
            this.aW.a(this.b());
            if (a4) {
                if (this.cW == null) {
                    this.cW = (View$OnClickListener)new bb(this);
                }
                this.aW.setOnAuthorClick(this.cW);
            }
            else {
                this.aW.setOnAuthorClick(null);
            }
            this.aG.clear();
            final Iterator<TweetView$InlineAction> iterator3 = this.d.values().iterator();
            while (iterator3.hasNext()) {
                this.aG.add(iterator3.next().a);
            }
            if (this.bE) {
                this.bD |= 0x4L;
            }
            else {
                this.bD &= 0xFFFFFFFFFFFFFFFBL;
            }
            if (bd != 0L || this.bD != 0L) {
                this.refreshDrawableState();
            }
            if (this.a(ay2, b4)) {
                this.I();
            }
            if ((this.cu == 5 && !this.a(ay2, this.aY)) || ((isPreview || this.B()) && b4 && !b(ay2, this.aY))) {
                this.cK = true;
                this.cI = a5;
                this.G();
                if (!this.cF) {
                    this.H();
                }
            }
            this.bw = this.a(context, com.twitter.library.media.util.q.a(ay, b.h()));
            this.cr = this.a(w);
            final String socialProofString = this.aV.getSocialProofString();
            final String b8 = com.twitter.library.util.bk.b(resources, ay.A);
            String lowerCase;
            if (b8 == null) {
                lowerCase = "";
            }
            else {
                lowerCase = b8.toLowerCase();
            }
            this.setContentDescription((CharSequence)this.getResources().getString(lg.timeline_tweet_format, new Object[] { this.aY.M + " @" + this.aY.F, a6, lowerCase, socialProofString }));
            if (b2) {
                this.requestLayout();
                this.invalidate();
            }
            return;
        }
        this.f.a(ay.B, ay.C, false);
        this.e();
    }
    
    void a(final TweetActionType tweetActionType) {
        if (this.c != null) {
            this.c.a(tweetActionType, this);
        }
    }
    
    @Override
    public void a(final boolean b) {
        if (!this.cf) {
            return;
        }
        final TweetActionType e = TweetActionType.e;
        TweetView$InlineAction$State tweetView$InlineAction$State;
        if (b) {
            tweetView$InlineAction$State = TweetView$InlineAction$State.a;
        }
        else {
            tweetView$InlineAction$State = TweetView$InlineAction$State.b;
        }
        this.b(e, tweetView$InlineAction$State);
    }
    
    public void a(final boolean cb, final boolean cd) {
        this.cb = cb;
        this.cd = cd;
    }
    
    public boolean a() {
        return this.cm;
    }
    
    @Override
    protected boolean a(final MotionEvent motionEvent) {
        return this.cD != null && this.cD.a(motionEvent);
    }
    
    protected boolean a(final Tweet tweet, final Tweet tweet2) {
        if (tweet != null && tweet.E == tweet2.E) {
            final CardInstanceData w = tweet.W();
            final CardInstanceData w2 = tweet2.W();
            if (w == null && w2 == null) {
                return true;
            }
            if (w != null && w2 != null) {
                return TextUtils.equals((CharSequence)w.forwardCardTypeURL, (CharSequence)w2.forwardCardTypeURL);
            }
        }
        return false;
    }
    
    public void b(final int n) {
        if (this.bJ != null) {
            this.bJ.j();
            this.bJ = null;
            this.a(n);
        }
        this.C();
        this.requestLayout();
    }
    
    void b(final TweetActionType tweetActionType) {
        if (this.c != null) {
            this.c.b(tweetActionType, this);
        }
    }
    
    @Override
    public void b(final boolean b) {
        if (!this.cf) {
            return;
        }
        if (b) {
            this.aY.e = true;
            final Tweet ay = this.aY;
            ++ay.t;
        }
        else {
            this.aY.e = false;
            this.aY.t = Math.max(-1 + this.aY.t, 0);
        }
        this.b(TweetActionType.b, this.b(TweetActionType.b, this.aY));
        this.c(TweetActionType.b, this.aY);
        this.requestLayout();
    }
    
    public boolean b() {
        return (this.aX.getVisibility() != 0 || this.bd != 2) && this.cS;
    }
    
    @Override
    public void c(final boolean b) {
        int n = 1;
        if (!this.cf) {
            return;
        }
        final Tweet ay = this.aY;
        boolean h;
        if (!b) {
            h = (n != 0);
        }
        else {
            h = false;
        }
        ay.h = h;
        final Tweet ay2 = this.aY;
        final int p = this.aY.p;
        if (b) {
            n = -1;
        }
        ay2.p = Math.max(n + p, 0);
        this.b(TweetActionType.c, this.b(TweetActionType.c, this.aY));
        this.c(TweetActionType.c, this.aY);
        this.requestLayout();
    }
    
    @Override
    protected boolean c() {
        return this.c != null && super.c();
    }
    
    @Override
    public void d(final boolean b) {
        final BadgeView ax = this.aX;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ax.setVisibility(visibility);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.v();
        final int[] drawableState = this.getDrawableState();
        for (final Drawable drawable : this.aG) {
            if (drawable != null && drawable.isStateful()) {
                drawable.setState(drawableState);
            }
        }
    }
    
    @Override
    public void e() {
        this.f.e();
        this.aU.e();
    }
    
    public void e(final boolean b) {
        this.cn = (b && this.aT != null);
        if (this.cn) {
            if (this.co == null) {
                (this.co = new ap(this, 262144L, 131072L, new bj(this), TweetView.m)).a(new Rect());
            }
            this.a(this.co);
        }
        else if (this.co != null) {
            this.b(this.co);
        }
        this.aW.setShowTimestamp(this.w());
    }
    
    @Override
    public void f() {
        this.f.f();
        this.aU.f();
    }
    
    void f(final boolean b) {
        final Tweet ay = this.aY;
        if (ay != null && this.c != null) {
            this.c.a(ay.D, ay.C, ay.F, ay.j, this, b);
        }
    }
    
    void g() {
        final ap ap = new ap(this, 65536L, 32768L, new bc(this), TweetView.l);
        ap.a(this.bC);
        this.a(ap);
    }
    
    public Prompt getActionPrompt() {
        return this.bJ;
    }
    
    public TwitterButton getActionPromptButton() {
        return this.cP;
    }
    
    public boolean getActionPromptVisibility() {
        return this.A();
    }
    
    public CharSequence getContent() {
        return this.bv;
    }
    
    public com.twitter.library.widget.tweet.content.d getContentContainer() {
        if (this.cI != null && this.cI.a() != null) {
            return this.cI.a();
        }
        return com.twitter.library.widget.tweet.content.d.G;
    }
    
    String getFavoriteLabel() {
        return this.bN;
    }
    
    public FriendshipCache getFriendshipCache() {
        return this.aZ;
    }
    
    public boolean getPreviewEnabled() {
        return this.aN;
    }
    
    public String getReason() {
        return this.cz;
    }
    
    public int getReasonIconResId() {
        return this.cA;
    }
    
    String getRetweetLabel() {
        return this.bM;
    }
    
    public TwitterScribeItem getScribeItem() {
        return this.cE;
    }
    
    public int getSocialContextCount() {
        return this.cw;
    }
    
    public String getSocialContextName() {
        return this.cx;
    }
    
    public int getSocialContextType() {
        return this.cy;
    }
    
    public Tweet getTweet() {
        return this.aY;
    }
    
    public f getTweetContentHost() {
        com.twitter.util.d.d();
        return this.cI;
    }
    
    public long getUserId() {
        if (this.aY != null) {
            return this.aY.C;
        }
        return 0L;
    }
    
    public boolean h() {
        return this.cu == 1 || this.cu == 3;
    }
    
    void i() {
        if (this.c != null) {
            final TweetClassicCard s = this.aY.S();
            if (s != null) {
                this.c.a(this.aY, s, this);
            }
        }
    }
    
    void j() {
        if (this.c != null) {
            final Tweet ay = this.aY;
            final MediaEntity q = ay.Q();
            if (q != null) {
                this.c.a(ay, q.id, this);
            }
        }
    }
    
    void k() {
        if (this.c != null) {
            final UrlEntity urlEntity = (UrlEntity)CollectionUtils.b(this.aY.G.c());
            if (urlEntity != null) {
                this.c.b(this.aY, urlEntity);
            }
        }
    }
    
    void l() {
        if (this.c != null) {
            this.c.a(this.aY, this);
        }
    }
    
    void m() {
        if (this.c != null) {
            this.c.c(this.aY, this);
        }
    }
    
    boolean n() {
        return this.c != null && this.c.b(this.aY);
    }
    
    public void o() {
        this.g(this.aY);
    }
    
    @Override
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.bE) {
            mergeDrawableStates(onCreateDrawableState, TweetView.a);
        }
        return onCreateDrawableState;
    }
    
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I();
        this.aU.a();
        this.f();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.aY != null) {
            final TextPaint p = TweetView.p;
            final int color = p.getColor();
            final int width = this.getWidth();
            final int scrollX = this.getScrollX();
            int n = this.getPaddingTop() + this.getScrollY();
            int n2 = scrollX + this.getPaddingLeft();
            int n3 = width + scrollX - this.getPaddingRight();
            final UserImageView f = this.f;
            final int bb = this.bB;
            final int bq = this.bq;
            if (this.h() && this.bO != null) {
                this.a(canvas, this.bs, p);
            }
            while (true) {
                int intrinsicWidth;
                int n4 = 0;
                float bx;
                int n5;
                int n6;
                int n7 = 0;
                int n8;
                int n9;
                int n10;
                int paddingLeft;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                int n16;
                int cq;
                int n17;
                int n18;
                int measuredHeight = 0;
                ImageView imageView;
                Label_1078_Outer:Label_1105_Outer:Label_1118_Outer:Label_1128_Outer:
                while (true) {
                    Label_0436: {
                        while (true) {
                            Label_0423: {
                                while (true) {
                                    Label_0396: {
                                        while (true) {
                                            Label_0370: {
                                                Label_0358: {
                                                    while (true) {
                                                        Label_0157: {
                                                            if (!this.cn) {
                                                                break Label_0157;
                                                            }
                                                            canvas.save();
                                                            intrinsicWidth = this.aT.getIntrinsicWidth();
                                                            Label_0145: {
                                                                if (this.cv) {
                                                                    canvas.translate((float)n2, (float)n);
                                                                    break Label_0145;
                                                                }
                                                                Label_1062: {
                                                                    break Label_1062;
                                                                Label_0764_Outer:
                                                                    while (true) {
                                                                        this.e.set(n2, n4, n2 + this.bb.getWidth(), n4 + this.bb.getHeight());
                                                                        canvas.save();
                                                                        canvas.translate((float)n2, (float)n4);
                                                                        p.setTypeface(this.aP.a);
                                                                        p.setTextSize(bx);
                                                                        p.setColor(bb);
                                                                        p.linkColor = this.cC;
                                                                        while (true) {
                                                                            Label_1300: {
                                                                                while (true) {
                                                                                Label_1293:
                                                                                    while (true) {
                                                                                        try {
                                                                                            this.bb.draw(canvas);
                                                                                            canvas.restore();
                                                                                            n4 += this.bb.getHeight();
                                                                                            if (this.bf != null) {
                                                                                                n5 = n4 + this.af;
                                                                                                canvas.save();
                                                                                                canvas.translate((float)n2, (float)n5);
                                                                                                p.setTextSize(this.aI);
                                                                                                p.setColor(this.bt);
                                                                                                this.bf.draw(canvas);
                                                                                                canvas.restore();
                                                                                                n4 = n5 + (this.bf.getHeight() + this.ag);
                                                                                            }
                                                                                            p.setTypeface(this.aP.a);
                                                                                            p.setTextSize(this.bu);
                                                                                            p.setColor(this.bq);
                                                                                            if (this.cu == 5 && !this.s()) {
                                                                                                this.a(canvas);
                                                                                            }
                                                                                            this.a(canvas, (Paint)p);
                                                                                            p.setColor(color);
                                                                                            if (!this.cT) {
                                                                                                n4 += this.cL;
                                                                                            }
                                                                                            if (this.aU.getVisibility() != 0) {
                                                                                                break Label_1300;
                                                                                            }
                                                                                            n6 = n4 + (this.aU.getMeasuredHeight() + this.ad);
                                                                                            if (this.b(this.aY) || (n7 != 0 && this.bd == 0)) {
                                                                                                if (this.c(this.aY) && this.ba != null) {
                                                                                                    n8 = n6 + this.aa;
                                                                                                    if (!this.z()) {
                                                                                                        break Label_1293;
                                                                                                    }
                                                                                                    n9 = n8 + this.aa;
                                                                                                    canvas.save();
                                                                                                    p.setColor(this.br);
                                                                                                    if (this.cv) {
                                                                                                        n10 = n3 - this.ba.getWidth();
                                                                                                        paddingLeft = this.getPaddingLeft();
                                                                                                        n11 = n10;
                                                                                                        n12 = n3;
                                                                                                        n13 = paddingLeft;
                                                                                                    }
                                                                                                    else {
                                                                                                        n14 = this.getPaddingLeft() + f.getWidth();
                                                                                                        n15 = this.getWidth() - this.getPaddingRight();
                                                                                                        n11 = n14;
                                                                                                        n13 = n14;
                                                                                                        n12 = n15;
                                                                                                    }
                                                                                                    canvas.drawLine((float)n13, (float)n9, (float)n12, (float)n9, (Paint)p);
                                                                                                    canvas.restore();
                                                                                                    n16 = n9 + this.ac;
                                                                                                    canvas.save();
                                                                                                    canvas.translate((float)n11, (float)n16);
                                                                                                    p.setTextSize(bx);
                                                                                                    p.setTypeface(this.aP.c);
                                                                                                    p.setColor(bb);
                                                                                                    this.ba.draw(canvas);
                                                                                                    canvas.restore();
                                                                                                    n6 += this.ab;
                                                                                                }
                                                                                                n6 += this.aX.getMeasuredHeight() + this.aa;
                                                                                            }
                                                                                            for (final TweetView$InlineAction tweetView$InlineAction : this.d.values()) {
                                                                                                if (tweetView$InlineAction.f == TweetActionType.b && tweetView$InlineAction.e == TweetView$InlineAction$State.a) {
                                                                                                    p.setColor(this.aq);
                                                                                                }
                                                                                                else if (tweetView$InlineAction.f == TweetActionType.c && tweetView$InlineAction.e == TweetView$InlineAction$State.a) {
                                                                                                    p.setColor(this.ar);
                                                                                                }
                                                                                                else {
                                                                                                    p.setColor(this.bq);
                                                                                                }
                                                                                                tweetView$InlineAction.a(canvas);
                                                                                            }
                                                                                            if (this.d.size() > 0) {
                                                                                                if (n7 != 0) {
                                                                                                    cq = this.cq;
                                                                                                }
                                                                                                else {
                                                                                                    cq = this.cq + this.ak;
                                                                                                }
                                                                                                n6 += cq;
                                                                                            }
                                                                                            if (n7 != 0 && this.bd == 1) {
                                                                                                n17 = n6 + (this.aX.getMeasuredHeight() + this.aa);
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                            canvas.translate((float)n18, (float)(f.getBottom() + this.W - f.getPaddingBottom()));
                                                                                            break Label_0358;
                                                                                            n2 += f.getWidth();
                                                                                            break Label_0396;
                                                                                            canvas.translate((float)(n3 - intrinsicWidth), (float)n);
                                                                                            break;
                                                                                            n4 = n + measuredHeight;
                                                                                            break Label_0423;
                                                                                            n7 = 0;
                                                                                            break Label_0436;
                                                                                        }
                                                                                        catch (Exception ex) {
                                                                                            continue Label_0764_Outer;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    n9 = n8;
                                                                                    continue Label_1078_Outer;
                                                                                }
                                                                            }
                                                                            n6 = n4;
                                                                            continue Label_1078_Outer;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            this.aT.draw(canvas);
                                                            canvas.restore();
                                                        }
                                                        if (this.aV.getVisibility() == 0) {
                                                            n += this.aV.getHeight();
                                                        }
                                                        bx = this.bx;
                                                        imageView = f.getImageView();
                                                        n18 = f.getLeft() + ((View)imageView).getLeft() + (((View)imageView).getWidth() - this.V) / 2;
                                                        if (this.aK != null && this.cb) {
                                                            canvas.save();
                                                            canvas.translate((float)n18, 0.0f);
                                                            this.aK.draw(canvas);
                                                            canvas.restore();
                                                        }
                                                        if (this.aL != null && this.cc) {
                                                            canvas.save();
                                                            canvas.translate((float)n18, (float)(f.getBottom() + this.W - f.getPaddingBottom()));
                                                            this.aL.draw(canvas);
                                                            canvas.restore();
                                                        }
                                                        if (this.aM == null || !this.cd) {
                                                            break Label_0370;
                                                        }
                                                        canvas.save();
                                                        if (!this.cc) {
                                                            continue Label_1105_Outer;
                                                        }
                                                        break;
                                                    }
                                                    canvas.translate((float)n18, (float)(this.h.bottom + this.W));
                                                }
                                                this.aM.draw(canvas);
                                                canvas.restore();
                                            }
                                            measuredHeight = this.aW.getMeasuredHeight();
                                            if (!this.cv) {
                                                continue Label_1118_Outer;
                                            }
                                            break;
                                        }
                                        n3 -= f.getWidth();
                                    }
                                    if (!this.b()) {
                                        continue Label_1128_Outer;
                                    }
                                    break;
                                }
                                n4 = n + (Math.max(f.getMeasuredHeight(), measuredHeight) + this.aQ);
                            }
                            if (this.aX.getVisibility() != 0) {
                                continue;
                            }
                            break;
                        }
                        n7 = 1;
                    }
                    if (n7 != 0 && this.bd == 2) {
                        n4 += this.aX.getMeasuredHeight();
                    }
                    if (this.cT) {
                        n4 += this.cL;
                    }
                    if (this.bb != null) {
                        continue Label_1078_Outer;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int paddingLeft;
        if (this.cv) {
            paddingLeft = this.getWidth() - (this.getPaddingRight() + this.f.getWidth());
        }
        else {
            paddingLeft = this.getPaddingLeft();
        }
        this.f.layout(paddingLeft, this.cO, paddingLeft + this.f.getMeasuredWidth(), this.cO + this.f.getMeasuredHeight());
        final View forwardMediaView = this.getForwardMediaView();
        if (forwardMediaView != null && !this.h.isEmpty()) {
            forwardMediaView.layout(this.h.left, this.h.top, this.h.right, this.h.bottom);
        }
        if (this.aU.getVisibility() == 0) {
            this.aU.layout(this.cM.left, this.cM.top, this.cM.right, this.cM.bottom);
        }
        if (this.aV.getVisibility() == 0) {
            final int badgeWidth = this.aV.getBadgeWidth();
            int n6;
            if (this.cv) {
                int n5 = 0;
                if (badgeWidth > 0) {
                    n5 = badgeWidth + this.f.getPaddingLeft();
                }
                n6 = paddingLeft + n5 - this.aV.getMeasuredWidth();
            }
            else {
                final int right = this.f.getRight();
                int n7 = 0;
                if (badgeWidth > 0) {
                    n7 = badgeWidth + this.f.getPaddingRight();
                }
                n6 = right - n7;
            }
            this.aV.layout(n6, this.ct, n6 + this.aV.getMeasuredWidth(), this.ct + this.aV.getMeasuredHeight());
        }
        int n8;
        if (this.cv) {
            if (this.cn) {
                n8 = this.getPaddingLeft() + this.aT.getIntrinsicWidth() + this.D;
            }
            else {
                n8 = this.getPaddingLeft();
            }
        }
        else {
            n8 = this.f.getRight();
        }
        this.aW.layout(n8, this.cs, n8 + this.aW.getMeasuredWidth(), this.cs + this.aW.getMeasuredHeight());
        if (this.aX.getVisibility() == 0) {
            final int measuredWidth = this.aX.getMeasuredWidth();
            int n9;
            if (this.cv) {
                n9 = this.getWidth() - this.getPaddingRight() - this.f.getWidth() - measuredWidth;
            }
            else {
                n9 = this.getPaddingLeft() + this.f.getWidth();
            }
            if (this.bd != 2) {
                this.bc += this.aa;
            }
            this.aX.layout(n9, this.bc, measuredWidth + n9, this.bc + this.aX.getMeasuredHeight());
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final Tweet ay = this.aY;
        if (ay == null) {
            super.onMeasure(n, n2);
            return;
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3;
        if (mode == 1073741824) {
            n3 = size;
        }
        else if (mode == Integer.MIN_VALUE) {
            n3 = Math.min(this.getSuggestedMinimumWidth(), size);
        }
        else {
            n3 = this.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        final ViewGroup$LayoutParams layoutParams = this.f.getLayoutParams();
        this.f.measure(View$MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        final TextPaint p2 = TweetView.p;
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n4 = n3 - paddingLeft - paddingRight;
        final int measuredWidth = this.f.getMeasuredWidth();
        final int measuredHeight = this.f.getMeasuredHeight();
        final int max = Math.max(n4 - measuredWidth, 0);
        final LinkedHashMap d = this.d;
        p2.setTextSize(this.bu);
        p2.setTypeface(this.aP.a);
        this.a(p2, max);
        this.cq = this.c(p2, max);
        int ba;
        if (this.cv) {
            ba = n3 - paddingRight - measuredWidth;
        }
        else {
            ba = paddingLeft + measuredWidth;
        }
        if (this.cn) {
            final int intrinsicWidth = this.aT.getIntrinsicWidth();
            final int intrinsicHeight = this.aT.getIntrinsicHeight();
            this.aT.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (this.cv) {
                this.co.a().set(0, 0, intrinsicWidth + paddingLeft * 2, intrinsicHeight + paddingTop * 2);
            }
            else {
                this.co.a().set(n3 - paddingRight * 2 - intrinsicWidth, 0, n3, intrinsicHeight + paddingTop * 2);
            }
        }
        if (this.bb == null && !TextUtils.isEmpty(this.bv)) {
            p2.setTextSize(this.bx);
            p2.setTypeface(this.aP.a);
            final CharSequence bv = this.bv;
            Layout$Alignment layout$Alignment;
            if (com.twitter.library.util.aj.a && ay.k()) {
                layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
            else {
                layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
            }
            this.bb = new StaticLayout(bv, p2, max, layout$Alignment, this.A, (float)this.C, false);
            if (this.bv instanceof Spanned) {
                this.cD = new u((View)this, (Layout)this.bb);
            }
        }
        if (this.bf == null && !this.bG && !TextUtils.isEmpty(this.bw)) {
            p2.setTextSize(this.aI);
            p2.setTypeface(this.aP.a);
            final CharSequence bw = this.bw;
            final int length = this.bw.length();
            Layout$Alignment layout$Alignment2;
            if (com.twitter.library.util.aj.a && ay.k()) {
                layout$Alignment2 = Layout$Alignment.ALIGN_OPPOSITE;
            }
            else {
                layout$Alignment2 = Layout$Alignment.ALIGN_NORMAL;
            }
            this.bf = new StaticLayout(bw, 0, length, p2, max, layout$Alignment2, this.A, (float)this.C, false, TextUtils$TruncateAt.END, max);
        }
        int co;
        int n5;
        if (this.aV.getVisibility() == 0) {
            this.aV.measure(View$MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
            this.ct = paddingTop;
            co = paddingTop + this.aV.getMeasuredHeight();
            n5 = max;
        }
        else if (this.cn) {
            n5 = max - (this.aT.getIntrinsicWidth() + this.D);
            co = paddingTop;
        }
        else {
            n5 = max;
            co = paddingTop;
        }
        this.cO = co;
        final int n6 = measuredHeight + this.cO;
        this.aW.measure(View$MeasureSpec.makeMeasureSpec(n5, 1073741824), 0);
        this.cs = co + this.f.getPaddingTop();
        int n8;
        if (this.b()) {
            final int n7 = this.f.getMeasuredHeight() - (this.f.getPaddingTop() + this.f.getPaddingBottom());
            final int measuredHeight2 = this.aW.getMeasuredHeight();
            final int max2 = Math.max(0, (n7 - measuredHeight2) / 2);
            this.cs += max2;
            n8 = co + (Math.max(measuredHeight, max2 + measuredHeight2 + this.f.getPaddingTop()) + this.aQ);
        }
        else {
            n8 = co + this.aW.getMeasuredHeight();
        }
        boolean b;
        if (this.aX.getVisibility() == 0) {
            b = true;
        }
        else {
            b = false;
        }
        int n9;
        if (b && this.bd == 2) {
            this.a(n8, n5);
            n9 = n8 + (this.aX.getMeasuredHeight() + this.aa);
        }
        else {
            n9 = n8;
        }
        this.cL = 0;
        if (this.cT) {
            this.a(size, n3, p2, n4, max, ba, n9);
            if (this.h() && this.cU != 0 && this.b(n3, n4) && com.twitter.library.experiments.b.i()) {
                this.cU = 0;
                this.a(size, n3, p2, n4, max, ba, n9);
            }
            n9 += this.cL;
        }
        int n11;
        if (this.bb != null) {
            final int n10 = n9 + this.bb.getHeight();
            n11 = n9;
            n9 = n10;
        }
        else {
            n11 = 0;
        }
        if (this.cl == null) {
            this.cl = new Rect();
        }
        int n16;
        if (this.bf != null) {
            final int width = this.bf.getWidth();
            int n12;
            int n13;
            if (this.cv) {
                n12 = ba - width;
                n13 = ba;
            }
            else {
                n13 = width + ba;
                n12 = ba;
            }
            final int n14 = n9 + this.af;
            this.cl.set(n12, n14, n13, n14 + this.bf.getHeight());
            final int n15 = n9 + (this.af + this.cl.height() + this.ag);
            final View forwardMediaView = this.getForwardMediaView();
            if (this.cu == 1 && forwardMediaView.isClickable()) {
                final ap ap = new ap(this, 4194304L, 2097152L, new com.twitter.library.widget.bl(this), TweetView.j);
                ap.a(this.cl);
                this.a(ap);
            }
            n16 = n15;
        }
        else {
            this.cl.setEmpty();
            n16 = n9;
        }
        if (!this.cT) {
            this.b(n3, size, p2, max, ba, n16, n4);
            n16 += this.cL;
        }
        int n19;
        if (this.aU.getVisibility() == 0) {
            this.cM = new Rect();
            int n17;
            if (this.cv) {
                n17 = paddingLeft;
            }
            else {
                n17 = ba;
            }
            final int n18 = n16 + this.ad;
            this.aU.measure(View$MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
            this.cM.set(n17, n18, n17 + max, n18 + this.aU.getMeasuredHeight());
            n19 = n16 + (this.aU.getMeasuredHeight() + this.ad);
        }
        else {
            n19 = n16;
        }
        if (b && this.bd == 0) {
            this.a(n19, max);
            n19 += this.aX.getMeasuredHeight() + this.aa;
        }
        int n26;
        int n27;
        if (this.c(ay)) {
            final int n20 = n19 + this.ac;
            int n21;
            if (this.z()) {
                n21 = n20 + this.aa;
            }
            else {
                n21 = n20;
            }
            final String a = ay.a();
            if (a != null) {
                p2.setTextSize(this.bx);
                p2.setTypeface(this.aP.c);
                this.ba = new StaticLayout((CharSequence)a, 0, a.length(), p2, com.twitter.util.t.a(a, p2), Layout$Alignment.ALIGN_NORMAL, this.A, (float)this.C, false, TextUtils$TruncateAt.END, max);
            }
            final TweetView$InlineAction tweetView$InlineAction = this.d.get(TweetActionType.e);
            if (tweetView$InlineAction != null) {
                if (this.b(ay)) {
                    this.a(this.bA, this.bz, n21 + this.ac, tweetView$InlineAction.c.height());
                    n21 += this.ac;
                }
                else {
                    final int n22 = this.bc + this.aa + this.ac;
                    final int n23 = (int)p2.getTextSize();
                    int n24;
                    if (this.ba != null) {
                        n24 = this.ba.getHeight() - n23;
                    }
                    else {
                        n24 = 0;
                    }
                    int min;
                    if (this.ba != null) {
                        min = Math.min(n23 + this.ba.getLineAscent(0), 0);
                    }
                    else {
                        min = 0;
                    }
                    this.a(this.bA, this.bz, min + (n24 + n22), tweetView$InlineAction.c.height());
                }
            }
            final int bc = this.bc;
            final int ac = this.ac;
            int n25;
            if (this.ba != null) {
                n25 = this.ba.getHeight();
            }
            else {
                n25 = this.aa;
            }
            this.bc = bc + (n25 + ac);
            n26 = n21 + this.ab;
            n27 = 0;
        }
        else if (this.cu == 0 && d.size() > 0) {
            final int n28 = n19 + this.ak;
            final int n29 = n19 + (this.cq + this.al);
            if (b && this.bd == 1) {
                this.a(n29, max);
                n26 = n29 + (this.aX.getMeasuredHeight() + this.aa);
                n27 = n28;
            }
            else {
                n26 = n29;
                n27 = n28;
            }
        }
        else {
            n26 = n19;
            n27 = 0;
        }
        final int max3 = Math.max(n26, n6);
        int n30;
        int min2;
        if (mode2 == 1073741824) {
            n30 = n27;
            min2 = size2;
        }
        else {
            final int max4 = Math.max(max3, this.getSuggestedMinimumHeight());
            int n34;
            if (this.cu != 0) {
                final int n31 = this.ak + this.am;
                if (d.size() > 0 && !this.c(ay)) {
                    final int n32 = max4 + n31;
                    final int n33 = max4 + (this.cq + this.al + this.am);
                    n30 = n32;
                    n34 = n33;
                }
                else {
                    n30 = n27;
                    n34 = max4;
                }
                if (b && this.bd == 1) {
                    this.a(n34, max);
                    n34 += this.aX.getMeasuredHeight() + this.aa;
                }
            }
            else {
                n30 = n27;
                n34 = max4;
            }
            min2 = n34 + paddingBottom;
            if (mode2 == Integer.MIN_VALUE) {
                min2 = Math.min(size2, min2);
            }
        }
        int n35;
        if (this.A()) {
            n35 = min2 + this.a(p2, n3, n30, this.cq);
        }
        else {
            n35 = min2;
        }
        if (this.aK != null) {
            this.aK.setBounds(0, 0, this.V, this.cO + this.f.getPaddingTop() - this.W);
        }
        if (this.aL != null) {
            this.cc = (!this.h.isEmpty() && this.cd && com.twitter.library.experiments.b.b(this.getContext()) && this.h());
            if (this.cc) {
                this.aL.setBounds(0, 0, this.V, this.h.top - n6 - 2 * this.W + this.f.getPaddingBottom());
            }
        }
        if (this.aM != null) {
            int n36;
            if (this.cc) {
                n36 = n35 - this.h.bottom - this.W;
            }
            else {
                n36 = n35 - n6 + this.f.getPaddingBottom() - this.W;
            }
            this.aM.setBounds(0, 0, this.V, n36);
        }
        if (this.cD != null) {
            int n37;
            if (this.cv) {
                n37 = 0;
            }
            else {
                n37 = measuredWidth;
            }
            this.cD.a(n37 + paddingLeft, n11);
        }
        if (n30 > 0 && !this.c(ay)) {
            this.a(ba, max, n30, this.cq);
            if (b && this.bd == 1) {
                this.a(n30 + this.cq, max);
                final int n38 = max3 + this.aX.getMeasuredHeight();
            }
        }
        if (this.bh != null && this.bL != null) {
            final TweetView$InlineAction tweetView$InlineAction2 = d.get(this.bL);
            if (tweetView$InlineAction2 != null) {
                this.bQ = tweetView$InlineAction2.c.left + tweetView$InlineAction2.a.getBounds().width() / 2 - this.aD;
                this.bR = 2 * this.aD;
            }
            else if ("long_press_action".equals(this.bL)) {
                this.bQ = -1;
                this.bR = -1;
            }
            else {
                this.bL = null;
            }
        }
        this.bA = ba;
        this.bz = max;
        this.setMeasuredDimension(n3, n35);
    }
    
    @Override
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f.f();
    }
    
    public boolean p() {
        final Iterator<TweetView$InlineAction> iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().g != null) {
                return true;
            }
        }
        return false;
    }
    
    public void q() {
        if (this.cF) {
            this.cF = false;
            this.f.setFromMemoryOnly(false);
            if (this.aU.getVisibility() == 0) {
                this.aU.setMediaFromMemoryOnly(false);
            }
            this.H();
        }
    }
    
    public void r() {
        if (this.cI != null) {
            final View z = this.cI.z();
            if (z != null) {
                this.addView(z);
                this.cJ = true;
            }
        }
    }
    
    public boolean s() {
        return this.cJ;
    }
    
    public void setAlwaysExpand(final boolean cg) {
        if (this.cg != cg) {
            this.cg = cg;
            this.requestLayout();
        }
    }
    
    public void setAlwaysExpandMedia(final boolean b) {
        if (this.ch != b) {
            this.ch = b;
            this.aU.setAlwaysExpandMedia(b);
            this.requestLayout();
        }
    }
    
    public void setAlwaysStripMediaUrls(final boolean cy) {
        if (this.cY != cy) {
            this.cY = cy;
            this.requestLayout();
        }
    }
    
    public void setAutoLink(final boolean cx) {
        this.cX = cx;
    }
    
    @Override
    public void setBadgeLocation(final int bd) {
        this.bd = bd;
    }
    
    public void setContentSize(final float bx) {
        this.bx = bx;
        this.bu = com.twitter.library.util.bo.a(bx);
        this.aU.setContentSize(this.bu);
        this.by = this.bu;
        this.aV.setContentSize(this.by);
        this.aW.a(this.bx, this.bu, this.bu);
        this.aX.setContentSize(this.bu);
    }
    
    public void setDisplaySensitiveMedia(final boolean cb) {
        this.cB = cb;
    }
    
    public void setDisplayTranslationBadge(final boolean cm) {
        this.cm = cm;
    }
    
    public void setExpandCardMediaType(final int ci) {
        if (this.ci != ci) {
            this.ci = ci;
            this.requestLayout();
        }
    }
    
    public void setFriendshipCache(final FriendshipCache az) {
        this.aZ = az;
    }
    
    public void setHideInlineActions(final boolean bf) {
        this.bF = bf;
    }
    
    public void setHideMediaTagSummary(final boolean bg) {
        this.bG = bg;
    }
    
    @Override
    public void setHighlighted(final boolean be) {
        if (this.bE != be) {
            this.bE = be;
            this.refreshDrawableState();
        }
    }
    
    public void setOnTweetViewClickListener(final z c) {
        this.c = c;
        if (c != null) {
            this.f.setOnClickListener(this.t);
            return;
        }
        this.f.setOnClickListener((View$OnClickListener)null);
    }
    
    public void setPromotedBadgeEnabled(final boolean b) {
        this.cZ.a(b);
    }
    
    public void setQuoteDisplayMode(final int displayMode) {
        this.aU.setDisplayMode(displayMode);
    }
    
    public void setReason(final String cz) {
        this.cz = cz;
    }
    
    public void setReasonIconResId(final int ca) {
        this.cA = ca;
    }
    
    public void setRelatedTweet(final boolean cp) {
        this.cp = cp;
    }
    
    public void setRenderRtl(final boolean renderRtl) {
        if (this.cv != renderRtl) {
            this.cv = renderRtl;
            this.aU.setRenderRtl(renderRtl);
            this.aV.setRenderRTL(renderRtl);
            this.aW.setRenderRTL(renderRtl);
            this.aX.setRenderRtl(renderRtl);
        }
    }
    
    public void setScribeItem(final TwitterScribeItem ce) {
        this.cE = ce;
    }
    
    public void setShouldSimulateInlineActions(final boolean cf) {
        if (this.cf != cf) {
            this.cf = cf;
            this.requestLayout();
        }
    }
    
    public void setShowActionPrompt(final boolean bh) {
        this.bH = bh;
        this.requestLayout();
    }
    
    public void setShowRetweetSocialProofToOwner(final boolean ce) {
        this.ce = ce;
    }
    
    public void setShowSocialBadge(final boolean showSocialBadge) {
        this.aV.setShowSocialBadge(showSocialBadge);
    }
    
    public void setSocialContextCount(final int cw) {
        this.cw = cw;
    }
    
    public void setSocialContextName(final String cx) {
        this.cx = cx;
    }
    
    public void setSocialContextType(final int cy) {
        this.cy = cy;
    }
    
    public void setStripMediaUrls(final boolean cj) {
        if (this.cj != cj) {
            this.cj = cj;
            this.requestLayout();
        }
    }
    
    public void setTweet(final Tweet tweet) {
        this.a(tweet, false, new g((Activity)this.getContext(), tweet), true);
    }
    
    public void setTweetCountMode(final int cg) {
        if (this.cG != cg) {
            this.cG = cg;
            if (this.cG == 1) {
                this.bU = this.ap;
            }
            else {
                this.bU = this.an;
            }
            this.requestLayout();
        }
    }
    
    public void setTweetNoLayout(final Tweet tweet) {
        this.a(tweet, false, new g((Activity)this.getContext(), tweet), false);
    }
}
