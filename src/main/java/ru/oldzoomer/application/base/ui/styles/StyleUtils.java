package ru.oldzoomer.application.base.ui.styles;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.dom.Style.AlignItems;
import com.vaadin.flow.dom.Style.Display;
import com.vaadin.flow.dom.Style.FlexDirection;
import com.vaadin.flow.dom.Style.JustifyContent;

/**
 * Утилитный класс для применения стилей к компонентам Vaadin
 */
public final class StyleUtils {

    // Приватный конструктор для предотвращения создания экземпляров
    private StyleUtils() {
    }

    /**
     * Применяет стили заголовка первого уровня (title-1)
     */
    public static void applyTitle1Style(Component component) {
        Style style = component.getElement().getStyle();
        style.setFontSize(StyleConstants.TITLE_1_SIZE);
        style.setFontWeight(StyleConstants.FONT_WEIGHT_BOLD);
        style.set("color", "var(--accent-bg-color)");
        style.setLineHeight(StyleConstants.TITLE_LINE_HEIGHT);
        style.setMargin(StyleConstants.TITLE_1_MARGIN);
        style.set("font-family", StyleConstants.FONT_MAIN);
    }

    /**
     * Применяет стили заголовка второго уровня (title-2)
     */
    public static void applyTitle2Style(Component component) {
        Style style = component.getElement().getStyle();
        style.setFontSize(StyleConstants.TITLE_2_SIZE);
        style.setFontWeight(StyleConstants.FONT_WEIGHT_SEMIBOLD);
        style.set("color", "var(--accent-bg-color)");
        style.setMargin(StyleConstants.TITLE_2_MARGIN);
        style.set("font-family", StyleConstants.FONT_MAIN);
    }

    /**
     * Применяет стили заголовка секции (heading)
     */
    public static void applyHeadingStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.setFontSize(StyleConstants.HEADING_SIZE);
        style.setFontWeight("600");
        style.setMargin(StyleConstants.HEADING_MARGIN);
        style.set("font-family", StyleConstants.FONT_MAIN);
        style.set("color", "var(--window-fg-color)");
    }

    /**
     * Применяет стили карточки (card)
     */
    public static void applyCardStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.set("background-color", "var(--card-bg-color)");
        style.set("color", "var(--card-fg-color)");
        style.setPadding(StyleConstants.CARD_PADDING);
        style.setBorderRadius(StyleConstants.BORDER_RADIUS);
        style.setBoxShadow(StyleConstants.BOX_SHADOW);
        style.setMargin(StyleConstants.CARD_MARGIN);
    }

    /**
     * Применяет стили для основного контейнера (body)
     */
    public static void applyBodyStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.setDisplay(Display.FLEX);
        style.setJustifyContent(JustifyContent.CENTER);
        style.setAlignItems(AlignItems.CENTER);
        style.setPadding(StyleConstants.CONTENT_PADDING);
        style.set("min-height", "100vh");
        style.set("background-color", "var(--window-bg-color)");
    }

    /**
     * Применяет стили для контейнера контента
     */
    public static void applyContentContainerStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.setMaxWidth(StyleConstants.MAX_WIDTH);
        style.setWidth("100%");
        style.setPadding(StyleConstants.CONTENT_PADDING);
        style.setDisplay(Display.FLEX);
        style.setFlexDirection(FlexDirection.COLUMN);
        style.setAlignItems(AlignItems.CENTER);

        component.getChildren()
                .map(x -> x.getElement().getStyle())
                .forEach(x -> x.setWidth("100%"));
    }

    /**
     * Применяет стили для списков
     */
    public static void applyListStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.setPaddingLeft(StyleConstants.LIST_PADDING_LEFT);
    }

    /**
     * Применяет стили для элементов списка
     */
    public static void applyListItemStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.set("margin-bottom", StyleConstants.LIST_ITEM_MARGIN_BOTTOM);
        style.setLineHeight(StyleConstants.LINE_HEIGHT);
    }

    /**
     * Применяет стили для ссылок
     */
    public static void applyLinkStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.set("color", "var(--accent-bg-color)");
        style.set("text-decoration", "none");
    }

    /**
     * Применяет стили для активируемых элементов (activatable)
     */
    public static void applyActivatableStyle(Component component) {
        applyLinkStyle(component);
        // Добавляем hover эффекты через CSS класс, так как Java не поддерживает
        // псевдоклассы
        component.addClassName("activatable-java");
    }

    /**
     * Применяет базовые стили для всех элементов
     */
    public static void applyBaseStyle(Component component) {
        Style style = component.getElement().getStyle();
        style.set("box-sizing", "border-box");
        style.set("font-family", StyleConstants.FONT_MAIN);
        style.set("color", "var(--window-fg-color)");
        style.set("word-wrap", "break-word");
    }

}