package pl.keepcoding.swing.custom.learningtest;

import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import org.fest.swing.annotation.RunsInEDT;
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
		GuiTask task = new GuiTask() {
			
			@Override
			protected void executeInEDT() throws Throwable {
				System.out.println("Is EDT: "+SwingUtilities.isEventDispatchThread());
				jTabbedPane.setSelectedIndex(0);
				Thread.sleep(1000);
				jTabbedPane.setSelectedIndex(1);
				Thread.sleep(1000);
				jTabbedPane.setSelectedIndex(2);
				Thread.sleep(1000);
				
			}
		};
		
		task.run();
	}
}
