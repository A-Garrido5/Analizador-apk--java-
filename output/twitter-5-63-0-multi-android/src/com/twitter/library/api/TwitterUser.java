// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.Serializable;
import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.io.ObjectInput;
import android.net.Uri;
import com.twitter.util.l;
import android.os.Parcel;
import com.twitter.internal.util.Optional;
import android.os.Parcelable$Creator;
import java.io.Externalizable;
import android.os.Parcelable;

public class TwitterUser implements Parcelable, ab, Externalizable
{
    public static final Parcelable$Creator CREATOR;
    private static final long serialVersionUID = 1169043633303889791L;
    public long createdAt;
    public TweetEntities descriptionEntities;
    public ExtendedProfile extendedProfile;
    public int fastfollowersCount;
    public int favoritesCount;
    public int flags;
    public int followersCount;
    public int friendsCount;
    public int friendship;
    public long friendshipTime;
    public boolean hasCollections;
    public boolean hasEmptyExtendedProfile;
    public boolean isGeoEnabled;
    public boolean isLifelineInstitution;
    public boolean isPromotableUser;
    public boolean isProtected;
    public boolean isTranslator;
    public long lastUpdated;
    public String location;
    public int mediaCount;
    public TwitterUserMetadata metadata;
    public String name;
    public boolean needsPhoneVerification;
    public int profileBgColor;
    public String profileDescription;
    public String profileHeaderImageUrl;
    public String profileHeaderPath;
    public String profileImagePath;
    public String profileImageUrl;
    public boolean profileImageUrlChanged;
    public int profileLinkColor;
    public String profileUrl;
    public PromotedContent promotedContent;
    public bp status;
    public int statusesCount;
    public Optional structuredLocation;
    public boolean suspended;
    public TweetEntities urlEntities;
    public long userId;
    public String username;
    public boolean verified;
    
    static {
        CREATOR = (Parcelable$Creator)new bv();
    }
    
    public TwitterUser() {
        this.userId = -1L;
        this.mediaCount = -1;
        this.friendship = 128;
    }
    
    public TwitterUser(final Parcel parcel) {
        boolean hasEmptyExtendedProfile = true;
        this.userId = -1L;
        this.mediaCount = -1;
        this.friendship = 128;
        this.userId = parcel.readLong();
        this.name = parcel.readString();
        this.username = parcel.readString();
        this.profileImageUrl = parcel.readString();
        this.profileHeaderImageUrl = parcel.readString();
        this.profileDescription = parcel.readString();
        this.followersCount = parcel.readInt();
        this.fastfollowersCount = parcel.readInt();
        this.profileUrl = parcel.readString();
        this.profileBgColor = parcel.readInt();
        this.profileLinkColor = parcel.readInt();
        this.suspended = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.isProtected = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.verified = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.location = parcel.readString();
        this.structuredLocation = Optional.c(parcel.readSerializable());
        this.friendsCount = parcel.readInt();
        this.createdAt = parcel.readLong();
        this.statusesCount = parcel.readInt();
        this.mediaCount = parcel.readInt();
        this.isGeoEnabled = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.friendship = parcel.readInt();
        this.friendshipTime = parcel.readLong();
        this.lastUpdated = parcel.readLong();
        this.favoritesCount = parcel.readInt();
        this.promotedContent = (PromotedContent)parcel.readSerializable();
        this.descriptionEntities = (TweetEntities)parcel.readSerializable();
        this.urlEntities = (TweetEntities)parcel.readSerializable();
        this.metadata = (TwitterUserMetadata)parcel.readParcelable(this.getClass().getClassLoader());
        this.profileImagePath = parcel.readString();
        this.profileHeaderPath = parcel.readString();
        this.isLifelineInstitution = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.isTranslator = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.needsPhoneVerification = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.hasCollections = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.flags = parcel.readInt();
        this.isPromotableUser = (parcel.readInt() == (hasEmptyExtendedProfile ? 1 : 0) && hasEmptyExtendedProfile);
        this.extendedProfile = (ExtendedProfile)parcel.readSerializable();
        if (parcel.readInt() != (hasEmptyExtendedProfile ? 1 : 0)) {
            hasEmptyExtendedProfile = false;
        }
        this.hasEmptyExtendedProfile = hasEmptyExtendedProfile;
        this.status = null;
        this.profileImageUrlChanged = false;
    }
    
