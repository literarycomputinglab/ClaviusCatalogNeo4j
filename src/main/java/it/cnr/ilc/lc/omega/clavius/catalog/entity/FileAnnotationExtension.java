package it.cnr.ilc.lc.omega.clavius.catalog.entity;

import it.cnr.ilc.lc.omega.entity.Annotation;

/**
 *
 * @author oakgen
 */
public class FileAnnotationExtension extends Annotation.Extension {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
