package pl.keepcoding.swing.custom.learningtest;

import org.fest.swing.finder.WindowFinder;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.launcher.ApplicationLauncher;
import org.fest.swing.testing.FestSwingTestCaseTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pl.keepcoding.swing.custom.ComponentNames;
import pl.keepcoding.swing.custom.JOutlookBarDemo;

/**
 * @author msanecki
 *
 */
public class JOutlookFromL2FProdTest extends FestSwingTestCaseTemplate{

	
	private FrameFixture mainFrame;

	@Before
    public void setUp(){
        setUpRobot();
        robot().settings().delayBetweenEvents( 1000 );
        
        ApplicationLauncher.application( JOutlookBarDemo.class ).start();
        mainFrame = WindowFinder.findFrame(ComponentNames.mainFrame ).using( robot() );
    }
	

	@After
    public void tearDown(){
        cleanUp();
    }
	
	
	@Test
	public void outlookTabsClick() throws Exception {
		
		String[] tabTitles = mainFrame.tabbedPane(ComponentNames.outlookbar).tabTitles();
		for (String stringtitle : tabTitles) {
			System.out.println(stringtitle);
		}
		
		// TODO How to get access to tabbed panes from JOutlookBar ???
		
//		int outlookBarXposition = 100;
//		robot().moveMouse(outlookBarXposition,50);
//		robot().moveMouse(outlookBarXposition,90);
//		robot().moveMouse(outlookBarXposition,130);
		
	}
}
