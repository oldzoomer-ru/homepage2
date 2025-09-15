package ru.oldzoomer.application.base.ui.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;

import ru.oldzoomer.application.base.ui.styles.StyleUtils;
import ru.oldzoomer.application.base.ui.styles.ThemeManager;

/**
 * Компонент заголовка страницы
 */
public class HeaderComponent extends Div {
    
    public HeaderComponent() {
        // Применяем базовые стили к контейнеру
        StyleUtils.applyBaseStyle(this);
        
        // Заголовок страницы
        H1 title = new H1("oldzoomer");
        StyleUtils.applyTitle1Style(title);
        StyleUtils.applyBaseStyle(title);
        ThemeManager.applyResponsiveTitleStyles(title, "title-1");
        title.getElement().setAttribute("aria-label", "Персональная страница oldzoomer");
        
        // Подзаголовок
        Div subtitle = new Div();
        subtitle.setText("Фидошник, Java-разработчик");
        StyleUtils.applyTitle2Style(subtitle);
        StyleUtils.applyBaseStyle(subtitle);
        ThemeManager.applyResponsiveTitleStyles(subtitle, "title-2");
        subtitle.getElement().setAttribute("aria-label", "Род деятельности: Фидошник, Java-разработчик");
        
        // Добавляем компоненты
        add(title, subtitle);
    }
}