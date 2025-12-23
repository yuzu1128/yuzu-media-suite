-- Seed Users
INSERT INTO users (username, password_hash, role) VALUES ('admin', 'hashed_password', 'ADMIN');
INSERT INTO users (username, password_hash, role) VALUES ('yuzu', 'hashed_password', 'READER');

-- Seed Assets
INSERT INTO assets (asset_tag, name, category, status) VALUES ('PC-2025-001', 'MacBook Pro M3', 'HARDWARE', 'AVAILABLE');
INSERT INTO assets (asset_tag, name, category, status) VALUES ('SW-2025-001', 'IntelliJ IDEA License', 'SOFTWARE', 'ASSIGNED');
