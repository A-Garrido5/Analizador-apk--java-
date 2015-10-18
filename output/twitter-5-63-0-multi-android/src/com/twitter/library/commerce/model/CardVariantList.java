// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.text.TextUtils;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CardVariantList
{
    private final ArrayList a;
    private final StringBuilder b;
    private int c;
    
    public CardVariantList(final HashMap hashMap) {
        this.a = new ArrayList();
        this.b = new StringBuilder();
        this.a(hashMap);
    }
    
    private String a(final String s) {
        int i = 0;
        this.b.setLength(0);
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (!Character.isDigit(char1)) {
                break;
            }
            this.b.append(char1);
            ++i;
        }
        if (this.b.length() == 0) {
            return null;
        }
        return this.b.toString();
    }
    
    private void a(String substring, final Object o, final CardVariant cardVariant) {
        if (substring.startsWith("_")) {
            substring = substring.substring("_".length());
        }
        if (substring.startsWith("attribute")) {
            final String substring2 = substring.substring("attribute".length());
            final String a = this.a(substring2);
            if (a == null) {
                throw new CardVariantList$CardVariantListException("Expected an attribute index");
            }
            final int n = -1 + Integer.parseInt(a);
            if (n < 0) {
                throw new CardVariantList$CardVariantListException("Invalid attribute index. Index < 0");
            }
            this.a(substring2.substring(a.length()), o, cardVariant, n);
        }
        else {
            switch (substring) {
                default: {}
                case "id": {
                    cardVariant.a((String)o);
                }
                case "description": {
                    cardVariant.c((String)o);
                }
                case "image": {
                    cardVariant.h((String)o);
                }
                case "inventory_count": {
                    cardVariant.d((String)o);
                }
                case "last_updated": {
                    cardVariant.e((String)o);
                }
                case "price": {
                    cardVariant.f((String)o);
                }
                case "tax_category": {
                    cardVariant.g((String)o);
                }
                case "title": {
                    cardVariant.b((String)o);
                }
            }
        }
    }
    
    private void a(String substring, final Object o, final CardVariant cardVariant, final int n) {
        if (substring.startsWith("_")) {
            substring = substring.substring("_".length());
        }
        if (substring.equals("text")) {
            cardVariant.a(n, (String)o);
        }
    }
    
    private void a(final HashMap hashMap) {
        if (hashMap != null) {
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s = entry.getKey();
                if (s.startsWith("variant")) {
                    final String substring = s.substring("variant".length());
                    final String a = this.a(substring);
                    if (a == null) {
                        throw new CardVariantList$CardVariantListException("Expected a variant index");
                    }
                    final int n = -1 + Integer.parseInt(a);
                    if (n < 0) {
                        throw new CardVariantList$CardVariantListException("Invalid variant index. Index < 0");
                    }
                    if (n >= this.a.size()) {
                        com.twitter.library.commerce.model.a.a(this.a, n + 1);
                    }
                    if (this.a.get(n) == null) {
                        this.a.set(n, new CardVariant());
                    }
                    this.a(substring.substring(a.length()), entry.getValue(), (CardVariant)this.a.get(n));
                }
            }
            if (!this.c()) {
                throw new CardVariantList$CardVariantListException("Invalid variant list. Null entries.");
            }
            if (!this.d()) {
                throw new CardVariantList$CardVariantListException("Invalid attributes. Mismatched size.");
            }
            if (this.a.size() > 0) {
                this.c = this.a.get(0).e().size();
            }
        }
    }
    
    private List b(final String[] array) {
        final ArrayList<CardVariant> list = new ArrayList<CardVariant>();
    Label_0016:
        for (final CardVariant cardVariant : this.a) {
            int i = 0;
            while (true) {
                while (i < array.length) {
                    final String s = array[i];
                    if (s != null && !s.equals(cardVariant.e().get(i))) {
                        final int n = 0;
                        if (n != 0) {
                            list.add(cardVariant);
                            continue Label_0016;
                        }
                        continue Label_0016;
                    }
                    else {
                        ++i;
                    }
                }
                final int n = 1;
                continue;
            }
        }
        return list;
    }
    
    private boolean c() {
        if (this.a.size() > 0) {
            final Iterator<CardVariant> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean d() {
        if (this.a.size() > 0) {
            final int size = this.a.get(0).e().size();
            for (final CardVariant cardVariant : this.a) {
                if (cardVariant.e().size() != size) {
                    return false;
                }
                final Iterator iterator2 = cardVariant.e().iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next() == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public final ArrayList a() {
        return this.a;
    }
    
    public List a(final int n, final String[] array) {
        if (n >= this.c || array.length != this.c) {
            throw new CardVariantList$CardVariantListException("Attribute size mismatch");
        }
        final ArrayList<String> list = new ArrayList<String>();
        if (this.a.size() > 0) {
            if (array[n] != null) {
                list.add(array[n]);
            }
            else {
                final Iterator<CardVariant> iterator = this.b(array).iterator();
                while (iterator.hasNext()) {
                    final String s = iterator.next().e().get(n);
                    if (!list.contains(s)) {
                        list.add(s);
                    }
                }
            }
        }
        return list;
    }
    
    public List a(final String[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (TextUtils.isEmpty((CharSequence)array[i])) {
                return null;
            }
        }
        return this.b(array);
    }
    
    public void a(final List list) {
        for (final CardVariant cardVariant : this.a) {
            for (final ProductVariant productVariant : list) {
                if (cardVariant.a().equals(productVariant.a())) {
                    cardVariant.a(productVariant);
                    break;
                }
            }
        }
    }
    
    public int b() {
        return this.c;
    }
}
