<?php
namespace Yuzu\PortalCore\Controller;

/**
 * Main Hub Controller.
 * Aggregates all projects into the unified gateway.
 */
class HubController {
    
    public function getProjects() {
        // v1 Project Data (Hardcoded for demonstration)
        $v1_projects = [
            [
                'title' => 'EC Site API',
                'tech' => 'PHP • LARAVEL • FLY.IO',
                'excerpt' => 'Secure product management API with Laravel Sanctum.',
                'link' => 'https://yuzu-ec-api.fly.dev'
            ],
            [
                'title' => 'EventHub',
                'tech' => 'RUBY ON RAILS • POSTGRES',
                'excerpt' => 'Full-stack event management platform with real-time updates.',
                'link' => '#'
            ]
        ];
        
        // v2 Dynamic Projects from CPT
        $v2_projects = [];
        $query = new \WP_Query(['post_type' => 'yuzu_project']);
        if ($query->have_posts()) {
            while ($query->have_posts()) {
                $query->the_post();
                $v2_projects[] = [
                    'title' => get_the_title(),
                    'tech' => get_post_meta(get_the_ID(), '_yuzu_tech_stack', true),
                    'excerpt' => get_the_excerpt(),
                    'link' => get_permalink()
                ];
            }
            wp_reset_postdata();
        }
        
        return array_merge($v1_projects, $v2_projects);
    }
}
