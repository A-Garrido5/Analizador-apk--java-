// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.dialog;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.res.TypedArray;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.os.Bundle;
import android.app.Dialog;
import android.view.View$OnClickListener;

public class SimpleDialogFragment extends BaseDialogFragment implements View$OnClickListener
{
    private boolean a;
    
    public SimpleDialogFragment() {
        this.setStyle(0, js.DialogTheme_SimpleDialog);
    }
    
    public SimpleDialogFragment a(final CharSequence charSequence) {
        this.getArguments().putCharSequence("twitter:title_string", charSequence);
        return this;
    }
    
    protected void a(final Dialog dialog, final Bundle bundle) {
        final TypedArray obtainStyledAttributes = dialog.getContext().obtainStyledAttributes(jt.SimpleDialog);
        final View viewById = dialog.findViewById(jo.dialog_panel);
        if (obtainStyledAttributes.getBoolean(jt.SimpleDialog_dialogCanceledOnTouchOutside, false)) {
            dialog.findViewById(16908290).setOnClickListener((View$OnClickListener)this);
            viewById.setOnClickListener((View$OnClickListener)this);
        }
        if (!this.a && bundle == null) {
            final int resourceId = obtainStyledAttributes.getResourceId(jt.SimpleDialog_dialogEnterAnimation, 0);
            if (resourceId > 0) {
                viewById.startAnimation(AnimationUtils.loadAnimation((Context)this.getActivity(), resourceId));
            }
        }
        obtainStyledAttributes.recycle();
        final Bundle arguments = this.getArguments();
        final Button button = (Button)dialog.findViewById(jo.button_positive);
        if (arguments.containsKey("twitter:positive_button_string")) {
            button.setText(arguments.getCharSequence("twitter:positive_button_string"));
            button.setOnClickListener((View$OnClickListener)this);
        }
        else if (arguments.containsKey("twitter:positive_button")) {
            button.setText(arguments.getInt("twitter:positive_button"));
            button.setOnClickListener((View$OnClickListener)this);
        }
        else {
            button.setVisibility(8);
        }
        dialog.findViewById(jo.button_dismiss).setOnClickListener((View$OnClickListener)this);
        final Button button2 = (Button)dialog.findViewById(jo.button_negative);
        if (arguments.containsKey("twitter:negative_button_string")) {
            button2.setText(arguments.getCharSequence("twitter:negative_button_string"));
            button2.setOnClickListener((View$OnClickListener)this);
        }
        else if (arguments.containsKey("twitter:negative_button")) {
            button2.setText(arguments.getInt("twitter:negative_button"));
            button2.setOnClickListener((View$OnClickListener)this);
        }
        else {
            button2.setVisibility(8);
        }
        final ImageView imageView = (ImageView)dialog.findViewById(jo.dialog_icon);
        if (arguments.containsKey("twitter:icon")) {
            imageView.setImageResource(arguments.getInt("twitter:icon"));
        }
        else {
            imageView.setVisibility(8);
        }
        final TextView textView = (TextView)dialog.findViewById(jo.dialog_title);
        if (arguments.containsKey("twitter:title_string")) {
            textView.setText(arguments.getCharSequence("twitter:title_string"));
        }
        else if (arguments.containsKey("twitter:title")) {
            textView.setText(arguments.getInt("twitter:title"));
        }
        else {
            textView.setVisibility(8);
        }
        final TextView textView2 = (TextView)dialog.findViewById(jo.dialog_message);
        if (arguments.containsKey("twitter:message_string")) {
            textView2.setText(arguments.getCharSequence("twitter:message_string"));
            return;
        }
        if (arguments.containsKey("twitter:message")) {
            textView2.setText(arguments.getInt("twitter:message"));
            return;
        }
        textView2.setVisibility(8);
    }
    
    public SimpleDialogFragment b(final int n) {
        this.getArguments().putInt("twitter:icon", n);
        return this;
    }
    
    public SimpleDialogFragment b(final CharSequence charSequence) {
        this.getArguments().putCharSequence("twitter:message_string", charSequence);
        return this;
    }
    
    public SimpleDialogFragment c(final int n) {
        this.getArguments().putInt("twitter:title", n);
        return this;
    }
    
    public SimpleDialogFragment c(final CharSequence charSequence) {
        this.getArguments().putCharSequence("twitter:positive_button_string", charSequence);
        return this;
    }
    
    public SimpleDialogFragment d(final int n) {
        this.getArguments().putInt("twitter:positive_button", n);
        return this;
    }
    
    protected void d() {
        this.m(-1);
        this.dismiss();
    }
    
    public SimpleDialogFragment e(final int n) {
        this.getArguments().putInt("twitter:negative_button", n);
        return this;
    }
    
    protected void e() {
        this.m(-2);
        this.dismiss();
    }
    
    protected void g() {
        this.dismiss();
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        final Dialog dialog = this.getDialog();
        if (id == jo.dialog_panel || id == 16908290) {
            if (id == 16908290) {
                dialog.cancel();
            }
        }
        else {
            if (id == jo.button_positive) {
                this.d();
                return;
            }
            if (id == jo.button_negative) {
                this.e();
                return;
            }
            if (id == jo.button_dismiss) {
                this.g();
            }
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.a(this.getDialog(), bundle);
        return null;
    }
}
