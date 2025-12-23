<?php get_header(); ?>

<main class="site-main">
    <!-- Hero Section -->
    <section class="hero" style="padding: 120px 0 80px; text-align: center;">
        <div class="container" style="max-width: 1200px; margin: 0 auto; padding: 0 20px;">
            <h1 style="font-size: 64px; font-weight: 800; margin-bottom: 10px;">
                Crafting <span class="citrus-text">Digital</span> Experiences
            </h1>
            <p style="font-size: 20px; color: hsl(var(--text-dim)); max-width: 700px; margin: 0 auto 40px;">
                Premium Portfolio Suite showcasing Enterprise Java, Real-time Cloud, and Advanced Web Design.
            </p>
            <div class="hero-actions">
                <a href="#projects" class="btn-primary">Explore My Work</a>
            </div>
        </div>
    </section>

    <!-- Projects Grid Section -->
    <section id="projects" class="projects-section" style="padding: 80px 0;">
        <div class="container" style="max-width: 1200px; margin: 0 auto; padding: 0 20px;">
            <h2 style="font-size: 32px; font-weight: 800; margin-bottom: 40px; text-align: center;">
                Project <span class="citrus-text">Showcase</span>
            </h2>
            
            <div class="project-grid" style="display: grid; grid-template-columns: repeat(auto-fill, minmax(350px, 1fr)); gap: 30px;">
                <?php
                $project_query = new WP_Query([
                    'post_type' => 'yuzu_project',
                    'posts_per_page' => 6,
                ]);

                if ($project_query->have_posts()) :
                    while ($project_query->have_posts()) : $project_query->the_post();
                        ?>
                        <div class="glass-panel">
                            <h3 style="margin-top: 0;"><?php the_title(); ?></h3>
                            <div class="project-meta" style="margin-bottom: 15px;">
                                <span class="citrus-text" style="font-size: 12px; font-weight: 700;">JAVA • SPRING • RENDER</span>
                            </div>
                            <?php the_excerpt(); ?>
                            <a href="<?php the_permalink(); ?>" style="color: hsl(var(--citrus-gold)); text-decoration: none; font-weight: 700; font-size: 14px;">View Details →</a>
                        </div>
                        <?php
                    endwhile;
                    wp_reset_postdata();
                else :
                    echo '<p style="text-align: center; color: hsl(var(--text-dim));">Initializing projects... please check the admin panel.</p>';
                endif;
                ?>
            </div>
        </div>
    </section>
</main>

<?php get_footer(); ?>
