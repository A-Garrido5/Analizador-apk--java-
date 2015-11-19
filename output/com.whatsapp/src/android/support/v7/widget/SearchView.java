// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.text.TextUtils;
import android.text.Editable;
import android.util.Log;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.widget.AutoCompleteTextView;
import android.content.ComponentName;
import android.database.Cursor;
import android.net.Uri;
import android.content.res.Resources;
import android.support.v7.appcompat.R$dimen;
import android.support.v7.internal.widget.ViewUtils;
import android.graphics.Rect;
import android.annotation.TargetApi;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.KeyEvent;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.content.ActivityNotFoundException;
import android.os.Build$VERSION;
import android.content.Intent;
import android.support.v7.internal.widget.TintManager;
import android.text.TextWatcher;
import android.view.View$OnKeyListener;
import android.support.v4.widget.CursorAdapter;
import android.app.SearchableInfo;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import android.view.View$OnFocusChangeListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.support.v7.view.CollapsibleActionView;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView
{
    static final SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER;
    private static final boolean IS_AT_LEAST_FROYO;
    private static final String[] z;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View$OnClickListener mOnClickListener;
    private SearchView$OnCloseListener mOnCloseListener;
    private final TextView$OnEditorActionListener mOnEditorActionListener;
    private final AdapterView$OnItemClickListener mOnItemClickListener;
    private final AdapterView$OnItemSelectedListener mOnItemSelectedListener;
    private SearchView$OnQueryTextListener mOnQueryChangeListener;
    private View$OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View$OnClickListener mOnSearchClickListener;
    private SearchView$OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private Runnable mReleaseCursorRunnable;
    private final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    private final SearchView$SearchAutoComplete mSearchSrcTextView;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    private CursorAdapter mSuggestionsAdapter;
    View$OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private final TintManager mTintManager;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;
    
    static {
        int is_AT_LEAST_FROYO = 1;
        final String[] z2 = new String[37];
        String s = "dwe{UiqVg]d}hpY";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0019:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_1067: {
                        if (length > n3) {
                            break Label_1067;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "'6)";
                                n2 = is_AT_LEAST_FROYO;
                                array = z2;
                                n = 0;
                                continue Label_0019;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                array = z2;
                                s = "nxybHX{lcThr";
                                n = is_AT_LEAST_FROYO;
                                continue Label_0019;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                s = "Dy|{X'xfc\u001ca\u007fgs\u001cqy`tY'elvNd~)v_s\u007f\u007f~H~";
                                n = 2;
                                array = z2;
                                continue Label_0019;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                s = "Tshe_o@`rK";
                                n = 3;
                                array = z2;
                                continue Label_0019;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])F[XqWB";
                                n = 4;
                                array = z2;
                                continue Label_0019;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "dwe{UiqVg]d}hpY";
                                n = 5;
                                array = z2;
                                continue Label_0019;
                            }
                            case 5: {
                                array[n2] = intern;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])DLDiKBZHlBXM^r@_GCyIBVUiIRER";
                                n = 6;
                                n2 = 7;
                                array = z2;
                                continue Label_0019;
                            }
                            case 6: {
                                array[n2] = intern;
                                s = "adlrcay{z";
                                n2 = 8;
                                array = z2;
                                n = 7;
                                continue Label_0019;
                            }
                            case 7: {
                                array[n2] = intern;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])ZHY{RWNR";
                                n2 = 9;
                                array = z2;
                                n = 8;
                                continue Label_0019;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                array = z2;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])[HOcUSZBpSE";
                                n = 9;
                                continue Label_0019;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])DLDiKBZHlBXM^r@_GCyIB";
                                n = 10;
                                array = z2;
                                continue Label_0019;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])ZHY{RWNRcJYMRp";
                                n = 11;
                                array = z2;
                                continue Label_0019;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "ffyHXfbh";
                                n = 12;
                                array = z2;
                                continue Label_0019;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "fxmeSnr'~Rssgc\u0012fu}~Si8ZR}UUA";
                                n = 13;
                                array = z2;
                                continue Label_0019;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "fxmeSnr'~Rssgc\u0012fu}~Si8ZR}UUA";
                                n = 14;
                                array = z2;
                                continue Label_0019;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = "Tshe_o@`rK";
                                n = 15;
                                array = z2;
                                continue Label_0019;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = "Aw`{Yc6evIiua7]db`aUso37";
                                n = 16;
                                array = z2;
                                continue Label_0019;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "Tshe_o@`rK";
                                n = 17;
                                array = z2;
                                continue Label_0019;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "Tshe_o6zb[`szcUhxz7_rdzxN'w}7Nha)";
                                n = 18;
                                array = z2;
                                continue Label_0019;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "fxmeSnr'~Rssgc\u0012fu}~Si8ZR}UUA";
                                n = 19;
                                array = z2;
                                continue Label_0019;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = "tcnpYtbV~Rssgcccw}vcnr";
                                n = 20;
                                array = z2;
                                continue Label_0019;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "tcnpYtbV~RssgccvcleE";
                                n = 21;
                                array = z2;
                                continue Label_0019;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "tcnpYtbV~Rssgccbn}e]Xrhc]";
                                n = 22;
                                array = z2;
                                continue Label_0019;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "tcnpYtbV~Rssgcccw}v";
                                n = 23;
                                array = z2;
                                continue Label_0019;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "'dlcIuxls\u001cbnjrLs\u007ffy\u0012";
                                n = 24;
                                array = z2;
                                continue Label_0019;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "tcnpYtbV~Rssgccfu}~Si";
                                n = 25;
                                array = z2;
                                continue Label_0019;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "relecvcleE";
                                n = 26;
                                array = z2;
                                continue Label_0019;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "vcleE";
                                n = 27;
                                array = z2;
                                continue Label_0019;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "nx}rRsIloHuwVs]swV|Y~";
                                n = 28;
                                array = z2;
                                continue Label_0019;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = "fu}~SiIbrE";
                                n = 29;
                                array = z2;
                                continue Label_0019;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = "ffyHXfbh";
                                n = 30;
                                array = z2;
                                continue Label_0019;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "fu}~SiIdd[";
                                n = 31;
                                array = z2;
                                continue Label_0019;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "fxmeSnr'dLbsj\u007f\u0012bn}e])ZHY{RWNRcJYMRp";
                                n = 32;
                                array = z2;
                                continue Label_0019;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "fxmeSnr'dLbsj\u007f\u0012fu}~Si8^R~XELVnD^";
                                n = 33;
                                array = z2;
                                continue Label_0019;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "fxmeSnr'dLbsj\u007f\u0012fu}~Si8[R\u007fHQG^fBIZGyBUA";
                                n = 34;
                                array = z2;
                                continue Label_0019;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "pskHObw{tT";
                                n = 35;
                                array = z2;
                                continue Label_0019;
                            }
                            case 35: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            z = z2;
                            while (true) {
                                Label_1162: {
                                    try {
                                        if (Build$VERSION.SDK_INT >= 8) {
                                            IS_AT_LEAST_FROYO = (is_AT_LEAST_FROYO != 0);
                                            HIDDEN_METHOD_INVOKER = new SearchView$AutoCompleteTextViewReflector();
                                            return;
                                        }
                                        break Label_1162;
                                        char c = '\0';
                                        Label_1150: {
                                            c = '\u0017';
                                        }
                                        while (true) {
                                            final char c2;
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            Label_1129:
                                            c = '\u0007';
                                            continue;
                                            Label_1143:
                                            c = '\t';
                                            continue;
                                            Label_1108:
                                            c = '<';
                                            continue;
                                            Label_1136:
                                            c = '\u0016';
                                            continue;
                                        }
                                        final char c2 = charArray[n3];
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@69a6976b, n3 % 5)
                                    catch (ActivityNotFoundException ex) {
                                        throw ex;
                                    }
                                }
                                is_AT_LEAST_FROYO = 0;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public SearchView(final Context context) {
        this(context, null);
    }
    
    public SearchView(final Context context, final AttributeSet set) {
        this(context, set, R$attr.searchViewStyle);
    }
    
    public SearchView(final Context p0, final AttributeSet p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: aload_1        
        //     7: aload_2        
        //     8: iload_3        
        //     9: invokespecial   android/support/v7/widget/LinearLayoutCompat.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    12: aload_0        
        //    13: new             Landroid/support/v7/widget/SearchView$1;
        //    16: dup            
        //    17: aload_0        
        //    18: invokespecial   android/support/v7/widget/SearchView$1.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    21: putfield        android/support/v7/widget/SearchView.mShowImeRunnable:Ljava/lang/Runnable;
        //    24: aload_0        
        //    25: new             Landroid/support/v7/widget/SearchView$2;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   android/support/v7/widget/SearchView$2.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    33: putfield        android/support/v7/widget/SearchView.mUpdateDrawableStateRunnable:Ljava/lang/Runnable;
        //    36: aload_0        
        //    37: new             Landroid/support/v7/widget/SearchView$3;
        //    40: dup            
        //    41: aload_0        
        //    42: invokespecial   android/support/v7/widget/SearchView$3.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    45: putfield        android/support/v7/widget/SearchView.mReleaseCursorRunnable:Ljava/lang/Runnable;
        //    48: aload_0        
        //    49: new             Ljava/util/WeakHashMap;
        //    52: dup            
        //    53: invokespecial   java/util/WeakHashMap.<init>:()V
        //    56: putfield        android/support/v7/widget/SearchView.mOutsideDrawablesCache:Ljava/util/WeakHashMap;
        //    59: aload_0        
        //    60: new             Landroid/support/v7/widget/SearchView$7;
        //    63: dup            
        //    64: aload_0        
        //    65: invokespecial   android/support/v7/widget/SearchView$7.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    68: putfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //    71: aload_0        
        //    72: new             Landroid/support/v7/widget/SearchView$8;
        //    75: dup            
        //    76: aload_0        
        //    77: invokespecial   android/support/v7/widget/SearchView$8.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    80: putfield        android/support/v7/widget/SearchView.mTextKeyListener:Landroid/view/View$OnKeyListener;
        //    83: aload_0        
        //    84: new             Landroid/support/v7/widget/SearchView$9;
        //    87: dup            
        //    88: aload_0        
        //    89: invokespecial   android/support/v7/widget/SearchView$9.<init>:(Landroid/support/v7/widget/SearchView;)V
        //    92: putfield        android/support/v7/widget/SearchView.mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;
        //    95: aload_0        
        //    96: new             Landroid/support/v7/widget/SearchView$10;
        //    99: dup            
        //   100: aload_0        
        //   101: invokespecial   android/support/v7/widget/SearchView$10.<init>:(Landroid/support/v7/widget/SearchView;)V
        //   104: putfield        android/support/v7/widget/SearchView.mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
        //   107: aload_0        
        //   108: new             Landroid/support/v7/widget/SearchView$11;
        //   111: dup            
        //   112: aload_0        
        //   113: invokespecial   android/support/v7/widget/SearchView$11.<init>:(Landroid/support/v7/widget/SearchView;)V
        //   116: putfield        android/support/v7/widget/SearchView.mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
        //   119: aload_0        
        //   120: new             Landroid/support/v7/widget/SearchView$12;
        //   123: dup            
        //   124: aload_0        
        //   125: invokespecial   android/support/v7/widget/SearchView$12.<init>:(Landroid/support/v7/widget/SearchView;)V
        //   128: putfield        android/support/v7/widget/SearchView.mTextWatcher:Landroid/text/TextWatcher;
        //   131: aload_1        
        //   132: aload_2        
        //   133: getstatic       android/support/v7/appcompat/R$styleable.SearchView:[I
        //   136: iload_3        
        //   137: iconst_0       
        //   138: invokestatic    android/support/v7/internal/widget/TintTypedArray.obtainStyledAttributes:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/internal/widget/TintTypedArray;
        //   141: astore          5
        //   143: aload_0        
        //   144: aload           5
        //   146: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getTintManager:()Landroid/support/v7/internal/widget/TintManager;
        //   149: putfield        android/support/v7/widget/SearchView.mTintManager:Landroid/support/v7/internal/widget/TintManager;
        //   152: aload_1        
        //   153: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   156: aload           5
        //   158: getstatic       android/support/v7/appcompat/R$styleable.SearchView_layout:I
        //   161: getstatic       android/support/v7/appcompat/R$layout.abc_search_view:I
        //   164: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getResourceId:(II)I
        //   167: aload_0        
        //   168: iconst_1       
        //   169: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   172: pop            
        //   173: aload_0        
        //   174: aload_0        
        //   175: getstatic       android/support/v7/appcompat/R$id.search_src_text:I
        //   178: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   181: checkcast       Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   184: putfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   187: aload_0        
        //   188: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   191: aload_0        
        //   192: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setSearchView:(Landroid/support/v7/widget/SearchView;)V
        //   195: aload_0        
        //   196: aload_0        
        //   197: getstatic       android/support/v7/appcompat/R$id.search_edit_frame:I
        //   200: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   203: putfield        android/support/v7/widget/SearchView.mSearchEditFrame:Landroid/view/View;
        //   206: aload_0        
        //   207: aload_0        
        //   208: getstatic       android/support/v7/appcompat/R$id.search_plate:I
        //   211: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   214: putfield        android/support/v7/widget/SearchView.mSearchPlate:Landroid/view/View;
        //   217: aload_0        
        //   218: aload_0        
        //   219: getstatic       android/support/v7/appcompat/R$id.submit_area:I
        //   222: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   225: putfield        android/support/v7/widget/SearchView.mSubmitArea:Landroid/view/View;
        //   228: aload_0        
        //   229: aload_0        
        //   230: getstatic       android/support/v7/appcompat/R$id.search_button:I
        //   233: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   236: checkcast       Landroid/widget/ImageView;
        //   239: putfield        android/support/v7/widget/SearchView.mSearchButton:Landroid/widget/ImageView;
        //   242: aload_0        
        //   243: aload_0        
        //   244: getstatic       android/support/v7/appcompat/R$id.search_go_btn:I
        //   247: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   250: checkcast       Landroid/widget/ImageView;
        //   253: putfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //   256: aload_0        
        //   257: aload_0        
        //   258: getstatic       android/support/v7/appcompat/R$id.search_close_btn:I
        //   261: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   264: checkcast       Landroid/widget/ImageView;
        //   267: putfield        android/support/v7/widget/SearchView.mCloseButton:Landroid/widget/ImageView;
        //   270: aload_0        
        //   271: aload_0        
        //   272: getstatic       android/support/v7/appcompat/R$id.search_voice_btn:I
        //   275: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   278: checkcast       Landroid/widget/ImageView;
        //   281: putfield        android/support/v7/widget/SearchView.mVoiceButton:Landroid/widget/ImageView;
        //   284: aload_0        
        //   285: aload_0        
        //   286: getstatic       android/support/v7/appcompat/R$id.search_mag_icon:I
        //   289: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   292: checkcast       Landroid/widget/ImageView;
        //   295: putfield        android/support/v7/widget/SearchView.mCollapsedIcon:Landroid/widget/ImageView;
        //   298: aload_0        
        //   299: getfield        android/support/v7/widget/SearchView.mSearchPlate:Landroid/view/View;
        //   302: aload           5
        //   304: getstatic       android/support/v7/appcompat/R$styleable.SearchView_queryBackground:I
        //   307: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   310: invokevirtual   android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   313: aload_0        
        //   314: getfield        android/support/v7/widget/SearchView.mSubmitArea:Landroid/view/View;
        //   317: aload           5
        //   319: getstatic       android/support/v7/appcompat/R$styleable.SearchView_submitBackground:I
        //   322: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   325: invokevirtual   android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   328: aload_0        
        //   329: getfield        android/support/v7/widget/SearchView.mSearchButton:Landroid/widget/ImageView;
        //   332: aload           5
        //   334: getstatic       android/support/v7/appcompat/R$styleable.SearchView_searchIcon:I
        //   337: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   340: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   343: aload_0        
        //   344: getfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //   347: aload           5
        //   349: getstatic       android/support/v7/appcompat/R$styleable.SearchView_goIcon:I
        //   352: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   355: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   358: aload_0        
        //   359: getfield        android/support/v7/widget/SearchView.mCloseButton:Landroid/widget/ImageView;
        //   362: aload           5
        //   364: getstatic       android/support/v7/appcompat/R$styleable.SearchView_closeIcon:I
        //   367: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   370: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   373: aload_0        
        //   374: getfield        android/support/v7/widget/SearchView.mVoiceButton:Landroid/widget/ImageView;
        //   377: aload           5
        //   379: getstatic       android/support/v7/appcompat/R$styleable.SearchView_voiceIcon:I
        //   382: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   385: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   388: aload_0        
        //   389: getfield        android/support/v7/widget/SearchView.mCollapsedIcon:Landroid/widget/ImageView;
        //   392: aload           5
        //   394: getstatic       android/support/v7/appcompat/R$styleable.SearchView_searchIcon:I
        //   397: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   400: invokevirtual   android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   403: aload_0        
        //   404: aload           5
        //   406: getstatic       android/support/v7/appcompat/R$styleable.SearchView_searchHintIcon:I
        //   409: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   412: putfield        android/support/v7/widget/SearchView.mSearchHintIcon:Landroid/graphics/drawable/Drawable;
        //   415: aload_0        
        //   416: aload           5
        //   418: getstatic       android/support/v7/appcompat/R$styleable.SearchView_suggestionRowLayout:I
        //   421: getstatic       android/support/v7/appcompat/R$layout.abc_search_dropdown_item_icons_2line:I
        //   424: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getResourceId:(II)I
        //   427: putfield        android/support/v7/widget/SearchView.mSuggestionRowLayout:I
        //   430: aload_0        
        //   431: aload           5
        //   433: getstatic       android/support/v7/appcompat/R$styleable.SearchView_commitIcon:I
        //   436: iconst_0       
        //   437: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getResourceId:(II)I
        //   440: putfield        android/support/v7/widget/SearchView.mSuggestionCommitIconResId:I
        //   443: aload_0        
        //   444: getfield        android/support/v7/widget/SearchView.mSearchButton:Landroid/widget/ImageView;
        //   447: aload_0        
        //   448: getfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //   451: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   454: aload_0        
        //   455: getfield        android/support/v7/widget/SearchView.mCloseButton:Landroid/widget/ImageView;
        //   458: aload_0        
        //   459: getfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //   462: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   465: aload_0        
        //   466: getfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //   469: aload_0        
        //   470: getfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //   473: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   476: aload_0        
        //   477: getfield        android/support/v7/widget/SearchView.mVoiceButton:Landroid/widget/ImageView;
        //   480: aload_0        
        //   481: getfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //   484: invokevirtual   android/widget/ImageView.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   487: aload_0        
        //   488: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   491: aload_0        
        //   492: getfield        android/support/v7/widget/SearchView.mOnClickListener:Landroid/view/View$OnClickListener;
        //   495: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   498: aload_0        
        //   499: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   502: aload_0        
        //   503: getfield        android/support/v7/widget/SearchView.mTextWatcher:Landroid/text/TextWatcher;
        //   506: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   509: aload_0        
        //   510: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   513: aload_0        
        //   514: getfield        android/support/v7/widget/SearchView.mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;
        //   517: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnEditorActionListener:(Landroid/widget/TextView$OnEditorActionListener;)V
        //   520: aload_0        
        //   521: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   524: aload_0        
        //   525: getfield        android/support/v7/widget/SearchView.mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;
        //   528: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   531: aload_0        
        //   532: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   535: aload_0        
        //   536: getfield        android/support/v7/widget/SearchView.mOnItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;
        //   539: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnItemSelectedListener:(Landroid/widget/AdapterView$OnItemSelectedListener;)V
        //   542: aload_0        
        //   543: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   546: aload_0        
        //   547: getfield        android/support/v7/widget/SearchView.mTextKeyListener:Landroid/view/View$OnKeyListener;
        //   550: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnKeyListener:(Landroid/view/View$OnKeyListener;)V
        //   553: aload_0        
        //   554: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   557: new             Landroid/support/v7/widget/SearchView$4;
        //   560: dup            
        //   561: aload_0        
        //   562: invokespecial   android/support/v7/widget/SearchView$4.<init>:(Landroid/support/v7/widget/SearchView;)V
        //   565: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setOnFocusChangeListener:(Landroid/view/View$OnFocusChangeListener;)V
        //   568: aload_0        
        //   569: aload           5
        //   571: getstatic       android/support/v7/appcompat/R$styleable.SearchView_iconifiedByDefault:I
        //   574: iconst_1       
        //   575: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getBoolean:(IZ)Z
        //   578: invokevirtual   android/support/v7/widget/SearchView.setIconifiedByDefault:(Z)V
        //   581: aload           5
        //   583: getstatic       android/support/v7/appcompat/R$styleable.SearchView_android_maxWidth:I
        //   586: iconst_m1      
        //   587: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getDimensionPixelSize:(II)I
        //   590: istore          7
        //   592: iload           7
        //   594: iconst_m1      
        //   595: if_icmpeq       604
        //   598: aload_0        
        //   599: iload           7
        //   601: invokevirtual   android/support/v7/widget/SearchView.setMaxWidth:(I)V
        //   604: aload           5
        //   606: getstatic       android/support/v7/appcompat/R$styleable.SearchView_queryHint:I
        //   609: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getText:(I)Ljava/lang/CharSequence;
        //   612: astore          8
        //   614: aload           8
        //   616: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   619: ifne            628
        //   622: aload_0        
        //   623: aload           8
        //   625: invokevirtual   android/support/v7/widget/SearchView.setQueryHint:(Ljava/lang/CharSequence;)V
        //   628: aload           5
        //   630: getstatic       android/support/v7/appcompat/R$styleable.SearchView_android_imeOptions:I
        //   633: iconst_m1      
        //   634: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //   637: istore          10
        //   639: iload           10
        //   641: iconst_m1      
        //   642: if_icmpeq       651
        //   645: aload_0        
        //   646: iload           10
        //   648: invokevirtual   android/support/v7/widget/SearchView.setImeOptions:(I)V
        //   651: aload           5
        //   653: getstatic       android/support/v7/appcompat/R$styleable.SearchView_android_inputType:I
        //   656: iconst_m1      
        //   657: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getInt:(II)I
        //   660: istore          11
        //   662: iload           11
        //   664: iconst_m1      
        //   665: if_icmpeq       674
        //   668: aload_0        
        //   669: iload           11
        //   671: invokevirtual   android/support/v7/widget/SearchView.setInputType:(I)V
        //   674: aload           5
        //   676: getstatic       android/support/v7/appcompat/R$styleable.SearchView_android_focusable:I
        //   679: iconst_1       
        //   680: invokevirtual   android/support/v7/internal/widget/TintTypedArray.getBoolean:(IZ)Z
        //   683: istore          12
        //   685: aload_0        
        //   686: iload           12
        //   688: invokevirtual   android/support/v7/widget/SearchView.setFocusable:(Z)V
        //   691: aload           5
        //   693: invokevirtual   android/support/v7/internal/widget/TintTypedArray.recycle:()V
        //   696: aload_0        
        //   697: new             Landroid/content/Intent;
        //   700: dup            
        //   701: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   704: bipush          34
        //   706: aaload         
        //   707: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   710: putfield        android/support/v7/widget/SearchView.mVoiceWebSearchIntent:Landroid/content/Intent;
        //   713: aload_0        
        //   714: getfield        android/support/v7/widget/SearchView.mVoiceWebSearchIntent:Landroid/content/Intent;
        //   717: ldc_w           268435456
        //   720: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   723: pop            
        //   724: aload_0        
        //   725: getfield        android/support/v7/widget/SearchView.mVoiceWebSearchIntent:Landroid/content/Intent;
        //   728: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   731: bipush          33
        //   733: aaload         
        //   734: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   737: bipush          36
        //   739: aaload         
        //   740: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   743: pop            
        //   744: aload_0        
        //   745: new             Landroid/content/Intent;
        //   748: dup            
        //   749: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   752: bipush          35
        //   754: aaload         
        //   755: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   758: putfield        android/support/v7/widget/SearchView.mVoiceAppSearchIntent:Landroid/content/Intent;
        //   761: aload_0        
        //   762: getfield        android/support/v7/widget/SearchView.mVoiceAppSearchIntent:Landroid/content/Intent;
        //   765: ldc_w           268435456
        //   768: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //   771: pop            
        //   772: aload_0        
        //   773: aload_0        
        //   774: aload_0        
        //   775: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   778: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getDropDownAnchor:()I
        //   781: invokevirtual   android/support/v7/widget/SearchView.findViewById:(I)Landroid/view/View;
        //   784: putfield        android/support/v7/widget/SearchView.mDropDownAnchor:Landroid/view/View;
        //   787: aload_0        
        //   788: getfield        android/support/v7/widget/SearchView.mDropDownAnchor:Landroid/view/View;
        //   791: astore          20
        //   793: aload           20
        //   795: ifnull          841
        //   798: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   801: istore          21
        //   803: iload           21
        //   805: bipush          11
        //   807: if_icmplt       837
        //   810: aload_0        
        //   811: invokespecial   android/support/v7/widget/SearchView.addOnLayoutChangeListenerToDropDownAnchorSDK11:()V
        //   814: iload           4
        //   816: ifeq            841
        //   819: getstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   822: istore          22
        //   824: iload           22
        //   826: ifeq            894
        //   829: iconst_0       
        //   830: istore          23
        //   832: iload           23
        //   834: putstatic       android/support/v7/app/AppCompatActivity.b:Z
        //   837: aload_0        
        //   838: invokespecial   android/support/v7/widget/SearchView.addOnLayoutChangeListenerToDropDownAnchorBase:()V
        //   841: aload_0        
        //   842: aload_0        
        //   843: getfield        android/support/v7/widget/SearchView.mIconifiedByDefault:Z
        //   846: invokespecial   android/support/v7/widget/SearchView.updateViewsVisibility:(Z)V
        //   849: aload_0        
        //   850: invokespecial   android/support/v7/widget/SearchView.updateQueryHint:()V
        //   853: return         
        //   854: astore          26
        //   856: aload           26
        //   858: athrow         
        //   859: astore          9
        //   861: aload           9
        //   863: athrow         
        //   864: astore          25
        //   866: aload           25
        //   868: athrow         
        //   869: astore          24
        //   871: aload           24
        //   873: athrow         
        //   874: astore          13
        //   876: aload           13
        //   878: athrow         
        //   879: astore          14
        //   881: aload           14
        //   883: athrow         
        //   884: astore          15
        //   886: aload           15
        //   888: athrow         
        //   889: astore          16
        //   891: aload           16
        //   893: athrow         
        //   894: iconst_1       
        //   895: istore          23
        //   897: goto            832
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  598    604    854    859    Landroid/content/ActivityNotFoundException;
        //  614    628    859    864    Landroid/content/ActivityNotFoundException;
        //  645    651    864    869    Landroid/content/ActivityNotFoundException;
        //  668    674    869    874    Landroid/content/ActivityNotFoundException;
        //  685    793    874    879    Landroid/content/ActivityNotFoundException;
        //  798    803    879    884    Landroid/content/ActivityNotFoundException;
        //  810    814    884    889    Landroid/content/ActivityNotFoundException;
        //  819    824    889    894    Landroid/content/ActivityNotFoundException;
        //  876    879    879    884    Landroid/content/ActivityNotFoundException;
        //  881    884    884    889    Landroid/content/ActivityNotFoundException;
        //  886    889    889    894    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 418, Size: 418
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static void access$000(final SearchView searchView) {
        searchView.updateFocusedState();
    }
    
    static CursorAdapter access$100(final SearchView searchView) {
        return searchView.mSuggestionsAdapter;
    }
    
    static ImageView access$1000(final SearchView searchView) {
        return searchView.mVoiceButton;
    }
    
    static void access$1100(final SearchView searchView) {
        searchView.onVoiceClicked();
    }
    
    static SearchView$SearchAutoComplete access$1200(final SearchView searchView) {
        return searchView.mSearchSrcTextView;
    }
    
    static void access$1300(final SearchView searchView) {
        searchView.forceSuggestionQuery();
    }
    
    static SearchableInfo access$1400(final SearchView searchView) {
        return searchView.mSearchable;
    }
    
    static boolean access$1500(final SearchView searchView, final View view, final int n, final KeyEvent keyEvent) {
        return searchView.onSuggestionsKey(view, n, keyEvent);
    }
    
    static void access$1700(final SearchView searchView, final int n, final String s, final String s2) {
        searchView.launchQuerySearch(n, s, s2);
    }
    
    static boolean access$1800(final SearchView searchView, final int n, final int n2, final String s) {
        return searchView.onItemClicked(n, n2, s);
    }
    
    static boolean access$1900(final SearchView searchView, final int n) {
        return searchView.onItemSelected(n);
    }
    
    static View$OnFocusChangeListener access$200(final SearchView searchView) {
        return searchView.mOnQueryTextFocusChangeListener;
    }
    
    static void access$2000(final SearchView searchView, final CharSequence charSequence) {
        searchView.onTextChanged(charSequence);
    }
    
    static void access$2100(final SearchView searchView, final boolean imeVisibility) {
        searchView.setImeVisibility(imeVisibility);
    }
    
    static void access$300(final SearchView searchView) {
        searchView.adjustDropDownSizeAndPosition();
    }
    
    static ImageView access$400(final SearchView searchView) {
        return searchView.mSearchButton;
    }
    
    static void access$500(final SearchView searchView) {
        searchView.onSearchClicked();
    }
    
    static ImageView access$600(final SearchView searchView) {
        return searchView.mCloseButton;
    }
    
    static void access$700(final SearchView searchView) {
        searchView.onCloseClicked();
    }
    
    static ImageView access$800(final SearchView searchView) {
        return searchView.mGoButton;
    }
    
    static void access$900(final SearchView searchView) {
        searchView.onSubmitQuery();
    }
    
    private void addOnLayoutChangeListenerToDropDownAnchorBase() {
        this.mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new SearchView$6(this));
    }
    
    @TargetApi(11)
    private void addOnLayoutChangeListenerToDropDownAnchorSDK11() {
        this.mDropDownAnchor.addOnLayoutChangeListener((View$OnLayoutChangeListener)new SearchView$5(this));
    }
    
    private void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() <= 1) {
            return;
        }
        while (true) {
            final Resources resources = this.getContext().getResources();
            final int paddingLeft = this.mSearchPlate.getPaddingLeft();
            final Rect rect = new Rect();
            final boolean layoutRtl = ViewUtils.isLayoutRtl((View)this);
            while (true) {
                try {
                    if (this.mIconifiedByDefault) {
                        final int n = resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R$dimen.abc_dropdownitem_icon_width);
                        this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
                        int dropDownHorizontalOffset = 0;
                        Label_0114: {
                            if (layoutRtl) {
                                dropDownHorizontalOffset = -rect.left;
                                if (!LinearLayoutCompat.a) {
                                    break Label_0114;
                                }
                            }
                            dropDownHorizontalOffset = paddingLeft - (n + rect.left);
                        }
                        this.mSearchSrcTextView.setDropDownHorizontalOffset(dropDownHorizontalOffset);
                        this.mSearchSrcTextView.setDropDownWidth(n + (this.mDropDownAnchor.getWidth() + rect.left + rect.right) - paddingLeft);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    private Intent createIntent(final String p0, final Uri p1, final String p2, final String p3, final int p4, final String p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/content/Intent;
        //     3: dup            
        //     4: aload_1        
        //     5: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //     8: astore          7
        //    10: aload           7
        //    12: ldc_w           268435456
        //    15: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //    18: pop            
        //    19: aload_2        
        //    20: ifnull          30
        //    23: aload           7
        //    25: aload_2        
        //    26: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //    29: pop            
        //    30: aload           7
        //    32: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    35: bipush          27
        //    37: aaload         
        //    38: aload_0        
        //    39: getfield        android/support/v7/widget/SearchView.mUserQuery:Ljava/lang/CharSequence;
        //    42: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
        //    45: pop            
        //    46: aload           4
        //    48: ifnull          65
        //    51: aload           7
        //    53: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    56: bipush          28
        //    58: aaload         
        //    59: aload           4
        //    61: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    64: pop            
        //    65: aload_3        
        //    66: ifnull          82
        //    69: aload           7
        //    71: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    74: bipush          29
        //    76: aaload         
        //    77: aload_3        
        //    78: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    81: pop            
        //    82: aload_0        
        //    83: getfield        android/support/v7/widget/SearchView.mAppSearchData:Landroid/os/Bundle;
        //    86: ifnull          105
        //    89: aload           7
        //    91: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    94: bipush          31
        //    96: aaload         
        //    97: aload_0        
        //    98: getfield        android/support/v7/widget/SearchView.mAppSearchData:Landroid/os/Bundle;
        //   101: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
        //   104: pop            
        //   105: iload           5
        //   107: ifeq            138
        //   110: aload           7
        //   112: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   115: bipush          30
        //   117: aaload         
        //   118: iload           5
        //   120: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   123: pop            
        //   124: aload           7
        //   126: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   129: bipush          32
        //   131: aaload         
        //   132: aload           6
        //   134: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   137: pop            
        //   138: getstatic       android/support/v7/widget/SearchView.IS_AT_LEAST_FROYO:Z
        //   141: ifeq            157
        //   144: aload           7
        //   146: aload_0        
        //   147: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //   150: invokevirtual   android/app/SearchableInfo.getSearchActivity:()Landroid/content/ComponentName;
        //   153: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   156: pop            
        //   157: aload           7
        //   159: areturn        
        //   160: astore          8
        //   162: aload           8
        //   164: athrow         
        //   165: astore          11
        //   167: aload           11
        //   169: athrow         
        //   170: astore          21
        //   172: aload           21
        //   174: athrow         
        //   175: astore          14
        //   177: aload           14
        //   179: athrow         
        //   180: astore          17
        //   182: aload           17
        //   184: athrow         
        //   185: astore          15
        //   187: aload           15
        //   189: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  10     19     160    165    Landroid/content/ActivityNotFoundException;
        //  23     30     160    165    Landroid/content/ActivityNotFoundException;
        //  30     46     165    170    Landroid/content/ActivityNotFoundException;
        //  51     65     165    170    Landroid/content/ActivityNotFoundException;
        //  69     82     170    175    Landroid/content/ActivityNotFoundException;
        //  82     105    175    180    Landroid/content/ActivityNotFoundException;
        //  110    138    180    185    Landroid/content/ActivityNotFoundException;
        //  138    157    185    190    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private Intent createIntentFromSuggestion(final Cursor p0, final int p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //     4: bipush          26
        //     6: aaload         
        //     7: invokestatic    android/support/v7/widget/SuggestionsAdapter.getColumnString:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
        //    10: astore          9
        //    12: aload           9
        //    14: astore          10
        //    16: aload           10
        //    18: ifnonnull       42
        //    21: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    24: istore          20
        //    26: iload           20
        //    28: bipush          8
        //    30: if_icmplt       42
        //    33: aload_0        
        //    34: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    37: invokevirtual   android/app/SearchableInfo.getSuggestIntentAction:()Ljava/lang/String;
        //    40: astore          10
        //    42: aload           10
        //    44: ifnonnull       55
        //    47: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    50: bipush          20
        //    52: aaload         
        //    53: astore          10
        //    55: aload_1        
        //    56: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    59: bipush          24
        //    61: aaload         
        //    62: invokestatic    android/support/v7/widget/SuggestionsAdapter.getColumnString:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
        //    65: astore          11
        //    67: aload           11
        //    69: astore          12
        //    71: getstatic       android/support/v7/widget/SearchView.IS_AT_LEAST_FROYO:Z
        //    74: istore          14
        //    76: iload           14
        //    78: ifeq            95
        //    81: aload           12
        //    83: ifnonnull       95
        //    86: aload_0        
        //    87: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    90: invokevirtual   android/app/SearchableInfo.getSuggestIntentData:()Ljava/lang/String;
        //    93: astore          12
        //    95: aload           12
        //    97: ifnull          279
        //   100: aload_1        
        //   101: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   104: bipush          21
        //   106: aaload         
        //   107: invokestatic    android/support/v7/widget/SuggestionsAdapter.getColumnString:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
        //   110: astore          15
        //   112: aload           15
        //   114: ifnull          279
        //   117: new             Ljava/lang/StringBuilder;
        //   120: dup            
        //   121: invokespecial   java/lang/StringBuilder.<init>:()V
        //   124: aload           12
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: ldc_w           "/"
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: aload           15
        //   137: invokestatic    android/net/Uri.encode:(Ljava/lang/String;)Ljava/lang/String;
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: astore          12
        //   148: goto            279
        //   151: aload_1        
        //   152: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   155: bipush          22
        //   157: aaload         
        //   158: invokestatic    android/support/v7/widget/SuggestionsAdapter.getColumnString:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
        //   161: astore          17
        //   163: aload_0        
        //   164: aload           10
        //   166: aload           16
        //   168: aload_1        
        //   169: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   172: bipush          23
        //   174: aaload         
        //   175: invokestatic    android/support/v7/widget/SuggestionsAdapter.getColumnString:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
        //   178: aload           17
        //   180: iload_2        
        //   181: aload_3        
        //   182: invokespecial   android/support/v7/widget/SearchView.createIntent:(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
        //   185: areturn        
        //   186: astore          19
        //   188: aload           19
        //   190: athrow         
        //   191: astore          4
        //   193: aload_1        
        //   194: invokeinterface android/database/Cursor.getPosition:()I
        //   199: istore          8
        //   201: iload           8
        //   203: istore          6
        //   205: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   208: bipush          18
        //   210: aaload         
        //   211: new             Ljava/lang/StringBuilder;
        //   214: dup            
        //   215: invokespecial   java/lang/StringBuilder.<init>:()V
        //   218: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   221: bipush          19
        //   223: aaload         
        //   224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: iload           6
        //   229: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   232: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   235: bipush          25
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: aload           4
        //   246: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   249: pop            
        //   250: aconst_null    
        //   251: areturn        
        //   252: astore          13
        //   254: aload           13
        //   256: athrow         
        //   257: aload           12
        //   259: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   262: astore          18
        //   264: aload           18
        //   266: astore          16
        //   268: goto            151
        //   271: astore          5
        //   273: iconst_m1      
        //   274: istore          6
        //   276: goto            205
        //   279: aload           12
        //   281: ifnonnull       257
        //   284: aconst_null    
        //   285: astore          16
        //   287: goto            151
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      12     191    252    Ljava/lang/RuntimeException;
        //  21     26     186    191    Ljava/lang/RuntimeException;
        //  33     42     191    252    Ljava/lang/RuntimeException;
        //  47     55     191    252    Ljava/lang/RuntimeException;
        //  55     67     191    252    Ljava/lang/RuntimeException;
        //  71     76     252    257    Ljava/lang/RuntimeException;
        //  86     95     191    252    Ljava/lang/RuntimeException;
        //  100    112    191    252    Ljava/lang/RuntimeException;
        //  117    148    191    252    Ljava/lang/RuntimeException;
        //  151    186    191    252    Ljava/lang/RuntimeException;
        //  188    191    191    252    Ljava/lang/RuntimeException;
        //  193    201    271    279    Ljava/lang/RuntimeException;
        //  254    257    191    252    Ljava/lang/RuntimeException;
        //  257    264    191    252    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @TargetApi(8)
    private Intent createVoiceAppSearchIntent(final Intent p0, final SearchableInfo p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokevirtual   android/app/SearchableInfo.getSearchActivity:()Landroid/content/ComponentName;
        //     4: astore_3       
        //     5: new             Landroid/content/Intent;
        //     8: dup            
        //     9: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    12: bipush          14
        //    14: aaload         
        //    15: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    18: astore          4
        //    20: aload           4
        //    22: aload_3        
        //    23: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //    26: pop            
        //    27: aload_0        
        //    28: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //    31: iconst_0       
        //    32: aload           4
        //    34: ldc_w           1073741824
        //    37: invokestatic    android/app/PendingIntent.getActivity:(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
        //    40: astore          6
        //    42: new             Landroid/os/Bundle;
        //    45: dup            
        //    46: invokespecial   android/os/Bundle.<init>:()V
        //    49: astore          7
        //    51: aload_0        
        //    52: getfield        android/support/v7/widget/SearchView.mAppSearchData:Landroid/os/Bundle;
        //    55: ifnull          73
        //    58: aload           7
        //    60: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    63: bipush          13
        //    65: aaload         
        //    66: aload_0        
        //    67: getfield        android/support/v7/widget/SearchView.mAppSearchData:Landroid/os/Bundle;
        //    70: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //    73: new             Landroid/content/Intent;
        //    76: dup            
        //    77: aload_1        
        //    78: invokespecial   android/content/Intent.<init>:(Landroid/content/Intent;)V
        //    81: astore          9
        //    83: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    86: bipush          8
        //    88: aaload         
        //    89: astore          10
        //    91: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    94: bipush          8
        //    96: if_icmplt       332
        //    99: aload_0        
        //   100: invokevirtual   android/support/v7/widget/SearchView.getResources:()Landroid/content/res/Resources;
        //   103: astore          25
        //   105: aload_2        
        //   106: invokevirtual   android/app/SearchableInfo.getVoiceLanguageModeId:()I
        //   109: ifeq            123
        //   112: aload           25
        //   114: aload_2        
        //   115: invokevirtual   android/app/SearchableInfo.getVoiceLanguageModeId:()I
        //   118: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   121: astore          10
        //   123: aload_2        
        //   124: invokevirtual   android/app/SearchableInfo.getVoicePromptTextId:()I
        //   127: ifeq            326
        //   130: aload           25
        //   132: aload_2        
        //   133: invokevirtual   android/app/SearchableInfo.getVoicePromptTextId:()I
        //   136: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   139: astore          13
        //   141: aload_2        
        //   142: invokevirtual   android/app/SearchableInfo.getVoiceLanguageId:()I
        //   145: ifeq            320
        //   148: aload           25
        //   150: aload_2        
        //   151: invokevirtual   android/app/SearchableInfo.getVoiceLanguageId:()I
        //   154: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //   157: astore          14
        //   159: aload_2        
        //   160: invokevirtual   android/app/SearchableInfo.getVoiceMaxResults:()I
        //   163: ifeq            310
        //   166: aload_2        
        //   167: invokevirtual   android/app/SearchableInfo.getVoiceMaxResults:()I
        //   170: istore          26
        //   172: aload           10
        //   174: astore          11
        //   176: iload           26
        //   178: istore          12
        //   180: aload           9
        //   182: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   185: bipush          12
        //   187: aaload         
        //   188: aload           11
        //   190: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   193: pop            
        //   194: aload           9
        //   196: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   199: iconst_5       
        //   200: aaload         
        //   201: aload           13
        //   203: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   206: pop            
        //   207: aload           9
        //   209: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   212: bipush          9
        //   214: aaload         
        //   215: aload           14
        //   217: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   220: pop            
        //   221: aload           9
        //   223: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   226: bipush          10
        //   228: aaload         
        //   229: iload           12
        //   231: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   234: pop            
        //   235: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   238: bipush          6
        //   240: aaload         
        //   241: astore          20
        //   243: aconst_null    
        //   244: astore          21
        //   246: aload_3        
        //   247: ifnonnull       301
        //   250: aload           9
        //   252: aload           20
        //   254: aload           21
        //   256: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   259: pop            
        //   260: aload           9
        //   262: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   265: bipush          11
        //   267: aaload         
        //   268: aload           6
        //   270: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //   273: pop            
        //   274: aload           9
        //   276: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //   279: bipush          7
        //   281: aaload         
        //   282: aload           7
        //   284: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
        //   287: pop            
        //   288: aload           9
        //   290: areturn        
        //   291: astore          8
        //   293: aload           8
        //   295: athrow         
        //   296: astore          15
        //   298: aload           15
        //   300: athrow         
        //   301: aload_3        
        //   302: invokevirtual   android/content/ComponentName.flattenToShortString:()Ljava/lang/String;
        //   305: astore          21
        //   307: goto            250
        //   310: aload           10
        //   312: astore          11
        //   314: iconst_1       
        //   315: istore          12
        //   317: goto            180
        //   320: aconst_null    
        //   321: astore          14
        //   323: goto            159
        //   326: aconst_null    
        //   327: astore          13
        //   329: goto            141
        //   332: aload           10
        //   334: astore          11
        //   336: iconst_1       
        //   337: istore          12
        //   339: aconst_null    
        //   340: astore          13
        //   342: aconst_null    
        //   343: astore          14
        //   345: goto            180
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  51     73     291    296    Landroid/content/ActivityNotFoundException;
        //  180    243    296    301    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0180:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @TargetApi(8)
    private Intent createVoiceWebSearchIntent(final Intent intent, final SearchableInfo searchableInfo) {
        while (true) {
            final Intent intent2 = new Intent(intent);
            final ComponentName searchActivity = searchableInfo.getSearchActivity();
            while (true) {
                try {
                    final String s = SearchView.z[0];
                    if (searchActivity == null) {
                        final String flattenToShortString = null;
                        intent2.putExtra(s, flattenToShortString);
                        return intent2;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final String flattenToShortString = searchActivity.flattenToShortString();
                continue;
            }
        }
    }
    
    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }
    
    private void forceSuggestionQuery() {
        SearchView.HIDDEN_METHOD_INVOKER.doBeforeTextChanged(this.mSearchSrcTextView);
        SearchView.HIDDEN_METHOD_INVOKER.doAfterTextChanged(this.mSearchSrcTextView);
    }
    
    private CharSequence getDecoratedHint(CharSequence charSequence) {
        Label_0026: {
            try {
                if (!this.mIconifiedByDefault) {
                    return charSequence;
                }
                final SearchView searchView = this;
                final Drawable drawable = searchView.mSearchHintIcon;
                if (drawable == null) {
                    return charSequence;
                }
                break Label_0026;
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            try {
                final SearchView searchView = this;
                final Drawable drawable = searchView.mSearchHintIcon;
                if (drawable == null) {
                    return charSequence;
                }
            }
            catch (ActivityNotFoundException ex2) {
                throw ex2;
            }
        }
        final int n = (int)(1.25 * this.mSearchSrcTextView.getTextSize());
        this.mSearchHintIcon.setBounds(0, 0, n, n);
        final Object o = new SpannableStringBuilder((CharSequence)SearchView.z[1]);
        ((SpannableStringBuilder)o).setSpan((Object)new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        ((SpannableStringBuilder)o).append(charSequence);
        charSequence = (CharSequence)o;
        return charSequence;
    }
    
    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(R$dimen.abc_search_view_preferred_width);
    }
    
    static boolean isLandscapeMode(final Context context) {
        try {
            if (context.getResources().getConfiguration().orientation == 2) {
                return true;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        return false;
    }
    
    private boolean isSubmitAreaEnabled() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSubmitButtonEnabled:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifne            22
        //    11: aload_0        
        //    12: getfield        android/support/v7/widget/SearchView.mVoiceButtonEnabled:Z
        //    15: istore          6
        //    17: iload           6
        //    19: ifeq            44
        //    22: aload_0        
        //    23: invokevirtual   android/support/v7/widget/SearchView.isIconified:()Z
        //    26: istore          5
        //    28: iload           5
        //    30: ifne            44
        //    33: iconst_1       
        //    34: ireturn        
        //    35: astore_1       
        //    36: aload_1        
        //    37: athrow         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    41: astore_3       
        //    42: aload_3        
        //    43: athrow         
        //    44: iconst_0       
        //    45: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      35     38     Landroid/content/ActivityNotFoundException;
        //  11     17     38     41     Landroid/content/ActivityNotFoundException;
        //  22     28     41     44     Landroid/content/ActivityNotFoundException;
        //  36     38     38     41     Landroid/content/ActivityNotFoundException;
        //  39     41     41     44     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void launchIntent(final Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent);
        }
        catch (RuntimeException ex) {
            Log.e(SearchView.z[16], SearchView.z[17] + intent, (Throwable)ex);
        }
    }
    
    private void launchQuerySearch(final int n, final String s, final String s2) {
        this.getContext().startActivity(this.createIntent(SearchView.z[15], null, null, s2, n, s));
    }
    
    private boolean launchSuggestion(final int n, final int n2, final String s) {
        final Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToPosition(n)) {
                    this.launchIntent(this.createIntentFromSuggestion(cursor, n2, s));
                    return true;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    private void onCloseClicked() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     4: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    12: istore          7
        //    14: iload           7
        //    16: ifeq            72
        //    19: aload_0        
        //    20: getfield        android/support/v7/widget/SearchView.mIconifiedByDefault:Z
        //    23: istore          9
        //    25: iload           9
        //    27: ifeq            95
        //    30: aload_0        
        //    31: getfield        android/support/v7/widget/SearchView.mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;
        //    34: astore          10
        //    36: aload           10
        //    38: ifnull          57
        //    41: aload_0        
        //    42: getfield        android/support/v7/widget/SearchView.mOnCloseListener:Landroid/support/v7/widget/SearchView$OnCloseListener;
        //    45: invokeinterface android/support/v7/widget/SearchView$OnCloseListener.onClose:()Z
        //    50: istore          11
        //    52: iload           11
        //    54: ifne            95
        //    57: aload_0        
        //    58: invokevirtual   android/support/v7/widget/SearchView.clearFocus:()V
        //    61: aload_0        
        //    62: iconst_1       
        //    63: invokespecial   android/support/v7/widget/SearchView.updateViewsVisibility:(Z)V
        //    66: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    69: ifeq            95
        //    72: aload_0        
        //    73: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    76: ldc_w           ""
        //    79: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setText:(Ljava/lang/CharSequence;)V
        //    82: aload_0        
        //    83: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    86: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.requestFocus:()Z
        //    89: pop            
        //    90: aload_0        
        //    91: iconst_1       
        //    92: invokespecial   android/support/v7/widget/SearchView.setImeVisibility:(Z)V
        //    95: return         
        //    96: astore_2       
        //    97: aload_2        
        //    98: athrow         
        //    99: astore_3       
        //   100: aload_3        
        //   101: athrow         
        //   102: astore          4
        //   104: aload           4
        //   106: athrow         
        //   107: astore          5
        //   109: aload           5
        //   111: athrow         
        //   112: astore          6
        //   114: aload           6
        //   116: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  8      14     96     99     Landroid/content/ActivityNotFoundException;
        //  19     25     99     102    Landroid/content/ActivityNotFoundException;
        //  30     36     102    107    Landroid/content/ActivityNotFoundException;
        //  41     52     107    112    Landroid/content/ActivityNotFoundException;
        //  57     72     112    117    Landroid/content/ActivityNotFoundException;
        //  72     95     112    117    Landroid/content/ActivityNotFoundException;
        //  97     99     99     102    Landroid/content/ActivityNotFoundException;
        //  100    102    102    107    Landroid/content/ActivityNotFoundException;
        //  104    107    107    112    Landroid/content/ActivityNotFoundException;
        //  109    112    112    117    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private boolean onItemClicked(final int p0, final int p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;
        //     4: astore          6
        //     6: aload           6
        //     8: ifnull          24
        //    11: aload_0        
        //    12: getfield        android/support/v7/widget/SearchView.mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;
        //    15: iload_1        
        //    16: invokeinterface android/support/v7/widget/SearchView$OnSuggestionListener.onSuggestionClick:(I)Z
        //    21: ifne            53
        //    24: aload_0        
        //    25: iload_1        
        //    26: iconst_0       
        //    27: aconst_null    
        //    28: invokespecial   android/support/v7/widget/SearchView.launchSuggestion:(IILjava/lang/String;)Z
        //    31: pop            
        //    32: aload_0        
        //    33: iconst_0       
        //    34: invokespecial   android/support/v7/widget/SearchView.setImeVisibility:(Z)V
        //    37: aload_0        
        //    38: invokespecial   android/support/v7/widget/SearchView.dismissSuggestions:()V
        //    41: iconst_1       
        //    42: ireturn        
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore          5
        //    50: aload           5
        //    52: athrow         
        //    53: iconst_0       
        //    54: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      43     48     Landroid/content/ActivityNotFoundException;
        //  11     24     48     53     Landroid/content/ActivityNotFoundException;
        //  24     41     48     53     Landroid/content/ActivityNotFoundException;
        //  45     48     48     53     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private boolean onItemSelected(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          24
        //    11: aload_0        
        //    12: getfield        android/support/v7/widget/SearchView.mOnSuggestionListener:Landroid/support/v7/widget/SearchView$OnSuggestionListener;
        //    15: iload_1        
        //    16: invokeinterface android/support/v7/widget/SearchView$OnSuggestionListener.onSuggestionSelect:(I)Z
        //    21: ifne            37
        //    24: aload_0        
        //    25: iload_1        
        //    26: invokespecial   android/support/v7/widget/SearchView.rewriteQueryFromSuggestion:(I)V
        //    29: iconst_1       
        //    30: ireturn        
        //    31: astore_2       
        //    32: aload_2        
        //    33: athrow         
        //    34: astore_3       
        //    35: aload_3        
        //    36: athrow         
        //    37: iconst_0       
        //    38: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      31     34     Landroid/content/ActivityNotFoundException;
        //  11     24     34     37     Landroid/content/ActivityNotFoundException;
        //  24     29     34     37     Landroid/content/ActivityNotFoundException;
        //  32     34     34     37     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void onSearchClicked() {
        try {
            this.updateViewsVisibility(false);
            this.mSearchSrcTextView.requestFocus();
            this.setImeVisibility(true);
            if (this.mOnSearchClickListener != null) {
                this.mOnSearchClickListener.onClick((View)this);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private void onSubmitQuery() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     4: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ifnull          84
        //    12: aload_1        
        //    13: invokestatic    android/text/TextUtils.getTrimmedLength:(Ljava/lang/CharSequence;)I
        //    16: istore          6
        //    18: iload           6
        //    20: ifle            84
        //    23: aload_0        
        //    24: getfield        android/support/v7/widget/SearchView.mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;
        //    27: astore          7
        //    29: aload           7
        //    31: ifnull          56
        //    34: aload_0        
        //    35: getfield        android/support/v7/widget/SearchView.mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;
        //    38: aload_1        
        //    39: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    44: invokeinterface android/support/v7/widget/SearchView$OnQueryTextListener.onQueryTextSubmit:(Ljava/lang/String;)Z
        //    49: istore          8
        //    51: iload           8
        //    53: ifne            84
        //    56: aload_0        
        //    57: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    60: ifnull          75
        //    63: aload_0        
        //    64: iconst_0       
        //    65: aconst_null    
        //    66: aload_1        
        //    67: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    72: invokespecial   android/support/v7/widget/SearchView.launchQuerySearch:(ILjava/lang/String;Ljava/lang/String;)V
        //    75: aload_0        
        //    76: iconst_0       
        //    77: invokespecial   android/support/v7/widget/SearchView.setImeVisibility:(Z)V
        //    80: aload_0        
        //    81: invokespecial   android/support/v7/widget/SearchView.dismissSuggestions:()V
        //    84: return         
        //    85: astore_2       
        //    86: aload_2        
        //    87: athrow         
        //    88: astore_3       
        //    89: aload_3        
        //    90: athrow         
        //    91: astore          4
        //    93: aload           4
        //    95: athrow         
        //    96: astore          5
        //    98: aload           5
        //   100: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  12     18     85     88     Landroid/content/ActivityNotFoundException;
        //  23     29     88     91     Landroid/content/ActivityNotFoundException;
        //  34     51     91     96     Landroid/content/ActivityNotFoundException;
        //  56     75     96     101    Landroid/content/ActivityNotFoundException;
        //  86     88     88     91     Landroid/content/ActivityNotFoundException;
        //  89     91     91     96     Landroid/content/ActivityNotFoundException;
        //  93     96     96     101    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private boolean onSuggestionsKey(final View p0, final int p1, final KeyEvent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnonnull       18
        //    11: iconst_0       
        //    12: ireturn        
        //    13: astore          4
        //    15: aload           4
        //    17: athrow         
        //    18: aload_0        
        //    19: getfield        android/support/v7/widget/SearchView.mSuggestionsAdapter:Landroid/support/v4/widget/CursorAdapter;
        //    22: astore          7
        //    24: aload           7
        //    26: ifnull          11
        //    29: aload_3        
        //    30: invokevirtual   android/view/KeyEvent.getAction:()I
        //    33: istore          12
        //    35: iload           12
        //    37: ifne            11
        //    40: aload_3        
        //    41: invokestatic    android/support/v4/view/KeyEventCompat.hasNoModifiers:(Landroid/view/KeyEvent;)Z
        //    44: istore          13
        //    46: iload           13
        //    48: ifeq            11
        //    51: iload_2        
        //    52: bipush          66
        //    54: if_icmpeq       69
        //    57: iload_2        
        //    58: bipush          84
        //    60: if_icmpeq       69
        //    63: iload_2        
        //    64: bipush          61
        //    66: if_icmpne       108
        //    69: aload_0        
        //    70: aload_0        
        //    71: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    74: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getListSelection:()I
        //    77: iconst_0       
        //    78: aconst_null    
        //    79: invokespecial   android/support/v7/widget/SearchView.onItemClicked:(IILjava/lang/String;)Z
        //    82: ireturn        
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    88: astore          8
        //    90: aload           8
        //    92: athrow         
        //    93: astore          9
        //    95: aload           9
        //    97: athrow         
        //    98: astore          10
        //   100: aload           10
        //   102: athrow         
        //   103: astore          11
        //   105: aload           11
        //   107: athrow         
        //   108: iload_2        
        //   109: bipush          21
        //   111: if_icmpeq       120
        //   114: iload_2        
        //   115: bipush          22
        //   117: if_icmpne       178
        //   120: iload_2        
        //   121: bipush          21
        //   123: if_icmpne       166
        //   126: iconst_0       
        //   127: istore          14
        //   129: aload_0        
        //   130: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   133: iload           14
        //   135: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setSelection:(I)V
        //   138: aload_0        
        //   139: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   142: iconst_0       
        //   143: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setListSelection:(I)V
        //   146: aload_0        
        //   147: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   150: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.clearListSelection:()V
        //   153: getstatic       android/support/v7/widget/SearchView.HIDDEN_METHOD_INVOKER:Landroid/support/v7/widget/SearchView$AutoCompleteTextViewReflector;
        //   156: aload_0        
        //   157: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   160: iconst_1       
        //   161: invokevirtual   android/support/v7/widget/SearchView$AutoCompleteTextViewReflector.ensureImeVisible:(Landroid/widget/AutoCompleteTextView;Z)V
        //   164: iconst_1       
        //   165: ireturn        
        //   166: aload_0        
        //   167: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   170: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.length:()I
        //   173: istore          14
        //   175: goto            129
        //   178: iload_2        
        //   179: bipush          19
        //   181: if_icmpne       11
        //   184: aload_0        
        //   185: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   188: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getListSelection:()I
        //   191: istore          16
        //   193: iload           16
        //   195: ifne            11
        //   198: iconst_0       
        //   199: ireturn        
        //   200: astore          15
        //   202: aload           15
        //   204: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      13     18     Landroid/content/ActivityNotFoundException;
        //  18     24     83     88     Landroid/content/ActivityNotFoundException;
        //  29     35     88     93     Landroid/content/ActivityNotFoundException;
        //  40     46     93     108    Landroid/content/ActivityNotFoundException;
        //  90     93     93     108    Landroid/content/ActivityNotFoundException;
        //  95     98     98     108    Landroid/content/ActivityNotFoundException;
        //  100    103    103    108    Landroid/content/ActivityNotFoundException;
        //  184    193    200    205    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void onTextChanged(final CharSequence p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_0        
        //     3: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     6: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
        //     9: astore_3       
        //    10: aload_0        
        //    11: aload_3        
        //    12: putfield        android/support/v7/widget/SearchView.mUserQuery:Ljava/lang/CharSequence;
        //    15: aload_3        
        //    16: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    19: istore          5
        //    21: iload           5
        //    23: ifne            107
        //    26: iload_2        
        //    27: istore          6
        //    29: aload_0        
        //    30: iload           6
        //    32: invokespecial   android/support/v7/widget/SearchView.updateSubmitButton:(Z)V
        //    35: iload           6
        //    37: ifne            118
        //    40: aload_0        
        //    41: iload_2        
        //    42: invokespecial   android/support/v7/widget/SearchView.updateVoiceButton:(Z)V
        //    45: aload_0        
        //    46: invokespecial   android/support/v7/widget/SearchView.updateCloseButton:()V
        //    49: aload_0        
        //    50: invokespecial   android/support/v7/widget/SearchView.updateSubmitArea:()V
        //    53: aload_0        
        //    54: getfield        android/support/v7/widget/SearchView.mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;
        //    57: astore          10
        //    59: aload           10
        //    61: ifnull          91
        //    64: aload_1        
        //    65: aload_0        
        //    66: getfield        android/support/v7/widget/SearchView.mOldQueryText:Ljava/lang/CharSequence;
        //    69: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    72: ifne            91
        //    75: aload_0        
        //    76: getfield        android/support/v7/widget/SearchView.mOnQueryChangeListener:Landroid/support/v7/widget/SearchView$OnQueryTextListener;
        //    79: aload_1        
        //    80: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    85: invokeinterface android/support/v7/widget/SearchView$OnQueryTextListener.onQueryTextChange:(Ljava/lang/String;)Z
        //    90: pop            
        //    91: aload_0        
        //    92: aload_1        
        //    93: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    98: putfield        android/support/v7/widget/SearchView.mOldQueryText:Ljava/lang/CharSequence;
        //   101: return         
        //   102: astore          4
        //   104: aload           4
        //   106: athrow         
        //   107: iconst_0       
        //   108: istore          6
        //   110: goto            29
        //   113: astore          7
        //   115: aload           7
        //   117: athrow         
        //   118: iconst_0       
        //   119: istore_2       
        //   120: goto            40
        //   123: astore          8
        //   125: aload           8
        //   127: athrow         
        //   128: astore          9
        //   130: aload           9
        //   132: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  10     21     102    107    Landroid/content/ActivityNotFoundException;
        //  29     35     113    118    Landroid/content/ActivityNotFoundException;
        //  40     59     123    128    Landroid/content/ActivityNotFoundException;
        //  64     91     128    133    Landroid/content/ActivityNotFoundException;
        //  125    128    128    133    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 67, Size: 67
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @TargetApi(8)
    private void onVoiceClicked() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnonnull       13
        //     9: return         
        //    10: astore_1       
        //    11: aload_1        
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    17: astore_3       
        //    18: aload_3        
        //    19: invokevirtual   android/app/SearchableInfo.getVoiceSearchLaunchWebSearch:()Z
        //    22: ifeq            51
        //    25: aload_0        
        //    26: aload_0        
        //    27: getfield        android/support/v7/widget/SearchView.mVoiceWebSearchIntent:Landroid/content/Intent;
        //    30: aload_3        
        //    31: invokespecial   android/support/v7/widget/SearchView.createVoiceWebSearchIntent:(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
        //    34: astore          9
        //    36: aload_0        
        //    37: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //    40: aload           9
        //    42: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //    45: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    48: ifeq            9
        //    51: aload_3        
        //    52: invokevirtual   android/app/SearchableInfo.getVoiceSearchLaunchRecognizer:()Z
        //    55: istore          7
        //    57: iload           7
        //    59: ifeq            9
        //    62: aload_0        
        //    63: aload_0        
        //    64: getfield        android/support/v7/widget/SearchView.mVoiceAppSearchIntent:Landroid/content/Intent;
        //    67: aload_3        
        //    68: invokespecial   android/support/v7/widget/SearchView.createVoiceAppSearchIntent:(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
        //    71: astore          8
        //    73: aload_0        
        //    74: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //    77: aload           8
        //    79: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
        //    82: return         
        //    83: astore          4
        //    85: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    88: iconst_4       
        //    89: aaload         
        //    90: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    93: iconst_3       
        //    94: aaload         
        //    95: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    98: pop            
        //    99: return         
        //   100: astore          6
        //   102: aload           6
        //   104: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      5      10     13     Landroid/content/ActivityNotFoundException;
        //  18     36     83     100    Landroid/content/ActivityNotFoundException;
        //  36     51     100    105    Landroid/content/ActivityNotFoundException;
        //  51     57     100    105    Landroid/content/ActivityNotFoundException;
        //  62     82     83     100    Landroid/content/ActivityNotFoundException;
        //  102    105    83     100    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void postUpdateFocusedState() {
        this.post(this.mUpdateDrawableStateRunnable);
    }
    
    private void rewriteQueryFromSuggestion(final int n) {
        final boolean a = LinearLayoutCompat.a;
        final Editable text = this.mSearchSrcTextView.getText();
        final Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor != null) {
            Label_0073: {
                if (!cursor.moveToPosition(n)) {
                    break Label_0073;
                }
                final CharSequence convertToString = this.mSuggestionsAdapter.convertToString(cursor);
                Label_0064: {
                    if (convertToString == null) {
                        break Label_0064;
                    }
                    try {
                        this.setQuery(convertToString);
                        if (a) {
                            this.setQuery((CharSequence)text);
                        }
                        if (a) {
                            try {
                                this.setQuery((CharSequence)text);
                            }
                            catch (ActivityNotFoundException ex) {
                                throw ex;
                            }
                        }
                    }
                    catch (ActivityNotFoundException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    private void setImeVisibility(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifeq            23
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        android/support/v7/widget/SearchView.mShowImeRunnable:Ljava/lang/Runnable;
        //     9: invokevirtual   android/support/v7/widget/SearchView.post:(Ljava/lang/Runnable;)Z
        //    12: pop            
        //    13: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //    16: istore          8
        //    18: iload           8
        //    20: ifeq            62
        //    23: aload_0        
        //    24: aload_0        
        //    25: getfield        android/support/v7/widget/SearchView.mShowImeRunnable:Ljava/lang/Runnable;
        //    28: invokevirtual   android/support/v7/widget/SearchView.removeCallbacks:(Ljava/lang/Runnable;)Z
        //    31: pop            
        //    32: aload_0        
        //    33: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //    36: getstatic       android/support/v7/widget/SearchView.z:[Ljava/lang/String;
        //    39: iconst_2       
        //    40: aaload         
        //    41: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    44: checkcast       Landroid/view/inputmethod/InputMethodManager;
        //    47: astore_3       
        //    48: aload_3        
        //    49: ifnull          62
        //    52: aload_3        
        //    53: aload_0        
        //    54: invokevirtual   android/support/v7/widget/SearchView.getWindowToken:()Landroid/os/IBinder;
        //    57: iconst_0       
        //    58: invokevirtual   android/view/inputmethod/InputMethodManager.hideSoftInputFromWindow:(Landroid/os/IBinder;I)Z
        //    61: pop            
        //    62: return         
        //    63: astore          6
        //    65: aload           6
        //    67: athrow         
        //    68: astore          4
        //    70: aload           4
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      18     63     68     Landroid/content/ActivityNotFoundException;
        //  52     62     68     73     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void setQuery(final CharSequence text) {
        while (true) {
            while (true) {
                try {
                    this.mSearchSrcTextView.setText(text);
                    final SearchView$SearchAutoComplete mSearchSrcTextView = this.mSearchSrcTextView;
                    if (TextUtils.isEmpty(text)) {
                        final int length = 0;
                        mSearchSrcTextView.setSelection(length);
                        return;
                    }
                }
                catch (ActivityNotFoundException ex) {
                    throw ex;
                }
                final int length = text.length();
                continue;
            }
        }
    }
    
    private void updateCloseButton() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     6: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
        //     9: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    12: istore_3       
        //    13: iload_3        
        //    14: ifne            103
        //    17: iload_1        
        //    18: istore          4
        //    20: iload           4
        //    22: ifne            47
        //    25: aload_0        
        //    26: getfield        android/support/v7/widget/SearchView.mIconifiedByDefault:Z
        //    29: istore          14
        //    31: iload           14
        //    33: ifeq            119
        //    36: aload_0        
        //    37: getfield        android/support/v7/widget/SearchView.mExpandedInActionView:Z
        //    40: istore          15
        //    42: iload           15
        //    44: ifne            119
        //    47: aload_0        
        //    48: getfield        android/support/v7/widget/SearchView.mCloseButton:Landroid/widget/ImageView;
        //    51: astore          6
        //    53: iconst_0       
        //    54: istore          7
        //    56: iload_1        
        //    57: ifeq            129
        //    60: aload           6
        //    62: iload           7
        //    64: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    67: aload_0        
        //    68: getfield        android/support/v7/widget/SearchView.mCloseButton:Landroid/widget/ImageView;
        //    71: invokevirtual   android/widget/ImageView.getDrawable:()Landroid/graphics/drawable/Drawable;
        //    74: astore          8
        //    76: aload           8
        //    78: ifnull          99
        //    81: iload           4
        //    83: ifeq            141
        //    86: getstatic       android/support/v7/widget/SearchView.ENABLED_STATE_SET:[I
        //    89: astore          9
        //    91: aload           8
        //    93: aload           9
        //    95: invokevirtual   android/graphics/drawable/Drawable.setState:([I)Z
        //    98: pop            
        //    99: return         
        //   100: astore_2       
        //   101: aload_2        
        //   102: athrow         
        //   103: iconst_0       
        //   104: istore          4
        //   106: goto            20
        //   109: astore          12
        //   111: aload           12
        //   113: athrow         
        //   114: astore          13
        //   116: aload           13
        //   118: athrow         
        //   119: iconst_0       
        //   120: istore_1       
        //   121: goto            47
        //   124: astore          5
        //   126: aload           5
        //   128: athrow         
        //   129: bipush          8
        //   131: istore          7
        //   133: goto            60
        //   136: astore          11
        //   138: aload           11
        //   140: athrow         
        //   141: getstatic       android/support/v7/widget/SearchView.EMPTY_STATE_SET:[I
        //   144: astore          9
        //   146: goto            91
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  2      13     100    103    Landroid/content/ActivityNotFoundException;
        //  25     31     109    114    Landroid/content/ActivityNotFoundException;
        //  36     42     114    119    Landroid/content/ActivityNotFoundException;
        //  47     53     124    129    Landroid/content/ActivityNotFoundException;
        //  86     91     136    141    Landroid/content/ActivityNotFoundException;
        //  111    114    114    119    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateFocusedState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     4: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.hasFocus:()Z
        //     7: ifeq            60
        //    10: getstatic       android/support/v7/widget/SearchView.FOCUSED_STATE_SET:[I
        //    13: astore_1       
        //    14: aload_0        
        //    15: getfield        android/support/v7/widget/SearchView.mSearchPlate:Landroid/view/View;
        //    18: invokevirtual   android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
        //    21: astore_2       
        //    22: aload_2        
        //    23: ifnull          32
        //    26: aload_2        
        //    27: aload_1        
        //    28: invokevirtual   android/graphics/drawable/Drawable.setState:([I)Z
        //    31: pop            
        //    32: aload_0        
        //    33: getfield        android/support/v7/widget/SearchView.mSubmitArea:Landroid/view/View;
        //    36: invokevirtual   android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
        //    39: astore_3       
        //    40: aload_3        
        //    41: ifnull          50
        //    44: aload_3        
        //    45: aload_1        
        //    46: invokevirtual   android/graphics/drawable/Drawable.setState:([I)Z
        //    49: pop            
        //    50: aload_0        
        //    51: invokevirtual   android/support/v7/widget/SearchView.invalidate:()V
        //    54: return         
        //    55: astore          8
        //    57: aload           8
        //    59: athrow         
        //    60: getstatic       android/support/v7/widget/SearchView.EMPTY_STATE_SET:[I
        //    63: astore_1       
        //    64: goto            14
        //    67: astore          6
        //    69: aload           6
        //    71: athrow         
        //    72: astore          4
        //    74: aload           4
        //    76: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  10     14     55     60     Landroid/content/ActivityNotFoundException;
        //  26     32     67     72     Landroid/content/ActivityNotFoundException;
        //  44     50     72     77     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateQueryHint() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v7/widget/SearchView.mQueryHint:Ljava/lang/CharSequence;
        //     8: astore          5
        //    10: aload           5
        //    12: ifnull          34
        //    15: aload_0        
        //    16: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    19: aload_0        
        //    20: aload_0        
        //    21: getfield        android/support/v7/widget/SearchView.mQueryHint:Ljava/lang/CharSequence;
        //    24: invokespecial   android/support/v7/widget/SearchView.getDecoratedHint:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //    27: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setHint:(Ljava/lang/CharSequence;)V
        //    30: iload_1        
        //    31: ifeq            115
        //    34: getstatic       android/support/v7/widget/SearchView.IS_AT_LEAST_FROYO:Z
        //    37: ifeq            101
        //    40: aload_0        
        //    41: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    44: astore          7
        //    46: aload           7
        //    48: ifnull          101
        //    51: aload_0        
        //    52: getfield        android/support/v7/widget/SearchView.mSearchable:Landroid/app/SearchableInfo;
        //    55: invokevirtual   android/app/SearchableInfo.getHintId:()I
        //    58: istore          8
        //    60: aconst_null    
        //    61: astore          9
        //    63: iload           8
        //    65: ifeq            79
        //    68: aload_0        
        //    69: invokevirtual   android/support/v7/widget/SearchView.getContext:()Landroid/content/Context;
        //    72: iload           8
        //    74: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //    77: astore          9
        //    79: aload           9
        //    81: ifnull          97
        //    84: aload_0        
        //    85: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    88: aload_0        
        //    89: aload           9
        //    91: invokespecial   android/support/v7/widget/SearchView.getDecoratedHint:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //    94: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setHint:(Ljava/lang/CharSequence;)V
        //    97: iload_1        
        //    98: ifeq            115
        //   101: aload_0        
        //   102: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //   105: aload_0        
        //   106: ldc_w           ""
        //   109: invokespecial   android/support/v7/widget/SearchView.getDecoratedHint:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //   112: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setHint:(Ljava/lang/CharSequence;)V
        //   115: return         
        //   116: astore_2       
        //   117: aload_2        
        //   118: athrow         
        //   119: astore_3       
        //   120: aload_3        
        //   121: athrow         
        //   122: astore          4
        //   124: aload           4
        //   126: athrow         
        //   127: astore          10
        //   129: aload           10
        //   131: athrow         
        //   132: astore          6
        //   134: aload           6
        //   136: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      10     116    119    Landroid/content/ActivityNotFoundException;
        //  15     30     119    122    Landroid/content/ActivityNotFoundException;
        //  34     46     122    127    Landroid/content/ActivityNotFoundException;
        //  84     97     127    132    Landroid/content/ActivityNotFoundException;
        //  101    115    132    137    Landroid/content/ActivityNotFoundException;
        //  117    119    119    122    Landroid/content/ActivityNotFoundException;
        //  120    122    122    127    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateSubmitArea() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_1       
        //     3: aload_0        
        //     4: invokespecial   android/support/v7/widget/SearchView.isSubmitAreaEnabled:()Z
        //     7: istore          4
        //     9: iload           4
        //    11: ifeq            40
        //    14: aload_0        
        //    15: getfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //    18: invokevirtual   android/widget/ImageView.getVisibility:()I
        //    21: ifeq            38
        //    24: aload_0        
        //    25: getfield        android/support/v7/widget/SearchView.mVoiceButton:Landroid/widget/ImageView;
        //    28: invokevirtual   android/widget/ImageView.getVisibility:()I
        //    31: istore          5
        //    33: iload           5
        //    35: ifne            40
        //    38: iconst_0       
        //    39: istore_1       
        //    40: aload_0        
        //    41: getfield        android/support/v7/widget/SearchView.mSubmitArea:Landroid/view/View;
        //    44: iload_1        
        //    45: invokevirtual   android/view/View.setVisibility:(I)V
        //    48: return         
        //    49: astore_2       
        //    50: aload_2        
        //    51: athrow         
        //    52: astore_3       
        //    53: aload_3        
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  3      9      49     52     Landroid/content/ActivityNotFoundException;
        //  14     33     52     55     Landroid/content/ActivityNotFoundException;
        //  50     52     52     55     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateSubmitButton(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          8
        //     2: istore_2       
        //     3: aload_0        
        //     4: getfield        android/support/v7/widget/SearchView.mSubmitButtonEnabled:Z
        //     7: istore          7
        //     9: iload           7
        //    11: ifeq            53
        //    14: aload_0        
        //    15: invokespecial   android/support/v7/widget/SearchView.isSubmitAreaEnabled:()Z
        //    18: istore          8
        //    20: iload           8
        //    22: ifeq            53
        //    25: aload_0        
        //    26: invokevirtual   android/support/v7/widget/SearchView.hasFocus:()Z
        //    29: istore          9
        //    31: iload           9
        //    33: ifeq            53
        //    36: iload_1        
        //    37: ifne            51
        //    40: aload_0        
        //    41: getfield        android/support/v7/widget/SearchView.mVoiceButtonEnabled:Z
        //    44: istore          10
        //    46: iload           10
        //    48: ifne            53
        //    51: iconst_0       
        //    52: istore_2       
        //    53: aload_0        
        //    54: getfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //    57: iload_2        
        //    58: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    61: return         
        //    62: astore_3       
        //    63: aload_3        
        //    64: athrow         
        //    65: astore          4
        //    67: aload           4
        //    69: athrow         
        //    70: astore          5
        //    72: aload           5
        //    74: athrow         
        //    75: astore          6
        //    77: aload           6
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  3      9      62     65     Landroid/content/ActivityNotFoundException;
        //  14     20     65     70     Landroid/content/ActivityNotFoundException;
        //  25     31     70     75     Landroid/content/ActivityNotFoundException;
        //  40     46     75     80     Landroid/content/ActivityNotFoundException;
        //  63     65     65     70     Landroid/content/ActivityNotFoundException;
        //  67     70     70     75     Landroid/content/ActivityNotFoundException;
        //  72     75     75     80     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 43, Size: 43
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateViewsVisibility(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: bipush          8
        //     4: istore_3       
        //     5: aload_0        
        //     6: iload_1        
        //     7: putfield        android/support/v7/widget/SearchView.mIconified:Z
        //    10: iload_1        
        //    11: ifeq            119
        //    14: iconst_0       
        //    15: istore          5
        //    17: aload_0        
        //    18: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    21: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
        //    24: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    27: istore          7
        //    29: iload           7
        //    31: ifne            130
        //    34: iload_2        
        //    35: istore          8
        //    37: aload_0        
        //    38: getfield        android/support/v7/widget/SearchView.mSearchButton:Landroid/widget/ImageView;
        //    41: iload           5
        //    43: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    46: aload_0        
        //    47: iload           8
        //    49: invokespecial   android/support/v7/widget/SearchView.updateSubmitButton:(Z)V
        //    52: aload_0        
        //    53: getfield        android/support/v7/widget/SearchView.mSearchEditFrame:Landroid/view/View;
        //    56: astore          10
        //    58: iload_1        
        //    59: ifeq            141
        //    62: iload_3        
        //    63: istore          11
        //    65: aload           10
        //    67: iload           11
        //    69: invokevirtual   android/view/View.setVisibility:(I)V
        //    72: aload_0        
        //    73: getfield        android/support/v7/widget/SearchView.mCollapsedIcon:Landroid/widget/ImageView;
        //    76: astore          13
        //    78: aload_0        
        //    79: getfield        android/support/v7/widget/SearchView.mIconifiedByDefault:Z
        //    82: istore          14
        //    84: iload           14
        //    86: ifeq            152
        //    89: aload           13
        //    91: iload_3        
        //    92: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    95: aload_0        
        //    96: invokespecial   android/support/v7/widget/SearchView.updateCloseButton:()V
        //    99: iload           8
        //   101: ifne            162
        //   104: aload_0        
        //   105: iload_2        
        //   106: invokespecial   android/support/v7/widget/SearchView.updateVoiceButton:(Z)V
        //   109: aload_0        
        //   110: invokespecial   android/support/v7/widget/SearchView.updateSubmitArea:()V
        //   113: return         
        //   114: astore          4
        //   116: aload           4
        //   118: athrow         
        //   119: iload_3        
        //   120: istore          5
        //   122: goto            17
        //   125: astore          6
        //   127: aload           6
        //   129: athrow         
        //   130: iconst_0       
        //   131: istore          8
        //   133: goto            37
        //   136: astore          9
        //   138: aload           9
        //   140: athrow         
        //   141: iconst_0       
        //   142: istore          11
        //   144: goto            65
        //   147: astore          12
        //   149: aload           12
        //   151: athrow         
        //   152: iconst_0       
        //   153: istore_3       
        //   154: goto            89
        //   157: astore          15
        //   159: aload           15
        //   161: athrow         
        //   162: iconst_0       
        //   163: istore_2       
        //   164: goto            104
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  5      10     114    119    Landroid/content/ActivityNotFoundException;
        //  17     29     125    130    Landroid/content/ActivityNotFoundException;
        //  37     58     136    141    Landroid/content/ActivityNotFoundException;
        //  65     84     147    152    Landroid/content/ActivityNotFoundException;
        //  89     99     157    162    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 88, Size: 88
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void updateVoiceButton(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mVoiceButtonEnabled:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            54
        //    11: aload_0        
        //    12: invokevirtual   android/support/v7/widget/SearchView.isIconified:()Z
        //    15: istore          6
        //    17: iload           6
        //    19: ifne            54
        //    22: iload_1        
        //    23: ifeq            54
        //    26: iconst_0       
        //    27: istore          5
        //    29: aload_0        
        //    30: getfield        android/support/v7/widget/SearchView.mGoButton:Landroid/widget/ImageView;
        //    33: bipush          8
        //    35: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    38: aload_0        
        //    39: getfield        android/support/v7/widget/SearchView.mVoiceButton:Landroid/widget/ImageView;
        //    42: iload           5
        //    44: invokevirtual   android/widget/ImageView.setVisibility:(I)V
        //    47: return         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: aload_3        
        //    53: athrow         
        //    54: bipush          8
        //    56: istore          5
        //    58: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      48     51     Landroid/content/ActivityNotFoundException;
        //  11     17     51     54     Landroid/content/ActivityNotFoundException;
        //  49     51     51     54     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void clearFocus() {
        this.mClearingFocus = true;
        this.setImeVisibility(false);
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mClearingFocus = false;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)this.mSearchSrcTextView.getText();
    }
    
    public boolean isIconified() {
        return this.mIconified;
    }
    
    @Override
    public void onActionViewCollapsed() {
        this.setQuery("", false);
        this.clearFocus();
        this.updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }
    
    @Override
    public void onActionViewExpanded() {
        try {
            if (this.mExpandedInActionView) {
                return;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        this.mExpandedInActionView = true;
        this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mSearchSrcTextView.setImeOptions(0x2000000 | this.mCollapsedImeOptions);
        this.mSearchSrcTextView.setText((CharSequence)"");
        this.setIconified(false);
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mUpdateDrawableStateRunnable);
        this.post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }
    
    @Override
    protected void onMeasure(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/widget/LinearLayoutCompat.a:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   android/support/v7/widget/SearchView.isIconified:()Z
        //     8: ifeq            23
        //    11: aload_0        
        //    12: iload_1        
        //    13: iload_2        
        //    14: invokespecial   android/support/v7/widget/LinearLayoutCompat.onMeasure:(II)V
        //    17: return         
        //    18: astore          4
        //    20: aload           4
        //    22: athrow         
        //    23: iload_1        
        //    24: invokestatic    android/view/View$MeasureSpec.getMode:(I)I
        //    27: istore          5
        //    29: iload_1        
        //    30: invokestatic    android/view/View$MeasureSpec.getSize:(I)I
        //    33: istore          6
        //    35: iload           5
        //    37: lookupswitch {
        //          -2147483648: 86
        //                0: 153
        //          1073741824: 127
        //          default: 72
        //        }
        //    72: aload_0        
        //    73: iload           6
        //    75: ldc_w           1073741824
        //    78: invokestatic    android/view/View$MeasureSpec.makeMeasureSpec:(II)I
        //    81: iload_2        
        //    82: invokespecial   android/support/v7/widget/LinearLayoutCompat.onMeasure:(II)V
        //    85: return         
        //    86: aload_0        
        //    87: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //    90: istore          11
        //    92: iload           11
        //    94: ifle            112
        //    97: aload_0        
        //    98: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //   101: iload           6
        //   103: invokestatic    java/lang/Math.min:(II)I
        //   106: istore          6
        //   108: iload_3        
        //   109: ifeq            72
        //   112: aload_0        
        //   113: invokespecial   android/support/v7/widget/SearchView.getPreferredWidth:()I
        //   116: iload           6
        //   118: invokestatic    java/lang/Math.min:(II)I
        //   121: istore          6
        //   123: iload_3        
        //   124: ifeq            72
        //   127: aload_0        
        //   128: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //   131: istore          9
        //   133: iload           9
        //   135: ifle            72
        //   138: aload_0        
        //   139: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //   142: iload           6
        //   144: invokestatic    java/lang/Math.min:(II)I
        //   147: istore          6
        //   149: iload_3        
        //   150: ifeq            72
        //   153: aload_0        
        //   154: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //   157: ifle            184
        //   160: aload_0        
        //   161: getfield        android/support/v7/widget/SearchView.mMaxWidth:I
        //   164: istore          6
        //   166: goto            72
        //   169: astore          10
        //   171: aload           10
        //   173: athrow         
        //   174: astore          8
        //   176: aload           8
        //   178: athrow         
        //   179: astore          7
        //   181: aload           7
        //   183: athrow         
        //   184: aload_0        
        //   185: invokespecial   android/support/v7/widget/SearchView.getPreferredWidth:()I
        //   188: istore          6
        //   190: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      17     18     23     Landroid/content/ActivityNotFoundException;
        //  86     92     169    174    Landroid/content/ActivityNotFoundException;
        //  127    133    174    179    Landroid/content/ActivityNotFoundException;
        //  153    166    179    184    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 79, Size: 79
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void onQueryRefine(final CharSequence query) {
        this.setQuery(query);
    }
    
    void onTextFocusChanged() {
        try {
            this.updateViewsVisibility(this.isIconified());
            this.postUpdateFocusedState();
            if (this.mSearchSrcTextView.hasFocus()) {
                this.forceSuggestionQuery();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.postUpdateFocusedState();
    }
    
    public boolean requestFocus(final int n, final Rect rect) {
        while (true) {
            try {
                final boolean mClearingFocus = this.mClearingFocus;
                final boolean requestFocus = false;
                if (mClearingFocus) {
                    return requestFocus;
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
            try {
                final boolean focusable = this.isFocusable();
                boolean requestFocus = false;
                if (!focusable) {
                    return requestFocus;
                }
                if (!this.isIconified()) {
                    requestFocus = this.mSearchSrcTextView.requestFocus(n, rect);
                    if (!requestFocus) {
                        return requestFocus;
                    }
                    try {
                        this.updateViewsVisibility(false);
                        return requestFocus;
                    }
                    catch (ActivityNotFoundException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (ActivityNotFoundException ex3) {
                throw ex3;
            }
            break;
        }
        return super.requestFocus(n, rect);
    }
    
    public void setIconified(final boolean b) {
        Label_0014: {
            if (!b) {
                break Label_0014;
            }
            try {
                this.onCloseClicked();
                if (LinearLayoutCompat.a) {
                    this.onSearchClicked();
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    public void setIconifiedByDefault(final boolean mIconifiedByDefault) {
        try {
            if (this.mIconifiedByDefault == mIconifiedByDefault) {
                return;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        this.updateViewsVisibility(this.mIconifiedByDefault = mIconifiedByDefault);
        this.updateQueryHint();
    }
    
    public void setImeOptions(final int imeOptions) {
        this.mSearchSrcTextView.setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        this.mSearchSrcTextView.setInputType(inputType);
    }
    
    public void setMaxWidth(final int mMaxWidth) {
        this.mMaxWidth = mMaxWidth;
        this.requestLayout();
    }
    
    public void setOnCloseListener(final SearchView$OnCloseListener mOnCloseListener) {
        this.mOnCloseListener = mOnCloseListener;
    }
    
    public void setOnQueryTextListener(final SearchView$OnQueryTextListener mOnQueryChangeListener) {
        this.mOnQueryChangeListener = mOnQueryChangeListener;
    }
    
    public void setOnSearchClickListener(final View$OnClickListener mOnSearchClickListener) {
        this.mOnSearchClickListener = mOnSearchClickListener;
    }
    
    public void setQuery(final CharSequence p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //     4: aload_1        
        //     5: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setText:(Ljava/lang/CharSequence;)V
        //     8: aload_1        
        //     9: ifnull          31
        //    12: aload_0        
        //    13: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    16: aload_0        
        //    17: getfield        android/support/v7/widget/SearchView.mSearchSrcTextView:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
        //    20: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.length:()I
        //    23: invokevirtual   android/support/v7/widget/SearchView$SearchAutoComplete.setSelection:(I)V
        //    26: aload_0        
        //    27: aload_1        
        //    28: putfield        android/support/v7/widget/SearchView.mUserQuery:Ljava/lang/CharSequence;
        //    31: iload_2        
        //    32: ifeq            46
        //    35: aload_1        
        //    36: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    39: ifne            46
        //    42: aload_0        
        //    43: invokespecial   android/support/v7/widget/SearchView.onSubmitQuery:()V
        //    46: return         
        //    47: astore_3       
        //    48: aload_3        
        //    49: athrow         
        //    50: astore          4
        //    52: aload           4
        //    54: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      8      47     50     Landroid/content/ActivityNotFoundException;
        //  12     31     47     50     Landroid/content/ActivityNotFoundException;
        //  35     46     50     55     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setQueryHint(final CharSequence mQueryHint) {
        this.mQueryHint = mQueryHint;
        this.updateQueryHint();
    }
}
