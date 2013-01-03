package pl.keepcoding.swing.custom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 * @author msanecki
 *
 */
public class JTabbedPaneDemo {

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("JOutlookbar Demo");
		mainFrame.setName(ComponentNames.mainFrame);

		JTabbedPane outlookBar = new JTabbedPane();
		outlookBar.setName(ComponentNames.outlookbar);
		outlookBar.setTabPlacement(JTabbedPane.LEFT);

		outlookBar.insertTab("tab1", null, new JButton("Button1"), "", 0);
		outlookBar.insertTab("tab2", null, new JButton("Button2"), "", 0);
		outlookBar.insertTab("tab3", null, new JButton("Button3"), "", 0);

		mainFrame.add(outlookBar);

		mainFrame.setSize(300, 300);
		mainFrame.setVisible(true);

	}
}
