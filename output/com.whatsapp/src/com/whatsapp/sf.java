// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.util.Iterator;
import android.view.View$MeasureSpec;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import java.util.ArrayList;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.text.TextUtils;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.View;
import android.widget.BaseAdapter;

class sf extends BaseAdapter
{
    private String a;
    private int b;
    final MessageDetailsActivity c;
    private final int d;
    private View e;
    
    public sf(final MessageDetailsActivity c) {
        this.c = c;
        this.d = c.getResources().getInteger(17694721);
    }
    
    static int a(final sf sf, final int b) {
        return sf.b = b;
    }
    
    static View a(final sf sf, final View e) {
        return sf.e = e;
    }
    
    private Animation a(final float n) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setDuration((long)this.d);
        ((Animation)alphaAnimation).setStartOffset((long)(n * this.d));
        return (Animation)alphaAnimation;
    }
    
    static String a(final sf sf) {
        return sf.a;
    }
    
    static String a(final sf sf, final String a) {
        return sf.a = a;
    }
    
    private void a(final int n, final View view) {
        final boolean i = App.I;
        final dr dr = MessageDetailsActivity.a(this.c).get(n);
        final View viewById = view.findViewById(2131755665);
        Label_0139: {
            if (n == 0 || dr.a() != MessageDetailsActivity.a(this.c).get(n - 1).a()) {
                viewById.setVisibility(0);
                final TextView textView = (TextView)view.findViewById(2131755666);
                final TextView textView2 = (TextView)view.findViewById(2131755667);
                Label_0878: {
                    switch (dr.a()) {
                        case 5: {
                            textView.setText(2131231322);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(2130838939, 0, 0, 0);
                            if (i) {
                                break Label_0878;
                            }
                            break;
                        }
                        case 13: {
                            int text;
                            if (MessageDetailsActivity.e(this.c).I == 0) {
                                text = 2131231329;
                            }
                            else {
                                text = 2131231331;
                            }
                            textView.setText(text);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(2130838938, 0, 0, 0);
                            if (i) {
                                break Label_0878;
                            }
                            break;
                        }
                        case 8: {
                            textView.setText(2131231327);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(2130838942, 0, 0, 0);
                            break;
                        }
                    }
                }
                if (!i) {
                    break Label_0139;
                }
            }
            viewById.setVisibility(8);
        }
        final View viewById2 = view.findViewById(2131755309);
        final View viewById3 = view.findViewById(2131755262);
        Label_0229: {
            if (n == -1 + MessageDetailsActivity.a(this.c).size() || dr.a() != MessageDetailsActivity.a(this.c).get(n + 1).a()) {
                viewById3.setBackgroundResource(2130838967);
                viewById2.setVisibility(8);
                if (!i) {
                    break Label_0229;
                }
            }
            viewById3.setBackgroundResource(2130838971);
            viewById2.setVisibility(0);
        }
        final ImageView imageView = (ImageView)view.findViewById(2131755295);
        final TextView textView3 = (TextView)view.findViewById(2131755277);
        final TextView textView4 = (TextView)view.findViewById(2131755585);
        final TextView textView5 = (TextView)view.findViewById(2131755668);
        final View viewById4 = view.findViewById(2131755674);
        final View viewById5 = view.findViewById(2131755672);
        final View viewById6 = view.findViewById(2131755670);
        final TextView textView6 = (TextView)view.findViewById(2131755663);
        final TextView textView7 = (TextView)view.findViewById(2131755662);
        final TextView textView8 = (TextView)view.findViewById(2131755660);
        final View viewById7 = view.findViewById(2131755675);
        final View viewById8 = view.findViewById(2131755673);
        final View viewById9 = view.findViewById(2131755671);
        viewById4.setVisibility(8);
        viewById5.setVisibility(8);
        viewById6.setVisibility(8);
        viewById7.setVisibility(8);
        viewById8.setVisibility(8);
        viewById9.setVisibility(8);
        if (dr instanceof dc) {
            textView5.setVisibility(0);
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView4.setVisibility(8);
            final dc dc = (dc)dr;
            textView5.setText((CharSequence)String.format(App.C.a(2131296294, dc.c), dc.c));
            if (!i) {
                return;
            }
        }
        final a_9 e = App.S.e(dr.a);
        textView5.setVisibility(8);
        imageView.setVisibility(0);
        MessageDetailsActivity.c(this.c).b(e, imageView);
        textView3.setVisibility(0);
        textView3.setText((CharSequence)e.a((Context)this.c));
        Label_0626: {
            if (e.r() && !TextUtils.isEmpty((CharSequence)e.o)) {
                textView4.setVisibility(0);
                textView4.setText(cq.b("~" + e.o, this.c.getBaseContext(), (Paint)textView4.getPaint()));
                if (!i) {
                    break Label_0626;
                }
            }
            textView4.setVisibility(8);
        }
        Label_0812: {
            if (e.u.equals(this.a)) {
                if (dr.a(5) > 0L) {
                    textView6.setText(MessageDetailsActivity.a(this.c, dr.a(5)));
                    viewById4.setVisibility(0);
                    viewById7.setVisibility(0);
                }
                if (dr.a(13) > 0L) {
                    textView7.setText(MessageDetailsActivity.a(this.c, dr.a(13)));
                    viewById5.setVisibility(0);
                    viewById8.setVisibility(0);
                }
                if (dr.a(8) <= 0L) {
                    break Label_0812;
                }
                textView8.setText(MessageDetailsActivity.a(this.c, dr.a(8)));
                viewById6.setVisibility(0);
                viewById9.setVisibility(0);
                if (!i) {
                    break Label_0812;
                }
            }
            Label_0962: {
                switch (dr.a()) {
                    case 5: {
                        textView6.setText(MessageDetailsActivity.a(this.c, dr.a(5)));
                        viewById4.setVisibility(0);
                        if (i) {
                            break Label_0962;
                        }
                        break;
                    }
                    case 13: {
                        textView7.setText(MessageDetailsActivity.a(this.c, dr.a(13)));
                        viewById5.setVisibility(0);
                        if (i) {
                            break Label_0962;
                        }
                        break;
                    }
                    case 8: {
                        textView8.setText(MessageDetailsActivity.a(this.c, dr.a(8)));
                        viewById6.setVisibility(0);
                        break;
                    }
                }
            }
        }
        view.setTag((Object)e);
    }
    
    private void a(final int n, final View view, final boolean b) {
        final boolean i = App.I;
        final dr dr = MessageDetailsActivity.a(this.c).get(n);
        final TextView textView = (TextView)view.findViewById(2131755663);
        final TextView textView2 = (TextView)view.findViewById(2131755662);
        final TextView textView3 = (TextView)view.findViewById(2131755660);
        final View viewById = view.findViewById(2131755675);
        final View viewById2 = view.findViewById(2131755673);
        final View viewById3 = view.findViewById(2131755671);
        final View viewById4 = view.findViewById(2131755674);
        final View viewById5 = view.findViewById(2131755672);
        final View viewById6 = view.findViewById(2131755670);
        final ArrayList<View> list = new ArrayList<View>(6);
        Label_0466: {
            switch (dr.a()) {
                case 5: {
                    list.add(viewById);
                    if (!App.ak()) {
                        break;
                    }
                    TranslateAnimation translateAnimation;
                    if (b) {
                        translateAnimation = new TranslateAnimation((float)(textView.getWidth() - viewById4.getWidth()), 0.0f, 0.0f, 0.0f);
                    }
                    else {
                        translateAnimation = new TranslateAnimation((float)viewById.getWidth(), 0.0f, 0.0f, 0.0f);
                    }
                    ((Animation)translateAnimation).setDuration((long)this.d);
                    ((Animation)translateAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
                    textView.startAnimation((Animation)translateAnimation);
                    if (i) {
                        break Label_0466;
                    }
                    break;
                }
                case 13: {
                    list.add(viewById2);
                    list.add(viewById4);
                    list.add(viewById);
                    if (!App.ak()) {
                        break;
                    }
                    TranslateAnimation translateAnimation2;
                    if (b) {
                        translateAnimation2 = new TranslateAnimation((float)(textView2.getWidth() - viewById5.getWidth()), 0.0f, 0.0f, 0.0f);
                    }
                    else {
                        translateAnimation2 = new TranslateAnimation((float)viewById2.getWidth(), 0.0f, 0.0f, 0.0f);
                    }
                    ((Animation)translateAnimation2).setDuration((long)this.d);
                    ((Animation)translateAnimation2).setInterpolator((Interpolator)new DecelerateInterpolator());
                    textView2.startAnimation((Animation)translateAnimation2);
                    if (i) {
                        break Label_0466;
                    }
                    break;
                }
                case 8: {
                    list.add(viewById3);
                    list.add(viewById5);
                    list.add(viewById2);
                    list.add(viewById4);
                    list.add(viewById);
                    if (App.ak()) {
                        TranslateAnimation translateAnimation3;
                        if (b) {
                            translateAnimation3 = new TranslateAnimation((float)(textView3.getWidth() - viewById6.getWidth()), 0.0f, 0.0f, 0.0f);
                        }
                        else {
                            translateAnimation3 = new TranslateAnimation((float)viewById3.getWidth(), 0.0f, 0.0f, 0.0f);
                        }
                        ((Animation)translateAnimation3).setDuration((long)this.d);
                        ((Animation)translateAnimation3).setInterpolator((Interpolator)new DecelerateInterpolator());
                        textView3.startAnimation((Animation)translateAnimation3);
                        break;
                    }
                    break;
                }
            }
        }
        for (final View view2 : list) {
            Animation animation;
            if (b) {
                animation = this.b(0.0f);
            }
            else {
                animation = this.a(0.0f);
            }
            view2.startAnimation(animation);
            if (i) {
                break;
            }
        }
        final View viewById7 = view.findViewById(2131755669);
        final int height = viewById7.getHeight();
        this.a(n, view);
        viewById7.measure(View$MeasureSpec.makeMeasureSpec(viewById7.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
        final int measuredHeight = viewById7.getMeasuredHeight();
        viewById7.getLayoutParams().height = height;
        final qg qg = new qg(this, viewById7, height, measuredHeight);
        qg.setDuration((long)this.d);
        viewById7.startAnimation((Animation)qg);
    }
    
    static void a(final sf sf, final int n, final View view, final boolean b) {
        sf.a(n, view, b);
    }
    
    static View b(final sf sf) {
        return sf.e;
    }
    
    private Animation b(final float n) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setDuration((long)this.d);
        ((Animation)alphaAnimation).setStartOffset((long)(n * this.d));
        return (Animation)alphaAnimation;
    }
    
    static int c(final sf sf) {
        return sf.b;
    }
    
    public int getCount() {
        return MessageDetailsActivity.a(this.c).size();
    }
    
    public Object getItem(final int n) {
        return MessageDetailsActivity.a(this.c).get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        if (view == null) {
            final View a = alm.a(this.c.getLayoutInflater(), 2130903189, viewGroup, false);
            if (!App.I) {
                view = a;
            }
        }
        this.a(n, view);
        view.setOnClickListener((View$OnClickListener)new alg(this, n));
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
