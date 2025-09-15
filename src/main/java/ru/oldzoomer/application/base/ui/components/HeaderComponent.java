package ru.oldzoomer.application.base.ui.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;

import ru.oldzoomer.application.base.ui.styles.StyleUtils;

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
        title.getElement().setAttribute("aria-label", "Персональная страница oldzoomer");
        
        // Подзаголовок
        Div subtitle = new Div();
        subtitle.setText("Фидошник, Java-разработчик");
        StyleUtils.applyTitle2Style(subtitle);
        StyleUtils.applyBaseStyle(subtitle);
        subtitle.getElement().setAttribute("aria-label", "Род деятельности: Фидошник, Java-разработчик");
        
        // Добавляем компоненты
        add(title, subtitle);
    }
}