// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.twitter.ui.dialog.c;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import com.twitter.ui.dialog.BaseDialogFragment;

public class PromptDialogFragment extends BaseDialogFragment implements DialogInterface$OnClickListener, DialogInterface$OnDismissListener
{
    public static PromptDialogFragment b(final int n) {
        final PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.d_(n);
        return promptDialogFragment;
    }
    
    public PromptDialogFragment a(final int n, final c c) {
        this.getArguments().putInt("view_id", n);
        this.a(c);
        return this;
    }
    
    public PromptDialogFragment a(final String s) {
        this.getArguments().putString("title_string", s);
        return this;
    }
    
    public PromptDialogFragment a(final CharSequence[] array) {
        this.getArguments().putCharSequenceArray("items", array);
        return this;
    }
    
    public void a(final FragmentManager fragmentManager, final String s) {
        final FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, s);
        beginTransaction.commitAllowingStateLoss();
    }
    
    public PromptDialogFragment b(final String s) {
        this.getArguments().putString("message_string", s);
        return this;
    }
    
    public PromptDialogFragment c(final int n) {
        this.getArguments().putInt("title", n);
        return this;
    }
    
    public PromptDialogFragment d(final int n) {
        this.getArguments().putInt("message", n);
        return this;
    }
    
    public PromptDialogFragment e(final int n) {
        this.getArguments().putInt("items_resource", n);
        return this;
    }
    
    public PromptDialogFragment f(final int n) {
        this.getArguments().putInt("single_choice_items", n);
        return this;
    }
    
    public PromptDialogFragment g(final int n) {
        this.getArguments().putInt("single_choice_checked", n);
        return this;
    }
    
    public PromptDialogFragment h(final int n) {
        this.getArguments().putInt("positive_button", n);
        return this;
    }
    
    public PromptDialogFragment i(final int n) {
        this.getArguments().putInt("neutral_button", n);
        return this;
    }
    
    public PromptDialogFragment j(final int n) {
        this.getArguments().putInt("negative_button", n);
        return this;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        if (this.getArguments().get("view_id") != null) {
            this.getDialog().show();
        }
        super.onActivityCreated(bundle);
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.m(n);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final Bundle arguments = this.getArguments();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        if (arguments.containsKey("icon")) {
            alertDialog$Builder.setIcon(arguments.getInt("icon"));
        }
        if (arguments.containsKey("title")) {
            alertDialog$Builder.setTitle(arguments.getInt("title"));
        }
        if (arguments.containsKey("title_string")) {
            alertDialog$Builder.setTitle((CharSequence)arguments.getString("title_string"));
        }
        if (arguments.containsKey("message")) {
            alertDialog$Builder.setMessage(arguments.getInt("message"));
        }
        if (arguments.containsKey("message_string")) {
            alertDialog$Builder.setMessage((CharSequence)arguments.getString("message_string"));
        }
        if (arguments.containsKey("positive_button")) {
            alertDialog$Builder.setPositiveButton(arguments.getInt("positive_button"), (DialogInterface$OnClickListener)this);
        }
        if (arguments.containsKey("neutral_button")) {
            alertDialog$Builder.setNeutralButton(arguments.getInt("neutral_button"), (DialogInterface$OnClickListener)this);
        }
        if (arguments.containsKey("negative_button")) {
            alertDialog$Builder.setNegativeButton(arguments.getInt("negative_button"), (DialogInterface$OnClickListener)this);
        }
        if (arguments.containsKey("items_resource")) {
            alertDialog$Builder.setItems(this.getResources().getTextArray(arguments.getInt("items_resource")), (DialogInterface$OnClickListener)this);
        }
        else if (arguments.containsKey("items")) {
            alertDialog$Builder.setItems(arguments.getCharSequenceArray("items"), (DialogInterface$OnClickListener)this);
        }
        if (arguments.containsKey("single_choice_items")) {
            alertDialog$Builder.setSingleChoiceItems(this.getResources().getTextArray(arguments.getInt("single_choice_items")), arguments.getInt("single_choice_checked", -1), (DialogInterface$OnClickListener)this);
        }
        if (arguments.containsKey("view_id")) {
            alertDialog$Builder.setView(((LayoutInflater)this.getActivity().getSystemService("layout_inflater")).inflate(this.getArguments().getInt("view_id"), (ViewGroup)null));
        }
        return (Dialog)alertDialog$Builder.create();
    }
    
    public void onDestroyView() {
        final Dialog dialog = this.getDialog();
        if (dialog != null && this.getRetainInstance()) {
            dialog.setDismissMessage((Message)null);
        }
        super.onDestroyView();
    }
}
