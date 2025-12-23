<?php
/**
 * Plugin Name: Yuzu Portal Core
 * Description: Core logic for Yuzu Media Suite Portfolio Hub. Symfony-style architecture.
 * Version: 1.0.0
 * Author: Antigravity
 */

if (!defined('ABSPATH')) exit;

require_once __DIR__ . '/src/Autoloader.php';

use Yuzu\PortalCore\Autoloader;

// Register Autoloader
Autoloader::register();

/**
 * Initialize Plugin
 */
add_action('plugins_loaded', function() {
    // Controller/Service initialization will happen here
});

// Define Project Custom Post Type
add_action('init', function() {
    register_post_type('yuzu_project', [
        'labels' => [
            'name' => 'Projects',
            'singular_name' => 'Project',
        ],
        'public' => true,
        'has_archive' => true,
        'menu_icon' => 'dashicons-portfolio',
        'supports' => ['title', 'editor', 'thumbnail', 'excerpt'],
    ]);
});
