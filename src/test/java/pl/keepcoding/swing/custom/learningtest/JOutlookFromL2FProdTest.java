package pl.keepcoding.swing.custom.learningtest;

import javax.swing.JTabbedPane;

import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiTask;
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
		
		final JTabbedPane jTabbedPane = mainFrame.tabbedPane(ComponentNames.outlookbar).component();
		
		int steps = 2;
		
		while(steps>=0){
			
			final int stepsProxy = steps;
			GuiActionRunner.execute(new GuiTask() {
				@Override
				protected void executeInEDT() throws Throwable {
					jTabbedPane.setSelectedIndex(stepsProxy);
					Thread.sleep(1000);
				}
			});
			
			steps--;
		}
		
		
		
		
	}
}
