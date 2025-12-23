<!DOCTYPE html>
<html <?php language_attributes(); ?>>
<head>
    <meta charset="<?php bloginfo('charset'); ?>">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php wp_head(); ?>
</head>
<body <?php body_class(); ?>>
    <header class="main-header" style="padding: 20px 0; border-bottom: 1px solid hsla(var(--glass-border));">
        <div class="container" style="max-width: 1200px; margin: 0 auto; display: flex; justify-content: space-between; align-items: center; padding: 0 20px;">
            <div class="logo">
                <a href="<?php echo esc_url(home_url('/')); ?>" style="text-decoration: none;">
                    <span style="font-size: 24px; font-weight: 800; color: white;">Yuzu <span class="citrus-text">Hub</span></span>
                </a>
            </div>
            <nav class="main-nav">
                <?php
                wp_nav_menu([
                    'theme_location' => 'main-menu',
                    'container' => false,
                    'menu_class' => 'nav-list',
                    'fallback_cb' => false,
                ]);
                ?>
                <a href="#contact" class="btn-primary" style="margin-left: 20px;">Get in Touch</a>
            </nav>
        </div>
    </header>
