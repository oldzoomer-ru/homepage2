package ru.oldzoomer.application.base.ui.styles;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.dom.Element;

/**
 * Менеджер тем и responsive стилей
 */
public final class ThemeManager {
    
    // Приватный конструктор для предотвращения создания экземпляров
    private ThemeManager() {}
    
    /**
     * Применяет темную тему к компоненту
     */
    public static void applyDarkTheme(Component component) {
        Element element = component.getElement();
        element.setAttribute("data-theme", "dark");
        
        // Применяем темные стили через JavaScript
        UI.getCurrent().getPage().executeJs(
            "const element = arguments[0];" +
            "element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_DARK + "');" +
            "element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_DARK + "');" +
            "element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_DARK + "');" +
            "element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_DARK + "');",
            element
        );
    }
    
    /**
     * Применяет светлую тему к компоненту
     */
    public static void applyLightTheme(Component component) {
        Element element = component.getElement();
        element.setAttribute("data-theme", "light");
        
        // Применяем светлые стили через JavaScript
        UI.getCurrent().getPage().executeJs(
            "const element = arguments[0];" +
            "element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_LIGHT + "');" +
            "element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_LIGHT + "');" +
            "element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_LIGHT + "');" +
            "element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_LIGHT + "');",
            element
        );
    }
    
    /**
     * Автоматически определяет и применяет тему на основе системных настроек
     */
    public static void applySystemTheme(Component component) {
        UI.getCurrent().getPage().executeJs(
            "const prefersDark = window.matchMedia('(prefers-color-scheme: dark)').matches;" +
            "const element = arguments[0];" +
            "if (prefersDark) {" +
            "  element.setAttribute('data-theme', 'dark');" +
            "  element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_DARK + "');" +
            "  element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_DARK + "');" +
            "  element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_DARK + "');" +
            "  element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_DARK + "');" +
            "} else {" +
            "  element.setAttribute('data-theme', 'light');" +
            "  element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_LIGHT + "');" +
            "  element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_LIGHT + "');" +
            "  element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_LIGHT + "');" +
            "  element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_LIGHT + "');" +
            "}",
            component.getElement()
        );
    }
    
    /**
     * Применяет responsive стили на основе размера экрана
     */
    public static void applyResponsiveStyles(Component component) {
        UI.getCurrent().getPage().executeJs(
            "const element = arguments[0];" +
            "const updateStyles = () => {" +
            "  const width = window.innerWidth;" +
            "  if (width <= " + StyleConstants.MOBILE_BREAKPOINT + ") {" +
            "    element.classList.add('mobile');" +
            "    element.classList.remove('tablet');" +
            "    element.style.setProperty('--content-padding', '" + StyleConstants.CONTENT_PADDING_MOBILE + "');" +
            "  } else if (width <= " + StyleConstants.TABLET_BREAKPOINT + ") {" +
            "    element.classList.add('tablet');" +
            "    element.classList.remove('mobile');" +
            "    element.style.setProperty('--content-padding', '" + StyleConstants.CONTENT_PADDING_TABLET + "');" +
            "  } else {" +
            "    element.classList.remove('mobile', 'tablet');" +
            "    element.style.setProperty('--content-padding', '" + StyleConstants.CONTENT_PADDING + "');" +
            "  }" +
            "};" +
            "updateStyles();" +
            "window.addEventListener('resize', updateStyles);",
            component.getElement()
        );
    }
    
    /**
     * Применяет responsive стили для заголовков
     */
    public static void applyResponsiveTitleStyles(Component component, String titleType) {
        String mobileSize, tabletSize, desktopSize;
        
        switch (titleType) {
            case "title-1":
                mobileSize = StyleConstants.TITLE_1_SIZE_MOBILE;
                tabletSize = StyleConstants.TITLE_1_SIZE_TABLET;
                desktopSize = StyleConstants.TITLE_1_SIZE;
                break;
            case "title-2":
                mobileSize = StyleConstants.TITLE_2_SIZE_MOBILE;
                tabletSize = StyleConstants.TITLE_2_SIZE_TABLET;
                desktopSize = StyleConstants.TITLE_2_SIZE;
                break;
            default:
                return;
        }
        
        UI.getCurrent().getPage().executeJs(
            "const element = arguments[0];" +
            "const updateTitleSize = () => {" +
            "  const width = window.innerWidth;" +
            "  if (width <= " + StyleConstants.MOBILE_BREAKPOINT + ") {" +
            "    element.style.fontSize = '" + mobileSize + "';" +
            "  } else if (width <= " + StyleConstants.TABLET_BREAKPOINT + ") {" +
            "    element.style.fontSize = '" + tabletSize + "';" +
            "  } else {" +
            "    element.style.fontSize = '" + desktopSize + "';" +
            "  }" +
            "};" +
            "updateTitleSize();" +
            "window.addEventListener('resize', updateTitleSize);",
            component.getElement()
        );
    }
    
    /**
     * Инициализирует все стили для корневого компонента
     */
    public static void initializeRootStyles(Component rootComponent) {
        applySystemTheme(rootComponent);
        applyResponsiveStyles(rootComponent);
        
        // Добавляем слушатель изменения системной темы
        UI.getCurrent().getPage().executeJs(
            "const mediaQuery = window.matchMedia('(prefers-color-scheme: dark)');" +
            "const element = arguments[0];" +
            "mediaQuery.addEventListener('change', (e) => {" +
            "  if (e.matches) {" +
            "    element.setAttribute('data-theme', 'dark');" +
            "    element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_DARK + "');" +
            "    element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_DARK + "');" +
            "    element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_DARK + "');" +
            "    element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_DARK + "');" +
            "  } else {" +
            "    element.setAttribute('data-theme', 'light');" +
            "    element.style.setProperty('--window-bg-color', '" + StyleConstants.WINDOW_BG_COLOR_LIGHT + "');" +
            "    element.style.setProperty('--window-fg-color', '" + StyleConstants.WINDOW_FG_COLOR_LIGHT + "');" +
            "    element.style.setProperty('--card-bg-color', '" + StyleConstants.CARD_BG_COLOR_LIGHT + "');" +
            "    element.style.setProperty('--card-fg-color', '" + StyleConstants.CARD_FG_COLOR_LIGHT + "');" +
            "  }" +
            "});",
            rootComponent.getElement()
        );
    }
}