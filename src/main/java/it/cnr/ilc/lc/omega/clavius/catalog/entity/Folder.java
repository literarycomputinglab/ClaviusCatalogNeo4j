package it.cnr.ilc.lc.omega.clavius.catalog.entity;

import it.cnr.ilc.lc.omega.entity.Annotation;
import it.cnr.ilc.lc.omega.entity.Content;
import it.cnr.ilc.lc.omega.entity.Source;
import it.cnr.ilc.lc.omega.entity.SuperNode;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 *
 * @author oakgen
 */

@NodeEntity
public class Folder extends SuperNode {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Relationship(type = "SUBFOLDER")
    private List<Folder> folders = new ArrayList<>();

    @Relationship(type = "FILEANNOTATION")
    private List<Annotation> filez = new ArrayList<>();

    @Relationship(type = "FILE")
    private List<Source> files = new ArrayList<>();
    
    public List<Folder> getFolders() {
        return folders;
    }

    public void addFolder(Folder folder) {
        if (!folders.contains(folder)) {
            folders.add(folder);
        }
    }

    public void insertFolder(int index, Folder folder) {
        if (!folders.contains(folder)) {
            folders.add(index, folder);
        }
    }

    public boolean removeFolder(Folder folder) {
        return folders.remove(folder);
    }

    public List<Annotation> getFilez() {
        return filez;
    }
    
     public List<Source> getFiles() {
        return files;
    }
    
     public void addFile(Source file) {
        if (!files.contains(file)) {
            files.add(file);
        }
    }

    public void addFilz(Annotation filz) {
        if (!filez.contains(filz)) {
            filez.add(filz);
        }
    }

    public void insertFile(int index, Annotation<? extends Content, FileAnnotationExtension> file) {
        if (!files.contains(file)) {
            files.add(index, file);
        }
    }

    public boolean removeFilz(Annotation<? extends Content, FileAnnotationExtension> filz) {
        return filez.remove(filz);
    } // attenzione!!! Remove File!
    
     public boolean removeFile(Source file) {
        return files.remove(file);
    } // attenzione!!! Remove File!
}
