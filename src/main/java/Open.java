import javax.swing.*;
import java.io.File;

public class Open {
    static File[] openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setAcceptAllFileFilterUsed(false);

        fileChooser.showOpenDialog(null);
        return fileChooser.getSelectedFiles();
    }
}
