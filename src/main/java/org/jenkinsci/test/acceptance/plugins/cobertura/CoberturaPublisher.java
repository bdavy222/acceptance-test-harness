package org.jenkinsci.test.acceptance.plugins.cobertura;

import org.jenkinsci.test.acceptance.po.BuildStepPageObject;
import org.jenkinsci.test.acceptance.po.Control;
import org.jenkinsci.test.acceptance.po.Job;
import org.jenkinsci.test.acceptance.po.PostBuildStep;

/**
 * @author Kohsuke Kawaguchi
 */
@BuildStepPageObject("Publish Cobertura Coverage Report")
public class CoberturaPublisher  extends PostBuildStep {
    public CoberturaPublisher(Job parent, String path) {
        super(parent, path);
    }

    public final Control reportFile = control("coberturaReportFile");
}
