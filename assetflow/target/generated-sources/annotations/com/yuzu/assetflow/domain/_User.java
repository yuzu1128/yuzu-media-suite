package com.yuzu.assetflow.domain;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.53.2" }, date = "2025-12-23T23:44:00.657+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _User extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.yuzu.assetflow.domain.User> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.2");
    }

    private static final _User __singleton = new _User();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.yuzu.assetflow.domain.User>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.User, ?>> __embeddedPropertyTypeMap;

    private _User() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "User";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __map = new java.util.LinkedHashMap<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.User, ?>> __embeddedMap = new java.util.LinkedHashMap<>(5);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.User, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.User, java.lang.Long, java.lang.Long>(com.yuzu.assetflow.domain.User.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLong(), "id", "", __namingType, false, __idGenerator));
        __map.put("username", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.User, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.User.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "username", "", __namingType, true, true, false));
        __map.put("passwordHash", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.User, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.User.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "passwordHash", "password_hash", __namingType, true, true, false));
        __map.put("role", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.User, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.User.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "role", "", __namingType, true, true, false));
        __map.put("createdAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.User, java.time.LocalDateTime, java.time.LocalDateTime>(com.yuzu.assetflow.domain.User.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "createdAt", "created_at", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    @Deprecated
    public String getTableName() {
        return getTableName(org.seasar.doma.internal.jdbc.entity.TableNames.namingFunction);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.yuzu.assetflow.domain.User entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.yuzu.assetflow.domain.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.User, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.User, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.User, ?, ?>)__entityPropertyTypeMap.get("id");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.yuzu.assetflow.domain.User, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.yuzu.assetflow.domain.User, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.yuzu.assetflow.domain.User, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.yuzu.assetflow.domain.User, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.yuzu.assetflow.domain.User newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.yuzu.assetflow.domain.User, ?>> __args) {
        com.yuzu.assetflow.domain.User entity = new com.yuzu.assetflow.domain.User();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("username") != null) __args.get("username").save(entity);
        if (__args.get("passwordHash") != null) __args.get("passwordHash").save(entity);
        if (__args.get("role") != null) __args.get("role").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        return entity;
    }

    @Override
    public Class<com.yuzu.assetflow.domain.User> getEntityClass() {
        return com.yuzu.assetflow.domain.User.class;
    }

    @Override
    public com.yuzu.assetflow.domain.User getOriginalStates(com.yuzu.assetflow.domain.User __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.yuzu.assetflow.domain.User __entity) {
    }

    /**
     * @return the singleton
     */
    public static _User getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _User newInstance() {
        return new _User();
    }

}
