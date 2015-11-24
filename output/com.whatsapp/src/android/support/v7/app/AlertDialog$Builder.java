// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.content.DialogInterface$OnCancelListener;
import android.view.View;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import android.view.ContextThemeWrapper;
import android.content.Context;

public class AlertDialog$Builder
{
    private final AlertController$AlertParams P;
    private int mTheme;
    
    public AlertDialog$Builder(final Context context) {
        this(context, AlertDialog.resolveDialogTheme(context, 0));
    }
    
    public AlertDialog$Builder(final Context context, final int mTheme) {
        this.P = new AlertController$AlertParams((Context)new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, mTheme)));
        this.mTheme = mTheme;
    }
    
    public AlertDialog create() {
        final AlertDialog alertDialog = new AlertDialog(this.P.mContext, this.mTheme, false);
        this.P.apply(AlertDialog.access$000(alertDialog));
        alertDialog.setCancelable(this.P.mCancelable);
        if (this.P.mCancelable) {
            alertDialog.setCanceledOnTouchOutside(true);
        }
        alertDialog.setOnCancelListener(this.P.mOnCancelListener);
        alertDialog.setOnDismissListener(this.P.mOnDismissListener);
        if (this.P.mOnKeyListener != null) {
            alertDialog.setOnKeyListener(this.P.mOnKeyListener);
        }
        return alertDialog;
    }
    
    public AlertDialog$Builder setAdapter(final ListAdapter mAdapter, final DialogInterface$OnClickListener mOnClickListener) {
        this.P.mAdapter = mAdapter;
        this.P.mOnClickListener = mOnClickListener;
        return this;
    }
    
    public AlertDialog$Builder setCancelable(final boolean mCancelable) {
        this.P.mCancelable = mCancelable;
        return this;
    }
    
    public AlertDialog$Builder setCustomTitle(final View mCustomTitleView) {
        this.P.mCustomTitleView = mCustomTitleView;
        return this;
    }
    
    public AlertDialog$Builder setItems(final int n, final DialogInterface$OnClickListener mOnClickListener) {
        this.P.mItems = this.P.mContext.getResources().getTextArray(n);
        this.P.mOnClickListener = mOnClickListener;
        return this;
    }
    
    public AlertDialog$Builder setItems(final CharSequence[] mItems, final DialogInterface$OnClickListener mOnClickListener) {
        this.P.mItems = mItems;
        this.P.mOnClickListener = mOnClickListener;
        return this;
    }
    
    public AlertDialog$Builder setMessage(final int n) {
        this.P.mMessage = this.P.mContext.getText(n);
        return this;
    }
    
    public AlertDialog$Builder setMessage(final CharSequence mMessage) {
        this.P.mMessage = mMessage;
        return this;
    }
    
    public AlertDialog$Builder setNegativeButton(final int n, final DialogInterface$OnClickListener mNegativeButtonListener) {
        this.P.mNegativeButtonText = this.P.mContext.getText(n);
        this.P.mNegativeButtonListener = mNegativeButtonListener;
        return this;
    }
    
    public AlertDialog$Builder setNegativeButton(final CharSequence mNegativeButtonText, final DialogInterface$OnClickListener mNegativeButtonListener) {
        this.P.mNegativeButtonText = mNegativeButtonText;
        this.P.mNegativeButtonListener = mNegativeButtonListener;
        return this;
    }
    
    public AlertDialog$Builder setNeutralButton(final int n, final DialogInterface$OnClickListener mNeutralButtonListener) {
        this.P.mNeutralButtonText = this.P.mContext.getText(n);
        this.P.mNeutralButtonListener = mNeutralButtonListener;
        return this;
    }
    
    public AlertDialog$Builder setOnCancelListener(final DialogInterface$OnCancelListener mOnCancelListener) {
        this.P.mOnCancelListener = mOnCancelListener;
        return this;
    }
    
    public AlertDialog$Builder setPositiveButton(final int n, final DialogInterface$OnClickListener mPositiveButtonListener) {
        this.P.mPositiveButtonText = this.P.mContext.getText(n);
        this.P.mPositiveButtonListener = mPositiveButtonListener;
        return this;
    }
    
    public AlertDialog$Builder setPositiveButton(final CharSequence mPositiveButtonText, final DialogInterface$OnClickListener mPositiveButtonListener) {
        this.P.mPositiveButtonText = mPositiveButtonText;
        this.P.mPositiveButtonListener = mPositiveButtonListener;
        return this;
    }
    
    public AlertDialog$Builder setSingleChoiceItems(final int n, final int mCheckedItem, final DialogInterface$OnClickListener mOnClickListener) {
        this.P.mItems = this.P.mContext.getResources().getTextArray(n);
        this.P.mOnClickListener = mOnClickListener;
        this.P.mCheckedItem = mCheckedItem;
        this.P.mIsSingleChoice = true;
        return this;
    }
    
    public AlertDialog$Builder setSingleChoiceItems(final CharSequence[] mItems, final int mCheckedItem, final DialogInterface$OnClickListener mOnClickListener) {
        this.P.mItems = mItems;
        this.P.mOnClickListener = mOnClickListener;
        this.P.mCheckedItem = mCheckedItem;
        this.P.mIsSingleChoice = true;
        return this;
    }
    
    public AlertDialog$Builder setTitle(final int n) {
        this.P.mTitle = this.P.mContext.getText(n);
        return this;
    }
    
    public AlertDialog$Builder setTitle(final CharSequence mTitle) {
        this.P.mTitle = mTitle;
        return this;
    }
    
    public AlertDialog$Builder setView(final View mView) {
        this.P.mView = mView;
        this.P.mViewLayoutResId = 0;
        this.P.mViewSpacingSpecified = false;
        return this;
    }
    
    public AlertDialog show() {
        final AlertDialog create = this.create();
        create.show();
        return create;
    }
}
