<?php
/**
 * Yuzu Theme Functions
 */

add_action('wp_enqueue_scripts', function() {
    wp_enqueue_style('yuzu-style', get_stylesheet_uri());
    wp_enqueue_style('google-fonts', 'https://fonts.googleapis.com/css2?family=Inter:wght@400;700&family=Outfit:wght@400;700&display=swap', [], null);
});

add_action('after_setup_theme', function() {
    add_theme_support('post-thumbnails');
    add_theme_support('title-tag');
});
