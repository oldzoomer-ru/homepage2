package ru.oldzoomer.application.base.ui;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.Route;

/**
 * This view shows up when a user navigates to the root ('/') of the application.
 */
@Route
@Menu(order = -100, icon = "vaadin:home", title = "Welcome!")
public final class MainView extends Main {

    MainView() {
        
    }
}
