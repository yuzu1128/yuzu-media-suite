package com.yuzu.assetflow.domain;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "2.53.2" }, date = "2025-12-23T23:44:00.369+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _Asset extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.yuzu.assetflow.domain.Asset> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.53.2");
    }

    private static final _Asset __singleton = new _Asset();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.yuzu.assetflow.domain.Asset>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __embeddedPropertyTypeMap;

    private _Asset() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "Asset";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __list = new java.util.ArrayList<>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __map = new java.util.LinkedHashMap<>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __embeddedMap = new java.util.LinkedHashMap<>(10);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.Long, java.lang.Long>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLong(), "id", "", __namingType, false, __idGenerator));
        __map.put("assetTag", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "assetTag", "asset_tag", __namingType, true, true, false));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "name", "", __namingType, true, true, false));
        __map.put("category", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "category", "", __namingType, true, true, false));
        __map.put("status", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.String, java.lang.String>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "status", "", __namingType, true, true, false));
        __map.put("purchaseDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.time.LocalDate, java.time.LocalDate>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDate(), "purchaseDate", "purchase_date", __namingType, true, true, false));
        __map.put("purchaseCost", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.math.BigDecimal, java.math.BigDecimal>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofBigDecimal(), "purchaseCost", "purchase_cost", __namingType, true, true, false));
        __map.put("assignedToUserId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.lang.Long, java.lang.Long>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLong(), "assignedToUserId", "assigned_to_user_id", __namingType, true, true, false));
        __map.put("createdAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.time.LocalDateTime, java.time.LocalDateTime>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "createdAt", "created_at", __namingType, true, true, false));
        __map.put("updatedAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.yuzu.assetflow.domain.Asset, java.time.LocalDateTime, java.time.LocalDateTime>(com.yuzu.assetflow.domain.Asset.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "updatedAt", "updated_at", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> __list) {
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
    public void preInsert(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.yuzu.assetflow.domain.Asset entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.yuzu.assetflow.domain.Asset> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.yuzu.assetflow.domain.Asset, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?>)__entityPropertyTypeMap.get("id");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.yuzu.assetflow.domain.Asset, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.yuzu.assetflow.domain.Asset newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.yuzu.assetflow.domain.Asset, ?>> __args) {
        com.yuzu.assetflow.domain.Asset entity = new com.yuzu.assetflow.domain.Asset();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("assetTag") != null) __args.get("assetTag").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("category") != null) __args.get("category").save(entity);
        if (__args.get("status") != null) __args.get("status").save(entity);
        if (__args.get("purchaseDate") != null) __args.get("purchaseDate").save(entity);
        if (__args.get("purchaseCost") != null) __args.get("purchaseCost").save(entity);
        if (__args.get("assignedToUserId") != null) __args.get("assignedToUserId").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        return entity;
    }

    @Override
    public Class<com.yuzu.assetflow.domain.Asset> getEntityClass() {
        return com.yuzu.assetflow.domain.Asset.class;
    }

    @Override
    public com.yuzu.assetflow.domain.Asset getOriginalStates(com.yuzu.assetflow.domain.Asset __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.yuzu.assetflow.domain.Asset __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Asset getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Asset newInstance() {
        return new _Asset();
    }

}
