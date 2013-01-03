package pl.keepcoding.swing.custom.learningtest;

import org.fest.swing.finder.WindowFinder;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.launcher.ApplicationLauncher;
import org.fest.swing.testing.FestSwingTestCaseTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pl.keepcoding.swing.custom.ComponentNames;
import pl.keepcoding.swing.custom.JTabbedPaneDemo;

/**
 * @author msanecki
 *
 */
public class JTabbedPaneGuiTest extends FestSwingTestCaseTemplate{

	private FrameFixture mainFrame;
	
	@Before
    public void setUp(){
        setUpRobot();
        robot().settings().delayBetweenEvents( 500 );
        
        ApplicationLauncher.application( JTabbedPaneDemo.class ).start();
        mainFrame = WindowFinder.findFrame(ComponentNames.mainFrame ).using( robot() );
    }
	

	@After
    public void tearDown(){
        cleanUp();
    }
	
	@Test
	public void testTabClick() throws Exception {
		
		mainFrame.tabbedPane(ComponentNames.outlookbar).selectTab("tab1");
		mainFrame.tabbedPane(ComponentNames.outlookbar).selectTab("tab2");
		mainFrame.tabbedPane(ComponentNames.outlookbar).selectTab("tab3").click();
		
	}
}
