package org.test.emf.address.example.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.osgi.service.component.annotations.ComponentPropertyType;
import org.osgi.annotation.bundle.Requirement;
import org.osgi.annotation.bundle.Requirements;

@ComponentPropertyType
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Requirements(value = { //
        @Requirement(namespace = "osgi.identity", name = "org.apache.felix.gogo.shell"), //
        @Requirement(namespace = "osgi.identity", name = "org.apache.felix.gogo.command"), //
})
public @interface Command {
    /**
     * Prefix for the property name. This value is prepended to each property name.
     */
    String PREFIX_ = "osgi.command.";

    String scope();

    String[] function();

}