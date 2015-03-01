package org.sqlproc.meta.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

public class ProcessorMetaResourceSetProvider extends XtextResourceSetProvider {

    @Override
    public ResourceSet get(IProject project) {
        System.out.println(project);
        ResourceSet set = super.get(project);
        // System.out.println(set);
        return set;
    }
}
