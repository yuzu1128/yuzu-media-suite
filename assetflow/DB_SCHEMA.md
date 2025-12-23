# AssetFlow: Database Schema Design

This document outlines the initial relational schema for the AssetFlow enterprise asset management system.

## 🗄️ Tables

### 1. `users`
Stores system users and their authentication/authorization details.
- `id`: BIGSERIAL (Primary Key)
- `username`: VARCHAR(50) (Unique, Not Null)
- `password_hash`: VARCHAR(255) (Not Null)
- `role`: VARCHAR(20) (Not Null) - `ADMIN`, `READER`
- `created_at`: TIMESTAMP (Default: Now)

### 2. `assets`
Core table for all managed company assets.
- `id`: BIGSERIAL (Primary Key)
- `asset_tag`: VARCHAR(50) (Unique, Not Null) - e.g., "PC-2025-001"
- `name`: VARCHAR(100) (Not Null)
- `category`: VARCHAR(50) (Not Null) - `HARDWARE`, `SOFTWARE`, `FURNITURE`
- `status`: VARCHAR(20) (Not Null) - `AVAILABLE`, `ASSIGNED`, `MAINTENANCE`, `DISPOSED`
- `purchase_date`: DATE
- `purchase_cost`: DECIMAL(12, 2)
- `assigned_to_user_id`: BIGINT (Foreign Key referencing `users.id`)
- `created_at`: TIMESTAMP
- `updated_at`: TIMESTAMP

### 3. `audit_logs`
Track all changes for compliance.
- `id`: BIGSERIAL (Primary Key)
- `entity_type`: VARCHAR(50) (Not Null) - `ASSET`, `USER`
- `entity_id`: BIGINT (Not Null)
- `action`: VARCHAR(20) (Not Null) - `CREATE`, `UPDATE`, `DELETE`
- `changed_by_user_id`: BIGINT (Foreign Key referencing `users.id`)
- `change_details`: JSONB (Stores before/after state)
- `created_at`: TIMESTAMP (Default: Now)

## 🔗 Relationships
- Many `assets` can be assigned to one `user`.
- One `user` (Admin) can generate many `audit_logs`.

---

## 🛠️ Implementation Note (DOMA 2)
DOMA 2 will use `.sql` templates located in `src/main/resources/META-INF/com/yuzu/assetflow/dao/`.
Naming convention: `DaoMethodName.sql`.
