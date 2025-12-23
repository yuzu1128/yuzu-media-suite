-- Drop tables if exist
DROP TABLE IF EXISTS audit_logs;
DROP TABLE IF EXISTS assets;
DROP TABLE IF EXISTS users;

-- Create Users Table
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Assets Table
CREATE TABLE assets (
    id SERIAL PRIMARY KEY,
    asset_tag VARCHAR(50) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    status VARCHAR(20) NOT NULL,
    purchase_date DATE,
    purchase_cost DECIMAL(12, 2),
    assigned_to_user_id INTEGER REFERENCES users(id),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Audit Logs Table
CREATE TABLE audit_logs (
    id SERIAL PRIMARY KEY,
    entity_type VARCHAR(50) NOT NULL,
    entity_id INTEGER NOT NULL,
    action VARCHAR(20) NOT NULL,
    changed_by_user_id INTEGER REFERENCES users(id),
    change_details TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
