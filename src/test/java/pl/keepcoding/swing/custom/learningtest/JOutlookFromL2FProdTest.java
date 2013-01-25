package pl.keepcoding.swing.custom.learningtest;

import java.awt.Point;

import javax.swing.JTabbedPane;

import org.fest.swing.core.MouseButton;
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
		robot().settings().delayBetweenEvents(1000);
        cleanUp();
    }
	
	
	@Test
	public void outlookTabsClick() throws Exception {
		
		String[] tabTitles = mainFrame.tabbedPane(ComponentNames.outlookbar).tabTitles();
		
		JTabbedPane component = mainFrame.tabbedPane(ComponentNames.outlookbar).component();
		component.setSelectedIndex(0);
		Thread.sleep(1000);
		component.setSelectedIndex(1);
		Thread.sleep(1000);
		component.setSelectedIndex(2);
		Thread.sleep(1000);
		
		
		for (String stringtitle : tabTitles) {
			System.out.println(stringtitle);
		}
		
		// TODO How to get access to tabbed panes from JOutlookBar ???
		
		int outlookBarXposition = 100;
		int step = 30;
		int nextPane = 752;
		int xAxis = -1158;
		
		
////		robot().moveMouse(xAxis,219);
//		robot().click(new Point(xAxis,219), MouseButton.LEFT_BUTTON, 1);
////		robot().moveMouse(xAxis,752);
//		robot().click(new Point(xAxis,752), MouseButton.LEFT_BUTTON, 1);
//		nextPane+=step;
////		robot().moveMouse(xAxis,nextPane);
//		robot().click(new Point(xAxis,nextPane), MouseButton.LEFT_BUTTON, 1);
//		nextPane+=step;
////		robot().moveMouse(xAxis,nextPane);
//		robot().click(new Point(xAxis,nextPane), MouseButton.LEFT_BUTTON, 1);
//		nextPane+=step;
////		robot().moveMouse(xAxis,nextPane);
//		robot().click(new Point(xAxis,nextPane), MouseButton.LEFT_BUTTON, 1);
//		nextPane+=step;
////		robot().moveMouse(xAxis,nextPane);
//		robot().click(new Point(xAxis,nextPane), MouseButton.LEFT_BUTTON, 1);
		
		
		
	}
}
