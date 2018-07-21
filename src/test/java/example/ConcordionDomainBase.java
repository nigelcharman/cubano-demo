package example;

import org.concordion.api.ConcordionResources;
import org.concordion.api.extension.Extension;
import org.concordion.api.extension.Extensions;
import org.concordion.api.option.ConcordionOptions;
import org.concordion.api.option.MarkdownExtensions;
import org.concordion.cubano.driver.concordion.ExpectedToFailInfoExtension;
import org.concordion.cubano.framework.ConcordionBase;
import org.concordion.ext.StoryboardExtension;
import org.concordion.ext.TimestampFormatterExtension;
import org.concordion.ext.runtotals.RunTotalsExtension;

/**
 * Sets up any Concordion extensions or other items that must be shared between
 * index and test fixtures.
 * 
 * NOTE: Test can be run from a Fixture or an Index, any global (@...Suite)
 * methods must be in this class to ensure the are executed from whichever class
 * initiates the test run.
 */
@ConcordionResources("/customConcordion.css")
@Extensions({ TimestampFormatterExtension.class, RunTotalsExtension.class, ExpectedToFailInfoExtension.class })
@ConcordionOptions(markdownExtensions = { MarkdownExtensions.HARDWRAPS, MarkdownExtensions.AUTOLINKS })
public abstract class ConcordionDomainBase extends ConcordionBase {

    @Extension
    private final StoryboardExtension storyboard = new StoryboardExtension();


    /**
     * @return A reference to the Storyboard extension.
     */
    public StoryboardExtension getStoryboard() {
        return storyboard;
    }
}
