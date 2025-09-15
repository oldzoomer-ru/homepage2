package ru.oldzoomer.application.base.ui.components;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Section;

import ru.oldzoomer.application.base.ui.styles.StyleUtils;

/**
 * Компонент секции навыков
 */
public class SkillsSection extends Section {
    
    public SkillsSection() {
        // Применяем стили карточки
        StyleUtils.applyCardStyle(this);
        StyleUtils.applyBaseStyle(this);
        getElement().setAttribute("aria-labelledby", "skills-heading");
        
        Div heading = new Div("Мой основной стек:");
        StyleUtils.applyHeadingStyle(heading);
        StyleUtils.applyBaseStyle(heading);
        heading.setId("skills-heading");
        
        OrderedList skillsList = new OrderedList();
        StyleUtils.applyListStyle(skillsList);
        StyleUtils.applyBaseStyle(skillsList);
        skillsList.getElement().setAttribute("role", "list");
        
        String[] skills = {
            "Java (Spring, JPA)",
            "SQL (PostgreSQL, Microsoft SQL Server)",
            "Linux (Docker)",
            "Git, GitHub",
            "Микросервисы (Kafka)",
            "CI/CD (GitHub Actions)"
        };
        
        for (String skill : skills) {
            ListItem item = new ListItem(skill);
            StyleUtils.applyListItemStyle(item);
            StyleUtils.applyBaseStyle(item);
            item.getElement().setAttribute("role", "listitem");
            skillsList.add(item);
        }
        
        Paragraph careerLink = new Paragraph();
        StyleUtils.applyBaseStyle(careerLink);
        careerLink.add("Мой текущий уровень навыков можно узнать на ");
        Anchor habr = new Anchor("https://career.habr.com/oldzoomer", "Хабр Карьерe");
        StyleUtils.applyLinkStyle(habr);
        StyleUtils.applyBaseStyle(habr);
        habr.getElement().setAttribute("aria-label", "Профиль на Хабр Карьере");
        careerLink.add(habr);
        careerLink.add(".");
        
        add(heading, skillsList, careerLink);
    }
}
