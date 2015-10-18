// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import com.twitter.library.card.property.FormSelectOption;
import com.twitter.library.card.property.FormField;
import com.twitter.library.card.property.TextToken;
import com.twitter.library.card.property.TextTokenGroup;
import com.twitter.library.card.property.StylePair;
import com.twitter.library.card.property.PurchaseRequestParameter;
import com.twitter.library.card.property.PurchaseRequest;
import com.twitter.library.card.property.ApiRequestParameter;
import com.twitter.library.card.property.ApiRequest;
import com.twitter.library.card.property.Form;
import com.twitter.library.card.property.TokenizedText;
import com.twitter.library.card.property.Style;
import com.twitter.library.card.property.Action;
import com.twitter.library.card.property.LocalizedTokenizedText;
import java.net.MalformedURLException;
import android.webkit.URLUtil;
import android.text.TextUtils;
import com.twitter.library.card.element.FormSelect;
import com.twitter.library.card.element.FormCheckbox;
import com.twitter.library.card.element.Player;
import com.twitter.library.card.element.Image;
import com.twitter.library.card.element.Text;
import com.twitter.library.card.element.Box;
import com.twitter.library.card.element.Container;
import com.twitter.library.card.element.Element;
import com.twitter.library.card.property.Binding;
import java.util.HashMap;
import com.twitter.library.util.bj;
import java.util.ArrayList;
import com.twitter.library.card.property.a;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.property.Border;
import com.twitter.library.card.property.Vector2;
import com.twitter.library.card.property.Spacing;
import android.graphics.Color;
import com.twitter.library.card.property.Fill;
import com.twitter.library.card.element.FollowButtonElement$Kind;
import com.twitter.library.card.element.FollowButtonElement;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.card.element.FormText;
import com.fasterxml.jackson.core.JsonParser;

