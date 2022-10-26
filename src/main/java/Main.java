import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        File[] openDir = Open.openFile();

        for (File dir: openDir) {

            File dir1 = new File(dir.getPath());
            File[] filesName = dir1.listFiles();
            assert filesName != null;
            for (File file : filesName) {
                if (file.isFile()) {
                    Headers.setting(file);
                } else {
                    openDir7(file.getPath());

                }
            }
        }
    }


    static void openDir(String path) {

        File dir1 = new File(path);

        File[] filesName1 = dir1.listFiles();

        assert filesName1 != null;
        for (File file1 : filesName1) {
            if (file1.isFile()) {

                Headers.setting(file1);

            } else {
                System.out.println("Не удалось прочитать - " + file1.toPath());
            }
        }
    }

    static void openDir1(String path) {

        File dir2 = new File(path);

        File[] filesName2 = dir2.listFiles();

        assert filesName2 != null;
        for (File file2 : filesName2) {
            if (file2.isFile()) {

                Headers.setting(file2);

            } else {
                openDir(file2.getPath());

            }
        }
    }

    static void openDir2(String path) {

        File dir3 = new File(path);

        File[] filesName3 = dir3.listFiles();

        assert filesName3 != null;
        for (File file3 : filesName3) {
            if (file3.isFile()) {

                Headers.setting(file3);

            } else {
                openDir1(file3.getPath());

            }
        }
    }

    static void openDir3(String path) {

        File dir4 = new File(path);

        File[] filesName4 = dir4.listFiles();

        assert filesName4 != null;
        for (File file4 : filesName4) {
            if (file4.isFile()) {

                Headers.setting(file4);

            } else {
                openDir2(file4.getPath());

            }
        }
    }


    static void openDir4(String path) {

        File dir5 = new File(path);

        File[] filesName5 = dir5.listFiles();

        assert filesName5 != null;
        for (File file5 : filesName5) {
            if (file5.isFile()) {

                Headers.setting(file5);

            } else {
                openDir3(file5.getPath());

            }
        }
    }

    static void openDir5(String path) {

        File dir6 = new File(path);

        File[] filesName6 = dir6.listFiles();

        assert filesName6 != null;
        for (File file6 : filesName6) {
            if (file6.isFile()) {

                Headers.setting(file6);

            } else {
                openDir4(file6.getPath());

            }
        }
    }

    static void openDir6(String path) {

        File dir7 = new File(path);

        File[] filesName7 = dir7.listFiles();

        assert filesName7 != null;
        for (File file7 : filesName7) {
            if (file7.isFile()) {

                Headers.setting(file7);

            } else {
                openDir5(file7.getPath());

            }
        }
    }

    static void openDir7(String path) {

        File dir8 = new File(path);

        File[] filesName8 = dir8.listFiles();

        assert filesName8 != null;
        for (File file8 : filesName8) {
            if (file8.isFile()) {

                Headers.setting(file8);

            } else {
                openDir6(file8.getPath());

            }
        }
    }
}
