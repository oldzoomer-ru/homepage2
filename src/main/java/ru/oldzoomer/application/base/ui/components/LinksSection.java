package ru.oldzoomer.application.base.ui.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Section;

import ru.oldzoomer.application.base.ui.styles.StyleUtils;

/**
 * Компонент секции ссылок
 */
public class LinksSection extends Section {
    
    public LinksSection() {
        // Применяем стили карточки
        StyleUtils.applyCardStyle(this);
        StyleUtils.applyBaseStyle(this);
        getElement().setAttribute("aria-labelledby", "links-heading");
        
        Div heading = new Div("Ссылки:");
        StyleUtils.applyHeadingStyle(heading);
        StyleUtils.applyBaseStyle(heading);
        heading.setId("links-heading");
        
        Nav nav = new Nav();
        StyleUtils.applyBaseStyle(nav);
        nav.getElement().setAttribute("aria-label", "Основные профили в соцсетях");
        
        OrderedList linksList = new OrderedList();
        StyleUtils.applyListStyle(linksList);
        StyleUtils.applyBaseStyle(linksList);
        linksList.getElement().setAttribute("role", "list");
        
        // GitHub ссылка
        ListItem githubItem = new ListItem();
        StyleUtils.applyListItemStyle(githubItem);
        StyleUtils.applyBaseStyle(githubItem);
        githubItem.getElement().setAttribute("role", "listitem");
        Anchor github = new Anchor("https://github.com/oldzoomer-ru", "GitHub");
        StyleUtils.applyActivatableStyle(github);
        StyleUtils.applyBaseStyle(github);
        github.getElement().setAttribute("aria-label", "Профиль на GitHub");
        githubItem.add(github);
        linksList.add(githubItem);
        
        // Хабр ссылка
        ListItem habrItem = new ListItem();
        StyleUtils.applyListItemStyle(habrItem);
        StyleUtils.applyBaseStyle(habrItem);
        habrItem.getElement().setAttribute("role", "listitem");
        Anchor habrLink = new Anchor("https://habr.com/ru/users/oldzoomer/", "Хабр");
        StyleUtils.applyActivatableStyle(habrLink);
        StyleUtils.applyBaseStyle(habrLink);
        habrLink.getElement().setAttribute("aria-label", "Профиль на Хабре");
        habrItem.add(habrLink);
        linksList.add(habrItem);
        
        nav.add(linksList);
        
        // Информация о Фидонет
        Paragraph fidonetInfo = new Paragraph();
        StyleUtils.applyBaseStyle(fidonetInfo);
        fidonetInfo.add("Также я являюсь самым молодым сисопом (системным оператором узла) в сети Фидонет на сегодняшний день - ");
        Anchor fidonet = new Anchor("https://nodehist.wfido.ru/index.cgi?address=2%3A5015%2F519", "2:5015/519");
        StyleUtils.applyLinkStyle(fidonet);
        StyleUtils.applyBaseStyle(fidonet);
        fidonet.getElement().setAttribute("aria-label", "Адрес в сети Фидонет");
        fidonetInfo.add(fidonet);
        fidonetInfo.add(".");
        
        add(heading, nav, fidonetInfo);
    }
}