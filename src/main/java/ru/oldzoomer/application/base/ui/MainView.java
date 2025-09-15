package ru.oldzoomer.application.base.ui;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.RouterLayout;

import ru.oldzoomer.application.base.ui.styles.StyleUtils;

/**
 * Главная страница - корневой view приложения
 */
public final class MainView extends Main implements RouterLayout {

    public MainView() {
        // Применяем стили основного контейнера
        StyleUtils.applyBodyStyle(this);
        StyleUtils.applyBaseStyle(this);
    }
}
