package it.cnr.ilc.lc.omega.clavius.catalog;

import it.cnr.ilc.lc.omega.clavius.catalog.entity.FileAnnotationExtension;
import it.cnr.ilc.lc.omega.entity.Builder;

/**
 *
 * @author oakgen
 */
public class FileBuilder implements Builder<FileAnnotationExtension> {

    private String name;
    
    public FileBuilder name(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public FileAnnotationExtension build(FileAnnotationExtension extension) {
        extension.setName(name);
        return extension;
    }
    
}