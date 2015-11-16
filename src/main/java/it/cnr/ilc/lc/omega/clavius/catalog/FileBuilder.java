package it.cnr.ilc.lc.omega.clavius.catalog;

import it.cnr.ilc.lc.omega.clavius.catalog.entity.FileAnnotationExtension;
import it.cnr.ilc.lc.omega.entity.AnnotationBuilder;
import java.net.URI;

/**
 *
 * @author oakgen
 */
public class FileBuilder implements AnnotationBuilder<FileAnnotationExtension> {

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

    @Override
    public void setURI(URI uri) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public URI getURI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
