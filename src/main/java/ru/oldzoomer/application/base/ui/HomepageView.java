package ru.oldzoomer.application.base.ui;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import ru.oldzoomer.application.base.ui.components.HeaderComponent;
import ru.oldzoomer.application.base.ui.components.LinksSection;
import ru.oldzoomer.application.base.ui.components.SkillsSection;
import ru.oldzoomer.application.base.ui.styles.StyleUtils;

/**
 * View домашней страницы с центрированным содержимым
 */
@Route(value = "", layout = MainView.class)
@PageTitle("oldzoomer - Фидошник и Java-разработчик | Персональная страница")
public class HomepageView extends Div {
    
    public HomepageView() {
        // Добавляем компоненты
        add(new HeaderComponent());
        add(new SkillsSection());
        add(new LinksSection());

        // Применяем стили контейнера контента
        StyleUtils.applyContentContainerStyle(this);
        StyleUtils.applyBaseStyle(this);
    }
}