public abstract class k
{
    protected static FormText A(final JsonParser jsonParser) {
        final FormText formText = new FormText();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("form_field".equalsIgnoreCase(g)) {
                        formText.field = w(jsonParser);
                        break;
                    }
                    if ("color".equalsIgnoreCase(g)) {
                        formText.color = D(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("placeholder_tokenized_text_id".equalsIgnoreCase(g)) {
                        formText.placeHolderTextId = jsonParser.h();
                        break;
                    }
                    if ("max_length".equalsIgnoreCase(g)) {
                        formText.maxLength = jsonParser.h();
                        break;
                    }
                    if ("font_size".equalsIgnoreCase(g)) {
                        formText.fontSize = a(jsonParser.j());
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("charset".equalsIgnoreCase(g)) {
                        formText.charset = jsonParser.g();
                        break;
                    }
                    if ("input_mode".equalsIgnoreCase(g)) {
                        formText.inputMode = jsonParser.g();
                        break;
                    }
                    if ("font_name".equalsIgnoreCase(g)) {
                        formText.fontName = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("font_bold".equalsIgnoreCase(g)) {
                        formText.fontBold = jsonParser.l();
                        break;
                    }
                    if ("font_underline".equalsIgnoreCase(g)) {
                        formText.fontUnderline = jsonParser.l();
                        break;
                    }
                    if ("font_italic".equalsIgnoreCase(g)) {
                        formText.fontItalic = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return formText;
    }
    
    protected static FollowButtonElement B(final JsonParser jsonParser) {
        String g = null;
        final FollowButtonElement followButtonElement = new FollowButtonElement();
        followButtonElement.kind = null;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if (!"kind".equalsIgnoreCase(g)) {
                        break;
                    }
                    if ("small".equalsIgnoreCase(g2)) {
                        followButtonElement.kind = FollowButtonElement$Kind.a;
                        break;
                    }
                    if ("large".equalsIgnoreCase(g2)) {
                        followButtonElement.kind = FollowButtonElement$Kind.b;
                        break;
                    }
                    throw new CardParserException("unknown kind: " + g2);
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        if (followButtonElement.kind == null) {
            throw new CardParserException("invalid follow button");
        }
        return followButtonElement;
    }
    
    protected static Fill C(final JsonParser jsonParser) {
        final Fill fill = new Fill();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            Label_0080: {
                switch (l.a[jsonToken.ordinal()]) {
                    case 1: {
                        if ("solid".equalsIgnoreCase(g)) {
                            fill.a(D(jsonParser));
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        if (!"gradient".equalsIgnoreCase(g)) {
                            jsonParser.c();
                            break;
                        }
                        JsonToken jsonToken2 = jsonParser.a();
                        while (true) {
                            boolean b;
                            if (jsonToken2 != null) {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            boolean b2;
                            if (jsonToken2 != JsonToken.e) {
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            if (!(b & b2)) {
                                break Label_0080;
                            }
                            a(jsonParser, fill);
                            jsonToken2 = jsonParser.a();
                        }
                        break;
                    }
                    case 3: {
                        final String g2 = jsonParser.g();
                        if (!"type".equalsIgnoreCase(g)) {
                            break;
                        }
                        if ("none".equalsIgnoreCase(g2)) {
                            fill.type = 1;
                            break;
                        }
                        if ("solid".equalsIgnoreCase(g2)) {
                            fill.type = 2;
                            break;
                        }
                        if ("gradient".equalsIgnoreCase(g2)) {
                            fill.type = 3;
                            break;
                        }
                        throw new CardParserException("unknown fill type: " + g2);
                    }
                    case 4:
                    case 5: {
                        if ("angle".equalsIgnoreCase(g)) {
                            fill.angle = jsonParser.j();
                            break;
                        }
                        break;
                    }
                    case 8: {
                        g = jsonParser.g();
                        break;
                    }
                }
            }
            jsonToken = jsonParser.a();
        }
        if (fill.type == 3 && fill.a() == 0) {
            throw new CardParserException("invalid fill");
        }
        return fill;
    }
    
    protected static int D(final JsonParser jsonParser) {
        int p = -1;
        final JsonToken a = jsonParser.a();
        String g = null;
        JsonToken a2 = a;
        int p2 = p;
        int p3 = p;
        int p4 = p;
        while (a2 != null && a2 != JsonToken.c) {
            switch (l.a[a2.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("a".equalsIgnoreCase(g)) {
                        p3 = P(jsonParser);
                        break;
                    }
                    if ("r".equalsIgnoreCase(g)) {
                        p2 = P(jsonParser);
                        break;
                    }
                    if ("g".equalsIgnoreCase(g)) {
                        p = P(jsonParser);
                        break;
                    }
                    if ("b".equalsIgnoreCase(g)) {
                        p4 = P(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            a2 = jsonParser.a();
        }
        if (p3 < 0 || p2 < 0 || p < 0 || p4 < 0) {
            throw new CardParserException("invalid color");
        }
        return Color.argb(p3, p2, p, p4);
    }
    
    protected static Spacing E(final JsonParser jsonParser) {
        final Spacing spacing = new Spacing(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    final float a = a(jsonParser.j());
                    if ("left".equalsIgnoreCase(g)) {
                        spacing.start.x = a;
                        break;
                    }
                    if ("top".equalsIgnoreCase(g)) {
                        spacing.start.y = a;
                        break;
                    }
                    if ("right".equalsIgnoreCase(g)) {
                        spacing.end.x = a;
                        break;
                    }
                    if ("bottom".equalsIgnoreCase(g)) {
                        spacing.end.y = a;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (Float.isNaN(spacing.start.x) || Float.isNaN(spacing.start.y) || Float.isNaN(spacing.end.x) || Float.isNaN(spacing.end.y)) {
            throw new CardParserException("invalid spacing");
        }
        return spacing;
    }
    
    protected static Vector2 F(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final Vector2 vector2 = new Vector2();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("width".equalsIgnoreCase(g)) {
                        vector2.x = G(jsonParser);
                        break;
                    }
                    if ("height".equalsIgnoreCase(g)) {
                        vector2.y = G(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (vector2.x == 0 || vector2.y == 0) {
            throw new CardParserException("invalid size mode vector");
        }
        return vector2;
    }
    
    protected static int G(final JsonParser jsonParser) {
        final String g = jsonParser.g();
        if ("fixed".equalsIgnoreCase(g)) {
            return 1;
        }
        if ("fill".equalsIgnoreCase(g)) {
            return 2;
        }
        if ("fit".equalsIgnoreCase(g)) {
            return 3;
        }
        if ("constrain".equalsIgnoreCase(g)) {
            return 4;
        }
        if ("none".equalsIgnoreCase(g)) {
            return 5;
        }
        throw new CardParserException("unknown size mode: " + g);
    }
    
    protected static Border H(final JsonParser jsonParser) {
        final Border border = new Border();
        border.width = Float.NaN;
        final JsonToken a = jsonParser.a();
        String g = null;
        boolean b = false;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (l.a[a2.ordinal()]) {
                case 1: {
                    if ("color".equalsIgnoreCase(g)) {
                        (border.background = new Fill()).a(D(jsonParser));
                        b = true;
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("width".equalsIgnoreCase(g)) {
                        border.width = a(jsonParser.j());
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        if (Float.isNaN(border.width) || !b) {
            throw new CardParserException("invalid border");
        }
        return border;
    }
    
    protected static Vector2 I(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final Vector2 vector2 = new Vector2();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("horizontal".equalsIgnoreCase(g)) {
                        vector2.x = J(jsonParser);
                        break;
                    }
                    if ("vertical".equalsIgnoreCase(g)) {
                        vector2.y = J(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (vector2.x == 0 || vector2.y == 0) {
            throw new CardParserException("invalid alignment mode vector");
        }
        return vector2;
    }
    
    protected static int J(final JsonParser jsonParser) {
        final String g = jsonParser.g();
        if ("start".equalsIgnoreCase(g)) {
            return 1;
        }
        if ("middle".equalsIgnoreCase(g)) {
            return 2;
        }
        if ("end".equalsIgnoreCase(g)) {
            return 3;
        }
        if ("natural".equalsIgnoreCase(g)) {
            return 4;
        }
        throw new CardParserException("unknown alignment mode: " + g);
    }
    
    protected static Vector2F K(final JsonParser jsonParser) {
        final Vector2F b = Vector2F.b();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    final float a = a(jsonParser.j());
                    if ("x".equalsIgnoreCase(g)) {
                        b.x = a;
                        break;
                    }
                    if ("y".equalsIgnoreCase(g)) {
                        b.y = a;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (Float.isNaN(b.x) || Float.isNaN(b.y)) {
            throw new CardParserException("invalid scaled vector2");
        }
        return b;
    }
    
    protected static int L(final JsonParser jsonParser) {
        final String g = jsonParser.g();
        if ("relative".equalsIgnoreCase(g)) {
            return 1;
        }
        if ("absolute".equalsIgnoreCase(g)) {
            return 2;
        }
        throw new CardParserException("unknown position mode:" + g);
    }
    
    protected static int M(final JsonParser jsonParser) {
        final String g = jsonParser.g();
        if ("clip".equalsIgnoreCase(g)) {
            return 1;
        }
        if ("show".equalsIgnoreCase(g)) {
            return 2;
        }
        if ("ellipsis".equalsIgnoreCase(g)) {
            return 3;
        }
        throw new CardParserException("unknown overflowMode mode: " + g);
    }
    
    protected static a N(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final a a = new a();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    d(jsonParser, a);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return a;
    }
    
    public static final int[] O(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<Integer> list = new ArrayList<Integer>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    list.add(Q(jsonParser));
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        final int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = list.get(i);
        }
        return array;
    }
    
    public static int P(final JsonParser jsonParser) {
        final int n = (int)(255.0f * jsonParser.j());
        if (n < 0 || n > 255) {
            throw new CardParserException("invalid color channel");
        }
        return n;
    }
    
    public static int Q(final JsonParser jsonParser) {
        final int h = jsonParser.h();
        if (h == 0) {
            throw new CardParserException("invalid id");
        }
        return h;
    }
    
    public static float a(final float n) {
        return n * bj.a;
    }
    
    public static Card a(final JsonParser jsonParser) {
        boolean doNotCache = false;
        String s = null;
        JsonToken a = jsonParser.a();
        int loadActionId = 0;
        HashMap localizedTokenizedTexts = null;
        a forms = null;
        a styles = null;
        a actions = null;
        Binding[] bindings = null;
        String platformKey = null;
        String name = null;
        String uuid = null;
        Card card = null;
        while (a != null && a != JsonToken.c) {
            boolean b = false;
            int n = 0;
            HashMap hashMap = null;
            a a2 = null;
            a a3 = null;
            a a4 = null;
            Binding[] array = null;
            String s3 = null;
            String s4 = null;
            String s5 = null;
            Card card3 = null;
            String g = null;
            Label_0150: {
                switch (l.a[a.ordinal()]) {
                    case 1: {
                        if ("root".equalsIgnoreCase(s)) {
                            final Card card2 = (Card)a(jsonParser, true);
                            final String s2 = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card2;
                            g = s2;
                            break Label_0150;
                        }
                        jsonParser.c();
                        g = s;
                        b = doNotCache;
                        n = loadActionId;
                        hashMap = localizedTokenizedTexts;
                        a2 = forms;
                        a3 = styles;
                        a4 = actions;
                        array = bindings;
                        s3 = platformKey;
                        s4 = name;
                        s5 = uuid;
                        card3 = card;
                        break Label_0150;
                    }
                    case 2: {
                        if ("bindings".equalsIgnoreCase(s)) {
                            final Binding[] b2 = b(jsonParser);
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final a a5 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = b2;
                            g = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = a5;
                            break Label_0150;
                        }
                        if ("actions".equalsIgnoreCase(s)) {
                            final a d = d(jsonParser);
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final a a6 = styles;
                            a4 = d;
                            g = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = a6;
                            break Label_0150;
                        }
                        if ("styles".equalsIgnoreCase(s)) {
                            final a m = m(jsonParser);
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final String s6 = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = m;
                            g = s6;
                            break Label_0150;
                        }
                        if ("localized_tokenized_text".equalsIgnoreCase(s)) {
                            final HashMap n2 = n(jsonParser);
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final String s7 = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = n2;
                            g = s7;
                            break Label_0150;
                        }
                        if ("forms".equalsIgnoreCase(s)) {
                            final a n3 = N(jsonParser);
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final int n4 = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = n3;
                            g = s;
                            b = doNotCache;
                            n = n4;
                            break Label_0150;
                        }
                        jsonParser.c();
                        g = s;
                        b = doNotCache;
                        n = loadActionId;
                        hashMap = localizedTokenizedTexts;
                        a2 = forms;
                        a3 = styles;
                        a4 = actions;
                        array = bindings;
                        s3 = platformKey;
                        s4 = name;
                        s5 = uuid;
                        card3 = card;
                        break Label_0150;
                    }
                    case 3: {
                        final String g2 = jsonParser.g();
                        if ("uuid".equalsIgnoreCase(s)) {
                            card3 = card;
                            final boolean b3 = doNotCache;
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = g2;
                            g = s;
                            b = b3;
                            break Label_0150;
                        }
                        if ("name".equalsIgnoreCase(s)) {
                            s5 = uuid;
                            card3 = card;
                            final int n5 = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = g2;
                            g = s;
                            b = doNotCache;
                            n = n5;
                            break Label_0150;
                        }
                        if ("platform_key".equalsIgnoreCase(s)) {
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final HashMap hashMap2 = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = g2;
                            g = s;
                            b = doNotCache;
                            n = loadActionId;
                            hashMap = hashMap2;
                            break Label_0150;
                        }
                        break;
                    }
                    case 4:
                    case 5: {
                        if ("load_action_id".equalsIgnoreCase(s)) {
                            final int q = Q(jsonParser);
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final String s8 = s;
                            b = doNotCache;
                            n = q;
                            g = s8;
                            break Label_0150;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        final boolean l = jsonParser.l();
                        if ("do_not_cache".equalsIgnoreCase(s)) {
                            n = loadActionId;
                            hashMap = localizedTokenizedTexts;
                            a2 = forms;
                            a3 = styles;
                            a4 = actions;
                            array = bindings;
                            s3 = platformKey;
                            s4 = name;
                            s5 = uuid;
                            card3 = card;
                            final String s9 = s;
                            b = l;
                            g = s9;
                            break Label_0150;
                        }
                        break;
                    }
                    case 8: {
                        g = jsonParser.g();
                        b = doNotCache;
                        n = loadActionId;
                        hashMap = localizedTokenizedTexts;
                        a2 = forms;
                        a3 = styles;
                        a4 = actions;
                        array = bindings;
                        s3 = platformKey;
                        s4 = name;
                        s5 = uuid;
                        card3 = card;
                        break Label_0150;
                    }
                }
                g = s;
                b = doNotCache;
                n = loadActionId;
                hashMap = localizedTokenizedTexts;
                a2 = forms;
                a3 = styles;
                a4 = actions;
                array = bindings;
                s3 = platformKey;
                s4 = name;
                s5 = uuid;
                card3 = card;
            }
            final JsonToken a7 = jsonParser.a();
            final String s10 = g;
            a = a7;
            card = card3;
            uuid = s5;
            name = s4;
            platformKey = s3;
            bindings = array;
            actions = a4;
            styles = a3;
            forms = a2;
            localizedTokenizedTexts = hashMap;
            loadActionId = n;
            doNotCache = b;
            s = s10;
        }
        if (card == null || uuid == null || name == null || platformKey == null) {
            throw new CardParserException("invalid card");
        }
        card.uuid = uuid;
        card.name = name;
        card.platformKey = platformKey;
        card.bindings = bindings;
        card.actions = actions;
        card.styles = styles;
        card.forms = forms;
        card.localizedTokenizedTexts = localizedTokenizedTexts;
        card.loadActionId = loadActionId;
        card.doNotCache = doNotCache;
        return card;
    }
    
    protected static Element a(final JsonParser jsonParser, final boolean b) {
        Element element = null;
        int id = 0;
        Integer value = 0;
        Vector2 sizeMode = null;
        Vector2 maxSizeMode = null;
        Vector2F position = null;
        Vector2F size = null;
        Vector2F maxSize = null;
        Spacing margin = null;
        float opacity = Float.NaN;
        int pressDownActionId = 0;
        int pressUpActionId = 0;
        int tapActionId = 0;
        int longPressActionId = 0;
        String debugId = null;
        final JsonToken a = jsonParser.a();
        String g = null;
        boolean b2 = false;
        boolean b3 = false;
        JsonToken a3;
        for (JsonToken jsonToken = a; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a3) {
            Integer n = null;
            int n2 = 0;
            Element element2 = null;
            int n4 = 0;
            float n5 = 0.0f;
            Spacing spacing = null;
            Vector2F vector2F = null;
            Vector2F vector2F2 = null;
            Vector2F vector2F3 = null;
            Vector2 vector2 = null;
            Vector2 vector3 = null;
            String g2 = null;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            Label_0194: {
                switch (l.a[jsonToken.ordinal()]) {
                    case 1: {
                        if ("size_mode".equalsIgnoreCase(g)) {
                            final Vector2 f = F(jsonParser);
                            n = value;
                            n2 = id;
                            element2 = element;
                            final int n3 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = f;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = n3;
                            break Label_0194;
                        }
                        if ("max_size_mode".equalsIgnoreCase(g)) {
                            final Vector2 f2 = F(jsonParser);
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final int n9 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = f2;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = n9;
                            break Label_0194;
                        }
                        if ("position".equalsIgnoreCase(g)) {
                            final Vector2F k = K(jsonParser);
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final float n10 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = k;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = n10;
                            break Label_0194;
                        }
                        if ("size".equalsIgnoreCase(g)) {
                            final Vector2F i = K(jsonParser);
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final Spacing spacing2 = margin;
                            vector2F = maxSize;
                            vector2F2 = i;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = spacing2;
                            break Label_0194;
                        }
                        if ("max_size".equalsIgnoreCase(g)) {
                            final Vector2F j = K(jsonParser);
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = j;
                            break Label_0194;
                        }
                        if ("margin".equalsIgnoreCase(g)) {
                            final Spacing e = E(jsonParser);
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final int n11 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = e;
                            g2 = debugId;
                            n6 = n11;
                            break Label_0194;
                        }
                        if ("container".equalsIgnoreCase(g)) {
                            final Container b4 = b(jsonParser, b);
                            final String s = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = b4;
                            g2 = s;
                            break Label_0194;
                        }
                        if ("box".equalsIgnoreCase(g)) {
                            final Box s2 = s(jsonParser);
                            final String s3 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = s2;
                            g2 = s3;
                            break Label_0194;
                        }
                        if ("text".equalsIgnoreCase(g)) {
                            final Text t = t(jsonParser);
                            final String s4 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = t;
                            g2 = s4;
                            break Label_0194;
                        }
                        if ("image".equalsIgnoreCase(g)) {
                            final Image u = u(jsonParser);
                            final String s5 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = u;
                            g2 = s5;
                            break Label_0194;
                        }
                        if ("player".equalsIgnoreCase(g)) {
                            final Player v = v(jsonParser);
                            final String s6 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = v;
                            g2 = s6;
                            break Label_0194;
                        }
                        if ("form_checkbox".equalsIgnoreCase(g)) {
                            final FormCheckbox x = x(jsonParser);
                            final String s7 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = x;
                            g2 = s7;
                            break Label_0194;
                        }
                        if ("form_select".equalsIgnoreCase(g)) {
                            final FormSelect z = z(jsonParser);
                            final String s8 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = z;
                            g2 = s8;
                            break Label_0194;
                        }
                        if ("form_text".equalsIgnoreCase(g)) {
                            final FormText a2 = A(jsonParser);
                            final String s9 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = a2;
                            g2 = s9;
                            break Label_0194;
                        }
                        if ("follow_button".equalsIgnoreCase(g)) {
                            final FollowButtonElement b5 = B(jsonParser);
                            final String s10 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = b5;
                            g2 = s10;
                            break Label_0194;
                        }
                        jsonParser.c();
                        g2 = debugId;
                        n6 = longPressActionId;
                        n7 = tapActionId;
                        n8 = pressUpActionId;
                        n4 = pressDownActionId;
                        n5 = opacity;
                        spacing = margin;
                        vector2F = maxSize;
                        vector2F2 = size;
                        vector2F3 = position;
                        vector2 = maxSizeMode;
                        vector3 = sizeMode;
                        n = value;
                        n2 = id;
                        element2 = element;
                        break Label_0194;
                    }
                    case 2: {
                        jsonParser.c();
                        g2 = debugId;
                        n6 = longPressActionId;
                        n7 = tapActionId;
                        n8 = pressUpActionId;
                        n4 = pressDownActionId;
                        n5 = opacity;
                        spacing = margin;
                        vector2F = maxSize;
                        vector2F2 = size;
                        vector2F3 = position;
                        vector2 = maxSizeMode;
                        vector3 = sizeMode;
                        n = value;
                        n2 = id;
                        element2 = element;
                        break Label_0194;
                    }
                    case 3: {
                        if ("position_mode".equalsIgnoreCase(g)) {
                            final Integer value2 = L(jsonParser);
                            n2 = id;
                            element2 = element;
                            final int n12 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value2;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = n12;
                            break Label_0194;
                        }
                        if ("debug_id".equalsIgnoreCase(g)) {
                            g2 = jsonParser.g();
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            break Label_0194;
                        }
                        break;
                    }
                    case 4:
                    case 5: {
                        if ("id".equalsIgnoreCase(g)) {
                            final int q = Q(jsonParser);
                            element2 = element;
                            final int n13 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = q;
                            g2 = debugId;
                            n6 = n13;
                            break Label_0194;
                        }
                        if ("opacity".equalsIgnoreCase(g)) {
                            final float l = jsonParser.j();
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final int n14 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = l;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = n14;
                            break Label_0194;
                        }
                        if ("press_down_action_id".equalsIgnoreCase(g)) {
                            final int q2 = Q(jsonParser);
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final String s11 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = q2;
                            g2 = s11;
                            break Label_0194;
                        }
                        if ("press_up_action_id".equalsIgnoreCase(g)) {
                            final int q3 = Q(jsonParser);
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = q3;
                            break Label_0194;
                        }
                        if ("tap_action_id".equalsIgnoreCase(g)) {
                            final int q4 = Q(jsonParser);
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            final String s12 = debugId;
                            n6 = longPressActionId;
                            n7 = q4;
                            g2 = s12;
                            break Label_0194;
                        }
                        if ("long_press_action_id".equalsIgnoreCase(g)) {
                            final int q5 = Q(jsonParser);
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            g2 = debugId;
                            n6 = q5;
                            break Label_0194;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        final boolean m = jsonParser.l();
                        if ("visible".equalsIgnoreCase(g)) {
                            b2 = true;
                            b3 = m;
                            g2 = debugId;
                            n6 = longPressActionId;
                            n7 = tapActionId;
                            n8 = pressUpActionId;
                            n4 = pressDownActionId;
                            n5 = opacity;
                            spacing = margin;
                            vector2F = maxSize;
                            vector2F2 = size;
                            vector2F3 = position;
                            vector2 = maxSizeMode;
                            vector3 = sizeMode;
                            n = value;
                            n2 = id;
                            element2 = element;
                            break Label_0194;
                        }
                        break;
                    }
                    case 8: {
                        g = jsonParser.g();
                        g2 = debugId;
                        n6 = longPressActionId;
                        n7 = tapActionId;
                        n8 = pressUpActionId;
                        n4 = pressDownActionId;
                        n5 = opacity;
                        spacing = margin;
                        vector2F = maxSize;
                        vector2F2 = size;
                        vector2F3 = position;
                        vector2 = maxSizeMode;
                        vector3 = sizeMode;
                        n = value;
                        n2 = id;
                        element2 = element;
                        break Label_0194;
                    }
                }
                g2 = debugId;
                n6 = longPressActionId;
                n7 = tapActionId;
                n8 = pressUpActionId;
                n4 = pressDownActionId;
                n5 = opacity;
                spacing = margin;
                vector2F = maxSize;
                vector2F2 = size;
                vector2F3 = position;
                vector2 = maxSizeMode;
                vector3 = sizeMode;
                n = value;
                n2 = id;
                element2 = element;
            }
            a3 = jsonParser.a();
            element = element2;
            id = n2;
            value = n;
            sizeMode = vector3;
            maxSizeMode = vector2;
            position = vector2F3;
            size = vector2F2;
            maxSize = vector2F;
            margin = spacing;
            opacity = n5;
            pressDownActionId = n4;
            pressUpActionId = n8;
            tapActionId = n7;
            longPressActionId = n6;
            debugId = g2;
        }
        if (element == null || value == 0 || sizeMode == null || maxSizeMode == null || position == null || size == null || maxSize == null || margin == null || Float.isNaN(opacity) || !b2) {
            throw new CardParserException("invalid element");
        }
        element.id = id;
        element.positionMode = value;
        element.sizeMode = sizeMode;
        element.maxSizeMode = maxSizeMode;
        element.position = position;
        element.size = size;
        element.maxSize = maxSize;
        element.margin = margin;
        element.opacity = opacity;
        element.pressDownActionId = pressDownActionId;
        element.pressUpActionId = pressUpActionId;
        element.tapActionId = tapActionId;
        element.longPressActionId = longPressActionId;
        element.f(b3);
        element.debugId = debugId;
        return element;
    }
    
    public static String a(String trim) {
        if (!TextUtils.isEmpty((CharSequence)trim)) {
            trim = trim.trim();
            if (!URLUtil.isValidUrl(trim) && !trim.startsWith("res://") && !trim.startsWith("capi://") && !trim.startsWith("card://")) {
                throw new MalformedURLException(trim);
            }
        }
        return trim;
    }
    
    protected static void a(final JsonParser jsonParser, final Fill fill) {
        int d = 0;
        float j = Float.NaN;
        final JsonToken a = jsonParser.a();
        String g = null;
        JsonToken a2 = a;
        boolean b = false;
        while (a2 != null && a2 != JsonToken.c) {
            switch (l.a[a2.ordinal()]) {
                case 1: {
                    if ("color".equalsIgnoreCase(g)) {
                        d = D(jsonParser);
                        b = true;
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("position".equalsIgnoreCase(g)) {
                        j = jsonParser.j();
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            a2 = jsonParser.a();
        }
        if (Float.isNaN(j) || !b) {
            throw new CardParserException("invalid color stop");
        }
        fill.a(j, d);
    }
    
    protected static void a(final JsonParser jsonParser, final LocalizedTokenizedText localizedTokenizedText) {
        JsonToken jsonToken = jsonParser.a();
        localizedTokenizedText.tokenizedTexts = new a();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    c(jsonParser, localizedTokenizedText.tokenizedTexts);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
    }
    
    protected static void a(final JsonParser jsonParser, final a a) {
        final Action action = new Action();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("api_request".equalsIgnoreCase(g)) {
                        action.apiRequest = e(jsonParser);
                        break;
                    }
                    if ("purchase_request".equalsIgnoreCase(g)) {
                        action.purchaseRequest = h(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("style_pairs".equalsIgnoreCase(g)) {
                        action.stylePairs = k(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("action_type".equalsIgnoreCase(g)) {
                        if ("open_url".equalsIgnoreCase(g2)) {
                            action.actionType = 1;
                            break;
                        }
                        if ("open_url_popup_menu".equalsIgnoreCase(g2)) {
                            action.actionType = 2;
                            break;
                        }
                        if ("open_photo".equalsIgnoreCase(g2)) {
                            action.actionType = 3;
                            break;
                        }
                        if ("open_profile".equalsIgnoreCase(g2)) {
                            action.actionType = 4;
                            break;
                        }
                        if ("open_store".equalsIgnoreCase(g2)) {
                            action.actionType = 5;
                            break;
                        }
                        if ("open_app_url".equalsIgnoreCase(g2)) {
                            action.actionType = 6;
                            break;
                        }
                        if ("apply_styles".equalsIgnoreCase(g2)) {
                            action.actionType = 7;
                            break;
                        }
                        if ("remove_styles".equalsIgnoreCase(g2)) {
                            action.actionType = 8;
                            break;
                        }
                        if ("compose_status".equalsIgnoreCase(g2)) {
                            action.actionType = 9;
                            break;
                        }
                        if ("favorite_status".equalsIgnoreCase(g2)) {
                            action.actionType = 10;
                            break;
                        }
                        if ("retweet_status".equalsIgnoreCase(g2)) {
                            action.actionType = 11;
                            break;
                        }
                        if ("share_status".equalsIgnoreCase(g2)) {
                            action.actionType = 12;
                            break;
                        }
                        if ("dial_phone".equalsIgnoreCase(g2)) {
                            action.actionType = 13;
                            break;
                        }
                        if ("api_request".equalsIgnoreCase(g2)) {
                            action.actionType = 14;
                            break;
                        }
                        if ("open_tweet_detail".equalsIgnoreCase(g2)) {
                            action.actionType = 15;
                            break;
                        }
                        if ("purchase_request".equalsIgnoreCase(g2)) {
                            action.actionType = 16;
                            break;
                        }
                        if ("submit_form".equalsIgnoreCase(g2)) {
                            action.actionType = 17;
                            break;
                        }
                        throw new CardParserException("unknown action_type: " + g2);
                    }
                    else {
                        if ("scribe_element".equalsIgnoreCase(g)) {
                            action.scribeElement = g2;
                            break;
                        }
                        if ("scribe_action".equalsIgnoreCase(g)) {
                            action.scribeAction = g2;
                            break;
                        }
                        if ("debug_id".equalsIgnoreCase(g)) {
                            action.debugId = g2;
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        action.id = Q(jsonParser);
                        break;
                    }
                    if ("tokenized_text_id".equalsIgnoreCase(g)) {
                        action.tokenizedTextId = Q(jsonParser);
                        break;
                    }
                    if ("success_action_id".equalsIgnoreCase(g)) {
                        action.successActionId = Q(jsonParser);
                        break;
                    }
                    if ("failure_action_id".equalsIgnoreCase(g)) {
                        action.failureActionId = Q(jsonParser);
                        break;
                    }
                    if ("form_id".equalsIgnoreCase(g)) {
                        action.formId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (action.id == 0 || action.actionType == 0 || (action.actionType == 14 && action.apiRequest == null)) {
            throw new CardParserException("invalid action");
        }
        a.put(action.id, (Object)action);
    }
    
    protected static void a(final JsonParser jsonParser, final HashMap hashMap) {
        String g = null;
        final LocalizedTokenizedText localizedTokenizedText = new LocalizedTokenizedText();
        JsonToken jsonToken = jsonParser.a();
        String s = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("tokenized_texts".equalsIgnoreCase(g)) {
                        a(jsonParser, localizedTokenizedText);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("locale".equalsIgnoreCase(g)) {
                        s = g2;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (s == null) {
            throw new CardParserException("invalid localized tokenized text");
        }
        hashMap.put(s, localizedTokenizedText);
    }
    
    protected static Container b(final JsonParser jsonParser, final boolean b) {
        Container container;
        if (b) {
            container = new Card();
        }
        else {
            container = new Container();
        }
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            Label_0084: {
                switch (l.a[jsonToken.ordinal()]) {
                    case 1: {
                        if ("background".equalsIgnoreCase(g)) {
                            container.background = C(jsonParser);
                            break;
                        }
                        if ("border".equalsIgnoreCase(g)) {
                            container.border = H(jsonParser);
                            break;
                        }
                        if ("padding".equalsIgnoreCase(g)) {
                            container.padding = E(jsonParser);
                            break;
                        }
                        if ("alignment_mode".equalsIgnoreCase(g)) {
                            container.alignmentMode = I(jsonParser);
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        if (!"children".equalsIgnoreCase(g)) {
                            jsonParser.c();
                            break;
                        }
                        JsonToken jsonToken2 = jsonParser.a();
                        while (true) {
                            boolean b2;
                            if (jsonToken2 != null) {
                                b2 = true;
                            }
                            else {
                                b2 = false;
                            }
                            boolean b3;
                            if (jsonToken2 != JsonToken.e) {
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            if (!(b2 & b3)) {
                                break Label_0084;
                            }
                            if (jsonToken2 == JsonToken.b) {
                                container.a(a(jsonParser, false));
                            }
                            else if (jsonToken2 == JsonToken.d) {
                                jsonParser.c();
                            }
                            jsonToken2 = jsonParser.a();
                        }
                        break;
                    }
                    case 3: {
                        final String g2 = jsonParser.g();
                        if ("layout".equalsIgnoreCase(g)) {
                            if ("horizontal".equalsIgnoreCase(g2)) {
                                container.layoutMode = 1;
                                break;
                            }
                            if ("vertical".equalsIgnoreCase(g2)) {
                                container.layoutMode = 2;
                                break;
                            }
                            if ("grid".equalsIgnoreCase(g2)) {
                                container.layoutMode = 3;
                                break;
                            }
                            break;
                        }
                        else {
                            if ("overflow".equalsIgnoreCase(g)) {
                                container.overflowMode = M(jsonParser);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    case 4:
                    case 5: {
                        final int h = jsonParser.h();
                        if ("visible_child_index".equalsIgnoreCase(g)) {
                            container.visibleChildIndex = h;
                            break;
                        }
                        if ("corner_radius".equalsIgnoreCase(g)) {
                            container.cornerRadius = a(jsonParser.j());
                            break;
                        }
                        break;
                    }
                    case 8: {
                        g = jsonParser.g();
                        break;
                    }
                }
            }
            jsonToken = jsonParser.a();
        }
        if (container.layoutMode == 0 || container.background == null || container.border == null || container.alignmentMode == null || container.padding == null || container.overflowMode == 0) {
            throw new CardParserException("invalid container");
        }
        return container;
    }
    
    protected static void b(final JsonParser jsonParser, final a a) {
        final Style style = new Style();
        final JsonToken a2 = jsonParser.a();
        String g = null;
        int q = 0;
        for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
            switch (l.a[a3.ordinal()]) {
                case 1: {
                    if ("margin".equalsIgnoreCase(g)) {
                        style.margin = E(jsonParser);
                        break;
                    }
                    if ("background".equalsIgnoreCase(g)) {
                        style.background = C(jsonParser);
                        break;
                    }
                    if ("border".equalsIgnoreCase(g)) {
                        style.border = H(jsonParser);
                        break;
                    }
                    if ("padding".equalsIgnoreCase(g)) {
                        style.padding = E(jsonParser);
                        break;
                    }
                    if ("color".equalsIgnoreCase(g)) {
                        style.color = D(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("font_name".equalsIgnoreCase(g)) {
                        style.fontName = g2;
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    final int h = jsonParser.h();
                    final float j = jsonParser.j();
                    final float a4 = a(jsonParser.j());
                    if ("id".equalsIgnoreCase(g)) {
                        style.id = Q(jsonParser);
                        q = Q(jsonParser);
                        break;
                    }
                    if ("position_x".equalsIgnoreCase(g)) {
                        style.positionX = a4;
                        break;
                    }
                    if ("position_y".equalsIgnoreCase(g)) {
                        style.positionY = a4;
                        break;
                    }
                    if ("size_x".equalsIgnoreCase(g)) {
                        style.sizeX = a4;
                        break;
                    }
                    if ("size_y".equalsIgnoreCase(g)) {
                        style.sizeY = a4;
                        break;
                    }
                    if ("max_size_x".equalsIgnoreCase(g)) {
                        style.maxSizeX = a4;
                        break;
                    }
                    if ("max_size_y".equalsIgnoreCase(g)) {
                        style.maxSizeY = a4;
                        break;
                    }
                    if ("opacity".equalsIgnoreCase(g)) {
                        style.opacity = j;
                        break;
                    }
                    if ("font_size".equalsIgnoreCase(g)) {
                        style.fontSize = a4;
                        break;
                    }
                    if ("line_height".equalsIgnoreCase(g)) {
                        style.lineHeight = a4;
                        break;
                    }
                    if ("corner_radius".equalsIgnoreCase(g)) {
                        style.cornerRadius = a4;
                        break;
                    }
                    if ("visible_child_index".equalsIgnoreCase(g)) {
                        style.visibleChildIndex = h;
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    final boolean l = jsonParser.l();
                    if ("visible".equalsIgnoreCase(g)) {
                        style.visible = l;
                        break;
                    }
                    if ("font_bold".equalsIgnoreCase(g)) {
                        style.fontBold = l;
                        break;
                    }
                    if ("font_underline".equalsIgnoreCase(g)) {
                        style.fontUnderline = l;
                        break;
                    }
                    if ("font_italic".equalsIgnoreCase(g)) {
                        style.fontItalic = l;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
        }
        if (style.id == 0) {
            throw new CardParserException("invalid style");
        }
        a.put(q, (Object)style);
    }
    
    protected static Binding[] b(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<Binding> list = new ArrayList<Binding>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(c(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new Binding[list.size()]);
    }
    
    protected static Binding c(final JsonParser jsonParser) {
        final Binding binding = new Binding();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("source_type".equalsIgnoreCase(g)) {
                        if ("string_value".equalsIgnoreCase(g2)) {
                            binding.sourceType = 1;
                            break;
                        }
                        if ("boolean_value".equalsIgnoreCase(g2)) {
                            binding.sourceType = 2;
                            break;
                        }
                        if ("image_value".equalsIgnoreCase(g2)) {
                            binding.sourceType = 3;
                            break;
                        }
                        if ("user_id".equalsIgnoreCase(g2)) {
                            binding.sourceType = 4;
                            break;
                        }
                        if ("user_screen_name".equalsIgnoreCase(g2)) {
                            binding.sourceType = 5;
                            break;
                        }
                        if ("user_profile_image_url".equalsIgnoreCase(g2)) {
                            binding.sourceType = 6;
                            break;
                        }
                        if ("user_profile_banner_url".equalsIgnoreCase(g2)) {
                            binding.sourceType = 7;
                            break;
                        }
                        if ("user_name".equalsIgnoreCase(g2)) {
                            binding.sourceType = 8;
                            break;
                        }
                        if ("user_location".equalsIgnoreCase(g2)) {
                            binding.sourceType = 9;
                            break;
                        }
                        if ("user_description".equalsIgnoreCase(g2)) {
                            binding.sourceType = 10;
                            break;
                        }
                        if ("user_url".equalsIgnoreCase(g2)) {
                            binding.sourceType = 11;
                            break;
                        }
                        if ("user_protected".equalsIgnoreCase(g2)) {
                            binding.sourceType = 12;
                            break;
                        }
                        if ("user_verified".equalsIgnoreCase(g2)) {
                            binding.sourceType = 13;
                            break;
                        }
                        if ("user_following".equalsIgnoreCase(g2)) {
                            binding.sourceType = 14;
                            break;
                        }
                        if ("user_statuses_count".equalsIgnoreCase(g2)) {
                            binding.sourceType = 15;
                            break;
                        }
                        if ("user_following_count".equalsIgnoreCase(g2)) {
                            binding.sourceType = 16;
                            break;
                        }
                        if ("user_followers_count".equalsIgnoreCase(g2)) {
                            binding.sourceType = 17;
                            break;
                        }
                        if ("status_id".equalsIgnoreCase(g2)) {
                            binding.sourceType = 18;
                            break;
                        }
                        if ("status_text".equalsIgnoreCase(g2)) {
                            binding.sourceType = 19;
                            break;
                        }
                        if ("status_date".equalsIgnoreCase(g2)) {
                            binding.sourceType = 20;
                            break;
                        }
                        if ("status_user_id".equalsIgnoreCase(g2)) {
                            binding.sourceType = 21;
                            break;
                        }
                        if ("status_in_reply_to_status_id".equalsIgnoreCase(g2)) {
                            binding.sourceType = 22;
                            break;
                        }
                        if ("status_retweeted_status_id".equalsIgnoreCase(g2)) {
                            binding.sourceType = 23;
                            break;
                        }
                        if ("status_latitude".equalsIgnoreCase(g2)) {
                            binding.sourceType = 24;
                            break;
                        }
                        if ("status_longitude".equalsIgnoreCase(g2)) {
                            binding.sourceType = 25;
                            break;
                        }
                        if ("status_retweet_count".equalsIgnoreCase(g2)) {
                            binding.sourceType = 26;
                            break;
                        }
                        if ("status_favorited".equalsIgnoreCase(g2)) {
                            binding.sourceType = 27;
                            break;
                        }
                        throw new CardParserException("unknown source_type: " + g2);
                    }
                    else {
                        if ("source_key".equalsIgnoreCase(g)) {
                            binding.sourceKey = g2;
                            break;
                        }
                        if ("controller_type".equalsIgnoreCase(g)) {
                            if ("conditional_exists".equalsIgnoreCase(g2)) {
                                binding.controllerType = 1;
                                break;
                            }
                            if ("conditional_can_open_url".equalsIgnoreCase(g2)) {
                                binding.controllerType = 2;
                                break;
                            }
                            if ("conditional_can_dial_phone".equalsIgnoreCase(g2)) {
                                binding.controllerType = 3;
                                break;
                            }
                            if ("conditional_truthy".equalsIgnoreCase(g2)) {
                                binding.controllerType = 4;
                                break;
                            }
                            if ("time_ago".equalsIgnoreCase(g2)) {
                                binding.controllerType = 5;
                                break;
                            }
                            if ("i18n_zero".equalsIgnoreCase(g2)) {
                                binding.controllerType = 6;
                                break;
                            }
                            if ("i18n_one".equalsIgnoreCase(g2)) {
                                binding.controllerType = 7;
                                break;
                            }
                            if ("i18n_two".equalsIgnoreCase(g2)) {
                                binding.controllerType = 8;
                                break;
                            }
                            if ("i18n_few".equalsIgnoreCase(g2)) {
                                binding.controllerType = 9;
                                break;
                            }
                            if ("i18n_many".equalsIgnoreCase(g2)) {
                                binding.controllerType = 10;
                                break;
                            }
                            if ("i18n_other".equalsIgnoreCase(g2)) {
                                binding.controllerType = 11;
                                break;
                            }
                            if ("format_micro_usd".equalsIgnoreCase(g2)) {
                                binding.controllerType = 12;
                                break;
                            }
                            throw new CardParserException("unknown controller type: " + g2);
                        }
                        else {
                            if (!"dest_type".equalsIgnoreCase(g)) {
                                break;
                            }
                            if ("element_visible".equalsIgnoreCase(g2)) {
                                binding.destType = 1;
                                break;
                            }
                            if ("element_image_spec".equalsIgnoreCase(g2)) {
                                binding.destType = 2;
                                break;
                            }
                            if ("element_image_spec_full_size".equalsIgnoreCase(g2)) {
                                binding.destType = 3;
                                break;
                            }
                            if ("element_player_stream_url".equalsIgnoreCase(g2)) {
                                binding.destType = 4;
                                break;
                            }
                            if ("element_player_stream_content_type".equalsIgnoreCase(g2)) {
                                binding.destType = 5;
                                break;
                            }
                            if ("element_player_stream_width".equalsIgnoreCase(g2)) {
                                binding.destType = 6;
                                break;
                            }
                            if ("element_player_stream_height".equalsIgnoreCase(g2)) {
                                binding.destType = 7;
                                break;
                            }
                            if ("element_player_html_url".equalsIgnoreCase(g2)) {
                                binding.destType = 8;
                                break;
                            }
                            if ("element_player_thumbnail_spec".equalsIgnoreCase(g2)) {
                                binding.destType = 9;
                                break;
                            }
                            if ("text_token_group".equalsIgnoreCase(g2)) {
                                binding.destType = 21;
                                break;
                            }
                            if ("text_token".equalsIgnoreCase(g2)) {
                                binding.destType = 22;
                                break;
                            }
                            if ("action_url".equalsIgnoreCase(g2)) {
                                binding.destType = 23;
                                break;
                            }
                            if ("action_display_url".equalsIgnoreCase(g2)) {
                                binding.destType = 24;
                                break;
                            }
                            if ("action_user_id".equalsIgnoreCase(g2)) {
                                binding.destType = 25;
                                break;
                            }
                            if ("action_app_id".equalsIgnoreCase(g2)) {
                                binding.destType = 26;
                                break;
                            }
                            if ("action_app_url".equalsIgnoreCase(g2)) {
                                binding.destType = 27;
                                break;
                            }
                            if ("action_display_app_url".equalsIgnoreCase(g2)) {
                                binding.destType = 28;
                                break;
                            }
                            if ("action_phone_number_url".equalsIgnoreCase(g2)) {
                                binding.destType = 29;
                                break;
                            }
                            if ("action_phone_number".equalsIgnoreCase(g2)) {
                                binding.destType = 30;
                                break;
                            }
                            if ("api_parameter_key".equalsIgnoreCase(g2)) {
                                binding.destType = 31;
                                break;
                            }
                            if ("api_parameter_value".equalsIgnoreCase(g2)) {
                                binding.destType = 32;
                                break;
                            }
                            if ("purchase_parameter_key".equalsIgnoreCase(g2)) {
                                binding.destType = 33;
                                break;
                            }
                            if ("purchase_parameter_value".equalsIgnoreCase(g2)) {
                                binding.destType = 34;
                                break;
                            }
                            if ("element_follow_button_user".equalsIgnoreCase(g2)) {
                                binding.destType = 10;
                                break;
                            }
                            throw new CardParserException("unknown dest_type: " + g2);
                        }
                    }
                    break;
                }
                case 4:
                case 5: {
                    if ("dest_id".equalsIgnoreCase(g)) {
                        binding.destId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    final boolean l = jsonParser.l();
                    if ("negate_controller".equalsIgnoreCase(g)) {
                        binding.negateController = l;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (binding.sourceType == 0 || binding.destType == 0 || binding.destId == 0) {
            throw new CardParserException("invalid binding");
        }
        return binding;
    }
    
    protected static void c(final JsonParser jsonParser, final a a) {
        final TokenizedText tokenizedText = new TokenizedText();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        int q = 0;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("text_token_groups".equalsIgnoreCase(g)) {
                        tokenizedText.textTokenGroups = o(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        q = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (q == 0) {
            throw new CardParserException("invalid tokenized text");
        }
        a.put(q, (Object)tokenizedText);
    }
    
    protected static a d(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final a a = new a();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    a(jsonParser, a);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return a;
    }
    
    protected static void d(final JsonParser jsonParser, final a a) {
        final Form form = new Form();
        form.id = 0;
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("element_ids".equalsIgnoreCase(g)) {
                        form.elementIds = O(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        form.id = Q(jsonParser);
                        break;
                    }
                    if ("api_request_action".equalsIgnoreCase(g)) {
                        form.apiRequestAction = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (form.id == 0) {
            throw new CardParserException("invalid form");
        }
        a.put(form.id, (Object)form);
    }
    
    protected static ApiRequest e(final JsonParser jsonParser) {
        final ApiRequest apiRequest = new ApiRequest();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("parameters".equalsIgnoreCase(g)) {
                        apiRequest.parameters = f(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("method".equalsIgnoreCase(g)) {
                        if ("get".equalsIgnoreCase(g2)) {
                            apiRequest.method = 1;
                            break;
                        }
                        if ("post".equalsIgnoreCase(g2)) {
                            apiRequest.method = 2;
                            break;
                        }
                        throw new CardParserException("unknown method: " + g2);
                    }
                    else {
                        if ("api_proxy_rule".equalsIgnoreCase(g)) {
                            apiRequest.apiProxyRule = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    if ("request_success_action_id".equalsIgnoreCase(g)) {
                        apiRequest.successActionId = Q(jsonParser);
                        break;
                    }
                    if ("request_failure_action_id".equalsIgnoreCase(g)) {
                        apiRequest.failureActionId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (apiRequest.method == 0) {
            throw new CardParserException("invalid api_request");
        }
        return apiRequest;
    }
    
    protected static ApiRequestParameter[] f(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<ApiRequestParameter> list = new ArrayList<ApiRequestParameter>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(g(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new ApiRequestParameter[list.size()]);
    }
    
    protected static ApiRequestParameter g(final JsonParser jsonParser) {
        final ApiRequestParameter apiRequestParameter = new ApiRequestParameter();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("key".equalsIgnoreCase(g)) {
                        apiRequestParameter.key = g2;
                        break;
                    }
                    if ("value".equalsIgnoreCase(g)) {
                        apiRequestParameter.value = g2;
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        apiRequestParameter.id = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (apiRequestParameter.id == 0) {
            throw new CardParserException("invalid api request parameter");
        }
        return apiRequestParameter;
    }
    
    protected static PurchaseRequest h(final JsonParser jsonParser) {
        final PurchaseRequest purchaseRequest = new PurchaseRequest();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("parameters".equalsIgnoreCase(g)) {
                        purchaseRequest.parameters = i(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("purchase_success_action_id".equalsIgnoreCase(g)) {
                        purchaseRequest.successActionId = Q(jsonParser);
                        break;
                    }
                    if ("purchase_failure_action_id".equalsIgnoreCase(g)) {
                        purchaseRequest.failureActionId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return purchaseRequest;
    }
    
    protected static PurchaseRequestParameter[] i(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<PurchaseRequestParameter> list = new ArrayList<PurchaseRequestParameter>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(j(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new PurchaseRequestParameter[list.size()]);
    }
    
    protected static PurchaseRequestParameter j(final JsonParser jsonParser) {
        final PurchaseRequestParameter purchaseRequestParameter = new PurchaseRequestParameter();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("key".equalsIgnoreCase(g)) {
                        purchaseRequestParameter.key = g2;
                        break;
                    }
                    if ("value".equalsIgnoreCase(g)) {
                        purchaseRequestParameter.value = g2;
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        purchaseRequestParameter.id = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (purchaseRequestParameter.id == 0) {
            throw new CardParserException("invalid purchase request parameter");
        }
        return purchaseRequestParameter;
    }
    
    protected static StylePair[] k(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<StylePair> list = new ArrayList<StylePair>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(l(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new StylePair[list.size()]);
    }
    
    protected static StylePair l(final JsonParser jsonParser) {
        final StylePair stylePair = new StylePair();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("element_id".equalsIgnoreCase(g)) {
                        stylePair.elementId = Q(jsonParser);
                        break;
                    }
                    if ("style_id".equalsIgnoreCase(g)) {
                        stylePair.styleId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (stylePair.elementId == 0 || stylePair.styleId == 0) {
            throw new CardParserException("invalid style pair");
        }
        return stylePair;
    }
    
    protected static a m(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final a a = new a();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    b(jsonParser, a);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return a;
    }
    
    protected static HashMap n(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final HashMap hashMap = new HashMap();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    a(jsonParser, hashMap);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return hashMap;
    }
    
    protected static TextTokenGroup[] o(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<TextTokenGroup> list = new ArrayList<TextTokenGroup>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(p(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new TextTokenGroup[list.size()]);
    }
    
    protected static TextTokenGroup p(final JsonParser jsonParser) {
        final TextTokenGroup textTokenGroup = new TextTokenGroup();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("text_tokens".equalsIgnoreCase(g)) {
                        textTokenGroup.textTokens = q(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("id".equalsIgnoreCase(g)) {
                        textTokenGroup.id = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return textTokenGroup;
    }
    
    protected static TextToken[] q(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<TextToken> list = new ArrayList<TextToken>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(r(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new TextToken[list.size()]);
    }
    
    protected static TextToken r(final JsonParser jsonParser) {
        final TextToken textToken = new TextToken();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("text".equalsIgnoreCase(g)) {
                        textToken.text = g2;
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    final int h = jsonParser.h();
                    if ("id".equalsIgnoreCase(g)) {
                        textToken.id = Q(jsonParser);
                        break;
                    }
                    if ("style_id".equalsIgnoreCase(g)) {
                        textToken.styleId = h;
                        break;
                    }
                    if ("press_down_action_id".equalsIgnoreCase(g)) {
                        textToken.pressDownActionId = Q(jsonParser);
                        break;
                    }
                    if ("press_up_action_id".equalsIgnoreCase(g)) {
                        textToken.pressUpActionId = Q(jsonParser);
                        break;
                    }
                    if ("tap_action_id".equalsIgnoreCase(g)) {
                        textToken.tapActionId = Q(jsonParser);
                        break;
                    }
                    if ("long_press_action_id".equalsIgnoreCase(g)) {
                        textToken.longPressActionId = Q(jsonParser);
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return textToken;
    }
    
    protected static Box s(final JsonParser jsonParser) {
        final Box box = new Box();
        box.cornerRadius = Float.NaN;
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("background".equalsIgnoreCase(g)) {
                        box.background = C(jsonParser);
                        break;
                    }
                    if ("border".equalsIgnoreCase(g)) {
                        box.border = H(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 4:
                case 5: {
                    if ("corner_radius".equalsIgnoreCase(g)) {
                        box.cornerRadius = a(jsonParser.j());
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (box.background == null || box.border == null || Float.isNaN(box.cornerRadius)) {
            throw new CardParserException("invalid box");
        }
        return box;
    }
    
    protected static Text t(final JsonParser jsonParser) {
        boolean b = false;
        final Text text = new Text();
        text.fontSize = Float.NaN;
        text.lineHeight = Float.NaN;
        final JsonToken a = jsonParser.a();
        String g = null;
        JsonToken a2 = a;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        while (a2 != null && a2 != JsonToken.c) {
            switch (l.a[a2.ordinal()]) {
                case 1: {
                    if ("color".equalsIgnoreCase(g)) {
                        text.color = D(jsonParser);
                        b4 = true;
                        break;
                    }
                    if ("alignment_mode".equalsIgnoreCase(g)) {
                        text.alignmentMode = I(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("text".equalsIgnoreCase(g)) {
                        text.a(g2);
                        break;
                    }
                    if ("font_name".equalsIgnoreCase(g)) {
                        text.b(g2);
                        break;
                    }
                    if ("overflow".equalsIgnoreCase(g)) {
                        text.overflowMode = M(jsonParser);
                        break;
                    }
                    break;
                }
                case 4:
                case 5: {
                    final int h = jsonParser.h();
                    final float j = jsonParser.j();
                    if ("tokenized_text_id".equalsIgnoreCase(g)) {
                        text.tokenizedTextId = h;
                        break;
                    }
                    if ("font_size".equalsIgnoreCase(g)) {
                        text.fontSize = a(jsonParser.j());
                        break;
                    }
                    if ("max_lines".equalsIgnoreCase(g)) {
                        text.maxLines = h;
                        b3 = true;
                        break;
                    }
                    if ("line_height".equalsIgnoreCase(g)) {
                        text.lineHeight = j;
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("font_bold".equalsIgnoreCase(g)) {
                        text.fontBold = jsonParser.l();
                        b2 = true;
                        break;
                    }
                    if ("font_underline".equalsIgnoreCase(g)) {
                        text.fontUnderline = jsonParser.l();
                        b = true;
                        break;
                    }
                    if ("font_italic".equalsIgnoreCase(g)) {
                        text.fontItalic = jsonParser.l();
                        b5 = true;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            a2 = jsonParser.a();
        }
        if (text.a() == null || Float.isNaN(text.fontSize) || !b4 || !b3 || text.overflowMode == 0 || Float.isNaN(text.lineHeight) || !b2 || !b || !b5 || text.alignmentMode == null) {
            throw new CardParserException("invalid text element");
        }
        return text;
    }
    
    protected static Image u(final JsonParser jsonParser) {
        boolean b = false;
        final Image image = new Image();
        image.cornerRadius = Float.NaN;
        final JsonToken a = jsonParser.a();
        String g = null;
        JsonToken a2 = a;
        boolean b2 = false;
        while (a2 != null && a2 != JsonToken.c) {
            switch (l.a[a2.ordinal()]) {
                case 1:
                case 2: {
                    if ("alignment_mode".equalsIgnoreCase(g)) {
                        image.alignmentMode = I(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if (!"loading_indicator".equalsIgnoreCase(g)) {
                        break;
                    }
                    if ("none".equalsIgnoreCase(g2)) {
                        image.loadingIndicator = 1;
                        break;
                    }
                    if ("placeholder".equalsIgnoreCase(g2)) {
                        image.loadingIndicator = 2;
                        break;
                    }
                    throw new CardParserException("unknown loading_indicator: " + g2);
                }
                case 4:
                case 5: {
                    if ("corner_radius".equalsIgnoreCase(g)) {
                        image.cornerRadius = a(jsonParser.j());
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("preserve_aspect_ratio".equalsIgnoreCase(g)) {
                        image.preserveAspectRatio = jsonParser.l();
                        b2 = true;
                        break;
                    }
                    if ("fill_available_space".equalsIgnoreCase(g)) {
                        image.fillAvailableSpace = jsonParser.l();
                        b = true;
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            a2 = jsonParser.a();
        }
        if (image.alignmentMode == null || image.loadingIndicator == 0 || Float.isNaN(image.cornerRadius) || !b2 || !b) {
            throw new CardParserException("invalid image");
        }
        return image;
    }
    
    protected static Player v(final JsonParser jsonParser) {
        final Player player = new Player();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return player;
    }
    
    protected static FormField w(final JsonParser jsonParser) {
        final FormField formField = new FormField();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("name".equalsIgnoreCase(g)) {
                        formField.name = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return formField;
    }
    
    protected static FormCheckbox x(final JsonParser jsonParser) {
        final FormCheckbox formCheckbox = new FormCheckbox();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("form_field".equalsIgnoreCase(g)) {
                        formCheckbox.field = w(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("value".equalsIgnoreCase(g)) {
                        formCheckbox.value = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("checked".equalsIgnoreCase(g)) {
                        formCheckbox.checked = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return formCheckbox;
    }
    
    protected static FormSelectOption y(final JsonParser jsonParser) {
        final FormSelectOption formSelectOption = new FormSelectOption();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (l.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("tokenized_text_id".equalsIgnoreCase(g)) {
                        formSelectOption.tokenizedTextId = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("value".equalsIgnoreCase(g)) {
                        formSelectOption.value = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("selected".equalsIgnoreCase(g)) {
                        formSelectOption.selected = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 8: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return formSelectOption;
    }
    
    protected static FormSelect z(final JsonParser jsonParser) {
        final FormSelect formSelect = new FormSelect();
        JsonToken a = jsonParser.a();
        String s = null;
        while (a != null && a != JsonToken.c) {
            String g = null;
            Label_0083: {
                switch (l.a[a.ordinal()]) {
                    case 1: {
                        if ("form_field".equalsIgnoreCase(s)) {
                            formSelect.field = w(jsonParser);
                            g = s;
                            break Label_0083;
                        }
                        if ("color".equalsIgnoreCase(s)) {
                            formSelect.color = D(jsonParser);
                            g = s;
                            break Label_0083;
                        }
                        jsonParser.c();
                        g = s;
                        break Label_0083;
                    }
                    case 2: {
                        if ("options".equalsIgnoreCase(s)) {
                            final ArrayList<FormSelectOption> list = new ArrayList<FormSelectOption>();
                            JsonToken jsonToken = jsonParser.a();
                            while (true) {
                                boolean b;
                                if (jsonToken != null) {
                                    b = true;
                                }
                                else {
                                    b = false;
                                }
                                boolean b2;
                                if (jsonToken != JsonToken.e) {
                                    b2 = true;
                                }
                                else {
                                    b2 = false;
                                }
                                if (!(b & b2)) {
                                    break;
                                }
                                list.add(y(jsonParser));
                                jsonToken = jsonParser.a();
                            }
                            formSelect.options = list.toArray(new FormSelectOption[list.size()]);
                            g = s;
                            break Label_0083;
                        }
                        jsonParser.c();
                        g = s;
                        break Label_0083;
                    }
                    case 4:
                    case 5: {
                        if ("font_size".equalsIgnoreCase(s)) {
                            formSelect.fontSize = a(jsonParser.j());
                            g = s;
                            break Label_0083;
                        }
                        break;
                    }
                    case 3: {
                        if ("font_name".equalsIgnoreCase(s)) {
                            formSelect.fontName = jsonParser.g();
                            g = s;
                            break Label_0083;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        if ("font_bold".equalsIgnoreCase(s)) {
                            formSelect.fontBold = jsonParser.l();
                            g = s;
                            break Label_0083;
                        }
                        if ("font_underline".equalsIgnoreCase(s)) {
                            formSelect.fontUnderline = jsonParser.l();
                            g = s;
                            break Label_0083;
                        }
                        if ("font_italic".equalsIgnoreCase(s)) {
                            formSelect.fontItalic = jsonParser.l();
                            g = s;
                            break Label_0083;
                        }
                        break;
                    }
                    case 8: {
                        g = jsonParser.g();
                        break Label_0083;
                    }
                }
                g = s;
            }
            final JsonToken a2 = jsonParser.a();
            final String s2 = g;
            a = a2;
            s = s2;
        }
        return formSelect;
    }
}
