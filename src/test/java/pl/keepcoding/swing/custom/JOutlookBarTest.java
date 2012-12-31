package pl.keepcoding.swing.custom;

import org.fest.swing.finder.WindowFinder;
import org.fest.swing.fixture.FrameFixture;
import org.fest.swing.launcher.ApplicationLauncher;
import org.fest.swing.testing.FestSwingTestCaseTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JOutlookBarTest extends FestSwingTestCaseTemplate{

	private FrameFixture mFrame;

	@Before
    public void setUp(){
        setUpRobot();
//        robot().settings().eventPostingDelay( 5 );
        robot().settings().delayBetweenEvents( 500 );
        
        ApplicationLauncher.application( JOutlookBar.class ).start();
        mFrame = WindowFinder.findFrame("main.frame" ).using( robot() );
        
        
    }
	

	@After
    public void tearDown(){
        cleanUp();
    }
	
	
	@Test
	public void testButtonClick() throws Exception {
		
		mFrame.button("One").click();
		mFrame.button("Four").click();
		mFrame.button("Two").click();
		
	}
}
