package com.yuzu.assetflow.domain;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.53.2" }, date = "2025-12-23T23:44:00.562+0900")
public final class Asset_ implements org.seasar.doma.jdbc.criteria.metamodel.EntityMetamodel<com.yuzu.assetflow.domain.Asset> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.2");
    }

    private final String __qualifiedTableName;

    private final com.yuzu.assetflow.domain._Asset __entityType = com.yuzu.assetflow.domain._Asset.getSingletonInternal();

    private final java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __allPropertyMetamodels;

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.Long> id = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.Long>(java.lang.Long.class, __entityType, "id");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> assetTag = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "assetTag");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> name = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "name");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> category = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "category");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> status = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "status");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.time.LocalDate> purchaseDate = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.time.LocalDate>(java.time.LocalDate.class, __entityType, "purchaseDate");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.math.BigDecimal> purchaseCost = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.math.BigDecimal>(java.math.BigDecimal.class, __entityType, "purchaseCost");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.Long> assignedToUserId = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.Long>(java.lang.Long.class, __entityType, "assignedToUserId");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.time.LocalDateTime> createdAt = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.time.LocalDateTime>(java.time.LocalDateTime.class, __entityType, "createdAt");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.time.LocalDateTime> updatedAt = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.time.LocalDateTime>(java.time.LocalDateTime.class, __entityType, "updatedAt");

    public Asset_() {
        this("");
    }

    public Asset_(String qualifiedTableName) {
        this.__qualifiedTableName = java.util.Objects.requireNonNull(qualifiedTableName);
        java.util.ArrayList<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __list = new java.util.ArrayList<>(10);
        __list.add(id);
        __list.add(assetTag);
        __list.add(name);
        __list.add(category);
        __list.add(status);
        __list.add(purchaseDate);
        __list.add(purchaseCost);
        __list.add(assignedToUserId);
        __list.add(createdAt);
        __list.add(updatedAt);
        __allPropertyMetamodels = java.util.Collections.unmodifiableList(__list);
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityType<com.yuzu.assetflow.domain.Asset> asType() {
        return __qualifiedTableName.isEmpty() ? __entityType : new org.seasar.doma.jdbc.criteria.metamodel.EntityTypeProxy<>(__entityType, __qualifiedTableName);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> allPropertyMetamodels() {
        return __allPropertyMetamodels;
    }

}
