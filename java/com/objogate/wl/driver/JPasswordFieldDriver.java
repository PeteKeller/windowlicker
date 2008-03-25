package com.objogate.wl.driver;

import javax.swing.JPasswordField;
import java.awt.Component;
import org.hamcrest.Matcher;
import com.objogate.exception.Defect;
import com.objogate.wl.ComponentSelector;
import com.objogate.wl.Prober;
import com.objogate.wl.gesture.GesturePerformer;

public class JPasswordFieldDriver extends JTextComponentDriver<JPasswordField> {

    public JPasswordFieldDriver(GesturePerformer gesturePerformer, JPasswordField component) {
        super(gesturePerformer, component);
    }

    public JPasswordFieldDriver(GesturePerformer gesturePerformer, JPasswordField component, Prober prober) {
        super(gesturePerformer, component, prober);
    }

    public JPasswordFieldDriver(GesturePerformer gesturePerformer, ComponentSelector<JPasswordField> componentSelector) {
        super(gesturePerformer, componentSelector);
    }

    public JPasswordFieldDriver(GesturePerformer gesturePerformer, ComponentSelector<JPasswordField> componentSelector, Prober prober) {
        super(gesturePerformer, componentSelector, prober);
    }

    public JPasswordFieldDriver(ComponentDriver<? extends Component> parentOrOwner, ComponentSelector<JPasswordField> componentSelector) {
        super(parentOrOwner, componentSelector);
    }

    public JPasswordFieldDriver(ComponentDriver<? extends Component> parentOrOwner, Class<JPasswordField> componentType, Matcher<? super JPasswordField>... matchers) {
        super(parentOrOwner, componentType, matchers);
    }

    @Override
    public void text(Matcher<String> textMatcher) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void selectText(TextOccurence textOccurence) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void hasText(String expectedText) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void hasText(Matcher<String> matcher) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void hasSelectedText(String expected) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void hasSelectedText(Matcher<String> matcher) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }

    @Override
    public void replaceText(TextOccurence textOccurence, String replacement) {
        throw new Defect("selecting or inspecting text from a password field is not allowed");
    }
}