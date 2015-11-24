// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import android.view.View;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.Arrays;
import com.twitter.library.card.property.PurchaseRequestParameter;
import com.twitter.library.card.property.TokenizedText;
import com.twitter.library.card.property.TextToken;
import com.twitter.util.i;
import com.twitter.library.card.property.LocalizedTokenizedText;
import java.util.Iterator;
import com.twitter.library.card.property.TextTokenGroup;
import com.twitter.library.card.element.FollowButtonElement;
import com.twitter.library.card.element.Player;
import com.twitter.library.card.element.Image;
import com.twitter.library.client.App;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.content.res.Resources;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.card.instance.UserValue;
import com.twitter.library.card.instance.BindingValue;
import com.twitter.library.network.ae;
import com.twitter.library.util.bj;
import android.graphics.Color;
import android.graphics.Canvas;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.card.element.d;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.card.element.FormFieldElement;
import com.twitter.library.card.property.ApiRequestParameter;
import com.twitter.library.card.property.ApiRequest;
import com.twitter.library.card.property.Form;
import com.twitter.library.util.text.Plurals;
import com.twitter.util.c;
import android.content.Intent;
import android.net.Uri;
import com.twitter.library.card.property.Style;
import com.twitter.library.card.property.StylePair;
import com.twitter.library.card.element.ElementState;
import java.text.NumberFormat;
import java.util.Locale;
import java.math.BigDecimal;
import android.text.TextUtils;
import com.twitter.library.card.element.Element;
import com.twitter.library.card.property.Action;
import com.twitter.library.card.instance.CardInstanceData;
import android.content.Context;
import com.twitter.library.util.text.Plurals$Rule;
import com.twitter.library.util.bk;
import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.util.SparseArray;
import java.util.HashMap;
import com.twitter.library.card.property.Binding;
import com.twitter.library.card.property.a;
import android.graphics.Paint;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Externalizable;
import com.twitter.library.card.element.Container;

public class Card extends Container implements Externalizable
{
    private static AtomicInteger c;
    private static boolean d = false;
    private static Paint e;
    private static final long serialVersionUID = -7333183987954105893L;
    public a actions;
    public Binding[] bindings;
    public boolean doNotCache;
    public a forms;
    public int loadActionId;
    public HashMap localizedTokenizedTexts;
    private SparseArray mApiRequestParameterMap;
    private int mBindId;
    private HashMap mBindingValues;
    private j mCardEventListener;
    private int mDeferredActionElementSerialId;
    private int mDeferredActionId;
    private int mDeferredActionTouchType;
    private SparseArray mElementMap;
    private boolean mFirstBind;
    private boolean mFirstLoad;
    private boolean mIsForwardCard;
    private final AtomicBoolean mIsReleased;
    private SparseArray mPurchaseRequestParameterMap;
    private SparseArray mSerialElementMap;
    private WeakReference mTestHooks;
    private SparseArray mTextTokenGroupMap;
    private SparseArray mTextTokenMap;
    boolean mToRefresh;
    private Tweet mTweet;
    public String name;
    public String platformKey;
    public a styles;
    public String uuid;
    
    static {
        Card.c = new AtomicInteger(0);
    }
    
    public Card() {
        this.mElementMap = new SparseArray();
        this.mSerialElementMap = new SparseArray();
        this.mTextTokenGroupMap = new SparseArray();
        this.mTextTokenMap = new SparseArray();
        this.mApiRequestParameterMap = new SparseArray();
        this.mPurchaseRequestParameterMap = new SparseArray();
        this.mBindingValues = new HashMap();
        this.mFirstBind = true;
        this.mFirstLoad = true;
        this.mIsReleased = new AtomicBoolean();
    }
    
    private void L() {
        this.mDeferredActionElementSerialId = 0;
        this.mDeferredActionTouchType = 0;
        this.mDeferredActionId = 0;
    }
    
    private void M() {
        final Context applicationContext = this.B().getApplicationContext();
        final Tweet mTweet = this.mTweet;
        final CardInstanceData cardInstanceData = mTweet.l.cardInstanceData;
        HashMap hashMap;
        HashMap hashMap2;
        if (this.mIsForwardCard) {
            final HashMap f = cardInstanceData.f();
            hashMap = cardInstanceData.forwardUsers;
            hashMap2 = f;
        }
        else {
            final HashMap e = cardInstanceData.e();
            hashMap = cardInstanceData.users;
            hashMap2 = e;
        }
        for (final Binding binding : this.bindings) {
            Object o = null;
            Object a = null;
            switch (binding.a()) {
                default: {
                    a = null;
                    break;
                }
                case 1: {
                    final int index = binding.sourceKey.indexOf(44);
                    String s;
                    String substring;
                    if (index == -1) {
                        s = binding.sourceKey;
                        substring = null;
                    }
                    else {
                        s = binding.sourceKey.substring(0, index);
                        substring = binding.sourceKey.substring(index + 1);
                    }
                    final Object a2 = this.a(s, hashMap2);
                    if (substring != null) {
                        a = this.a(substring, hashMap2);
                        o = a2;
                        break;
                    }
                    o = a2;
                    a = null;
                    break;
                }
                case 2: {
                    o = this.a(binding, hashMap2, hashMap);
                    a = null;
                    break;
                }
                case 3: {
                    o = this.a(binding, mTweet);
                    a = null;
                    break;
                }
            }
            switch (binding.controllerType) {
                case 1: {
                    o = binding.a(o != null);
                    break;
                }
                case 2: {
                    if (a != null && a instanceof String) {
                        String s2;
                        if (o != null && o instanceof String) {
                            s2 = (String)o;
                        }
                        else {
                            s2 = null;
                        }
                        o = binding.a(this.a(applicationContext, s2, (String)a));
                        break;
                    }
                    o = binding.a(false);
                    break;
                }
                case 3: {
                    if (o != null && o instanceof String) {
                        o = binding.a(this.d((String)o));
                        break;
                    }
                    o = binding.a(false);
                    break;
                }
                case 4: {
                    o = this.f(binding, o);
                    break;
                }
                case 5: {
                    if (o != null && o instanceof Long) {
                        o = bk.b(applicationContext.getResources(), (long)o);
                        break;
                    }
                    o = null;
                    break;
                }
                case 6: {
                    o = this.a(binding, o, Plurals$Rule.a);
                    break;
                }
                case 7: {
                    o = this.a(binding, o, Plurals$Rule.b);
                    break;
                }
                case 8: {
                    o = this.a(binding, o, Plurals$Rule.c);
                    break;
                }
                case 9: {
                    o = this.a(binding, o, Plurals$Rule.d);
                    break;
                }
                case 10: {
                    o = this.a(binding, o, Plurals$Rule.e);
                    break;
                }
                case 11: {
                    o = this.a(binding, o, Plurals$Rule.f);
                    break;
                }
                case 12: {
                    o = this.a(o);
                    break;
                }
            }
            if (o != null) {
                if (binding.destType < 21) {
                    this.a(binding, o, hashMap);
                }
                else if (binding.destType == 21) {
                    this.a(binding, o);
                }
                else if (binding.destType == 22) {
                    this.b(binding, o);
                }
                else if (binding.destType < 31) {
                    this.c(binding, o);
                }
                else if (binding.destType < 33) {
                    this.d(binding, o);
                }
                else {
                    this.e(binding, o);
                }
            }
        }
    }
    
