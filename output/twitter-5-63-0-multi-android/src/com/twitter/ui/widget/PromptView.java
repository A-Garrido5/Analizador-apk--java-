// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.content.res.Resources;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.text.format.Time;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class PromptView extends RelativeLayout implements View$OnClickListener
{
    private TextView a;
    protected boolean b;
    protected Time c;
    private TextView d;
    private Button e;
    private View f;
    private q g;
    private int h;
    
    public PromptView(final Context context) {
        super(context);
        this.c = new Time();
        this.a(null, 0);
    }
    
    public PromptView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = new Time();
        this.a(set, 0);
    }
    
    public PromptView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = new Time();
        this.a(set, n);
    }
    
    private void a(final AttributeSet set, final int n) {
        inflate(this.getContext(), jq.prompt_layout, (ViewGroup)this);
        this.a = (TextView)this.findViewById(jo.prompt_title);
        this.d = (TextView)this.findViewById(jo.prompt_subtitle);
        (this.e = (Button)this.findViewById(jo.prompt_btn)).setOnClickListener((View$OnClickListener)this);
        (this.f = this.findViewById(jo.dismiss)).setOnClickListener((View$OnClickListener)this);
        int dismissVisibility;
        boolean boolean1;
        String buttonText;
        String subtitle;
        String title;
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(set, jt.PromptView, n, 0);
            final String string = obtainStyledAttributes.getString(jt.PromptView_titleText);
            final String string2 = obtainStyledAttributes.getString(jt.PromptView_subtitleText);
            final String string3 = obtainStyledAttributes.getString(jt.PromptView_buttonText);
            if (obtainStyledAttributes.getBoolean(jt.PromptView_showDismiss, false)) {
                dismissVisibility = 0;
            }
            else {
                dismissVisibility = 8;
            }
            boolean1 = obtainStyledAttributes.getBoolean(jt.PromptView_isHeader, false);
            obtainStyledAttributes.recycle();
            buttonText = string3;
            subtitle = string2;
            title = string;
        }
        else {
            dismissVisibility = 8;
            boolean1 = false;
            buttonText = null;
            subtitle = null;
            title = null;
        }
        this.setTitle(title);
        this.setSubtitle(subtitle);
        this.setButtonText(buttonText);
        this.setDismissVisibility(dismissVisibility);
        this.setIsHeader(boolean1);
    }
    
    private void a(final View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
    }
    
    private void a(final View view, final float n) {
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().setDuration(200L).translationYBy(n).scaleX(0.8f).scaleY(0.7f).alpha(0.0f);
    }
    
    private static void a(final TextView textView, final CharSequence text) {
        if (TextUtils.isEmpty(text)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(text);
        textView.setVisibility(0);
    }
    
    private void c() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(300L);
        ofFloat.addListener((Animator$AnimatorListener)new o(this));
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new p(this));
        ofFloat.start();
    }
    
    protected void a() {
        if (this.g != null) {
            this.g.a(this);
        }
    }
    
    protected void b() {
        this.f();
        if (this.g != null) {
            this.g.b(this);
        }
    }
    
    public void f() {
        this.setVisibility(8);
    }
    
    protected void g() {
        this.a((View)this.getPromptHeader(), -50.0f);
        this.a((View)this.getPromptSubtitle(), -35.0f);
        this.a((View)this.getPromptButton(), -20.0f);
        this.h = this.getMeasuredHeight();
        this.c();
    }
    
    protected Button getPromptButton() {
        return this.e;
    }
    
    protected TextView getPromptHeader() {
        return this.a;
    }
    
    protected TextView getPromptSubtitle() {
        return this.d;
    }
    
    public void onClick(final View view) {
        if (view.getId() == jo.prompt_btn) {
            this.a();
        }
        else if (view.getId() == jo.dismiss) {
            this.g();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        super.onMeasure(n, n2);
    }
    
    public void setButtonText(final int n) {
        this.setButtonText(this.getContext().getString(n));
    }
    
    public void setButtonText(final CharSequence charSequence) {
        a((TextView)this.e, charSequence);
    }
    
    public void setDismissVisibility(final int visibility) {
        this.f.setVisibility(visibility);
    }
    
    public void setIsHeader(final boolean b) {
        final Resources resources = this.getResources();
        int n;
        if (b) {
            n = jm.prompt_vertical_top_padding;
        }
        else {
            n = jm.prompt_padding;
        }
        final float dimension = resources.getDimension(n);
        final View viewById = this.findViewById(jo.prompt_inner_container);
        viewById.setPadding(viewById.getPaddingLeft(), (int)dimension, viewById.getPaddingRight(), viewById.getPaddingBottom());
    }
    
    public void setOnPromptClickListener(final q g) {
        this.g = g;
    }
    
    public void setSubtitle(final int n) {
        this.setSubtitle(this.getContext().getString(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        a(this.d, charSequence);
    }
    
    public void setTitle(final int n) {
        this.setTitle(this.getContext().getString(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        a(this.a, charSequence);
    }
}
