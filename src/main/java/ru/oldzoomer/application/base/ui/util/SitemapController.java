package ru.oldzoomer.application.base.ui.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для генерации sitemap.xml
 */
@RestController
public class SitemapController {

    private static final String BASE_URL = "https://oldzoomer.ru";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @GetMapping(value = "/sitemap.xml", produces = MediaType.APPLICATION_XML_VALUE)
    public String generateSitemap() {
        StringBuilder sitemap = new StringBuilder();
        sitemap.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sitemap.append("<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n");
        
        // Добавляем главную страницу
        addUrl(sitemap, "", "1.0", "daily");
        
        sitemap.append("</urlset>");
        return sitemap.toString();
    }

    private void addUrl(StringBuilder sitemap, String path, String priority, String changefreq) {
        String fullUrl = BASE_URL + (path.isEmpty() ? "/" : path);
        String lastMod = LocalDate.now().format(DATE_FORMATTER);
        
        sitemap.append("  <url>\n");
        sitemap.append("    <loc>").append(fullUrl).append("</loc>\n");
        sitemap.append("    <lastmod>").append(lastMod).append("</lastmod>\n");
        sitemap.append("    <changefreq>").append(changefreq).append("</changefreq>\n");
        sitemap.append("    <priority>").append(priority).append("</priority>\n");
        sitemap.append("  </url>\n");
    }
}