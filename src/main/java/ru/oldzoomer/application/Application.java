package ru.oldzoomer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.page.Meta;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.server.AppShellSettings;
import com.vaadin.flow.theme.Theme;

@SpringBootApplication
@Theme("default")
@Viewport("width=device-width, initial-scale=1.0")
@Meta(name = "description", content = "Персональная страница oldzoomer - Фидошник, линуксоид, Java-разработчик")
@Meta(name = "author", content = "oldzoomer")
@Meta(name = "robots", content = "index, follow")
@Meta(name = "language", content = "ru")
@Meta(name = "og:type", content = "profile")
@Meta(name = "og:title", content = "oldzoomer - Фидошник и Java-разработчик")
@Meta(name = "og:description", content = "Персональная страница oldzoomer - Фидошник, линуксоид, Java-разработчик")
@Meta(name = "og:url", content = "https://oldzoomer.ru/")
@Meta(name = "og:image", content = "https://oldzoomer.ru/avatar.png")
@Meta(name = "twitter:card", content = "summary")
@Meta(name = "twitter:title", content = "oldzoomer - Фидошник и Java-разработчик")
@Meta(name = "twitter:description", content = "Персональная страница oldzoomer - Фидошник, линуксоид, Java-разработчик")
public class Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configurePage(AppShellSettings settings) {
        settings.addFavIcon("icon", "avatar.png", "512x512");
    }

}
