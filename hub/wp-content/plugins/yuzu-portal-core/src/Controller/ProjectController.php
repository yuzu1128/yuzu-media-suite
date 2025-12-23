<?php
namespace Yuzu\PortalCore\Controller;

/**
 * Controller for managing project displays.
 * Demonstrates Symfony-style separation of concerns within WordPress.
 */
class ProjectController {
    
    /**
     * Get all portfolio projects formatted for the grid.
     */
    public function getProjects() {
        $args = [
            'post_type' => 'yuzu_project',
            'posts_per_page' => -1,
            'status' => 'publish'
        ];
        
        return get_posts($args);
    }
    
    /**
     * Render a single project card using design tokens.
     */
    public function renderCard($project) {
        $tech_stack = get_post_meta($project->ID, '_yuzu_tech_stack', true) ?: 'TECHNOLOGY';
        
        ob_start();
        ?>
        <div class="glass-panel">
            <h3 style="margin-top: 0;"><?php echo esc_html($project->post_title); ?></h3>
            <div class="project-meta" style="margin-bottom: 15px;">
                <span class="citrus-text" style="font-size: 12px; font-weight: 700;">
                    <?php echo esc_html(strtoupper($tech_stack)); ?>
                </span>
            </div>
            <p><?php echo esc_html(get_the_excerpt($project)); ?></p>
            <a href="<?php echo get_permalink($project->ID); ?>" style="color: hsl(var(--citrus-gold)); text-decoration: none; font-weight: 700; font-size: 14px;">View Details →</a>
        </div>
        <?php
        return ob_get_clean();
    }
}
