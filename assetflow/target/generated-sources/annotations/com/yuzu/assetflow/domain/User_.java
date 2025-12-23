package com.yuzu.assetflow.domain;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.53.2" }, date = "2025-12-23T23:44:00.712+0900")
public final class User_ implements org.seasar.doma.jdbc.criteria.metamodel.EntityMetamodel<com.yuzu.assetflow.domain.User> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.2");
    }

    private final String __qualifiedTableName;

    private final com.yuzu.assetflow.domain._User __entityType = com.yuzu.assetflow.domain._User.getSingletonInternal();

    private final java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __allPropertyMetamodels;

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.Long> id = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.Long>(java.lang.Long.class, __entityType, "id");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> username = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "username");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> passwordHash = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "passwordHash");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> role = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "role");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.time.LocalDateTime> createdAt = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.time.LocalDateTime>(java.time.LocalDateTime.class, __entityType, "createdAt");

    public User_() {
        this("");
    }

    public User_(String qualifiedTableName) {
        this.__qualifiedTableName = java.util.Objects.requireNonNull(qualifiedTableName);
        java.util.ArrayList<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __list = new java.util.ArrayList<>(5);
        __list.add(id);
        __list.add(username);
        __list.add(passwordHash);
        __list.add(role);
        __list.add(createdAt);
        __allPropertyMetamodels = java.util.Collections.unmodifiableList(__list);
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityType<com.yuzu.assetflow.domain.User> asType() {
        return __qualifiedTableName.isEmpty() ? __entityType : new org.seasar.doma.jdbc.criteria.metamodel.EntityTypeProxy<>(__entityType, __qualifiedTableName);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> allPropertyMetamodels() {
        return __allPropertyMetamodels;
    }

}
