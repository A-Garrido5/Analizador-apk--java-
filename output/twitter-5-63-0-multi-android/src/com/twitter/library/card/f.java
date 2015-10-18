// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

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
import com.twitter.library.card.element.Element;
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
import android.graphics.Paint;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Externalizable;
import com.twitter.library.card.element.Container;
import android.text.TextUtils;
import com.twitter.library.card.property.Action;
import android.os.AsyncTask;

class f extends AsyncTask
{
    protected final Void a(final Action... array) {
        for (final Action action : array) {
            if (action != null) {
                if (e(action.appUrl)) {
                    action.validationStatus = 2;
                    CardDebugLog.a("Action app Url " + action.appUrl + " is valid", null);
                }
                else {
                    action.validationStatus = 3;
                    if (!TextUtils.isEmpty((CharSequence)action.appUrl)) {
                        CardDebugLog.a("Action app Url " + action.appUrl + " is NOT valid", null);
                    }
                }
            }
        }
        return null;
    }
}
