# Yuzu Media Suite: Deployment Guide ($0 Maintenance)

This guide outlines how to deploy the entire suite using free-tier services.

## 1. AssetFlow (Enterprise Java)
**Target**: Render.com (Web Service + PostgreSQL)

1. Connect your GitHub repository to Render.
2. Select **"Blueprint"** and point it to:
   `yuzu_media_suite/assetflow/render.yaml`
3. Render will automatically provision:
   - A free PostgreSQL database.
   - A Spring Boot web service using the provided Dockerfile/Wrapper.

## 2. Brand Gateway (Portfolio Portal)
**Target**: Vercel or GitHub Pages (Static)

1. Since WordPress is used for local management, run a static export tool (e.g., WP2Static or Simply Static).
2. Push the contents of `yuzu_media_suite/hub/static-export/` to a new GitHub Repo.
3. Import the repo to **Vercel**.
4. Set the Framework Preset to **"Other"** and output directory to `./`.

## 3. Global Pulse (Real-time Cloud)
**Target**: Render.com (Native + Docker) & K8s (Showcase Only)

### Live Demo (Render)
1. Use the Blueprint at `yuzu_media_suite/global-pulse/render.yaml` (Created below).
2. It will deploy the Rails 8 API and the Python Analysis worker.

### Infrastructure Showcase (K8s)
- These files are for **interview demonstration** only.
- Show the `yuzu_media_suite/global-pulse/k8s-manifests/` directory to recruiters to prove ability to manage clusters, autoscaling, and production-grade YAML.

## Environment Variables
- `RAILS_MASTER_KEY`: (Required for Global Pulse Rails API)
- `DATABASE_URL`: (Auto-injected by Render Blueprints)
