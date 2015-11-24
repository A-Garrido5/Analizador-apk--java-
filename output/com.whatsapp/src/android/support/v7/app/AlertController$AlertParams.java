// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.os.Message;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.SimpleCursorAdapter;
import android.view.ViewGroup;
import android.widget.ListView;
import android.content.DialogInterface$OnKeyListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.widget.ListAdapter;

public class AlertController$AlertParams
{
    private static final String z;
    public ListAdapter mAdapter;
    public boolean mCancelable;
    public int mCheckedItem;
    public boolean[] mCheckedItems;
    public final Context mContext;
    public Cursor mCursor;
    public View mCustomTitleView;
    public Drawable mIcon;
    public int mIconAttrId;
    public int mIconId;
    public final LayoutInflater mInflater;
    public String mIsCheckedColumn;
    public boolean mIsMultiChoice;
    public boolean mIsSingleChoice;
    public CharSequence[] mItems;
    public String mLabelColumn;
    public CharSequence mMessage;
    public DialogInterface$OnClickListener mNegativeButtonListener;
    public CharSequence mNegativeButtonText;
    public DialogInterface$OnClickListener mNeutralButtonListener;
    public CharSequence mNeutralButtonText;
    public DialogInterface$OnCancelListener mOnCancelListener;
    public DialogInterface$OnMultiChoiceClickListener mOnCheckboxClickListener;
    public DialogInterface$OnClickListener mOnClickListener;
    public DialogInterface$OnDismissListener mOnDismissListener;
    public AdapterView$OnItemSelectedListener mOnItemSelectedListener;
    public DialogInterface$OnKeyListener mOnKeyListener;
    public AlertController$AlertParams$OnPrepareListViewListener mOnPrepareListViewListener;
    public DialogInterface$OnClickListener mPositiveButtonListener;
    public CharSequence mPositiveButtonText;
    public boolean mRecycleOnMeasure;
    public CharSequence mTitle;
    public View mView;
    public int mViewLayoutResId;
    public int mViewSpacingBottom;
    public int mViewSpacingLeft;
    public int mViewSpacingRight;
    public boolean mViewSpacingSpecified;
    public int mViewSpacingTop;
    
    static {
        final char[] charArray = "bK\u00057dzu\u00156wbK\b=c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0011';
                    break;
                }
                case 0: {
                    c2 = '\u000e';
                    break;
                }
                case 1: {
                    c2 = '*';
                    break;
                }
                case 2: {
                    c2 = '|';
                    break;
                }
                case 3: {
                    c2 = 'X';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public AlertController$AlertParams(final Context mContext) {
        this.mIconId = 0;
        this.mIconAttrId = 0;
        this.mViewSpacingSpecified = false;
        this.mCheckedItem = -1;
        this.mRecycleOnMeasure = true;
        this.mContext = mContext;
        this.mCancelable = true;
        this.mInflater = (LayoutInflater)mContext.getSystemService(AlertController$AlertParams.z);
    }
    
    private void createListView(final AlertController alertController) {
        final boolean a = ActionBar.a;
        final ListView listView = (ListView)this.mInflater.inflate(AlertController.access$800(alertController), (ViewGroup)null);
        Object mAdapter = null;
        Label_0176: {
            if (this.mIsMultiChoice) {
                if (this.mCursor == null) {
                    mAdapter = new AlertController$AlertParams$1(this, this.mContext, AlertController.access$900(alertController), 16908308, this.mItems, listView);
                    if (!a) {
                        break Label_0176;
                    }
                }
                final AlertController$AlertParams$2 alertController$AlertParams$2 = new AlertController$AlertParams$2(this, this.mContext, this.mCursor, false, listView, alertController);
                if (!a) {
                    mAdapter = alertController$AlertParams$2;
                    break Label_0176;
                }
            }
            int n;
            if (this.mIsSingleChoice) {
                n = AlertController.access$1000(alertController);
            }
            else {
                n = AlertController.access$1100(alertController);
            }
            if (this.mCursor == null) {
                if (this.mAdapter != null) {
                    mAdapter = this.mAdapter;
                }
                else {
                    mAdapter = new AlertController$CheckedItemAdapter(this.mContext, n, 16908308, this.mItems);
                }
                if (!a) {
                    break Label_0176;
                }
            }
            mAdapter = new SimpleCursorAdapter(this.mContext, n, this.mCursor, new String[] { this.mLabelColumn }, new int[] { 16908308 });
        }
        if (this.mOnPrepareListViewListener != null) {
            this.mOnPrepareListViewListener.onPrepareListView(listView);
        }
        AlertController.access$1202(alertController, (ListAdapter)mAdapter);
        AlertController.access$1302(alertController, this.mCheckedItem);
        Label_0254: {
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener((AdapterView$OnItemClickListener)new AlertController$AlertParams$3(this, alertController));
                if (!a) {
                    break Label_0254;
                }
            }
            if (this.mOnCheckboxClickListener != null) {
                listView.setOnItemClickListener((AdapterView$OnItemClickListener)new AlertController$AlertParams$4(this, listView, alertController));
            }
        }
        if (this.mOnItemSelectedListener != null) {
            listView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        }
        Label_0297: {
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
                if (!a) {
                    break Label_0297;
                }
            }
            if (this.mIsMultiChoice) {
                listView.setChoiceMode(2);
            }
        }
        AlertController.access$1402(alertController, listView);
    }
    
    public void apply(final AlertController alertController) {
        final boolean a = ActionBar.a;
        Label_0087: {
            if (this.mCustomTitleView != null) {
                alertController.setCustomTitle(this.mCustomTitleView);
                if (!a) {
                    break Label_0087;
                }
            }
            if (this.mTitle != null) {
                alertController.setTitle(this.mTitle);
            }
            if (this.mIcon != null) {
                alertController.setIcon(this.mIcon);
            }
            if (this.mIconId != 0) {
                alertController.setIcon(this.mIconId);
            }
            if (this.mIconAttrId != 0) {
                alertController.setIcon(alertController.getIconAttributeResId(this.mIconAttrId));
            }
        }
        if (this.mMessage != null) {
            alertController.setMessage(this.mMessage);
        }
        if (this.mPositiveButtonText != null) {
            alertController.setButton(-1, this.mPositiveButtonText, this.mPositiveButtonListener, null);
        }
        if (this.mNegativeButtonText != null) {
            alertController.setButton(-2, this.mNegativeButtonText, this.mNegativeButtonListener, null);
        }
        if (this.mNeutralButtonText != null) {
            alertController.setButton(-3, this.mNeutralButtonText, this.mNeutralButtonListener, null);
        }
        if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
            this.createListView(alertController);
        }
        if (this.mView != null) {
            if (this.mViewSpacingSpecified) {
                alertController.setView(this.mView, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                if (!a) {
                    return;
                }
            }
            alertController.setView(this.mView);
            if (!a) {
                return;
            }
        }
        if (this.mViewLayoutResId != 0) {
            alertController.setView(this.mViewLayoutResId);
        }
    }
}
