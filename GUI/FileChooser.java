package GUI;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser {
    FileChooser() {
        JFileChooser c = new JFileChooser();
        c.showSaveDialog(null);

    }
}
