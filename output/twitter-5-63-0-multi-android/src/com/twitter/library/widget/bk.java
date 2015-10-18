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

class bk implements Runnable
{
    final /* synthetic */ TweetView a;
    private TweetView$InlineAction b;
    
    public bk(final TweetView a, final TweetView$InlineAction b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.a(this.b);
    }
}