    private void N() {
        if (this.bindings != null) {
            for (final Binding binding : this.bindings) {
                if (binding.destType < 21) {
                    this.a(binding);
                }
                else if (binding.destType != 21) {
                    if (binding.destType == 22) {
                        this.b(binding);
                    }
                    else if (binding.destType < 31) {
                        this.c(binding);
                    }
                    else {
                        this.d(binding);
                    }
                }
            }
        }
    }
    
    private void O() {
        if (this.actions != null) {
            for (int size = this.actions.size(), i = 0; i < size; ++i) {
                final Action action = (Action)this.actions.valueAt(i);
                if (action != null) {
                    if (6 == action.actionType) {
                        action.validationStatus = 1;
                        new f(null).execute((Object[])new Action[] { action });
                    }
                    else {
                        action.validationStatus = 2;
                    }
                }
            }
        }
    }
    
    private Boolean a(final Element element, final Action action) {
        final Boolean value = true;
        switch (action.actionType) {
            default: {
                return value;
            }
            case 1: {
                this.a(action.debugId, "Open URL " + action.url);
                this.mCardEventListener.a(action.url);
                return value;
            }
            case 2: {
                this.a(action.debugId, "Popup Menu");
                final Tweet ad_ = this.aD_();
                if (ad_ != null && !ad_.h()) {
                    this.b(action.url, action.displayUrl);
                    return value;
                }
                this.mCardEventListener.a(action.url);
                return value;
            }
            case 3: {
                this.a(action.debugId, "Open Photo");
                this.c(element);
                return value;
            }
            case 4: {
                this.a(action.debugId, "Open Profile " + action.userId);
                this.mCardEventListener.c(action.userId);
                return value;
            }
            case 5: {
                this.a(action.debugId, "Open Store " + action.appId);
                this.mCardEventListener.d(action.appId);
                return value;
            }
            case 6: {
                if (1 != action.validationStatus) {
                    String s;
                    if (2 != action.validationStatus || TextUtils.isEmpty((CharSequence)action.displayAppUrl)) {
                        s = action.appUrl;
                    }
                    else {
                        s = action.displayAppUrl;
                    }
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        this.a(action.debugId, "Open App URL " + s);
                    }
                    else if (!TextUtils.isEmpty((CharSequence)action.appId)) {
                        this.a(action.debugId, "Open App " + action.appId);
                    }
                    this.mCardEventListener.c(s, action.appId);
                    return value;
                }
                this.a(action.debugId, "Open App URL " + action.appUrl + " is still validating");
                return value;
            }
            case 7: {
                this.a(action.debugId, "Apply Styles");
                this.a(action.stylePairs);
                return value;
            }
            case 8: {
                this.a(action.debugId, "Remove Styles");
                this.b(action.stylePairs);
                return value;
            }
            case 9: {
                this.a(action.debugId, "Compose Status");
                this.mCardEventListener.d(this.c(action.tokenizedTextId), action.url);
                return null;
            }
            case 10: {
                this.a(action.debugId, "Favorite Status");
                this.mCardEventListener.f();
                return value;
            }
            case 11: {
                this.a(action.debugId, "Retweet Status");
                this.mCardEventListener.g();
                return value;
            }
            case 12: {
                this.a(action.debugId, "Share Status");
                this.mCardEventListener.h();
                return value;
            }
            case 13: {
                this.a(action.debugId, "Dial Phone " + action.phoneNumber);
                this.mCardEventListener.e(action.phoneNumber);
                return value;
            }
            case 14: {
                this.a(action.debugId, "API Request");
                this.mCardEventListener.a(element, action);
                return value;
            }
            case 15: {
                this.a(action.debugId, "Open Tweet Detail");
                this.mCardEventListener.i();
                return value;
            }
            case 17: {
                this.a(action.debugId, "Submit Form");
                this.b(element, action);
                return value;
            }
            case 16: {
                this.a(action.debugId, "Purchase Request");
                this.mCardEventListener.b(null, (Action)null);
                return value;
            }
        }
    }
    
    public static String a(final BigDecimal bigDecimal) {
        return NumberFormat.getCurrencyInstance(Locale.US).format(bigDecimal.divide(new BigDecimal(1000000L)));
    }
    
    private void a(final m m) {
        if (m != null && (!this.doNotCache || m.c != 0)) {
            final SparseArray a = m.a;
            this.mBindingValues = m.b;
            for (int size = a.size(), i = 0; i < size; ++i) {
                final int key = a.keyAt(i);
                final ElementState elementState = (ElementState)a.valueAt(i);
                final Element a2 = this.a(key);
                if (a2 != null) {
                    a2.a(this, elementState);
                }
            }
            this.mDeferredActionElementSerialId = m.c;
            this.mDeferredActionTouchType = m.d;
            this.mDeferredActionId = m.e;
            this.mFirstLoad = false;
        }
    }
    
    private void a(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            CardDebugLog.a("Action: " + s + " " + s2, null);
            return;
        }
        CardDebugLog.a("Action: " + s2, null);
    }
    
    public static void a(final boolean d) {
        Card.d = d;
    }
    
    private void a(final StylePair[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Applying styles to elements ");
        for (final StylePair stylePair : array) {
            final Element a = this.a(stylePair.elementId);
            if (a != null) {
                final Style style = (Style)this.styles.get(stylePair.styleId);
                if (style != null) {
                    a.a(style);
                    a.r();
                    a.K();
                    if (!TextUtils.isEmpty((CharSequence)a.debugId)) {
                        sb.append(a.debugId).append(", ");
                    }
                }
            }
        }
        CardDebugLog.a(sb.toString(), null);
    }
    
    private boolean a(final Context context, final String s, final String s2) {
        return (TextUtils.isEmpty((CharSequence)s) || !context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0).isEmpty()) && com.twitter.util.c.a(context, s2);
    }
    
    private boolean a(final Binding binding, final Object o, final Plurals$Rule plurals$Rule) {
        boolean b = true;
        if (o == null) {
            b = false;
        }
        else if (o instanceof String) {
            if (Plurals.a((String)o) != plurals$Rule) {
                b = false;
            }
        }
        else if (o instanceof Long) {
            if (Plurals.a((long)o) != plurals$Rule) {
                b = false;
            }
        }
        else if (o instanceof Integer) {
            if (Plurals.a((int)o) != plurals$Rule) {
                b = false;
            }
        }
        else {
            b = false;
        }
        return binding.a(b);
    }
    
    public static boolean a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        switch (s) {
            default: {
                return false;
            }
            case "2586390716:buy_now":
            case "2586390716:buy_now:staging":
            case "13598072:buy_now:staging": {
                return true;
            }
        }
    }
    
    private void b(final Element element, final Action action) {
        final int formId = action.formId;
        if (this.forms != null) {
            final Form form = (Form)this.forms.get(formId);
            if (form != null) {
                final Action action2 = (Action)this.actions.get(form.apiRequestAction);
                if (action2.url != null) {
                    final Action action3 = new Action();
                    action3.id = action2.id;
                    action3.actionType = action2.actionType;
                    action3.apiRequest = new ApiRequest();
                    action3.apiRequest.method = action2.apiRequest.method;
                    action3.apiRequest.successActionId = action2.apiRequest.successActionId;
                    action3.apiRequest.failureActionId = action2.apiRequest.failureActionId;
                    action3.url = action2.url;
                    int length;
                    if (action2.apiRequest.parameters != null) {
                        length = action2.apiRequest.parameters.length;
                    }
                    else {
                        length = 0;
                    }
                    int length2;
                    if (form.elementIds != null) {
                        length2 = form.elementIds.length;
                    }
                    else {
                        length2 = 0;
                    }
                    action3.apiRequest.parameters = new ApiRequestParameter[length + length2];
                    int i = 0;
                    if (length > 0) {
                        System.arraycopy(action2.apiRequest.parameters, 0, action3.apiRequest.parameters, 0, length);
                    }
                    while (i < length2) {
                        final int id = form.elementIds[i];
                        final FormFieldElement formFieldElement = (FormFieldElement)this.a(id);
                        if (formFieldElement == null) {
                            return;
                        }
                        final ApiRequestParameter apiRequestParameter = new ApiRequestParameter();
                        apiRequestParameter.id = id;
                        apiRequestParameter.key = formFieldElement.b();
                        apiRequestParameter.value = formFieldElement.a();
                        action3.apiRequest.parameters[i + length] = apiRequestParameter;
                        ++i;
                    }
                    this.mCardEventListener.a(element, action3);
                }
            }
        }
    }
    
    private void b(final String s, final String title) {
        final Context b = this.B();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b);
        alertDialog$Builder.setTitle((CharSequence)title);
        alertDialog$Builder.setItems((CharSequence[])b.getResources().getStringArray(ku.card_long_press_options), (DialogInterface$OnClickListener)new com.twitter.library.card.c(this, s, title));
        alertDialog$Builder.create().show();
    }
    
    private void b(final StylePair[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Removing styles from elements ");
        for (final StylePair stylePair : array) {
            final Element a = this.a(stylePair.elementId);
            if (a != null) {
                final Style style = (Style)this.styles.get(stylePair.styleId);
                if (style != null) {
                    a.b(style);
                    a.r();
                    a.K();
                    if (!TextUtils.isEmpty((CharSequence)a.debugId)) {
                        sb.append(a.debugId).append(", ");
                    }
                }
            }
        }
        CardDebugLog.a(sb.toString(), null);
    }
    
    public static boolean b(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        switch (s) {
            default: {
                return false;
            }
            case "2586390716:buy_now_offers":
            case "2586390716:buy_now_offers:staging":
            case "2586390716.forward:forward_buy_now_offers":
            case "2586390716.forward:forward_buy_now_offers:staging": {
                return true;
            }
        }
    }
    
    private void c(final Element element) {
        final ArrayList list = new ArrayList();
        final int[] array = { 0 };
        this.a(new b(this, element, array, list));
        if (list.size() > 0) {
            this.mCardEventListener.a(list, array[0]);
        }
    }
    
    private boolean d(final String s) {
        return TelephonyUtil.f() && e(s);
    }
    
    private void e(final Canvas canvas) {
        canvas.save();
        final int argb = Color.argb(176, 255, 0, 255);
        final int argb2 = Color.argb(255, 255, 160, 255);
        final int argb3 = Color.argb(192, 255, 160, 255);
        if (Card.e == null) {
            Card.e = new Paint(1);
        }
        Card.e.clearShadowLayer();
        Card.e.setColor(argb);
        canvas.drawRect(this.mLayoutRect, Card.e);
        Card.e.setTextSize(12.0f * bj.b);
        Card.e.setFakeBoldText(true);
        Card.e.setShadowLayer(3.0f, 1.0f, 1.0f, -16777216);
        Card.e.setColor(argb2);
        final float fontSpacing = Card.e.getFontSpacing();
        canvas.drawText("name=" + this.name, 4.0f, fontSpacing, Card.e);
        final float n = fontSpacing + fontSpacing;
        canvas.drawText("status=" + Long.toString(this.mTweet.Q), 4.0f, n, Card.e);
        final float n2 = n + fontSpacing;
        canvas.drawText("platKey=" + this.platformKey, 4.0f, n2, Card.e);
        final float n3 = fontSpacing + n2;
        Card.e.setColor(argb3);
        canvas.drawText("currCardPlat=" + ae.a(this.B()).a(), 4.0f, n3, Card.e);
        canvas.restore();
    }
    
    private static boolean e(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/net/URL;
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //     8: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    11: checkcast       Ljava/net/HttpURLConnection;
        //    14: astore_3       
        //    15: aload_3        
        //    16: iconst_0       
        //    17: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    20: aload_3        
        //    21: invokevirtual   java/net/HttpURLConnection.connect:()V
        //    24: aload_3        
        //    25: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    28: istore          5
        //    30: iload           5
        //    32: sipush          301
        //    35: if_icmpeq       46
        //    38: iload           5
        //    40: sipush          302
        //    43: if_icmpne       81
        //    46: iconst_1       
        //    47: istore          6
        //    49: aload_3        
        //    50: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    53: iload           6
        //    55: ireturn        
        //    56: astore          4
        //    58: aload_3        
        //    59: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    62: aload           4
        //    64: athrow         
        //    65: astore_2       
        //    66: iconst_0       
        //    67: ireturn        
        //    68: astore          8
        //    70: iload           6
        //    72: ireturn        
        //    73: astore_1       
        //    74: iconst_0       
        //    75: ireturn        
        //    76: astore          7
        //    78: iload           6
        //    80: ireturn        
        //    81: iconst_0       
        //    82: istore          6
        //    84: goto            49
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      15     65     68     Ljava/io/IOException;
        //  0      15     73     76     Ljava/lang/NullPointerException;
        //  15     30     56     65     Any
        //  49     53     68     73     Ljava/io/IOException;
        //  49     53     76     81     Ljava/lang/NullPointerException;
        //  58     65     65     68     Ljava/io/IOException;
        //  58     65     73     76     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    private boolean f(final Binding binding, final Object o) {
        boolean booleanValue = true;
        if (o == null) {
            booleanValue = false;
        }
        else if (o instanceof String) {
            if (((String)o).length() == 0) {
                booleanValue = false;
            }
        }
        else if (o instanceof Double) {
            if ((double)o == 0.0) {
                booleanValue = false;
            }
        }
        else if (o instanceof Float) {
            if ((float)o == 0.0f) {
                booleanValue = false;
            }
        }
        else if (o instanceof Long) {
            if ((long)o == 0L) {
                booleanValue = false;
            }
        }
        else if (o instanceof Integer) {
            if ((int)o == 0) {
                booleanValue = false;
            }
        }
        else if (o instanceof Boolean) {
            booleanValue = (boolean)o;
        }
        return binding.a(booleanValue);
    }
    
    public int a() {
        return this.mBindId;
    }
    
    @Override
    public Element a(final int n) {
        return (Element)this.mElementMap.get(n);
    }
    
    protected Object a(final Binding binding, final Tweet tweet) {
        switch (binding.sourceType) {
            default: {
                return null;
            }
            case 18: {
                return tweet.Q;
            }
            case 19: {
                return tweet.y;
            }
            case 20: {
                return tweet.A;
            }
            case 21: {
                return tweet.f;
            }
            case 22: {
                return tweet.O;
            }
            case 23: {
                return tweet.H;
            }
            case 24: {
                return tweet.S;
            }
            case 25: {
                return tweet.T;
            }
            case 26: {
                return tweet.p;
            }
            case 27: {
                return tweet.e;
            }
        }
    }
    
    protected Object a(final Binding binding, final HashMap hashMap, final HashMap hashMap2) {
        final Object a = BindingValue.a(hashMap.get(binding.sourceKey));
        if (a != null && a instanceof UserValue) {
            final UserValue userValue = (UserValue)a;
            final TwitterUser twitterUser = hashMap2.get(userValue.id);
            if (twitterUser != null) {
                Object o = null;
                switch (binding.sourceType) {
                    default: {
                        o = null;
                        break;
                    }
                    case 4: {
                        o = userValue.id;
                        break;
                    }
                    case 5: {
                        o = twitterUser.username;
                        break;
                    }
                    case 6: {
                        final int dimensionPixelSize = this.B().getResources().getDimensionPixelSize(ky.card_profile_image_size);
                        final float n = dimensionPixelSize;
                        o = new ImageSpec(n, n);
                        ((ImageSpec)o).url = UserImageRequest.a(twitterUser.profileImageUrl, dimensionPixelSize).a().a();
                        break;
                    }
                    case 7: {
                        final Resources resources = this.B().getResources();
                        o = new ImageSpec(resources.getDimension(ky.card_banner_image_width), resources.getDimension(ky.card_banner_image_height));
                        ((ImageSpec)o).url = com.twitter.library.media.util.m.a(twitterUser.profileHeaderImageUrl, bj.a);
                        break;
                    }
                    case 8: {
                        o = twitterUser.name;
                        break;
                    }
                    case 9: {
                        o = twitterUser.location;
                        break;
                    }
                    case 10: {
                        o = twitterUser.profileDescription;
                        break;
                    }
                    case 11: {
                        o = twitterUser.profileUrl;
                        break;
                    }
                    case 12: {
                        o = twitterUser.isProtected;
                        break;
                    }
                    case 13: {
                        o = twitterUser.verified;
                        break;
                    }
                    case 14: {
                        o = (twitterUser.friendship == 1);
                        break;
                    }
                    case 15: {
                        o = twitterUser.statusesCount;
                        break;
                    }
                    case 16: {
                        o = twitterUser.friendsCount;
                        break;
                    }
                    case 17: {
                        o = twitterUser.followersCount;
                        break;
                    }
                }
                return o;
            }
        }
        return null;
    }
    
    protected Object a(final String s, final HashMap hashMap) {
        BindingValue bindingValue = this.mBindingValues.get(s);
        if (bindingValue == null && hashMap != null) {
            bindingValue = hashMap.get(s);
        }
        if (bindingValue != null) {
            return BindingValue.a(bindingValue);
        }
        return null;
    }
    
    protected String a(final Object o) {
        String a = null;
        if (o == null) {
            return a;
        }
        final boolean b = o instanceof String;
        a = null;
        if (!b) {
            return a;
        }
        final String s = (String)o;
        try {
            a = a(new BigDecimal(s));
            return a;
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public void a(final int n, final int n2) {
        this.b(this, n, n2);
    }
    
    public void a(final int n, final int n2, final boolean b) {
        if (this.mCardView != null && this.b(n) != null) {
            final Action action = (Action)this.actions.get(n2);
            if (action != null) {
                if (!b) {
                    this.a(1, action.apiRequest.failureActionId);
                    return;
                }
                this.a(1, action.apiRequest.successActionId);
            }
        }
    }
    
    @Override
    public void a(Context applicationContext) {
        final n n = new n(applicationContext);
        if (com.twitter.library.featureswitch.d.f("cards_forward_card_cache_enabled")) {
            applicationContext = applicationContext.getApplicationContext();
        }
        this.mView = (View)new CardView(applicationContext, this, n);
        this.d(applicationContext);
    }
    
    public void a(final Context context, final Tweet mTweet, final h h, final ao ao, final m m, final j j, final boolean mIsForwardCard) {
        synchronized (this) {
            this.mBindId = Card.c.incrementAndGet();
            this.mTweet = mTweet;
            this.mIsForwardCard = mIsForwardCard;
            this.b(context);
            this.a(j);
            if (this.mFirstBind) {
                this.k();
                this.l();
                this.m();
            }
            this.a(m);
            this.n();
            if (this.mFirstBind) {
                this.c(context);
            }
            this.mIsReleased.set(false);
            this.a(h, ao);
        }
    }
    
    @Override
    public void a(final Canvas canvas) {
        super.a(canvas);
        if (Card.d && App.f()) {
            this.e(canvas);
        }
    }
    
    public void a(final Element element, final int mDeferredActionTouchType, final int mDeferredActionId) {
        if (this.mDeferredActionElementSerialId == 0) {
            this.mDeferredActionElementSerialId = element.x();
            this.mDeferredActionTouchType = mDeferredActionTouchType;
            this.mDeferredActionId = mDeferredActionId;
        }
    }
    
    public void a(final j mCardEventListener) {
        this.mCardEventListener = mCardEventListener;
    }
    
    protected void a(final Binding binding) {
        final Element a = this.a(binding.destId);
        if (a != null) {
            try {
                switch (binding.destType) {
                    case 1:
                    case 6:
                    case 7: {
                        break;
                    }
                    case 2: {
                        ((Image)a).spec = null;
                    }
                    case 3: {
                        ((Player)a).specFullSize = null;
                    }
                    case 4: {
                        ((Player)a).streamUrl = null;
                    }
                    case 5: {
                        ((Player)a).streamContentType = null;
                    }
                    case 8: {
                        ((Player)a).htmlUrl = null;
                    }
                    case 9: {
                        ((Player)a).spec = null;
                    }
                    case 10: {
                        ((FollowButtonElement)a).a((TwitterUser)null);
                    }
                    default: {}
                }
            }
            catch (NumberFormatException ex) {}
            catch (ClassCastException ex2) {}
        }
    }
    
    protected void a(final Binding binding, final Object o) {
        if (this.aE_() != null) {
            try {
                final boolean booleanValue = (boolean)o;
                final ArrayList list = (ArrayList)this.mTextTokenGroupMap.get(binding.destId);
                if (list != null) {
                    final Iterator<TextTokenGroup> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().visible = booleanValue;
                    }
                }
            }
            catch (ClassCastException ex) {}
        }
    }
    
    protected void a(final Binding binding, final Object o, final HashMap hashMap) {
        final Element a = this.a(binding.destId);
        if (a != null) {
            try {
                switch (binding.destType) {
                    case 1: {
                        a.f((boolean)o);
                    }
                    case 2: {
                        ((Image)a).spec = (ImageSpec)o;
                    }
                    case 3: {
                        ((Player)a).specFullSize = (ImageSpec)o;
                    }
                    case 4: {
                        ((Player)a).streamUrl = (String)o;
                    }
                    case 5: {
                        ((Player)a).streamContentType = (String)o;
                    }
                    case 6: {
                        ((Player)a).streamSize.x = Float.parseFloat(o.toString());
                    }
                    case 7: {
                        ((Player)a).streamSize.y = Float.parseFloat(o.toString());
                    }
                    case 8: {
                        ((Player)a).htmlUrl = (String)o;
                    }
                    case 9: {
                        ((Player)a).spec = (ImageSpec)o;
                    }
                    case 10: {
                        final FollowButtonElement followButtonElement = (FollowButtonElement)a;
                        final TwitterUser twitterUser = hashMap.get(o);
                        if (twitterUser != null) {
                            followButtonElement.a(twitterUser);
                            return;
                        }
                        break;
                    }
                    default: {}
                }
            }
            catch (NumberFormatException ex) {}
            catch (ClassCastException ex2) {}
        }
    }
    
    public void a(final Tweet mTweet) {
        synchronized (this) {
            this.mTweet = mTweet;
            this.v();
        }
    }
    
    public void a(final Tweet tweet, final h h, final ao ao) {
        if (!this.mToRefresh) {
            return;
        }
        new e(this, tweet, h, ao, this.a()).execute((Object[])new Void[0]);
    }
    
    public void a(final String s, final BindingValue bindingValue) {
        this.mBindingValues.put(s, bindingValue);
    }
    
    public void a(final String s, final String s2, final String s3, final boolean b, final boolean b2) {
        this.mCardEventListener.a(s, s2, s3, b, b2);
    }
    
    public CardView aB_() {
        return this.mCardView;
    }
    
    public j aC_() {
        return this.mCardEventListener;
    }
    
    public Tweet aD_() {
        return this.mTweet;
    }
    
    public LocalizedTokenizedText aE_() {
        LocalizedTokenizedText localizedTokenizedText;
        if (this.localizedTokenizedTexts == null) {
            localizedTokenizedText = null;
        }
        else {
            final String lowerCase = i.b(this.B().getResources().getConfiguration().locale).toLowerCase();
            localizedTokenizedText = (LocalizedTokenizedText)this.localizedTokenizedTexts.get(lowerCase);
            if (localizedTokenizedText == null) {
                String s;
                if ("nb".equals(lowerCase)) {
                    s = "no";
                }
                else if ("ms".equals(lowerCase)) {
                    s = "msa";
                }
                else {
                    s = "en";
                }
                return (LocalizedTokenizedText)this.localizedTokenizedTexts.get(s);
            }
        }
        return localizedTokenizedText;
    }
    
    public Element b(final int n) {
        return (Element)this.mSerialElementMap.get(n);
    }
    
    public m b() {
        final m m = new m();
        this.a(new com.twitter.library.card.a(this, m));
        m.b = this.mBindingValues;
        m.c = this.mDeferredActionElementSerialId;
        m.d = this.mDeferredActionTouchType;
        m.e = this.mDeferredActionId;
        return m;
    }
    
    public void b(final Element element, final int n, final int n2) {
        if (n2 != 0 && this.mCardEventListener != null) {
            a actions;
            int n3;
            for (Action action = (Action)this.actions.get(n2); action != null; action = (Action)actions.get(n3)) {
                if (this.mCardEventListener != null) {
                    this.mCardEventListener.a(element, n, action.id);
                }
                final Boolean a = this.a(element, action);
                if (a == null) {
                    this.a(element, n, action.id);
                    return;
                }
                o o;
                if (this.mTestHooks == null) {
                    o = null;
                }
                else {
                    o = (o)this.mTestHooks.get();
                }
                if (o != null) {
                    o.a(n, action);
                }
                actions = this.actions;
                if (a) {
                    n3 = action.successActionId;
                }
                else {
                    n3 = action.failureActionId;
                }
            }
        }
    }
    
    protected void b(final Binding binding) {
        if (this.aE_() != null) {
            final ArrayList list = (ArrayList)this.mTextTokenMap.get(binding.destId);
            if (list != null) {
                final Iterator<TextToken> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().text = null;
                }
            }
        }
    }
    
    protected void b(final Binding binding, final Object o) {
        if (this.aE_() != null && (o instanceof String || o instanceof Integer || o instanceof Long || o instanceof Float || o instanceof Double || o instanceof Boolean)) {
            final String string = o.toString();
            final ArrayList list = (ArrayList)this.mTextTokenMap.get(binding.destId);
            if (list != null) {
                final Iterator<TextToken> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().text = string;
                }
            }
        }
    }
    
    @Override
    public void b(final boolean b) {
        this.mIsReleased.set(true);
        super.b(b);
    }
    
    public String c(final int n) {
        final StringBuilder sb = new StringBuilder();
        final LocalizedTokenizedText ae_ = this.aE_();
        if (ae_ != null) {
            final TokenizedText tokenizedText = (TokenizedText)ae_.tokenizedTexts.get(n);
            if (tokenizedText != null) {
                for (final TextTokenGroup textTokenGroup : tokenizedText.textTokenGroups) {
                    if (textTokenGroup.visible && textTokenGroup.textTokens != null) {
                        for (final TextToken textToken : textTokenGroup.textTokens) {
                            if (textToken.text != null) {
                                sb.append(textToken.text);
                            }
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
    
    protected void c(final Binding binding) {
        final Action action = (Action)this.actions.get(binding.destId);
        if (action == null) {
            return;
        }
        try {
            switch (binding.destType) {
                case 23: {
                    action.url = null;
                }
                case 24: {
                    action.displayUrl = null;
                }
                case 25: {
                    action.userId = 0L;
                }
                case 26: {
                    action.appId = null;
                }
                case 27: {
                    action.appUrl = null;
                }
                case 28: {
                    action.displayAppUrl = null;
                }
                case 29: {
                    action.phoneNumberUrl = null;
                }
                case 30: {
                    action.phoneNumber = null;
                }
                default: {}
            }
        }
        catch (ClassCastException ex) {}
    }
    
    protected void c(final Binding binding, final Object o) {
        final Action action = (Action)this.actions.get(binding.destId);
        if (action == null) {
            return;
        }
        try {
            switch (binding.destType) {
                case 23: {
                    action.url = (String)o;
                }
                case 24: {
                    action.displayUrl = (String)o;
                }
                case 25: {
                    if (o instanceof String) {
                        action.userId = Long.parseLong((String)o);
                        return;
                    }
                    action.userId = (long)o;
                }
                case 26: {
                    action.appId = (String)o;
                }
                case 27: {
                    action.appUrl = (String)o;
                }
                case 28: {
                    action.displayAppUrl = (String)o;
                }
                case 29: {
                    action.phoneNumberUrl = (String)o;
                }
                case 30: {
                    action.phoneNumber = (String)o;
                }
                default: {}
            }
        }
        catch (ClassCastException ex) {}
        catch (NumberFormatException ex2) {}
    }
    
    public void c(final boolean b) {
        final int mDeferredActionElementSerialId = this.mDeferredActionElementSerialId;
        final int mDeferredActionTouchType = this.mDeferredActionTouchType;
        final int mDeferredActionId = this.mDeferredActionId;
        this.L();
        if (mDeferredActionElementSerialId != 0) {
            final Element b2 = this.b(mDeferredActionElementSerialId);
            if (b2 != null) {
                final Action action = (Action)this.actions.get(mDeferredActionId);
                int n;
                if (b) {
                    n = action.successActionId;
                }
                else {
                    n = action.failureActionId;
                }
                this.b(b2, mDeferredActionTouchType, n);
            }
        }
    }
    
    public boolean c() {
        return this.mIsForwardCard;
    }
    
    public ApiRequestParameter d(final int n) {
        return (ApiRequestParameter)this.mApiRequestParameterMap.get(n);
    }
    
    protected void d(final Binding binding) {
        final ApiRequestParameter d = this.d(binding.destId);
        if (d == null) {
            return;
        }
        try {
            switch (binding.destType) {
                case 31: {
                    d.key = null;
                }
                case 32: {
                    d.value = null;
                }
                default: {}
            }
        }
        catch (ClassCastException ex) {}
    }
    
    protected void d(final Binding binding, final Object o) {
        final ApiRequestParameter d = this.d(binding.destId);
        if (d == null) {
            return;
        }
        try {
            switch (binding.destType) {
                case 31: {
                    d.key = (String)o;
                }
                case 32: {
                    d.value = (String)o;
                }
                default: {}
            }
        }
        catch (ClassCastException ex) {}
    }
    
    public PurchaseRequestParameter e(final int n) {
        return (PurchaseRequestParameter)this.mPurchaseRequestParameterMap.get(n);
    }
    
    protected void e(final Binding binding, final Object o) {
        final PurchaseRequestParameter e = this.e(binding.destId);
        if (e == null) {
            return;
        }
        try {
            switch (binding.destType) {
                case 33: {
                    e.key = (String)o;
                }
                case 34: {
                    e.value = (String)o;
                }
                default: {}
            }
        }
        catch (ClassCastException ex) {}
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Card)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Card card = (Card)o;
            if (this.doNotCache != card.doNotCache) {
                return false;
            }
            if (this.loadActionId != card.loadActionId) {
                return false;
            }
            Label_0087: {
                if (this.actions != null) {
                    if (this.actions.equals(card.actions)) {
                        break Label_0087;
                    }
                }
                else if (card.actions == null) {
                    break Label_0087;
                }
                return false;
            }
            if (!Arrays.equals(this.bindings, card.bindings)) {
                return false;
            }
            Label_0133: {
                if (this.localizedTokenizedTexts != null) {
                    if (this.localizedTokenizedTexts.equals(card.localizedTokenizedTexts)) {
                        break Label_0133;
                    }
                }
                else if (card.localizedTokenizedTexts == null) {
                    break Label_0133;
                }
                return false;
            }
            Label_0163: {
                if (this.name != null) {
                    if (this.name.equals(card.name)) {
                        break Label_0163;
                    }
                }
                else if (card.name == null) {
                    break Label_0163;
                }
                return false;
            }
            Label_0193: {
                if (this.platformKey != null) {
                    if (this.platformKey.equals(card.platformKey)) {
                        break Label_0193;
                    }
                }
                else if (card.platformKey == null) {
                    break Label_0193;
                }
                return false;
            }
            Label_0223: {
                if (this.styles != null) {
                    if (this.styles.equals(card.styles)) {
                        break Label_0223;
                    }
                }
                else if (card.styles == null) {
                    break Label_0223;
                }
                return false;
            }
            Label_0253: {
                if (this.uuid != null) {
                    if (this.uuid.equals(card.uuid)) {
                        break Label_0253;
                    }
                }
                else if (card.uuid == null) {
                    break Label_0253;
                }
                return false;
            }
            if (this.forms != null) {
                if (this.forms.equals(card.forms)) {
                    return true;
                }
            }
            else if (card.forms == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public void h() {
        synchronized (this) {
            this.w();
            this.N();
            this.L();
            this.b((Context)null);
            this.mTweet = null;
            this.mBindingValues.clear();
            this.mFirstLoad = true;
            this.mBindId = 0;
            this.mIsReleased.set(true);
        }
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.uuid != null) {
            hashCode = this.uuid.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.name != null) {
            hashCode2 = this.name.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.platformKey != null) {
            hashCode3 = this.platformKey.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.bindings != null) {
            hashCode4 = Arrays.hashCode(this.bindings);
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.actions != null) {
            hashCode5 = this.actions.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.styles != null) {
            hashCode6 = this.styles.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.localizedTokenizedTexts != null) {
            hashCode7 = this.localizedTokenizedTexts.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (31 * (hashCode7 + n7) + this.loadActionId);
        int hashCode8;
        if (this.forms != null) {
            hashCode8 = this.forms.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n9 = 31 * (hashCode8 + n8);
        final boolean doNotCache = this.doNotCache;
        int n10 = 0;
        if (doNotCache) {
            n10 = 1;
        }
        return n9 + n10;
    }
    
    public Card i() {
        synchronized (this) {
            if (this.mFirstBind) {
                this.a(this.B());
                if (this.mView != null) {
                    this.a((CardView)this.mView);
                }
            }
            Card card;
            if (this.mView == null) {
                card = null;
            }
            else {
                this.a_(this);
                this.r();
                this.v();
                this.d();
                this.mFirstBind = false;
                card = this;
            }
            return card;
        }
    }
    
    public void j() {
        this.u();
        if (this.mFirstLoad) {
            this.mFirstLoad = false;
            this.a(1, this.loadActionId);
        }
    }
    
    protected void k() {
        this.a(new com.twitter.library.card.d(this));
    }
    
    protected void l() {
        final LocalizedTokenizedText ae_ = this.aE_();
        if (ae_ != null && ae_.tokenizedTexts != null) {
            for (int size = ae_.tokenizedTexts.size(), i = 0; i < size; ++i) {
                final TokenizedText tokenizedText = (TokenizedText)ae_.tokenizedTexts.valueAt(i);
                if (tokenizedText != null && tokenizedText.textTokenGroups != null) {
                    for (final TextTokenGroup textTokenGroup : tokenizedText.textTokenGroups) {
                        final int id = textTokenGroup.id;
                        if (id != 0) {
                            ArrayList<TextTokenGroup> list = (ArrayList<TextTokenGroup>)this.mTextTokenGroupMap.get(id);
                            if (list == null) {
                                list = new ArrayList<TextTokenGroup>();
                                this.mTextTokenGroupMap.put(id, (Object)list);
                            }
                            list.add(textTokenGroup);
                        }
                        if (textTokenGroup.textTokens != null) {
                            for (final TextToken textToken : textTokenGroup.textTokens) {
                                final int id2 = textToken.id;
                                if (id2 != 0) {
                                    ArrayList<TextToken> list2 = (ArrayList<TextToken>)this.mTextTokenMap.get(id2);
                                    if (list2 == null) {
                                        list2 = new ArrayList<TextToken>();
                                        this.mTextTokenMap.put(id2, (Object)list2);
                                    }
                                    list2.add(textToken);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected void m() {
        if (this.actions != null) {
            for (int size = this.actions.size(), i = 0; i < size; ++i) {
                final ApiRequest apiRequest = ((Action)this.actions.valueAt(i)).apiRequest;
                if (apiRequest != null) {
                    final ApiRequestParameter[] parameters = apiRequest.parameters;
                    if (parameters != null) {
                        for (final ApiRequestParameter apiRequestParameter : parameters) {
                            this.mApiRequestParameterMap.put(apiRequestParameter.id, (Object)apiRequestParameter);
                        }
                    }
                }
            }
        }
    }
    
    public void n() {
        if (this.bindings != null) {
            this.M();
            this.O();
        }
        this.s();
    }
    
    protected boolean o() {
        return this.mIsReleased.get();
    }
    
    public void p() {
        this.mToRefresh = true;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.uuid = (String)objectInput.readObject();
        this.name = (String)objectInput.readObject();
        this.platformKey = (String)objectInput.readObject();
        this.bindings = (Binding[])com.twitter.util.f.a(Binding[].class, objectInput);
        this.actions = com.twitter.library.card.property.a.a(Action.class, objectInput);
        this.styles = com.twitter.library.card.property.a.a(Style.class, objectInput);
        this.localizedTokenizedTexts = com.twitter.util.f.a(String.class, LocalizedTokenizedText.class, objectInput);
        this.loadActionId = objectInput.readInt();
        this.forms = com.twitter.library.card.property.a.a(Form.class, objectInput);
        this.doNotCache = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.uuid);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.platformKey);
        com.twitter.util.f.a(this.bindings, objectOutput);
        com.twitter.library.card.property.a.a(this.actions, objectOutput);
        com.twitter.library.card.property.a.a(this.styles, objectOutput);
        com.twitter.util.f.a(this.localizedTokenizedTexts, objectOutput);
        objectOutput.writeInt(this.loadActionId);
        com.twitter.library.card.property.a.a(this.forms, objectOutput);
        objectOutput.writeBoolean(this.doNotCache);
    }
}
