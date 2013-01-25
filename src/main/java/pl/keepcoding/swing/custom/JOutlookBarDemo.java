package pl.keepcoding.swing.custom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author msanecki The aim of this class is to demonstrate JOutlookbar from
 *         http://www.l2fprod.com/common
 */
public class JOutlookBarDemo {

	public static void main(String[] args) {

		// com.l2fprod.common.swing.
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				createGui();
			}
		});
		

	}

	private static void createGui() {
		com.l2fprod.common.swing.JOutlookBar outlookBar = new com.l2fprod.common.swing.JOutlookBar();
		outlookBar.setName(ComponentNames.outlookbar);

		JFrame mainFrame = new JFrame("JOutlookbar Demo");
		mainFrame.setName(ComponentNames.mainFrame);

		outlookBar.insertTab("tab1", null, new JButton("Button1"), "", 0);
		outlookBar.insertTab("tab2", null, new JButton("Button2"), "", 1);
		outlookBar.insertTab("tab3", null, new JButton("Button3"), "", 2);

		mainFrame.add(outlookBar);

		mainFrame.setSize(300, 300);
		mainFrame.setVisible(true);
	}

}