    public long a() {
        return this.userId;
    }
    
    public TwitterUser a(final int profileBgColor) {
        this.profileBgColor = profileBgColor;
        return this;
    }
    
    public TwitterUser a(final long userId) {
        this.userId = userId;
        return this;
    }
    
    public TwitterUser a(final Optional structuredLocation) {
        this.structuredLocation = structuredLocation;
        return this;
    }
    
    public TwitterUser a(final ExtendedProfile extendedProfile) {
        this.extendedProfile = extendedProfile;
        return this;
    }
    
    public TwitterUser a(final PromotedContent promotedContent) {
        this.promotedContent = promotedContent;
        return this;
    }
    
    public TwitterUser a(final TweetEntities descriptionEntities) {
        this.descriptionEntities = descriptionEntities;
        return this;
    }
    
    public TwitterUser a(final TwitterUserMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public TwitterUser a(final bp status) {
        this.status = status;
        return this;
    }
    
    public TwitterUser a(final String name) {
        this.name = name;
        return this;
    }
    
    public TwitterUser a(final boolean suspended) {
        this.suspended = suspended;
        return this;
    }
    
    public boolean a(final TwitterUser twitterUser) {
        return this == twitterUser || (twitterUser != null && this.createdAt == twitterUser.createdAt && this.favoritesCount == twitterUser.favoritesCount && this.followersCount == twitterUser.followersCount && this.fastfollowersCount == twitterUser.fastfollowersCount && this.friendsCount == twitterUser.friendsCount && this.friendship == twitterUser.friendship && this.friendshipTime == twitterUser.friendshipTime && this.isGeoEnabled == twitterUser.isGeoEnabled && this.suspended == twitterUser.suspended && this.needsPhoneVerification == twitterUser.needsPhoneVerification && this.hasCollections == twitterUser.hasCollections && this.isProtected == twitterUser.isProtected && this.profileImageUrlChanged == twitterUser.profileImageUrlChanged && this.statusesCount == twitterUser.statusesCount && this.mediaCount == twitterUser.mediaCount && this.userId == twitterUser.userId && this.verified == twitterUser.verified && this.isTranslator == twitterUser.isTranslator && l.a(this.location, twitterUser.location) && l.a(this.structuredLocation, twitterUser.structuredLocation) && l.a(this.extendedProfile, twitterUser.extendedProfile) && this.hasEmptyExtendedProfile == twitterUser.hasEmptyExtendedProfile && l.a(this.name, twitterUser.name) && l.a(this.profileDescription, twitterUser.profileDescription) && l.a(this.profileImagePath, twitterUser.profileImagePath) && l.a(this.profileHeaderPath, twitterUser.profileHeaderPath) && l.a(this.profileUrl, twitterUser.profileUrl) && this.profileBgColor == twitterUser.profileBgColor && this.profileLinkColor == twitterUser.profileLinkColor && l.a(this.status, twitterUser.status) && l.a(this.username, twitterUser.username) && l.a(this.promotedContent, twitterUser.promotedContent) && l.a(this.descriptionEntities, twitterUser.descriptionEntities) && l.a(this.urlEntities, twitterUser.urlEntities) && l.a(this.metadata, twitterUser.metadata) && this.isLifelineInstitution == twitterUser.isLifelineInstitution && this.isPromotableUser == twitterUser.isPromotableUser);
    }
    
    public TwitterUser b(final int profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
        return this;
    }
    
    public TwitterUser b(final long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    public TwitterUser b(final TweetEntities urlEntities) {
        this.urlEntities = urlEntities;
        return this;
    }
    
    public TwitterUser b(final String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        String path;
        if (profileImageUrl != null) {
            path = Uri.parse(profileImageUrl).getPath();
        }
        else {
            path = null;
        }
        this.profileImagePath = path;
        return this;
    }
    
    public TwitterUser b(final boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }
    
    public String b() {
        return String.valueOf(this.userId);
    }
    
    public TwitterUser c(final int followersCount) {
        this.followersCount = followersCount;
        return this;
    }
    
    public TwitterUser c(final long friendshipTime) {
        this.friendshipTime = friendshipTime;
        return this;
    }
    
    public TwitterUser c(final String profileDescription) {
        if (profileDescription == null || profileDescription.equals("null")) {
            this.profileDescription = null;
            return this;
        }
        this.profileDescription = profileDescription;
        return this;
    }
    
    public TwitterUser c(final boolean verified) {
        this.verified = verified;
        return this;
    }
    
    public String c() {
        if (this.name != null) {
            return this.name;
        }
        return this.username;
    }
    
    public TwitterUser d(final int fastfollowersCount) {
        this.fastfollowersCount = fastfollowersCount;
        return this;
    }
    
    public TwitterUser d(final long lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }
    
    public TwitterUser d(final String profileUrl) {
        if (profileUrl == null || profileUrl.equals("null")) {
            this.profileUrl = null;
            return this;
        }
        this.profileUrl = profileUrl;
        return this;
    }
    
    public TwitterUser d(final boolean isTranslator) {
        this.isTranslator = isTranslator;
        return this;
    }
    
    public boolean d() {
        return this.createdAt > 0L;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public TwitterUser e(final int friendsCount) {
        this.friendsCount = friendsCount;
        return this;
    }
    
    public TwitterUser e(final String username) {
        this.username = username;
        return this;
    }
    
    public TwitterUser e(final boolean isLifelineInstitution) {
        this.isLifelineInstitution = isLifelineInstitution;
        return this;
    }
    
    public void e() {
        this.createdAt = -1L;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && o instanceof TwitterUser && this.a((TwitterUser)o));
    }
    
    public TwitterUser f(final int statusesCount) {
        this.statusesCount = statusesCount;
        return this;
    }
    
    public TwitterUser f(final String location) {
        if (location == null || location.equals("null")) {
            this.location = null;
            return this;
        }
        this.location = location;
        return this;
    }
    
    public TwitterUser f(final boolean hasEmptyExtendedProfile) {
        this.hasEmptyExtendedProfile = hasEmptyExtendedProfile;
        return this;
    }
    
    public boolean f() {
        return this.profileImagePath != null && this.profileImagePath.startsWith("/sticky/default_profile_images/");
    }
    
    public TwitterUser g(final int mediaCount) {
        this.mediaCount = mediaCount;
        return this;
    }
    
    public TwitterUser g(final String profileHeaderImageUrl) {
        this.profileHeaderImageUrl = profileHeaderImageUrl;
        String path;
        if (profileHeaderImageUrl != null) {
            path = Uri.parse(profileHeaderImageUrl).getPath();
        }
        else {
            path = null;
        }
        this.profileHeaderPath = path;
        return this;
    }
    
    public TwitterUser g(final boolean isGeoEnabled) {
        this.isGeoEnabled = isGeoEnabled;
        return this;
    }
    
    public String g() {
        if (this.metadata != null) {
            return this.metadata.c;
        }
        return null;
    }
    
    public TwitterUser h(final int favoritesCount) {
        this.favoritesCount = favoritesCount;
        return this;
    }
    
    public TwitterUser h(final boolean needsPhoneVerification) {
        this.needsPhoneVerification = needsPhoneVerification;
        return this;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (int)(this.userId ^ this.userId >>> 32);
        int hashCode;
        if (this.name != null) {
            hashCode = this.name.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n3 = 31 * (hashCode + n2);
        int hashCode2;
        if (this.profileImagePath != null) {
            hashCode2 = this.profileImagePath.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n4 = 31 * (hashCode2 + n3);
        int hashCode3;
        if (this.profileHeaderPath != null) {
            hashCode3 = this.profileHeaderPath.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n5 = 31 * (hashCode3 + n4);
        int hashCode4;
        if (this.profileDescription != null) {
            hashCode4 = this.profileDescription.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n6 = 31 * (hashCode4 + n5);
        int hashCode5;
        if (this.profileUrl != null) {
            hashCode5 = this.profileUrl.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n7 = 31 * (31 * (31 * (hashCode5 + n6) + this.profileBgColor) + this.profileLinkColor);
        int hashCode6;
        if (this.username != null) {
            hashCode6 = this.username.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n8 = 31 * (hashCode6 + n7);
        int n9;
        if (this.suspended) {
            n9 = n;
        }
        else {
            n9 = 0;
        }
        final int n10 = 31 * (n9 + n8);
        int n11;
        if (this.needsPhoneVerification) {
            n11 = n;
        }
        else {
            n11 = 0;
        }
        final int n12 = 31 * (n11 + n10);
        int n13;
        if (this.hasCollections) {
            n13 = n;
        }
        else {
            n13 = 0;
        }
        final int n14 = 31 * (n13 + n12);
        int n15;
        if (this.isProtected) {
            n15 = n;
        }
        else {
            n15 = 0;
        }
        final int n16 = 31 * (n15 + n14);
        int n17;
        if (this.verified) {
            n17 = n;
        }
        else {
            n17 = 0;
        }
        final int n18 = 31 * (n17 + n16);
        int n19;
        if (this.isTranslator) {
            n19 = n;
        }
        else {
            n19 = 0;
        }
        final int n20 = 31 * (n19 + n18);
        int hashCode7;
        if (this.location != null) {
            hashCode7 = this.location.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n21 = 31 * (hashCode7 + n20);
        int hashCode8;
        if (this.structuredLocation != null) {
            hashCode8 = this.structuredLocation.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n22 = 31 * (hashCode8 + n21);
        int hashCode9;
        if (this.extendedProfile != null) {
            hashCode9 = this.extendedProfile.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n23 = 31 * (hashCode9 + n22);
        int n24;
        if (this.hasEmptyExtendedProfile) {
            n24 = n;
        }
        else {
            n24 = 0;
        }
        final int n25 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (n24 + n23) + this.followersCount) + this.fastfollowersCount) + this.friendsCount) + (int)(this.createdAt ^ this.createdAt >>> 32)) + this.statusesCount) + this.mediaCount);
        int hashCode10;
        if (this.status != null) {
            hashCode10 = this.status.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n26 = 31 * (hashCode10 + n25);
        int n27;
        if (this.isGeoEnabled) {
            n27 = n;
        }
        else {
            n27 = 0;
        }
        final int n28 = 31 * (31 * (31 * (n27 + n26) + this.friendship) + this.favoritesCount);
        int n29;
        if (this.profileImageUrlChanged) {
            n29 = n;
        }
        else {
            n29 = 0;
        }
        final int n30 = 31 * (n29 + n28);
        int hashCode11;
        if (this.promotedContent != null) {
            hashCode11 = this.promotedContent.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final int n31 = 31 * (hashCode11 + n30);
        int hashCode12;
        if (this.descriptionEntities != null) {
            hashCode12 = this.descriptionEntities.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final int n32 = 31 * (hashCode12 + n31);
        int hashCode13;
        if (this.urlEntities != null) {
            hashCode13 = this.urlEntities.hashCode();
        }
        else {
            hashCode13 = 0;
        }
        final int n33 = 31 * (hashCode13 + n32);
        int hashCode14;
        if (this.metadata != null) {
            hashCode14 = this.metadata.hashCode();
        }
        else {
            hashCode14 = 0;
        }
        final int n34 = 31 * (hashCode14 + n33);
        int n35;
        if (this.isLifelineInstitution) {
            n35 = n;
        }
        else {
            n35 = 0;
        }
        final int n36 = 31 * (31 * (n35 + n34) + (int)this.lastUpdated);
        if (!this.isPromotableUser) {
            n = 0;
        }
        return n36 + n;
    }
    
    public TwitterUser i(final int friendship) {
        this.friendship = friendship;
        return this;
    }
    
    public TwitterUser i(final boolean hasCollections) {
        this.hasCollections = hasCollections;
        return this;
    }
    
    public TwitterUser j(final int flags) {
        this.flags = flags;
        return this;
    }
    
    public TwitterUser j(final boolean isPromotableUser) {
        this.isPromotableUser = isPromotableUser;
        return this;
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.userId = objectInput.readLong();
        this.name = (String)objectInput.readObject();
        this.username = (String)objectInput.readObject();
        this.profileImageUrl = (String)objectInput.readObject();
        this.profileHeaderImageUrl = (String)objectInput.readObject();
        this.profileDescription = (String)objectInput.readObject();
        this.followersCount = objectInput.readInt();
        this.profileUrl = (String)objectInput.readObject();
        this.profileBgColor = objectInput.readInt();
        this.profileLinkColor = objectInput.readInt();
        this.isProtected = objectInput.readBoolean();
        this.verified = objectInput.readBoolean();
        this.location = (String)objectInput.readObject();
        this.structuredLocation = Optional.c(objectInput.readObject());
        this.friendsCount = objectInput.readInt();
        this.createdAt = objectInput.readLong();
        this.statusesCount = objectInput.readInt();
        this.mediaCount = objectInput.readInt();
        this.isGeoEnabled = objectInput.readBoolean();
        this.friendship = objectInput.readInt();
        this.friendshipTime = objectInput.readLong();
        this.lastUpdated = objectInput.readLong();
        this.favoritesCount = objectInput.readInt();
        this.promotedContent = (PromotedContent)objectInput.readObject();
        this.descriptionEntities = (TweetEntities)objectInput.readObject();
        this.urlEntities = (TweetEntities)objectInput.readObject();
        this.profileImagePath = (String)objectInput.readObject();
        this.profileHeaderPath = (String)objectInput.readObject();
        this.isLifelineInstitution = objectInput.readBoolean();
        this.isTranslator = objectInput.readBoolean();
        this.needsPhoneVerification = objectInput.readBoolean();
        this.hasCollections = objectInput.readBoolean();
        this.flags = objectInput.readInt();
        try {
            this.fastfollowersCount = objectInput.readInt();
            this.isPromotableUser = objectInput.readBoolean();
            this.extendedProfile = (ExtendedProfile)objectInput.readObject();
            this.hasEmptyExtendedProfile = objectInput.readBoolean();
        }
        catch (OptionalDataException ex) {}
        catch (EOFException ex2) {}
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.userId);
        objectOutput.writeObject(this.name);
        objectOutput.writeObject(this.username);
        objectOutput.writeObject(this.profileImageUrl);
        objectOutput.writeObject(this.profileHeaderImageUrl);
        objectOutput.writeObject(this.profileDescription);
        objectOutput.writeInt(this.followersCount);
        objectOutput.writeObject(this.profileUrl);
        objectOutput.writeInt(this.profileBgColor);
        objectOutput.writeInt(this.profileLinkColor);
        objectOutput.writeBoolean(this.isProtected);
        objectOutput.writeBoolean(this.verified);
        objectOutput.writeObject(this.location);
        objectOutput.writeObject(Optional.b(this.structuredLocation));
        objectOutput.writeInt(this.friendsCount);
        objectOutput.writeLong(this.createdAt);
        objectOutput.writeInt(this.statusesCount);
        objectOutput.writeInt(this.mediaCount);
        objectOutput.writeBoolean(this.isGeoEnabled);
        objectOutput.writeInt(this.friendship);
        objectOutput.writeLong(this.friendshipTime);
        objectOutput.writeLong(this.lastUpdated);
        objectOutput.writeInt(this.favoritesCount);
        objectOutput.writeObject(this.promotedContent);
        objectOutput.writeObject(this.descriptionEntities);
        objectOutput.writeObject(this.urlEntities);
        objectOutput.writeObject(this.profileImagePath);
        objectOutput.writeObject(this.profileHeaderPath);
        objectOutput.writeBoolean(this.isLifelineInstitution);
        objectOutput.writeBoolean(this.isTranslator);
        objectOutput.writeBoolean(this.needsPhoneVerification);
        objectOutput.writeBoolean(this.hasCollections);
        objectOutput.writeInt(this.flags);
        objectOutput.writeInt(this.fastfollowersCount);
        objectOutput.writeBoolean(this.isPromotableUser);
        objectOutput.writeObject(this.extendedProfile);
        objectOutput.writeBoolean(this.hasEmptyExtendedProfile);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeLong(this.userId);
        parcel.writeString(this.name);
        parcel.writeString(this.username);
        parcel.writeString(this.profileImageUrl);
        parcel.writeString(this.profileHeaderImageUrl);
        parcel.writeString(this.profileDescription);
        parcel.writeInt(this.followersCount);
        parcel.writeInt(this.fastfollowersCount);
        parcel.writeString(this.profileUrl);
        parcel.writeInt(this.profileBgColor);
        parcel.writeInt(this.profileLinkColor);
        int n3;
        if (this.suspended) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.isProtected) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        int n5;
        if (this.verified) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        parcel.writeInt(n5);
        parcel.writeString(this.location);
        parcel.writeSerializable((Serializable)Optional.b(this.structuredLocation));
        parcel.writeInt(this.friendsCount);
        parcel.writeLong(this.createdAt);
        parcel.writeInt(this.statusesCount);
        parcel.writeInt(this.mediaCount);
        int n6;
        if (this.isGeoEnabled) {
            n6 = n2;
        }
        else {
            n6 = 0;
        }
        parcel.writeInt(n6);
        parcel.writeInt(this.friendship);
        parcel.writeLong(this.friendshipTime);
        parcel.writeLong(this.lastUpdated);
        parcel.writeInt(this.favoritesCount);
        parcel.writeSerializable((Serializable)this.promotedContent);
        parcel.writeSerializable((Serializable)this.descriptionEntities);
        parcel.writeSerializable((Serializable)this.urlEntities);
        parcel.writeParcelable((Parcelable)this.metadata, n);
        parcel.writeString(this.profileImagePath);
        parcel.writeString(this.profileHeaderPath);
        int n7;
        if (this.isLifelineInstitution) {
            n7 = n2;
        }
        else {
            n7 = 0;
        }
        parcel.writeInt(n7);
        int n8;
        if (this.isTranslator) {
            n8 = n2;
        }
        else {
            n8 = 0;
        }
        parcel.writeInt(n8);
        int n9;
        if (this.needsPhoneVerification) {
            n9 = n2;
        }
        else {
            n9 = 0;
        }
        parcel.writeInt(n9);
        int n10;
        if (this.hasCollections) {
            n10 = n2;
        }
        else {
            n10 = 0;
        }
        parcel.writeInt(n10);
        parcel.writeInt(this.flags);
        int n11;
        if (this.isPromotableUser) {
            n11 = n2;
        }
        else {
            n11 = 0;
        }
        parcel.writeInt(n11);
        parcel.writeSerializable((Serializable)this.extendedProfile);
        if (!this.hasEmptyExtendedProfile) {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
