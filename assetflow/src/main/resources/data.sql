-- Seed Users (Password is 'password')
INSERT INTO users (username, password_hash, role) VALUES ('admin', '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07Ofu01p2.e80Mv7nC', 'ADMIN');
INSERT INTO users (username, password_hash, role) VALUES ('yuzu', '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07Ofu01p2.e80Mv7nC', 'READER');

-- Seed Assets
INSERT INTO assets (asset_tag, name, category, status) VALUES ('PC-2025-001', 'MacBook Pro M3', 'HARDWARE', 'AVAILABLE');
INSERT INTO assets (asset_tag, name, category, status) VALUES ('SW-2025-001', 'IntelliJ IDEA License', 'SOFTWARE', 'ASSIGNED');
