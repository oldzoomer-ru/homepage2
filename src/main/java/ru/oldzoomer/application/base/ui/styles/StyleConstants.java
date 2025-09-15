package ru.oldzoomer.application.base.ui.styles;

/**
 * Константы стилей, переведенные из CSS переменных
 */
public final class StyleConstants {
    
    // Приватный конструктор для предотвращения создания экземпляров
    private StyleConstants() {}
    
    // Шрифты
    public static final String FONT_MAIN = "Cantarell, sans-serif";
    public static final String FONT_WEIGHT_BOLD = "800";
    public static final String FONT_WEIGHT_SEMIBOLD = "700";
    
    // Размеры
    public static final String MAX_WIDTH = "700px";
    public static final String CONTENT_PADDING = "10px";
    
    // Цвета светлой темы
    public static final String WINDOW_BG_COLOR_LIGHT = "#fafafb";
    public static final String WINDOW_FG_COLOR_LIGHT = "rgba(0, 0, 6, 0.8)";
    public static final String ACCENT_BG_COLOR = "#3584e4";
    public static final String ACCENT_FG_COLOR = "#ffffff";
    public static final String CARD_BG_COLOR_LIGHT = "#ffffff";
    public static final String CARD_FG_COLOR_LIGHT = "rgba(0, 0, 6, 0.8)";
    
    // Цвета темной темы
    public static final String WINDOW_BG_COLOR_DARK = "#222226";
    public static final String WINDOW_FG_COLOR_DARK = "#ffffff";
    public static final String CARD_BG_COLOR_DARK = "rgba(255, 255, 255, 0.08)";
    public static final String CARD_FG_COLOR_DARK = "#ffffff";
    
    // Размеры шрифтов
    public static final String TITLE_1_SIZE = "2.5rem";
    public static final String TITLE_1_SIZE_TABLET = "2rem";
    public static final String TITLE_1_SIZE_MOBILE = "1.8rem";
    
    public static final String TITLE_2_SIZE = "1.8rem";
    public static final String TITLE_2_SIZE_TABLET = "1.5rem";
    public static final String TITLE_2_SIZE_MOBILE = "1.3rem";
    
    public static final String HEADING_SIZE = "1.4rem";
    
    // Отступы и размеры
    public static final String BORDER_RADIUS = "8px";
    public static final String BOX_SHADOW = "0 2px 4px rgba(0, 0, 0, 0.1)";
    public static final String LIST_PADDING_LEFT = "1.5rem";
    public static final String LIST_ITEM_MARGIN_BOTTOM = "0.75rem";
    public static final String LINE_HEIGHT = "1.6";
    public static final String TITLE_LINE_HEIGHT = "1.2";
    
    // Responsive breakpoints
    public static final int TABLET_BREAKPOINT = 768;
    public static final int MOBILE_BREAKPOINT = 480;
    
    // Responsive размеры
    public static final String CONTENT_PADDING_TABLET = "15px";
    public static final String CONTENT_PADDING_MOBILE = "10px";
    
    // Отступы для элементов
    public static final String TITLE_1_MARGIN = "1rem 0";
    public static final String TITLE_2_MARGIN = "0.8rem 0";
    public static final String HEADING_MARGIN = "0.6rem 0";
    public static final String CARD_PADDING = "1rem";
    public static final String CARD_MARGIN = "1rem 0";
    
    // Focus стили
    public static final String FOCUS_OUTLINE = "2px solid " + ACCENT_BG_COLOR;
    public static final String FOCUS_OUTLINE_OFFSET = "2px";
}